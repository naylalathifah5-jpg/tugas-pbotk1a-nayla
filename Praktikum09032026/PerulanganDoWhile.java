/*
 * Program : PerulanganDoWhile.java
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
public class PerulanganDoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        System.out.print("Masukkan nomor awal : ");
        int awal = input.nextInt();
        System.out.print("Masukkan nomor akhir: ");
        int akhir = input.nextInt();
        
        System.out.println("Misi yang membuka portal adalah:");
        for (int i = awal; i <= akhir; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
        
        System.out.println(); 
    }
    
}
