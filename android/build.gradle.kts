allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

val newBuildDir: Directory = rootProject.layout.buildDirectory.dir("../../build").get()
rootProject.layout.buildDirectory.value(newBuildDir)

subprojects {
    val newSubprojectBuildDir: Directory = newBuildDir.dir(project.name)
    project.layout.buildDirectory.value(newSubprojectBuildDir)

    buildscript {
        repositories {
            google()
            mavenCentral()
        }
        configurations.all {
            resolutionStrategy {
                force("org.jetbrains.kotlin:kotlin-gradle-plugin:2.1.0")
            }
        }
    }
    
    afterEvaluate {
        if (project.name == "ar_flutter_plugin") {
            val android = project.extensions.findByName("android")
            if (android != null) {
                try {
                    val setNamespace = android.javaClass.getMethod("setNamespace", String::class.java)
                    setNamespace.invoke(android, "io.carius.lars.ar_flutter_plugin")
                    println("SUCCESS: Set namespace for ar_flutter_plugin")
                } catch (e: Exception) {
                    println("WARNING: Failed to set namespace for ar_flutter_plugin: $e")
                }
            }
            // Force Kotlin to 1.8 only for this legacy plugin
            project.tasks.withType(org.jetbrains.kotlin.gradle.tasks.KotlinCompile::class.java).configureEach {
                kotlinOptions {
                    jvmTarget = "1.8"
                }
            }
        }
    }

}
subprojects {
    project.evaluationDependsOn(":app")
}

tasks.register<Delete>("clean") {
    delete(rootProject.layout.buildDirectory)
}
