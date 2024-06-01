load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")
load("@dagger//:workspace_defs.bzl", "dagger_rules")

dagger_rules(repo_name="@io_jackbradshaw_maven")

kt_jvm_library(
    name = "materials",
    testonly = True,
    srcs = [
        "Materials.kt",
    ],
    visibility = [
        "//java/io/jackbradshaw/otter/demo:__subpackages__",
        "//javatests:__subpackages__",
    ],
    deps = [
        "@io_jackbradshaw_maven//:javax_inject_javax_inject",
        "@io_jackbradshaw_maven//:org_jmonkeyengine_jme3_core",
    ],
)

kt_jvm_library(
    name = "impl",
    testonly = True,
    srcs = [
        "MaterialsImpl.kt",
    ],
    visibility = [
        "//java/io/jackbradshaw/otter/demo:__subpackages__",
        "//javatests:__subpackages__",
    ],
    deps = [
        ":materials",
        "//java/io/jackbradshaw/otter/demo:scope",
        "//java/io/jackbradshaw/otter/demo/constants",
        "//java/io/jackbradshaw/otter/engine/core",
        "@io_jackbradshaw_maven//:javax_inject_javax_inject",
        "@io_jackbradshaw_maven//:org_jmonkeyengine_jme3_core",
    ],
)

kt_jvm_library(
    name = "module",
    testonly = True,
    srcs = [
        "MaterialsModule.kt",
    ],
    visibility = [
        "//java/io/jackbradshaw/otter/demo:__subpackages__",
        "//javatests:__subpackages__",
    ],
    deps = [
        ":impl",
        ":materials",
        "@io_jackbradshaw_maven//:javax_inject_javax_inject",
    ],
)
