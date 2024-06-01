load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library", "kt_jvm_test")
load("@dagger//:workspace_defs.bzl", "dagger_rules")

dagger_rules(repo_name="@io_jackbradshaw_maven")

kt_jvm_test(
    name = "ManifestGeneratorTest",
    srcs = [
        "ManifestGeneratorTest.kt",
    ],
    deps = [
        ":dagger",
        "//java/io/jackbradshaw/otter:component",
        "//java/io/jackbradshaw/otter/config:proto_extensions",
        "//java/io/jackbradshaw/otter/openxr/config:proto_extensions",
        "//java/io/jackbradshaw/otter/openxr/manifest/encoder",
        "//java/io/jackbradshaw/otter/openxr/standard",
        "//javatests/io/jackbradshaw/otter/openxr/manifest/goldens",
        "@bazel_tools//tools/java/runfiles",
        "@io_jackbradshaw_maven//:com_google_protobuf_protobuf_kotlin_lite",
        "@io_jackbradshaw_maven//:com_google_truth_truth",
        "@io_jackbradshaw_maven//:junit_junit",
        "@io_jackbradshaw_maven//:org_jetbrains_kotlinx_kotlinx_coroutines_core",
    ],
)
