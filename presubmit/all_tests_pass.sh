#!/bin/bash
# Presubmit to make sure all tests pass.
# Success condition: All tests build and pass.
# Failure condition: At least one test fails to build or does not pass.

bazel test //...