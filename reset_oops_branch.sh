#!/bin/bash

# Move to your repo root (adjust path as needed)
cd ~/OneDrive/Desktop/BridgeLabz-SIPP-Training || exit

# Delete local OOPS folder (be careful: this deletes files)
rm -rf OOPS

# Checkout orphan branch (clean history)
git checkout --orphan OOPS

# Remove all files from Git tracking
git rm -rf . > /dev/null 2>&1

# Create clean folder structure
mkdir -p OOPS/Class_Object/Level-1
touch OOPS/.gitkeep

# Stage and commit clean structure
git add .
git commit -m "Initial: Clean empty OOPS branch"

# Force push to GitHub
git push --force origin OOPS

echo "✅ OOPS branch cleaned and pushed successfully."
