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
    private int a=0;

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
        a=ds.beolvas();
        assertTrue(a>=1 && a<=6,"O.K.");
    }
    @Test
    void tesztHossz(){
        ds.leghosszabb(a);
        switch(a){
            case 1:
                assertEquals("1111: 4", outContent.toString());
                break;
            case 2:
                assertEquals("2: 1", outContent.toString());
                break;
            case 3:
                assertEquals("3: 1", outContent.toString());
                break;
            case 4:
                assertEquals("4444: 4", outContent.toString());
                break;
            case 5:
                assertEquals("5555: 4", outContent.toString());
                break;
            case 6:
                assertEquals("6666: 4", outContent.toString());
                break;
        }
    }
}
