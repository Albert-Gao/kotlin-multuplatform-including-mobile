## Overview
This is an example of using Kotlin native to share the code between iOS and Android. It contains the tests for all the platform code. Setup via the support from multiplatform kotlin.

## Folders
- Android: Android project built by Android Studio
- iOS: iOS Project built by XCode
- Shared: Kotlin Native code which will be shared across iOS and Android

## About the shared folder
The shared code is in the `Shared` folder.
- common: The common code
- android: Some platform specific code for android, which will be included in the android folder
- ios: Some platform specific code for iOS, it will be compiled as an iOS framework

## Workflow:
- Android: Open `Android` folder in Android Studio
- iOS: Open `iOS` folder in XCode
- KN: Open the root folder in `IDEA` or any other IDE.

## Current issues
The android project can get the `string` from `Sample.checkPlatform()`, compile and run without problem. 

### Android Studio
1. The Android Studio won't recognize the syntax of `expect` and `actual`. 
2. The Android Studio doesn't recognize any code in the `shared-common` module. Even though it will build and run without problem. See the `AuthActivity.kt` in Android Studio, it will display the `Sample` class as red while it should be there.

### shared-ios
The gradle test won't run, seems the sourceSets is not right, but I already defined it in the `framework()`section.