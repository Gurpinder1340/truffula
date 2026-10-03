import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ColorPrinterTest {

  @Test
  void testPrintlnWithRedColorAndReset() {
    // Arrange: Capture the printed output
    ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    PrintStream printStream = new PrintStream(outputStream);

    ColorPrinter printer = new ColorPrinter(printStream);
    printer.setCurrentColor(ConsoleColor.RED);

    // Act: Print the message
    String message = "I speak for the trees";
    printer.println(message);


    String expectedOutput = ConsoleColor.RED + "I speak for the trees" + System.lineSeparator() + ConsoleColor.RESET;

    // Assert: Verify the printed output
    assertEquals(expectedOutput, outputStream.toString());
  }


@Test 
void testPrintWithBlueColorAndReset() {
  // Arrange: 
ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
PrintStream printStream = new PrintStream(outputStream);


// Test the constructor with color blue
ColorPrinter printer = new ColorPrinter(printStream);
printer.setCurrentColor(ConsoleColor.BLUE);


// Act:
printer.print("Hello");

String expectedOutput = ConsoleColor.BLUE + "Hello" + ConsoleColor.RESET;


// Assert:
assertEquals(expectedOutput, outputStream.toString());

}

@Test 
void testPrintWithoutReset() {
  //Arrange:
ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
PrintStream printStream = new PrintStream(outputStream);

ColorPrinter printer = new ColorPrinter(printStream);
printer.setCurrentColor(ConsoleColor.GREEN);

// Act:
printer.print("Hello", false);

//Assert:
String expectedOutput = ConsoleColor.GREEN + "Hello";

assertEquals(expectedOutput, outputStream.toString());
}

}
