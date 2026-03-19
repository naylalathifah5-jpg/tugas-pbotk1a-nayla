/*
 * Nama          : Nayla Lathifah Hasna
 * NIM           : 2501081005
 * Kelas         : Teknik Komputer 1A
 * Tanggal Tugas : 18 Maret 2026
 */
package PraktikumOnlineDeadline27maret2026;

/**
 *
 * @author Nayla latifah hasna
 */

import java.util.Scanner;
public class soal4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bil;
        
        do {
            System.out.print("Masukkan bilangan genap: ");
            bil = in.nextInt();
            
            if (bil % 2 != 0) {
                System.out.println("Input salah! Itu bilangan ganjil.");
            }
        } while (bil % 2 != 0); 
        
        System.out.println("Hasil akhir (bilangan + 1): " + (bil + 1));
    }
}
