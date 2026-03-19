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
public class soal6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Masukkan umur PNP: ");
        int umur = in.nextInt();
        
        if (umur % 10 == 0) {
            int angkaDekade = umur / 10;
            System.out.println("Output: Dekade PNP Ke " + angkaDekade);
        } else {
            System.out.println("Output: Dies Natalis PNP Ke " + umur);
        }
    }
}
