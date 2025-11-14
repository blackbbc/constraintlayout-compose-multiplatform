rootProject.name = "constraintlayout-compose-multiplatform"
pluginManagement {
    repositories {
        mavenLocal()
        maven("https://mirrors.tencent.com/nexus/repository/maven-tencent")
        maven("https://mirrors.tencent.com/nexus/repository/maven-public")
        google()
        gradlePluginPortal()
        mavenCentral()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenLocal()
        maven("https://mirrors.tencent.com/nexus/repository/maven-tencent")
        maven("https://mirrors.tencent.com/nexus/repository/maven-public")
        google()
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

//include(":sample:shared")
include(":compose")
