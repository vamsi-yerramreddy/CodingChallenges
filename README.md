# CodingChallenges
Challenges that are intentionally small enough to be completed in over a week or two, yet substantial enough to result in fully functional projects
# Build Your Own wc (Word Count) Command

Welcome to the "Build Your Own wc (Word Count) Command" challenge! In this project, you'll be creating your own version of the Unix command-line tool `wc`, which stands for "word count." This tool is a classic example of a simple and powerful utility in the Unix philosophy.

## Challenge Overview

The Unix command-line tools exemplify good software engineering practices and adhere to the Unix Philosophies, including:

1. **Writing Simple Parts Connected by Clean Interfaces:** Each Unix tool does one thing and does it well, offering a simple command-line interface that can handle text input from files or streams.

2. **Designing Programs to be Connected to Other Programs:** These tools can easily be combined with other tools, allowing for the creation of sophisticated text data processing pipelines.

By following these philosophies, Unix command-line tools have become essential in software development and data engineering, enabling the construction of complex data processing workflows from simple, modular components.

## Challenge Objectives

Your task is to create a `wc`-like command-line tool that counts words, lines, and characters in a given text input. Here are the main objectives:

- Implement a command-line interface that accepts input from files or standard input (stdin).
- Count the number of words in the input text.
- Count the number of lines in the input text.
- Count the number of characters in the input text.
- Provide a user-friendly way to display the results.

## Getting Started

**Creating a JAR File:**

1. Open your project in IntelliJ IDEA.
3. Create a JAR configuration in IntelliJ IDEA.
4. Build the JAR file using the "Build Project" option.

**Running the Command-Line Application:**

1. Open a terminal or command prompt.
2. Navigate to the directory containing your JAR file.
3. Run the JAR file using `java -jar your-application.jar`.

**Sample output**

```
java -jar wordCount.jar temp.txt
Command line arguments passed are temp.txt
Number of lines in the file temp.txt are 3
Number of words in the file temp.txt are 9
Number of characters in the file temp.txt are 42
```

```
cat temp.txt | java -jar wordCount.jar 
Number of lines in the file temp.txt are 3
Number of words in the file temp.txt are 9
Number of characters in the file temp.txt are 42
```
