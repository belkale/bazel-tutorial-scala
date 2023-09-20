load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
java_library(
    name = "api",
    exports = [
        "//external:jar/com/theokanning/openai_gpt3_java/api"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_annotations",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/com/knuddels:jtokkit"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "client",
    exports = [
        "//external:jar/com/theokanning/openai_gpt3_java/client"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/squareup/retrofit2:adapter_rxjava2",
        "//3rdparty/jvm/com/squareup/retrofit2:converter_jackson",
        "//3rdparty/jvm/com/squareup/retrofit2:retrofit",
        ":api"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "service",
    exports = [
        "//external:jar/com/theokanning/openai_gpt3_java/service"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/kjetland:mbknor_jackson_jsonschema",
        "//3rdparty/jvm/com/squareup/retrofit2:adapter_rxjava2",
        "//3rdparty/jvm/com/squareup/retrofit2:converter_jackson",
        "//3rdparty/jvm/com/squareup/retrofit2:retrofit",
        ":client"
    ],
    visibility = [
        "//visibility:public"
    ]
)


