# COMP2931 Coursework 1 - Ryan Wan

Note: All the files and folders were created on computers running CentOS 7 in DEC-10.


This repository contains a checks the validity of methods relating to calendar dates in the "Date.java" file through a series of tests in the "DateTest.java" files.


Requirements

Make sure the repository contains "src" and "lib" folders and a "build.xml" file.

Apache Ant must be installed on the computer for any of the commands listed below to work.


Instructions for Linux

To run complete the following instructions:

1) Open terminal and navigate to where the cwk1 directory is located, which should contain "build.xml" and "README.md" files, as well the "lib" and "src" folders.

2) To compile the relevant files and run the tests enter "ant" into the terminal. The terminal should create a "bin" folder, which should contain "Date.class" and "DateTest.class" inside. Tests should now run and pass, which can be verified by checking the display message that states "Tests run: 13" with "Failures: 0" and "Errors: 0". "BUILD SUCCESSFUL" should appear near the bottom signifying that the compile and testing was successful.

3) (Optional) Type "ant docs" to generate a "doc" folder that contains documentation related to the classes and methods.

4) (Optional) To remove the addtional folders "ant clean" to get rid of all the unnecessary folders ("bin" and "doc").
