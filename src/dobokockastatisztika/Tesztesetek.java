/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dobokockastatisztika;

/**
 *
 * @author Mr.KaraszekZoltán
 */
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class Tesztesetek {
    private static DobokockaStatisztika ds;
    
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }
    
    @BeforeAll
    void setUpAll() {
        ds=new DobokockaStatisztika();
    }
    @Test
    void tesztSzam() {
        int a=ds.beolvas();
        assertTrue(a>=1 && a<=6,"O.K.");
    }
    @Test
    void tesztHossz(){
        ds.leghosszabb(6);
        assertEquals("6666: 4", outContent.toString());
    }
}
