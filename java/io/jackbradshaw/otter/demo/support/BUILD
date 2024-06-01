load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library")
load("@dagger//:workspace_defs.bzl", "dagger_rules")

dagger_rules(repo_name="@io_jackbradshaw_maven")

kt_jvm_library(
    name = "module",
    testonly = True,
    srcs = [
        "SupportModule.kt",
    ],
    visibility = [
        "//java/io/jackbradshaw/otter/demo:__subpackages__",
        "//javatests:__subpackages__",
    ],
    deps = [
        ":dagger",
        "//java/io/jackbradshaw/otter/demo:scope",
        "@io_jackbradshaw_maven//:javax_inject_javax_inject",
    ],
)
