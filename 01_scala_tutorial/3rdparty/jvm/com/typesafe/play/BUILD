load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
scala_import(
    name = "play_functional_3",
    jars = [
        "//external:jar/com/typesafe/play/play_functional_3"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala3_library_3"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "play_json_3",
    jars = [
        "//external:jar/com/typesafe/play/play_json_3"
    ],
    runtime_deps = [
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_annotations",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_core",
        "//3rdparty/jvm/com/fasterxml/jackson/core:jackson_databind",
        "//3rdparty/jvm/com/fasterxml/jackson/datatype:jackson_datatype_jdk8",
        "//3rdparty/jvm/com/fasterxml/jackson/datatype:jackson_datatype_jsr310",
        "//3rdparty/jvm/org/scala_lang:scala3_library_3",
        ":play_functional_3"
    ],
    visibility = [
        "//visibility:public"
    ]
)


