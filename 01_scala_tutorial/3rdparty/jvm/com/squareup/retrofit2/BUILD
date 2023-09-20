load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
java_library(
    name = "adapter_rxjava2",
    exports = [
        "//external:jar/com/squareup/retrofit2/adapter_rxjava2"
    ],
    runtime_deps = [
        "//3rdparty/jvm/io/reactivex/rxjava2:rxjava",
        "//3rdparty/jvm/org/reactivestreams:reactive_streams",
        ":retrofit"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "converter_jackson",
    exports = [
        "//external:jar/com/squareup/retrofit2/converter_jackson"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        ":retrofit"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "retrofit",
    exports = [
        "//external:jar/com/squareup/retrofit2/retrofit"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/squareup/okhttp3:okhttp"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


