package hello;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloMEITREXTest {

    @Test
    public void testPrintsHelloMEITREX() {
        // Standardausgabe abfangen
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(out));

        try {
            // Main aufrufen
            Main.main(new String[]{});
        } finally {
            System.setOut(originalOut);
        }

        // Ausgabe prüfen (egal ob mit oder ohne Zeilenumbruch)
        String output = out.toString().replace("\r", "").replace("\n", "");
        assertEquals("Hello MEITREX", output, 
            "Das Programm muss exakt 'Hello MEITREX' ausgeben.");
    }
}