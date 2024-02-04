#!/bin/bash

find . -name '*.class' -o -name '.project' -o -name '.classpath' -delete
rm -rf bin
