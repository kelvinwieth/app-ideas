#!/bin/bash

for file in *.md; do
  snake_case_name=$(echo "$file" | sed -E 's/-/_/g' | tr '[:upper:]' '[:lower:]')
  mv "$file" "$snake_case_name"
done
