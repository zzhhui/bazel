# This should correspond to the list of "EMBEDDED_TOOLS" in TestConstants.java.bazel.
filegroup(
    name = "embedded_scripts",
    testonly = 1,
    data = [
        "//src/main/tools:build-runfiles",
        "//src/main/tools:build_interface_so",
        "//src/main/tools:namespace-sandbox",
        "//src/main/tools:process-wrapper",
    ],
)

java_library(
    name = "testutil",
    srcs = glob(["testutil/*.java"]),
    visibility = ["//visibility:public"],
    deps = [
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:clock",
        "//src/main/java/com/google/devtools/build/lib:collect",
        "//src/main/java/com/google/devtools/build/lib:concurrent",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:io",
        "//src/main/java/com/google/devtools/build/lib:os_util",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/build/lib/actions",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:junit4",
        "//third_party:truth",
    ],
)

java_library(
    name = "skyframe_testutil",
    srcs = glob([
        "skyframe/util/*.java",
    ]),
    tags = ["skyframe"],
    deps = [
        ":actions_testutil",
        ":analysis_testutil",
        ":foundations_testutil",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:clock",
        "//src/main/java/com/google/devtools/build/lib:cmdline",
        "//src/main/java/com/google/devtools/build/lib:collect",
        "//src/main/java/com/google/devtools/build/lib:concurrent",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:io",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/build/lib/actions",
        "//src/main/java/com/google/devtools/build/skyframe",
        "//src/test/java/com/google/devtools/build/lib:packages_testutil",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:truth",
    ],
)

java_test(
    name = "skyframe_test",
    srcs = glob([
        "skyframe/*.java",
    ]),
    args = ["com.google.devtools.build.lib.AllTests"],
    tags = ["skyframe"],
    deps = [
        ":actions_testutil",
        ":analysis_testutil",
        ":foundations_testutil",
        ":packages_testutil",
        ":skyframe_testutil",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:buildtool-runtime",
        "//src/main/java/com/google/devtools/build/lib:clock",
        "//src/main/java/com/google/devtools/build/lib:cmdline",
        "//src/main/java/com/google/devtools/build/lib:collect",
        "//src/main/java/com/google/devtools/build/lib:concurrent",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:io",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/build/lib/actions",
        "//src/main/java/com/google/devtools/build/skyframe",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:truth",
    ],
)

java_library(
    name = "foundations_testutil",
    srcs = glob([
        "vfs/util/*.java",
        "events/util/*.java",
    ]),
    data = [
        "//src/main/native:libunix.dylib",
        "//src/main/native:libunix.so",
    ],
    deps = [
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:clock",
        "//src/main/java/com/google/devtools/build/lib:concurrent",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:io",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:shell",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:junit4",
        "//third_party:truth",
    ],
)

java_library(
    name = "test_runner",
    srcs = ["AllTests.java"],
    deps = [
        ":testutil",
        "//third_party:junit4",
    ],
)

java_test(
    name = "foundations_test",
    srcs = glob(
        [
            "cmdline/*.java",
            "concurrent/*.java",
            "collect/*.java",
            "collect/nestedset/*.java",
            "events/*.java",
            "testutiltests/*.java",
            "unix/*.java",
            "util/*.java",
            "util/io/*.java",
            "vfs/*.java",
            "vfs/inmemoryfs/*.java",
        ],
        # java_rules_skylark doesn't support resource loading with
        # qualified paths.
        exclude = [
            "util/DependencySetWindowsTest.java",
            "util/ResourceFileLoaderTest.java",
            "vfs/PathFragmentWindowsTest.java",
            "vfs/PathWindowsTest.java",
        ],
    ),
    args = ["com.google.devtools.build.lib.AllTests"],
    data = glob(["vfs/*.zip"]),
    tags = ["foundations"],
    deps = [
        ":foundations_testutil",
        ":test_runner",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:base-util",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:clock",
        "//src/main/java/com/google/devtools/build/lib:collect",
        "//src/main/java/com/google/devtools/build/lib:concurrent",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:io",
        "//src/main/java/com/google/devtools/build/lib:os_util",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:shell",
        "//src/main/java/com/google/devtools/build/lib:unix",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/common/options",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:junit4",
        "//third_party:truth",
    ],
)

