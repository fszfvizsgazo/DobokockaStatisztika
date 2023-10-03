/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dobokockastatisztika;

/**
 *
 * @author Mr.KaraszekZoltán
 */
public class DobokockaStatisztika {

    /**
     * @param args the command line arguments
     */
    String sorozat="123146166661611115555152444425";
    public static void main(String[] args) {
        // TODO code application logic here
        Tesztesetek t=new Tesztesetek();
        t.setUpAll();
        t.setUpStreams();
        t.tesztSzam();
        t.tesztHossz();
        t.restoreStreams();
    }
    int beolvas(){
        return 6;
    }
    void leghosszabb(int szam){
        System.out.printf("%s: %d","6666",4);
    }
}
