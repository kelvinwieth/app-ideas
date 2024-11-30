#!/bin/bash

find . -type d -name "implementations" | while read -r dir; do
  touch "$dir/.gitkeep"
done
