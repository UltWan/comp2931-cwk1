# COMP2931 Coursework 1 - Ryan Wan

All the files and folders were created on computers running CentOS 7 in DEC-10.

This repository contains a checks the validity of methods relating to calendar dates in the "Date.java" file through a series of tests in the "DateTest.java" files.

To run complete the following instructions:

1) Open terminal and navigate to where the cwk1 directory is located, which should contain "build.xml" and "README.md" files, as well the "lib" and "src" folders.

2) To compile the relevant files enter "ant" into the terminal. The terminal should create a bin file display a message saying "BUILD SUCCESSFUL". There should also be files in "Date.class" and "DateTest.class" in the newly created "bin" folder.

3) To run tests, type "ant test" into the terminal to run the tests in the "DateTest.java". All tests should pass, which should be display a message stating "Tests run: 13" with "Failures: 0" and "Errors: 0".

4) Type "ant docs" to generate "doc" folder that contains documentaion related to the classes and other features used.

5) To remove the addtional folders "ant clean" to get rid of all the unnecessary folders ("bin" and "doc").
