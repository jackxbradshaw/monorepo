load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")
load("@dagger//:workspace_defs.bzl", "dagger_rules")

dagger_rules(repo_name="@io_jackbradshaw_maven")

kt_jvm_library(
    name = "installer",
    srcs = [
        "ManifestInstaller.kt",
    ],
    visibility = [
        "//java/io/jackbradshaw/otter:__subpackages__",
        "//javatests:__subpackages__",
    ],
    deps = [
        "//java/io/jackbradshaw/klu/flow",
        "//java/io/jackbradshaw/otter/openxr/model:java_lite_proto",
        "//java/io/jackbradshaw/otter/openxr/standard",
        "@io_jackbradshaw_maven//:org_jetbrains_kotlinx_kotlinx_coroutines_core",
    ],
)

kt_jvm_library(
    name = "impl",
    srcs = [
        "ManifestInstallerImpl.kt",
    ],
    visibility = [
        "//java/io/jackbradshaw/otter:__subpackages__",
        "//javatests:__subpackages__",
    ],
    deps = [
        ":dagger",
        ":installer",
        "//java/io/jackbradshaw/otter:scope",
        #"//java/io/jackbradshaw/otter/config:kt_jvm_proto",
        "//java/io/jackbradshaw/otter/openxr/manifest/generator",
        "@io_jackbradshaw_maven//:com_google_code_gson_gson",
        "@io_jackbradshaw_maven//:org_jetbrains_kotlinx_kotlinx_coroutines_core",
    ],
)

kt_jvm_library(
    name = "module",
    srcs = [
        "ManifestInstallerModule.kt",
    ],
    visibility = [
        "//java/io/jackbradshaw/otter:__subpackages__",
        "//javatests:__subpackages__",
    ],
    deps = [
        ":dagger",
        ":impl",
        ":installer",
    ],
)
