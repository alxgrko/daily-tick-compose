# Daily Tick

**Daily Tick** is a minimalist habit‑tracking app built with Jetpack Compose. It helps you keep your daily habits on track without any remote services or complex setup. All data lives on your device in `SharedPreferences` so nothing is ever sent to the cloud.

## Tech Stack

| Layer         | Library/Tool                     |
|--------------|----------------------------------|
| Language      | Kotlin                          |
| UI            | Jetpack Compose (Material 3)     |
| Persistence   | SharedPreferences + Gson         |
| Build system  | Gradle with Kotlin DSL          |
| Target SDK    | Android 34                      |

## Features

* **Today view** showing the current date, a progress indicator and your active habits grouped by category.
* **Tick / Untick habits** to mark today’s completion. Streaks are calculated based on consecutive days ending today.
* **Add habit dialog** with name, category, and emoji fields. Categories include Health, Fitness, Finance, Mindset, Learning and Home.
* **Seed habits** (Drink Water, Walk 10 Minutes, Read 5 Pages) on the first launch if no data exists.
* **Material 3 forest theme** with light/dark support.
* **Local‑only storage** using Gson to serialize the list of habits into a JSON string saved in SharedPreferences.

## Opening in Android Studio

1. Clone or download this repository from GitHub.
2. Open **Android Studio** (Hedgehog/Flamingo or later) and choose **File → Open**.
3. Select the `daily-tick-project` directory as the project root.
4. Let Android Studio download missing SDK components if prompted.
5. Run the app on an emulator or connected device. The package name is `com.example.dailytick` and the default launch activity is `MainActivity`.

## Building from the command line

If you prefer building without Android Studio, you can assemble a debug APK using Gradle:

```bash
./gradlew assembleDebug
```

The assembled APK will appear in `app/build/outputs/apk/debug/`. You can install it on a device using `adb install`.

## Finding the debug APK

After a successful build, check the directory:

```
daily-tick-project/app/build/outputs/apk/debug/app-debug.apk
```

This file is the debug version of the application. It is signed with a debug key and intended for development purposes.

## Notes

* Data is stored locally in SharedPreferences. Clearing app data or uninstalling the app will delete all habits and progress.
* There is no backend service; everything runs on device.
* All app logic—including models, theming, state and persistence—resides in `MainActivity.kt` to simplify the prototype.
