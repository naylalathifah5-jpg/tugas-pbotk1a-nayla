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
public class soal3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int awal, akhir;
        int jumlah = 0;
        int total = 0;

        System.out.print("Batas awal: ");
        awal = in.nextInt();

        System.out.print("Batas akhir: ");
        akhir = in.nextInt();

        for (int i = awal; i <= akhir; i++) {
            if (i % 11 == 0 && i % 2 != 0) {
                System.out.print(i + " ");
                jumlah++;
                total += i;
            }
        }

        int rata = 0;
        if (jumlah != 0) {
            rata = total / jumlah;
        }

        System.out.println("\nJumlah = " + jumlah);
        System.out.println("Rata-rata = " + rata);
    }
}

