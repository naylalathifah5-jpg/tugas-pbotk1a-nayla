/*
 * Nama          : Nayla Lathifah Hasna
 * NIM           : 2501081005
 * Kelas         : Teknik Komputer 1A
 * Tanggal Tugas : 16 Maret 2026
 */
package PraktikumOnlineDeadline27maret2026;

/**
 *
 * @author Nayla latifah hasna
 */

import java.util.Scanner;
public class soal2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int merk, jumlah;
        int harga = 0;
        int total = 0;
        int diskon = 0;

        System.out.println("Pilih merk:");
        System.out.println("1. X");
        System.out.println("2. Y");
        System.out.println("3. Z");
        System.out.print("Masukkan pilihan: ");
        merk = in.nextInt();

        System.out.print("Jumlah beli: ");
        jumlah = in.nextInt();

        if (merk == 1) {
            harga = 40000;
            total = harga * jumlah;
            if (jumlah >= 3) {
                diskon = total * 10 / 100;
            }

        } else if (merk == 2) {
            harga = 50000;
            total = harga * jumlah;
            if (jumlah > 3) {
                diskon = total * 12 / 100;
            }

        } else if (merk == 3) {
            harga = 60000;
            total = harga * jumlah;
            if (jumlah >= 2) {
                diskon = (jumlah - 1) * harga * 15 / 100;
            }
        }

        int bayar = total - diskon;

        System.out.println("Total = Rp " + total);
        System.out.println("Diskon = Rp " + diskon);
        System.out.println("Bayar = Rp " + bayar);
    }
}