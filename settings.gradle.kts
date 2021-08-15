enableFeaturePreview("VERSION_CATALOGS")
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
    versionCatalogs {
        create("libs") {
            version("kotlin", "1.5.21")
            version("build-gradle", "7.0.0")

            version("androidx-coreKtx", "1.6.0")
            version("androidx-appcompat", "1.3.1")
            version("material", "1.4.0")

            version("androidx-lifecycle", "2.3.1")

            version("androidx-compose", "1.0.1")

            version("androidx-activityCompose", "1.3.1")

            version("junit", "4.13.2")
            version("androidx-test-ext-junit", "1.1.3")
            version("androidx-test-espressoCore", "3.4.0")

            // classpath
            alias("build-gradle").to("com.android.tools.build", "gradle").versionRef("build-gradle")
            alias("kotlin-kotlinGradlePlugin").to("org.jetbrains.kotlin", "kotlin-gradle-plugin").versionRef("kotlin")

            // implementation
            alias("androidx-coreKtx").to("androidx.core", "core-ktx").versionRef("androidx-coreKtx")
            alias("androidx-appcompat").to("androidx.appcompat", "appcompat").versionRef("androidx-appcompat")
            alias("material").to("com.google.android.material", "material").versionRef("material")

            // implementation
            alias("androidx-lifecycleRuntimeKtx").to("androidx.lifecycle", "lifecycle-runtime-ktx").versionRef("androidx-lifecycle")

            // implementation
            alias("androidx-compose-ui").to("androidx.compose.ui", "ui").versionRef("androidx-compose")
            alias("androidx-compose-uiToolingPreview").to("androidx.compose.ui", "ui-tooling-preview").versionRef("androidx-compose")
            alias("androidx-compose-material").to("androidx.compose.material", "material").versionRef("androidx-compose")
            // androidTestImplementation
            alias("androidx-compose-uiTestJunit4").to("androidx.compose.ui", "ui-test-junit4").versionRef("androidx-compose")
            // debugImplementation
            alias("androidx-compose-uiTooling").to("androidx.compose.ui", "ui-tooling").versionRef("androidx-compose")

            // implementation
            alias("androidx-activityCompose").to("androidx.activity", "activity-compose").versionRef("androidx-activityCompose")

            // testImplementation
            alias("junit").to("junit", "junit").versionRef("junit")

            // androidTestImplementation
            alias("androidx-test-ext-junit").to("androidx.test.ext", "junit").versionRef("androidx-test-ext-junit")
            alias("androidx-test-espressoCore").to("androidx.test.espresso", "espresso-core").versionRef("androidx-test-espressoCore")

            // implementation
            bundle("androidx-compose", listOf("androidx-compose-ui", "androidx-compose-uiToolingPreview", "androidx-compose-material"))
        }
    }
}
rootProject.name = "Version Catalog Demo"
include(":app")
