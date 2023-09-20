load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
java_library(
    name = "fontbox",
    exports = [
        "//external:jar/org/apache/pdfbox/fontbox"
    ],
    runtime_deps = [
        "//3rdparty/jvm/commons_logging:commons_logging",
        ":pdfbox_io"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



java_library(
    name = "pdfbox",
    exports = [
        "//external:jar/org/apache/pdfbox/pdfbox"
    ],
    runtime_deps = [
        "//3rdparty/jvm/commons_logging:commons_logging",
        ":fontbox",
        ":pdfbox_io"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "pdfbox_io",
    exports = [
        "//external:jar/org/apache/pdfbox/pdfbox_io"
    ],
    runtime_deps = [
        "//3rdparty/jvm/commons_logging:commons_logging"
    ],
    visibility = [
        "//visibility:public"
    ]
)


