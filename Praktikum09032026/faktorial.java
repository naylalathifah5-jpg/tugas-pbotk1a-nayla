/*
 * Program : faktorial.java
 * pembuat : nayla lathifah hasna
 * Tanggal : 9 maret 2026
 * Deskripsi : perulangan do while
 */
package Praktikum09032026;

/**
 *
 * @author Nayla latifah hasna
 */

import java.util.Scanner;
public class faktorial {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        int angka;
        int hasil = 1;
        
        System.out.print("masukkan angka = "); 
        angka = input.nextInt();
        
        for(int i=1; i<=angka; i++){
            hasil = hasil * i;
        }
        System.out.println("nilai faktorial dari "+ angka + " adalah " + hasil);
    }
}
