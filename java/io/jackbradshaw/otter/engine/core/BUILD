load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")
load("@dagger//:workspace_defs.bzl", "dagger_rules")

dagger_rules(repo_name="@io_jackbradshaw_maven")

kt_jvm_library(
    name = "core",
    srcs = [
        "EngineCore.kt",
    ],
    visibility = ["//java/io/jackbradshaw/otter:__subpackages__"],
    deps = [
        ":dagger",
        "//java/io/jackbradshaw/otter:scope",
        "@io_jackbradshaw_maven//:org_jetbrains_kotlinx_kotlinx_coroutines_core",
        "@io_jackbradshaw_maven//:org_jmonkeyengine_jme3_bullet",
        "@io_jackbradshaw_maven//:org_jmonkeyengine_jme3_core",
        "@io_jackbradshaw_maven//:org_jmonkeyengine_jme3_vr",
    ],
)

kt_jvm_library(
    name = "impl",
    srcs = [
        "EngineCoreImpl.kt",
    ],
    visibility = [
        "//java/io/jackbradshaw/otter:__subpackages__",
        "//javatests:__subpackages__",
    ],
    deps = [
        ":core",
        ":dagger",
        "//java/io/jackbradshaw/otter:scope",
        "//java/io/jackbradshaw/otter/config:java_lite_proto",
        "//java/io/jackbradshaw/otter/coroutines",
        "//java/io/jackbradshaw/otter/openxr/manifest/installer",
        "@io_jackbradshaw_maven//:org_jetbrains_kotlinx_kotlinx_coroutines_core",
        "@io_jackbradshaw_maven//:org_jmonkeyengine_jme3_core",
        "@io_jackbradshaw_maven//:org_jmonkeyengine_jme3_vr",
    ],
)

kt_jvm_library(
    name = "module",
    srcs = [
        "EngineCoreModule.kt",
    ],
    visibility = [
        "//java/io/jackbradshaw/otter:__subpackages__",
        "//javatests:__subpackages__",
    ],
    deps = [
        ":core",
        ":dagger",
        ":impl",
        "@io_jackbradshaw_maven//:org_jetbrains_kotlinx_kotlinx_coroutines_core",
        "@io_jackbradshaw_maven//:org_jmonkeyengine_jme3_core",
        "@io_jackbradshaw_maven//:org_jmonkeyengine_jme3_vr",
    ],
)
