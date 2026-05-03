// Top‑level build file where you can add configuration options common to all
// sub‑projects/modules.

// Register a clean task to delete the build directory. This mirrors the
// default build logic used in Android Studio projects.
tasks.register<Delete>("clean") {
    delete(rootProject.buildDir)
}
