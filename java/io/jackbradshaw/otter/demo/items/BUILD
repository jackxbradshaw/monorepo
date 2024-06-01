load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")
load("@dagger//:workspace_defs.bzl", "dagger_rules")

dagger_rules(repo_name="@io_jackbradshaw_maven")

kt_jvm_library(
    name = "items",
    testonly = True,
    srcs = [
        "Cube.kt",
        "CubeLevel.kt",
        "CubeSwarm.kt",
    ],
    visibility = [
        "//java/io/jackbradshaw/otter/demo:__subpackages__",
        "//javatests:__subpackages__",
    ],
    deps = [
        "//java/io/jackbradshaw/otter/scene/item",
    ],
)

kt_jvm_library(
    name = "impl",
    testonly = True,
    srcs = [
        "CubeImpl.kt",
        "CubeLevelImpl.kt",
        "CubeSwarmImpl.kt",
    ],
    visibility = [
        "//java/io/jackbradshaw/otter/demo:__subpackages__",
        "//javatests:__subpackages__",
    ],
    deps = [
        ":items",
        "//java/io/jackbradshaw/klu",
        "//java/io/jackbradshaw/otter/coroutines",
        "//java/io/jackbradshaw/otter/demo:scope",
        "//java/io/jackbradshaw/otter/demo/constants",
        "//java/io/jackbradshaw/otter/demo/materials",
        "//java/io/jackbradshaw/otter/engine/core",
        "//java/io/jackbradshaw/otter/qualifiers",
        "//java/io/jackbradshaw/otter/scene/item",
        "//java/io/jackbradshaw/otter/scene/item:impl",
        "//java/io/jackbradshaw/otter/timing",
        "@io_jackbradshaw_maven//:org_jetbrains_kotlinx_kotlinx_coroutines_core",
        "@io_jackbradshaw_maven//:org_jmonkeyengine_jme3_bullet",
        "@io_jackbradshaw_maven//:org_jmonkeyengine_jme3_core",
    ],
)

kt_jvm_library(
    name = "module",
    testonly = True,
    srcs = [
        "ItemsModule.kt",
    ],
    visibility = [
        "//java/io/jackbradshaw/otter/demo:__subpackages__",
        "//javatests:__subpackages__",
    ],
    deps = [
        ":dagger",
        ":impl",
        ":items",
        "@io_jackbradshaw_maven//:javax_inject_javax_inject",
    ],
)