java_test(
    name = "windows_test",
    srcs = [
        "util/DependencySetWindowsTest.java",
        "vfs/PathFragmentWindowsTest.java",
        "vfs/PathWindowsTest.java",
    ],
    args = [
        "com.google.devtools.build.lib.AllTests",
    ],
    jvm_flags = ["-Dblaze.os=Windows"],
    deps = [
        ":foundations_testutil",
        ":test_runner",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:clock",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/common/options",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:junit4",
        "//third_party:truth",
    ],
)

java_library(
    name = "actions_testutil",
    srcs = glob([
        "actions/util/*.java",
    ]),
    deps = [
        ":foundations_testutil",
        ":test_runner",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:clock",
        "//src/main/java/com/google/devtools/build/lib:concurrent",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:io",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/build/lib/actions",
        "//src/main/java/com/google/devtools/build/skyframe",
        "//src/main/java/com/google/devtools/common/options",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:mockito",
        "//third_party:truth",
    ],
)

java_test(
    name = "actions_test",
    srcs = glob([
        "actions/*.java",
    ]),
    args = ["com.google.devtools.build.lib.AllTests"],
    deps = [
        ":actions_testutil",
        ":foundations_testutil",
        ":test_runner",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:clock",
        "//src/main/java/com/google/devtools/build/lib:collect",
        "//src/main/java/com/google/devtools/build/lib:concurrent",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/build/lib/actions",
        "//src/main/java/com/google/devtools/common/options",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:mockito",
        "//third_party:truth",
    ],
)

java_library(
    name = "analysis_testutil",
    srcs = glob([
        "analysis/mock/BazelAnalysisMock.java",
        "analysis/util/*.java",
        "exec/util/*.java",
        "skyframe/util/*.java",
    ]),
    resources = [
        "MOCK_CROSSTOOL",
    ],
    tags = ["analysis"],
    deps = [
        ":actions_testutil",
        ":foundations_testutil",
        ":packages_testutil",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:buildtool-runtime",
        "//src/main/java/com/google/devtools/build/lib:clock",
        "//src/main/java/com/google/devtools/build/lib:collect",
        "//src/main/java/com/google/devtools/build/lib:concurrent",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:io",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:runtime",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/build/lib/actions",
        "//src/main/java/com/google/devtools/build/skyframe",
        "//src/main/java/com/google/devtools/common/options",
        "//src/main/protobuf:extra_actions_base_proto",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:mockito",
        "//third_party:truth",
    ],
)

java_test(
    name = "analysis_actions_test",
    srcs = glob([
        "analysis/actions/*.java",
    ]),
    args = ["com.google.devtools.build.lib.AllTests"],
    tags = ["analysis"],
    deps = [
        ":actions_testutil",
        ":analysis_testutil",
        ":foundations_testutil",
        ":test_runner",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:io",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/build/lib/actions",
        "//src/main/protobuf:extra_actions_base_proto",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:mockito",
        "//third_party:truth",
    ],
)

java_test(
    name = "analysis_config_test",
    srcs = glob([
        "analysis/config/*.java",
    ]),
    args = ["com.google.devtools.build.lib.AllTests"],
    tags = ["analysis"],
    deps = [
        ":actions_testutil",
        ":analysis_testutil",
        ":foundations_testutil",
        ":test_runner",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:common",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/common/options",
        "//src/main/protobuf:extra_actions_base_proto",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:mockito",
        "//third_party:truth",
    ],
)

java_test(
    name = "analysis_constraints_test",
    srcs = glob([
        "analysis/constraints/*.java",
    ]),
    args = ["com.google.devtools.build.lib.AllTests"],
    tags = ["analysis"],
    deps = [
        ":actions_testutil",
        ":analysis_testutil",
        ":foundations_testutil",
        ":test_runner",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//third_party:guava",
        "//third_party:junit4",
        "//third_party:truth",
    ],
)

java_test(
    name = "analysis_select_test",
    srcs = glob([
        "analysis/select/*.java",
    ]),
    args = ["com.google.devtools.build.lib.AllTests"],
    tags = ["analysis"],
    deps = [
        ":actions_testutil",
        ":analysis_testutil",
        ":foundations_testutil",
        ":packages_testutil",
        ":test_runner",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//third_party:guava",
        "//third_party:junit4",
        "//third_party:truth",
    ],
)

