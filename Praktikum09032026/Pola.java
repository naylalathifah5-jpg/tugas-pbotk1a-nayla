/*
 * Program : PerulanganDoWhile.java
 * pembuat : nayla lathifah hasna
 * Tanggal : 9 maret 2026
 * Deskripsi : pola bintang
 */
package Praktikum09032026;

/**
 *
 * @author Nayla latifah hasna
 */

import java.util.Scanner;
public class Pola {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka : ");
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
          
            for (int j = 0; j < n; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }   
}
