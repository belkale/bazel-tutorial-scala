load("@io_bazel_rules_scala//scala:scala_import.bzl", "scala_import")
load("@io_bazel_rules_scala//scala:scala.bzl", "scala_library")
scala_import(
    name = "scalatest_3",
    jars = [
        "//external:jar/org/scalatest/scalatest_3"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala3_library_3",
        ":scalatest_core_3",
        ":scalatest_diagrams_3",
        ":scalatest_featurespec_3",
        ":scalatest_flatspec_3",
        ":scalatest_freespec_3",
        ":scalatest_funspec_3",
        ":scalatest_funsuite_3",
        ":scalatest_matchers_core_3",
        ":scalatest_mustmatchers_3",
        ":scalatest_propspec_3",
        ":scalatest_refspec_3",
        ":scalatest_shouldmatchers_3",
        ":scalatest_wordspec_3"
    ],
    visibility = [
        "//visibility:public"
    ]
)



java_library(
    name = "scalatest_compatible",
    exports = [
        "//external:jar/org/scalatest/scalatest_compatible"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scalatest_core_3",
    jars = [
        "//external:jar/org/scalatest/scalatest_core_3"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang/modules:scala_xml_3",
        "//3rdparty/jvm/org/scala_lang:scala3_library_3",
        "//3rdparty/jvm/org/scalactic:scalactic_3",
        ":scalatest_compatible"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scalatest_diagrams_3",
    jars = [
        "//external:jar/org/scalatest/scalatest_diagrams_3"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala3_library_3",
        ":scalatest_core_3"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scalatest_featurespec_3",
    jars = [
        "//external:jar/org/scalatest/scalatest_featurespec_3"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala3_library_3",
        ":scalatest_core_3"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scalatest_flatspec_3",
    jars = [
        "//external:jar/org/scalatest/scalatest_flatspec_3"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala3_library_3",
        ":scalatest_core_3"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scalatest_freespec_3",
    jars = [
        "//external:jar/org/scalatest/scalatest_freespec_3"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala3_library_3",
        ":scalatest_core_3"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scalatest_funspec_3",
    jars = [
        "//external:jar/org/scalatest/scalatest_funspec_3"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala3_library_3",
        ":scalatest_core_3"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scalatest_funsuite_3",
    jars = [
        "//external:jar/org/scalatest/scalatest_funsuite_3"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala3_library_3",
        ":scalatest_core_3"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scalatest_matchers_core_3",
    jars = [
        "//external:jar/org/scalatest/scalatest_matchers_core_3"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala3_library_3",
        ":scalatest_core_3"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scalatest_mustmatchers_3",
    jars = [
        "//external:jar/org/scalatest/scalatest_mustmatchers_3"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala3_library_3",
        ":scalatest_matchers_core_3"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scalatest_propspec_3",
    jars = [
        "//external:jar/org/scalatest/scalatest_propspec_3"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala3_library_3",
        ":scalatest_core_3"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scalatest_refspec_3",
    jars = [
        "//external:jar/org/scalatest/scalatest_refspec_3"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala3_library_3",
        ":scalatest_core_3"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scalatest_shouldmatchers_3",
    jars = [
        "//external:jar/org/scalatest/scalatest_shouldmatchers_3"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala3_library_3",
        ":scalatest_matchers_core_3"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)



scala_import(
    name = "scalatest_wordspec_3",
    jars = [
        "//external:jar/org/scalatest/scalatest_wordspec_3"
    ],
    runtime_deps = [
        "//3rdparty/jvm/org/scala_lang:scala3_library_3",
        ":scalatest_core_3"
    ],
    visibility = [
        "//3rdparty/jvm:__subpackages__"
    ]
)


