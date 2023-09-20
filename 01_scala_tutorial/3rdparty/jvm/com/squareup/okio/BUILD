load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
java_library(
    name = "okio",
    exports = [
        "//external:jar/com/squareup/okio/okio"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/jetbrains/kotlin:kotlin_stdlib",
        "//3rdparty/jvm/org/jetbrains/kotlin:kotlin_stdlib_common"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


