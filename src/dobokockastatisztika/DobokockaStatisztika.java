/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dobokockastatisztika;

import java.util.Scanner;

/**
 * @author Mr.KaraszekZoltán
 */
public class DobokockaStatisztika {

    /**
     * @param args the command line arguments
     */
    String sorozat = "123146166661611115555152444425";

    public static void main(String[] args) {
        // TODO code application logic here
        Tesztesetek t = new Tesztesetek();
        t.setUpAll();
        t.setUpStreams();
        t.tesztSzam();
        t.tesztHossz();
        t.restoreStreams();
    }

    int beolvas() {

        Scanner sc = new Scanner(System.in);
        int dobas;
        dobas = sc.nextInt();
        while (dobas < 1 || dobas > 6) {
            dobas = sc.nextInt();
        }
        return dobas;
    }

    void leghosszabb(int szam) {
        int maxHossz = 0;
        int aktualHossz = 0;
        boolean sorozatE = false;
        for (int i = 0; i < sorozat.length(); i++) {
            if (sorozat.charAt(i) == szam) {
                if (sorozatE) {
                    aktualHossz++;
                } else {
                    aktualHossz = 1;
                    sorozatE = true;
                }
            } else {
                if (sorozatE && (aktualHossz > maxHossz)) {
                    maxHossz = aktualHossz;
                }
                sorozatE = false;
            }
        }
        String ered = "";
        for (int i = 0; i < maxHossz; i++) {
            ered += String.valueOf(szam);
        }
        System.out.printf("%s: %d", ered, maxHossz);
    }
}
