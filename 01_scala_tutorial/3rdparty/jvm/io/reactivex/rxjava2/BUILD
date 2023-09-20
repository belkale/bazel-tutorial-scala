load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
java_library(
    name = "rxjava",
    exports = [
        "//external:jar/io/reactivex/rxjava2/rxjava"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/reactivestreams:reactive_streams"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


