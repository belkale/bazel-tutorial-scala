load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
java_library(
    name = "java_driver_core",
    exports = [
        "//external:jar/com/scylladb/java_driver_core"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/datastax/oss:java_driver_shaded_guava",
        "//3rdparty/jvm/com/datastax/oss:native_protocol",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_core",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/com/github/jnr:jnr_posix",
        "//3rdparty/jvm/com/github/spotbugs:spotbugs_annotations",
        "//3rdparty/jvm/com/github/stephenc/jcip:jcip_annotations",
        "//3rdparty/jvm/com/typesafe:config",
        "//3rdparty/jvm/io/dropwizard/metrics:metrics_core",
        "//3rdparty/jvm/io/netty:netty_handler",
        "//3rdparty/jvm/org/hdrhistogram:HdrHistogram",
        "//3rdparty/jvm/org/reactivestreams:reactive_streams",
        "//3rdparty/jvm/org/slf4j:slf4j_api"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "java_driver_core_shaded",
    exports = [
        "//external:jar/com/scylladb/java_driver_core_shaded"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/datastax/oss:java_driver_shaded_guava",
        "//3rdparty/jvm/com/datastax/oss:native_protocol",
        "//3rdparty/jvm/com/github/jnr:jnr_posix",
        "//3rdparty/jvm/com/github/spotbugs:spotbugs_annotations",
        "//3rdparty/jvm/com/github/stephenc/jcip:jcip_annotations",
        "//3rdparty/jvm/com/typesafe:config",
        "//3rdparty/jvm/io/dropwizard/metrics:metrics_core",
        "//3rdparty/jvm/org/hdrhistogram:HdrHistogram",
        "//3rdparty/jvm/org/reactivestreams:reactive_streams",
        "//3rdparty/jvm/org/slf4j:slf4j_api"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "java_driver_query_builder",
    exports = [
        "//external:jar/com/scylladb/java_driver_query_builder"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/datastax/oss:java_driver_shaded_guava",
        "//3rdparty/jvm/com/github/spotbugs:spotbugs_annotations",
        "//3rdparty/jvm/com/github/stephenc/jcip:jcip_annotations",
        ":java_driver_core"
    ],
    visibility = [
        "//visibility:public"
    ]
)


