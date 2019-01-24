# gradle1

demo for convert gradle to maven
run `gradle install` will generate build/poms/pom-default.xml

## the key
build.gradle
```
plugins {
    ....
    id 'maven'
    ....
}

```