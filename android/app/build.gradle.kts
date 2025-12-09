(base) PS C:\Users\Chritian\Documents\flutter_22526_ar_ia> flutter run -d SWORZLEEAINVAEFM
Launching lib\main.dart on M2101K7BNY in debug mode...
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:10:38: Expecting an element
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:12:42: Expecting an element
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:12:56: Expecting an element
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:13:42: Expecting an element
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:13:59: Expecting an expression
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:13:59: Expecting ')'
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:13:62: Expecting an element
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:13:78: Expecting ']'
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:13:78: Unexpected tokens (use ';' to separate expressions on the same line)
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:19:43: Unexpected tokens (use ';' to separate expressions on the same line)
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:21:43: Unexpected tokens (use ';' to separate expressions on the same line)
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:2:1: Unresolved reference: subprojects
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:3:5: Unresolved reference: afterEvaluate
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:4:13: Function invocation 'project(...)' expected
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:4:13: None of the following functions can be called with the arguments supplied:
public abstract fun project(projectDir: File!): ProjectDescriptor! defined in org.gradle.api.initialization.Settings
public abstract fun project(path: String!): ProjectDescriptor! defined in org.gradle.api.initialization.Settings
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:4:33: Too many characters in a character literal ''android''
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:5:17: Function invocation 'project(...)' expected
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:5:17: None of the following functions can be called with the arguments supplied:
public abstract fun project(projectDir: File!): ProjectDescriptor! defined in org.gradle.api.initialization.Settings
public abstract fun project(path: String!): ProjectDescriptor! defined in org.gradle.api.initialization.Settings
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:5:45: Too many characters in a character literal ''namespace''
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:9:17: Unresolved reference: android
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:10:21: Unresolved reference: def
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:10:48: Unresolved reference: projectDir
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:11:25: Unresolved reference: manifestFile
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:12:25: Unresolved reference: def
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:13:25: Unresolved reference: def
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:14:29: Unresolved reference: packageMatch
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:15:29: Unresolved reference: namespace
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:15:51: Unsupported [Collection literals outside of annotations]
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:18:33: Function invocation 'project(...)' expected
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:18:33: None of the following functions can be called with the arguments supplied:
public abstract fun project(projectDir: File!): ProjectDescriptor! defined in org.gradle.api.initialization.Settings
public abstract fun project(path: String!): ProjectDescriptor! defined in org.gradle.api.initialization.Settings
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:18:49: Too many characters in a character literal ''ar_flutter_plugin''  
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:19:33: Unresolved reference: namespace
e: file:///C:/Users/Chritian/Documents/flutter_22526_ar_ia/android/settings.gradle.kts:21:33: Unresolved reference: namespace

FAILURE: Build failed with an exception.

* Where:
Settings file 'C:\Users\Chritian\Documents\flutter_22526_ar_ia\android\settings.gradle.kts' line: 2

