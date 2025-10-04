buildscript {
    ext.kotlin_version = '1.9.10' // Обновлённая версия
    repositories {
        google()
        mavenCentral() // Заменили jcenter()
    }

    dependencies {
        classpath 'com.android.tools.build:gradle:8.1.2' // Обновлённая версия
        classpath "org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlin_version"
    }
}

allprojects {
    repositories {
        google()
        mavenCentral() // Заменили jcenter()
    }
}