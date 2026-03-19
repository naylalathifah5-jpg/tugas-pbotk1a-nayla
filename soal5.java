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
public class soal5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int awal, akhir;

        System.out.print("Awal: ");
        awal = in.nextInt();

        System.out.print("Akhir: ");
        akhir = in.nextInt();

        for (int i = awal; i <= akhir; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
