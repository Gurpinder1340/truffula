# Truffula Notes
As part of Wave 0, please fill out notes for each of the below files. They are in the order I recommend you go through them. A few bullet points for each file is enough. You don't need to have a perfect understanding of everything, but you should work to gain an idea of how the project is structured and what you'll need to implement. Note that there are programming techniques used here that we have not covered in class! You will need to do some light research around things like enums and and `java.io.File`.

PLEASE MAKE FREQUENT COMMITS AS YOU FILL OUT THIS FILE.

## App.java
- main class that starts the program and prints a directory tree
- h: show hidden files -nc: do not use color 
- TruffulaPrinter is used to print the directory tree. 

## ConsoleColor.java
- enum that stores different console text colors using ANSI codes
- RESET changes the text back to normal
- Each color has its own ANSI code 

## ColorPrinter.java / ColorPrinterTest.java
- prints text with different colors in the terminal.
- uses ConsoleColor to set the color and prints message 
- tests to make sure the text is printed correctly


## TruffulaOptions.java / TruffulaOptionsTest.java
- Figures out what setting the user chose based on the options they enter.
- Stores the options the user picked so the program knows how to print the directory tree. 
- Tests to make sure TruffulaOptions correctly reads the users options.


## TruffulaPrinter.java / TruffulaPrinterTest.java
- prints the directory tree like files and folders using different colors.
- TruffulaPrinterTest is test if the files and folders are printed correctly.


## AlphabeticalFileSorter.java
- Sorts the files alphabetically by name
- uses array of files and returns it sorted
