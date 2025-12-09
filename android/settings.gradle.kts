// Fix para namespace en plugins viejos (AGP 8.0+)
subprojects {
    afterEvaluate {
        if (project.hasProperty('android')) {
            if (project.android.hasProperty('namespace')) {
                // Ya tiene namespace, no toques
            } else {
                // Fuerza el namespace basado en el package del manifest
                android {
                    def manifestFile = file("${projectDir}/src/main/AndroidManifest.xml")
                    if (manifestFile.exists()) {
                        def manifestText = manifestFile.text
                        def packageMatch = (manifestText =~ /package=["']([^"']+)["']/)
                        if (packageMatch) {
                            namespace packageMatch[0][1]
                        } else {
                            // Fallback para ar_flutter_plugin (package conocido)
                            if (project.name == 'ar_flutter_plugin') {
                                namespace 'io.github.cariuslars.ar_flutter_plugin'
                            } else {
                                namespace 'com.example.' + project.name
                            }
                        }
                    }
                }
            }
        }
    }
}