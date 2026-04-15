# Dependency Analysis plugin repro

This project implements an annotation processor in `src/generator/java` that is used from `src/main/java`.
With this setup, the `build/classes/java/generator` directory lands on the annotation processor path.
`FindDeclaredProcsTask` expects the annotation processor path to contain jar/zip files, so it fails when given a classes directory instead.

## Steps

1. Run `./gradlew build`. It should succeed.
2. Run `./gradlew buildHealth`. It should fail in `FindDeclaredProcsTask` while executing `:findDeclaredProcsGenerator`.

## Environment

- Windows 11
- Oracle JDK 21.0.2
