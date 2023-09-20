load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
java_library(
    name = "spotbugs_annotations",
    exports = [
        "//external:jar/com/github/spotbugs/spotbugs_annotations"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/google/code/findbugs:jsr305"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