java_test(
    name = "analysis_test",
    srcs = glob([
        "analysis/*.java",
    ]),
    args = ["com.google.devtools.build.lib.AllTests"],
    tags = ["analysis"],
    deps = [
        ":actions_testutil",
        ":analysis_testutil",
        ":foundations_testutil",
        ":test_runner",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:collect",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/build/lib/actions",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:mockito",
        "//third_party:truth",
    ],
)

java_library(
    name = "packages_testutil",
    srcs = glob([
        "packages/util/*.java",
    ]),
    deps = [
        ":foundations_testutil",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:clock",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:io",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/build/skyframe",
        "//src/main/java/com/google/devtools/common/options",
        "//src/main/protobuf:extra_actions_base_proto",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:mockito",
        "//third_party:truth",
    ],
)

java_test(
    name = "packages_test",
    srcs = glob([
        "packages/*.java",
    ]),
    args = ["com.google.devtools.build.lib.AllTests"],
    deps = [
        ":actions_testutil",
        ":analysis_testutil",
        ":foundations_testutil",
        ":packages_testutil",
        ":test_runner",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/build/skyframe",
        "//src/main/protobuf:build_proto",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:truth",
    ],
)

java_test(
    name = "ideinfo_test",
    srcs = glob([
        "ideinfo/*.java",
    ]),
    args = ["com.google.devtools.build.lib.AllTests"],
    tags = ["ideinfo"],
    deps = [
        ":analysis_testutil",
        ":foundations_testutil",
        ":test_runner",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:collect",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/build/lib/actions",
        "//src/main/protobuf:android_studio_ide_info_proto",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:mockito",
        "//third_party:truth",
    ],
)

cc_binary(
    name = "shell/killmyself",
    srcs = ["shell/killmyself.cc"],
)

java_test(
    name = "shell_test",
    srcs = glob([
        "shell/*.java",
    ]),
    args = ["com.google.devtools.build.lib.AllTests"],
    data = [
        ":shell/killmyself",
    ],
    tags = ["shell"],
    deps = [
        ":foundations_testutil",
        ":test_runner",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:collect",
        "//src/main/java/com/google/devtools/build/lib:shell",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:mockito",
        "//third_party:truth",
    ],
)

java_binary(
    name = "skylarkshell",
    srcs = ["syntax/SkylarkShell.java"],
    main_class = "com.google.devtools.build.lib.syntax.SkylarkShell",
    deps = [
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:packages",
    ],
)

java_test(
    name = "syntax_test",
    srcs = glob([
        "syntax/*.java",
    ]),
    args = ["com.google.devtools.build.lib.AllTests"],
    deps = [
        ":foundations_testutil",
        ":syntax_testutil",
        ":test_runner",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:collect",
        "//src/main/java/com/google/devtools/build/lib:concurrent",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/build/lib/actions",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:truth",
    ],
)

java_library(
    name = "syntax_testutil",
    srcs = glob([
        "syntax/util/*.java",
    ]),
    deps = [
        ":foundations_testutil",
        ":test_runner",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:collect",
        "//src/main/java/com/google/devtools/build/lib:concurrent",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/build/lib/actions",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:truth",
    ],
)

java_library(
    name = "skylark_testutil",
    srcs = glob([
        "skylark/util/*.java",
    ]),
    deps = [
        ":analysis_testutil",
        ":foundations_testutil",
        ":syntax_testutil",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:collect",
        "//src/main/java/com/google/devtools/build/lib:concurrent",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/build/lib/actions",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:truth",
    ],
)

java_test(
    name = "skylark_test",
    srcs = glob([
        "skylark/*.java",
    ]),
    args = ["com.google.devtools.build.lib.AllTests"],
    deps = [
        ":actions_testutil",
        ":analysis_testutil",
        ":foundations_testutil",
        ":skylark_testutil",
        ":test_runner",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:collect",
        "//src/main/java/com/google/devtools/build/lib:concurrent",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/build/lib/actions",
        "//src/main/java/com/google/devtools/build/skyframe",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:truth",
    ],
)

