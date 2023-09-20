load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
java_library(
    name = "milvus_sdk_java",
    exports = [
        "//external:jar/io/milvus/milvus_sdk_java"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/alibaba:fastjson",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/com/google/code/gson:gson",
        "//3rdparty/jvm/com/google/protobuf:protobuf_java",
        "//3rdparty/jvm/com/squareup/okhttp3:okhttp",
        "//3rdparty/jvm/io/grpc:grpc_netty",
        "//3rdparty/jvm/io/grpc:grpc_protobuf",
        "//3rdparty/jvm/io/grpc:grpc_stub",
        "//3rdparty/jvm/org/apache/commons:commons_collections4",
        "//3rdparty/jvm/org/apache/commons:commons_text",
        "//3rdparty/jvm/org/apache/logging/log4j:log4j_slf4j_impl",
        "//3rdparty/jvm/org/codehaus/plexus:plexus_utils",
        "//3rdparty/jvm/org/jetbrains/kotlin:kotlin_stdlib",
        "//3rdparty/jvm/org/slf4j:slf4j_api"
    ],
    visibility = [
        "//visibility:public"
    ]
)


