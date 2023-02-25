#!/bin/bash
# Presubmit to make sure all Kotlin files are in their auto-formatted state.

ktfmt java
ktfmt javatests

if [[ -z $(git status -s) ]]
then
  echo "All files formatted as expected."
  exit 0
else
  echo "There are unformatted Kotlin files. Run ktfmt before submitting."
  exit 1
fi