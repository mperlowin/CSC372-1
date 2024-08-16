#!/bin/bash

# Check if the user provided an input argument
if [ -z "$1" ]; then
  echo "Please provide the name of the Java file (without the .java extension)."
  exit 1
fi

# Assign the input to a variable
INPUT=$1

# Compile the Java file
javac "${INPUT}.java"

# Check if the compilation was successful
if [ $? -eq 0 ]; then
  # Run the compiled Java program
  java "${INPUT}"
else
  echo "Compilation failed."
  exit 1
fi

# Clean up: delete the .class files
rm -f *.class

# Exit the script
exit 0
