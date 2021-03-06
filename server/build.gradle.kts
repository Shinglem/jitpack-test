plugins {
  // Apply the Kotlin JVM plugin to add support for Kotlin.
  java
  kotlin("jvm")
  maven
}

dependencies {
  implementation(project(":client"))
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}


tasks {

  compileJava {
    sourceCompatibility = JavaVersion.VERSION_1_8.toString()
  }
  compileTestJava {
    sourceCompatibility = JavaVersion.VERSION_1_8.toString()
  }
  compileKotlin {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
  }
  compileTestKotlin {
    kotlinOptions.jvmTarget = JavaVersion.VERSION_1_8.toString()
  }

}