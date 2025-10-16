package hello;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

class HelloMEITREXTest {

    @Test
    void testPrintsHelloMEITREX() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream buffer = new ByteArrayOutputStream();
        System.setOut(new PrintStream(buffer));
        try {
            Main.main(new String[0]);
        } finally {
            System.setOut(originalOut);
        }
        // Accept with or without trailing newline
        String out = buffer.toString().replace("\r", "");
        if (out.endsWith("\n")) out = out.substring(0, out.length() - 1);
        assertEquals("Hello MEITREX", out, "Expected exact output: Hello MEITREX");
    }
}