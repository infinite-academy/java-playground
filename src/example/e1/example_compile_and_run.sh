#!/bin/bash

# Compile Java code and specify output directory
javac -d bin Main.java

# Check if compilation was successful
if [ $? -eq 0 ]; then
    # Run the compiled Java program
    java -cp bin Main
else
    echo "Compilation failed. Exiting..."
fi
