load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
java_library(
    name = "okhttp",
    exports = [
        "//external:jar/com/squareup/okhttp3/okhttp"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/squareup/okio:okio",
        "//3rdparty/jvm/org/jetbrains/kotlin:kotlin_stdlib"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


