#!/bin/bash

JAVA_EXECUTABLE="`which java`"

DIST_DIR="$( cd "$( dirname "${BASH_SOURCE[0]}" )/../" && pwd )"
LIB_DIR="$DIST_DIR/lib"
CONF_DIR="$DIST_DIR/conf"

echo "Starting Application ${project.version}."

$JAVA_EXECUTABLE -cp "$CONF_DIR:$LIB_DIR/${project.build.finalName}.${project.packaging}" \
	Application