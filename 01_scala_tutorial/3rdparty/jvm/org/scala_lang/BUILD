load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
scala_import(
    name = "scala3_library_3",
    jars = [
        "//external:jar/org/scala_lang/scala3_library_3"
    ],
    runtime_deps = [
        ":scala_library"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scala_library",
    jars = [
        "//external:jar/org/scala_lang/scala_library"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scala_reflect",
    jars = [
        "//external:jar/org/scala_lang/scala_reflect"
    ],
    runtime_deps = [
        ":scala_library"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


