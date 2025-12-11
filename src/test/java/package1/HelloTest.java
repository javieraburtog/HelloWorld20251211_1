package package1;

/**
 * Unit test for the Hello class.
 * <p>
 * This test verifies that the main method of Hello prints the expected output to the console.
 * </p>
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class HelloTest {
    @Test
    void testMainOutput() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));
        try {
            Hello.main(new String[]{});
        } finally {
            System.setOut(originalOut);
        }
        String output = outContent.toString().replace("\r\n", "\n").replace("\r", "\n");
        String expected = "Hello, World!\n" +
                          "Welcome to Maven Project\n" +
                          "This is a simple Java program.\n";
        assertEquals(expected, output);
    }
}