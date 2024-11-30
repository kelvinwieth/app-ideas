#!/bin/bash

for file in *.md; do
  folder_name="${file%.md}"
  mkdir -p "$folder_name"
  mv "$file" "$folder_name/"
  mkdir -p "$folder_name/implementations"
done
