package(
    default_visibility = ["//src:__subpackages__"],
)

config_setting(
    name = "darwin",
    values = {"host_cpu": "darwin"},
)

config_setting(
    name = "k8",
    values = {"host_cpu": "k8"},
)

filegroup(
    name = "toolchain",
    srcs = select({
        ":darwin": ["@golang-darwin-amd64//:toolchain"],
        ":k8": ["@golang-linux-amd64//:toolchain"],
    }),
    visibility = ["//visibility:public"],
)

filegroup(
    name = "go_tool",
    srcs = select({
        ":darwin": ["@golang-darwin-amd64//:go_tool"],
        ":k8": ["@golang-linux-amd64//:go_tool"],
    }),
    visibility = ["//visibility:public"],
)

filegroup(
    name = "srcs",
    srcs = [
        "BUILD",
        "BUILD.go-toolchain",
        "WORKSPACE.go-toolchain",
        ":go_tool",
        ":toolchain",
    ],
)
