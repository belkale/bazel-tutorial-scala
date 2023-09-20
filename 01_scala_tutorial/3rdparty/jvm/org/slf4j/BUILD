load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
java_library(
    name = "slf4j_api",
    exports = [
        "//external:jar/org/slf4j/slf4j_api"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "slf4j_reload4j",
    exports = [
        "//external:jar/org/slf4j/slf4j_reload4j"
    ],
    runtime_deps = [
        "//3rdparty/jvm/ch/qos/reload4j:reload4j",
        ":slf4j_api"
    ],
    visibility = [
        "//visibility:public"
    ]
)


