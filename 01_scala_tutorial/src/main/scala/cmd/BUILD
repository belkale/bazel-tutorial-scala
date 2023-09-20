load("@io_bazel_rules_scala//scala:scala.bzl", "scala_binary")

scala_binary(
    name = "runner",
    srcs = ["Runner.scala"],
    main_class = "cmd.Runner",
    deps = [
        "//3rdparty/jvm/org/apache/pdfbox",
        "//3rdparty/jvm/org/apache/pdfbox:pdfbox_io",
        "//src/main/scala/lib:greeting",
    ],
)
