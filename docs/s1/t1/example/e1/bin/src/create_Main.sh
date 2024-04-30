#!/bin/bash

# Check if the project name is provided
if [ $# -eq 0 ]; then
    echo "Usage: $0 <project_name>"
    exit 1
fi

# Create project directory
mkdir $1
cd $1

# Create source directory
mkdir -p src/$1

# Create Main.java file
cat <<EOF > src/$1/Main.java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
EOF

# Compile Main.java
javac -d out src/$1/Main.java

# Create out directory
mkdir out
