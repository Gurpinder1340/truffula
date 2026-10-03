import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;

public class TruffulaOptionsTest {

  @Test
  void testValidDirectoryIsSet(@TempDir File tempDir) throws FileNotFoundException {
    // Arrange: Prepare the arguments with the temp directory
    File directory = new File(tempDir, "subfolder");
    directory.mkdir();
    String directoryPath = directory.getAbsolutePath();
    String[] args = {"-nc", "-h", directoryPath};

    // Act: Create TruffulaOptions instance
    TruffulaOptions options = new TruffulaOptions(args);

    // Assert: Check that the root directory is set correctly
    assertEquals(directory.getAbsolutePath(), options.getRoot().getAbsolutePath());
    assertTrue(options.isShowHidden());
    assertFalse(options.isUseColor());
  }
@Test 
void testwithNoFlags(@TempDir File tempDir) throws FileNotFoundException {
//Arrange: set up the directory with no flags
String[] args = {tempDir.getAbsolutePath()};

// Act: creates TruffulaOptions
TruffulaOptions options = new TruffulaOptions(args);

// Assert: checks the default settings
assertFalse(options.isShowHidden());
assertTrue(options.isUseColor());
}

@Test
void testHiddenFlag(@TempDir File tempDir) throws FileNotFoundException {
  // Arrange: Set up the directory with the -h flag
  String[] args = {"-h", tempDir.getAbsolutePath()};

  // Act: Create TruffulaOptions
  TruffulaOptions options = new TruffulaOptions(args);

  // Assert: Check that hidden files are on and color is on
  assertTrue(options.isShowHidden());
  assertTrue(options.isUseColor());
}
@Test 
void testNoColorFlag(@TempDir File tempDir) throws FileNotFoundException {
  // Arrange: Set up the directory with the -nc flag
  String[] args = {"-nc", tempDir.getAbsolutePath()};

  // Act: Create TruffulaOptions
  TruffulaOptions options = new TruffulaOptions(args);

  // Assert: Check that hidden files are on and color is on
  assertFalse(options.isShowHidden());
  assertFalse(options.isUseColor());

}

}
