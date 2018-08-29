#!/usr/bin/env bash

set -e
set -o pipefail

runSbt() {
  sbt --warn 'set concurrentRestrictions in Global += Tags.limitAll(1)' "$@"
}

runSbtNoisy() {
  sbt 'set concurrentRestrictions in Global += Tags.limitAll(1)' "$@"
}
