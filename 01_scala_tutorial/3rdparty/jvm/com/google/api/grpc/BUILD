load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
java_library(
    name = "proto_google_common_protos",
    exports = [
        "//external:jar/com/google/api/grpc/proto_google_common_protos"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/google/protobuf:protobuf_java"
    ],
    visibility = [
        "//visibility:public"
    ]
)


