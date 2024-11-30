#!/bin/bash

for file in *.md; do
  snake_case_name=$(echo "$file" | \
    sed -E 's/-/_/g' | \
    sed -E 's/(.*)\.md/\L\1.md/')
  mv "$file" "$snake_case_name"
done
