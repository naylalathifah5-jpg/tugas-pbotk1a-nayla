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
public class soal7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jam lembur karyawan: ");
        int jam = in.nextInt();
        
        if (jam > 50)
            jam = 50;
        
        int upah;
        if (jam <= 20) {
            upah = jam * 2000;
        } else {
            upah = jam * 3000;
        }
        
        System.out.println("Total upah lembur: Rp " + upah); 
    }
}