java_test(
    name = "filegroup-rules-tests",
    srcs = glob(["rules/filegroup/*.java"]),
    args = ["com.google.devtools.build.lib.AllTests"],
    tags = ["rules"],
    deps = [
        ":actions_testutil",
        ":analysis_testutil",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:truth",
    ],
)

java_test(
    name = "java-rules-tests",
    srcs = glob(["rules/java/*.java"]),
    args = ["com.google.devtools.build.lib.AllTests"],
    tags = ["rules"],
    deps = [
        ":actions_testutil",
        ":analysis_testutil",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:truth",
    ],
)

java_test(
    name = "bazel-rules-tests",
    srcs = glob([
        "bazel/rules/**/*.java",
    ]),
    args = ["com.google.devtools.build.lib.AllTests"],
    resources = glob(["bazel/rules/**/*.txt"]),
    tags = ["rules"],
    deps = [
        ":foundations_testutil",
        ":test_runner",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/protobuf:crosstool_config_proto",
        "//third_party:guava",
        "//third_party:junit4",
        "//third_party:truth",
    ],
)

java_test(
    name = "repository_test",
    srcs = glob([
        "bazel/repository/*.java",
    ]),
    args = ["com.google.devtools.build.lib.AllTests"],
    tags = ["rules"],
    deps = [
        ":foundations_testutil",
        ":test_runner",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:bazel-core",
        "//src/main/java/com/google/devtools/build/lib:collect",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//third_party:guava",
        "//third_party:guava-testlib",
        "//third_party:jsr305",
        "//third_party:junit4",
        "//third_party:truth",
    ],
)

java_test(
    name = "runtime-tests",
    srcs = glob(["runtime/*.java"]),
    args = ["com.google.devtools.build.lib.AllTests"],
    deps = [
        ":foundations_testutil",
        ":test_runner",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:buildtool-runtime",
        "//src/main/java/com/google/devtools/build/lib:clock",
        "//src/main/java/com/google/devtools/build/lib:io",
        "//src/main/java/com/google/devtools/build/lib:packages",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/common/options",
        "//src/main/protobuf:invocation_policy_proto",
        "//src/main/protobuf:test_status_proto",
        "//third_party:guava",
        "//third_party:junit4",
        "//third_party:mockito",
        "//third_party:truth",
    ],
)

java_test(
    name = "sandbox-tests",
    srcs = glob(["sandbox/*.java"]),
    args = ["com.google.devtools.build.lib.AllTests"],
    data = [":embedded_scripts"],
    deps = [
        ":actions_testutil",
        ":analysis_testutil",
        ":foundations_testutil",
        ":testutil",
        "//src/main/java/com/google/devtools/build/lib:analysis-exec-rules-skyframe",
        "//src/main/java/com/google/devtools/build/lib:clock",
        "//src/main/java/com/google/devtools/build/lib:events",
        "//src/main/java/com/google/devtools/build/lib:os_util",
        "//src/main/java/com/google/devtools/build/lib:shell",
        "//src/main/java/com/google/devtools/build/lib:util",
        "//src/main/java/com/google/devtools/build/lib:vfs",
        "//src/main/java/com/google/devtools/build/lib/actions",
        "//src/main/java/com/google/devtools/build/lib/sandbox",
        "//src/main/java/com/google/devtools/common/options",
        "//third_party:guava",
        "//third_party:junit4",
        "//third_party:truth",
    ],
)

java_library(
    name = "worker-example-lib",
    srcs = glob(["worker/ExampleWorker*.java"]),
    visibility = [
        "//src/test/shell/bazel:__pkg__",
    ],
    deps = [
        "//src/main/java/com/google/devtools/common/options",
        "//src/main/protobuf:worker_protocol_proto",
        "//third_party:guava",
    ],
)

java_binary(
    name = "worker-example",
    main_class = "com.google.devtools.build.lib.worker.ExampleWorker",
    visibility = [
        "//src/test/shell/bazel:__pkg__",
    ],
    runtime_deps = [
        ":worker-example-lib",
    ],
)

TEST_SUITES = [
    "ziputils",
    "rules",
    "analysis",
    "foundations",
    "shell",
    "skyframe",
    "ideinfo",
]

[
    test_suite(
        name = n,
        tags = [n],
    )
    for n in TEST_SUITES
]

test_suite(
    name = "others",
    tags = ["-" + n for n in TEST_SUITES],
)
