load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
java_library(
    name = "kotlin_stdlib",
    exports = [
        "//external:jar/org/jetbrains/kotlin/kotlin_stdlib"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/jetbrains:annotations",
        ":kotlin_stdlib_common"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "kotlin_stdlib_common",
    exports = [
        "//external:jar/org/jetbrains/kotlin/kotlin_stdlib_common"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


