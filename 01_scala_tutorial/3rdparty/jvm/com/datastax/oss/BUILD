load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
java_library(
    name = "java_driver_shaded_guava",
    exports = [
        "//external:jar/com/datastax/oss/java_driver_shaded_guava"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "native_protocol",
    exports = [
        "//external:jar/com/datastax/oss/native_protocol"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


