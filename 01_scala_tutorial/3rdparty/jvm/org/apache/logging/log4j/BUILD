load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
java_library(
    name = "log4j_api",
    exports = [
        "//external:jar/org/apache/logging/log4j/log4j_api"
    ],
    visibility = [
        "//visibility:public"
    ]
)



scala_import(
    name = "log4j_api_scala",
    jars = [
        "//external:jar/org/apache/logging/log4j/log4j_api_scala_2_12"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala_library",
        "//3rdparty/jvm/org/scala_lang:scala_reflect",
        ":log4j_api"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "log4j_core",
    exports = [
        "//external:jar/org/apache/logging/log4j/log4j_core"
    ],
    runtime_deps = [
        ":log4j_api"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "log4j_slf4j2_impl",
    exports = [
        "//external:jar/org/apache/logging/log4j/log4j_slf4j2_impl"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        ":log4j_api",
        ":log4j_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "log4j_slf4j_impl",
    exports = [
        "//external:jar/org/apache/logging/log4j/log4j_slf4j_impl"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/slf4j:slf4j_api",
        ":log4j_api",
        ":log4j_core"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


