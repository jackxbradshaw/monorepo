load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_library", "kt_jvm_test")

kt_jvm_test(
    name = "OnceTest",
    srcs = [
        "OnceTest.kt",
    ],
    deps = [
        "//java/io/jackbradshaw/klu/concurrency",
        "@io_jackbradshaw_maven//:com_google_truth_truth",
        "@io_jackbradshaw_maven//:junit_junit",
        "@io_jackbradshaw_maven//:org_jetbrains_kotlin_kotlin_test",
        "@io_jackbradshaw_maven//:org_jetbrains_kotlinx_kotlinx_coroutines_core",
    ],
)