* What went wrong:
Script compilation errors:

  Line 02: subprojects {
           ^ Unresolved reference: subprojects

  Line 03:     afterEvaluate {
               ^ Unresolved reference: afterEvaluate

  Line 04:         if (project.hasProperty('android')) {
                       ^ Function invocation 'project(...)' expected

  Line 04:         if (project.hasProperty('android')) {
                       ^ None of the following functions can be called with the arguments supplied:
                           public abstract fun project(projectDir: File!): ProjectDescriptor! defined in org.gradle.api.initialization.Settings
                           public abstract fun project(path: String!): ProjectDescriptor! defined in org.gradle.api.initialization.Settings

  Line 04:         if (project.hasProperty('android')) {
                                           ^ Too many characters in a character literal ''android''

  Line 05:             if (project.android.hasProperty('namespace')) {
                           ^ Function invocation 'project(...)' expected

  Line 05:             if (project.android.hasProperty('namespace')) {
                           ^ None of the following functions can be called with the arguments supplied:
                               public abstract fun project(projectDir: File!): ProjectDescriptor! defined in org.gradle.api.initialization.Settings
                               public abstract fun project(path: String!): ProjectDescriptor! defined in org.gradle.api.initialization.Settings

  Line 05:             if (project.android.hasProperty('namespace')) {
                                                       ^ Too many characters in a character literal ''namespace''

  Line 09:                 android {
                           ^ Unresolved reference: android

  Line 10:                     def manifestFile = file("${projectDir}/src/main/AndroidManifest.xml")
                                                ^ Expecting an element

  Line 10:                     def manifestFile = file("${projectDir}/src/main/AndroidManifest.xml")
                               ^ Unresolved reference: def

  Line 10:                     def manifestFile = file("${projectDir}/src/main/AndroidManifest.xml")
                                                          ^ Unresolved reference: projectDir

  Line 11:                     if (manifestFile.exists()) {
                                   ^ Unresolved reference: manifestFile

  Line 12:                         def manifestText = manifestFile.text
                                                    ^ Expecting an element

  Line 12:                         def manifestText = manifestFile.text
                                                                  ^ Expecting an element

  Line 12:                         def manifestText = manifestFile.text
                                   ^ Unresolved reference: def

  Line 13:                         def packageMatch = (manifestText =~ /package=["']([^"']+)["']/)
                                                    ^ Expecting an element

  Line 13:                         def packageMatch = (manifestText =~ /package=["']([^"']+)["']/)
                                                                     ^ Expecting an expression

  Line 13:                         def packageMatch = (manifestText =~ /package=["']([^"']+)["']/)
                                                                     ^ Expecting ')'

  Line 13:                         def packageMatch = (manifestText =~ /package=["']([^"']+)["']/)
                                                                        ^ Expecting an element

  Line 13:                         def packageMatch = (manifestText =~ /package=["']([^"']+)["']/)
                                                                                        ^ Expecting ']'

  Line 13:                         def packageMatch = (manifestText =~ /package=["']([^"']+)["']/)
                                                                                        ^ Unexpected tokens (use ';' to separate expressions on the same line)  

  Line 13:                         def packageMatch = (manifestText =~ /package=["']([^"']+)["']/)
                                   ^ Unresolved reference: def

  Line 14:                         if (packageMatch) {
                                       ^ Unresolved reference: packageMatch

  Line 15:                             namespace packageMatch[0][1]
                                       ^ Unresolved reference: namespace

  Line 15:                             namespace packageMatch[0][1]
                                                             ^ Unsupported [Collection literals outside of annotations]

  Line 18:                             if (project.name == 'ar_flutter_plugin') {
                                           ^ Function invocation 'project(...)' expected

  Line 18:                             if (project.name == 'ar_flutter_plugin') {
                                           ^ None of the following functions can be called with the arguments supplied:
                                               public abstract fun project(projectDir: File!): ProjectDescriptor! defined in org.gradle.api.initialization.Settings
                                               public abstract fun project(path: String!): ProjectDescriptor! defined in org.gradle.api.initialization.Settings 

  Line 18:                             if (project.name == 'ar_flutter_plugin') {
                                                           ^ Too many characters in a character literal ''ar_flutter_plugin''

  Line 19:                                 namespace 'io.github.cariuslars.ar_flutter_plugin'
                                                     ^ Unexpected tokens (use ';' to separate expressions on the same line)

  Line 19:                                 namespace 'io.github.cariuslars.ar_flutter_plugin'
                                           ^ Unresolved reference: namespace

  Line 21:                                 namespace 'com.example.' + project.name
                                                     ^ Unexpected tokens (use ';' to separate expressions on the same line)

  Line 21:                                 namespace 'com.example.' + project.name
                                           ^ Unresolved reference: namespace

33 errors

* Try:
> Run with --stacktrace option to get the stack trace.
> Run with --info or --debug option to get more log output.
> Run with --scan to get full insights.
> Get more help at https://help.gradle.org.

BUILD FAILED in 964ms
Running Gradle task 'assembleDebug'...                           1.243ms
Error: Gradle task assembleDebug failed with exit code 1
(base) PS C:\Users\Chritian\Documents\flutter_22526_ar_ia> 