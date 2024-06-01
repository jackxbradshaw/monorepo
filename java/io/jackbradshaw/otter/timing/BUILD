load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")
load("@dagger//:workspace_defs.bzl", "dagger_rules")

dagger_rules(repo_name="@io_jackbradshaw_maven")

kt_jvm_library(
    name = "timing",
    srcs = [
        "Clock.kt",
    ],
    visibility = ["//java/io/jackbradshaw/otter:__subpackages__"],
    deps = [
        "@io_jackbradshaw_maven//:org_jetbrains_kotlinx_kotlinx_coroutines_core",
    ],
)

kt_jvm_library(
    name = "impl",
    srcs = [
        "PhysicsClock.kt",
        "RenderingClock.kt",
    ],
    visibility = [
        "//java/io/jackbradshaw/otter:__subpackages__",
        "//javatests:__subpackages__",
    ],
    deps = [
        ":timing",
        "//java/io/jackbradshaw/otter:scope",
        "//java/io/jackbradshaw/otter/coroutines",
        "//java/io/jackbradshaw/otter/engine/core",
        "@io_jackbradshaw_maven//:javax_inject_javax_inject",
        "@io_jackbradshaw_maven//:org_jetbrains_kotlinx_kotlinx_coroutines_core",
    ],
)

kt_jvm_library(
    name = "module",
    srcs = [
        "TimingModule.kt",
    ],
    visibility = [
        "//java/io/jackbradshaw/otter:__subpackages__",
        "//javatests:__subpackages__",
    ],
    deps = [
        ":dagger",
        ":impl",
        ":timing",
        "//java/io/jackbradshaw/otter/qualifiers",
        "@io_jackbradshaw_maven//:org_jetbrains_kotlinx_kotlinx_coroutines_core",
    ],
)
