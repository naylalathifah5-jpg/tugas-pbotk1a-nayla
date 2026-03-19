/*
 * Nama          : Nayla Lathifah Hasna
 * NIM           : 2501081005
 * Kelas         : Teknik Komputer 1A
 * Tanggal Tugas : 19 Maret 2026
 */
package PraktikumOnlineDeadline27maret2026;

/**
 *
 * @author Nayla latifah hasna
 */

import java.util.Scanner;
public class soal9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n;

        System.out.print("Masukkan ukuran: ");
        n = in.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int s = 1; s < i; s++) {
                System.out.print("  ");
            }

            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}
