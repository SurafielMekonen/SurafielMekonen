pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.PREFER_SETTINGS) // Dit lost de botsing op!
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Jarvis"
include(":app")
