# orama-api-consumer
A Java android app which lists and show details of objects from the Orama API.

## Unit Tests
For unit tests you can run either in debug or in mockedEnvironment Build Variants

## Instrumented Tests
For Instrumented Tests it is necessary to run with the mockedEnvironment Build Variant

## Launching a new version
In this project I added github actions to take care of the CI/CD of the project. The actions are triggered when:
- **There is a new PR pointed to develop** -> run tests and generates a APK for testing of the new version
- **There is a new PR pointed to main** -> run tests and generates a APK for testing of the new version
- **A new tag is pushed to the origin** -> deploys a new release

## The teck stack
- [x] MVVM
- [x] Build Gradle
- [x] Material Design
- [x] Retrofit
- [x] GSON
- [x] JUnit for unit tests
- [x] Espresso for Instrumented tests
- [x] Glide
- [x] Data Binding
- [x] JetPack Navigation
- [x] JetPack Safe-Args
- [x] Github Actions
- [x] 100% Java language
