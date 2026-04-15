plugins {
  `java-library`
}

repositories {
  mavenCentral()
}

val generatorSourceSet = sourceSets.register("generator")

dependencies {
  annotationProcessor(generatorSourceSet.get().runtimeClasspath)
}

