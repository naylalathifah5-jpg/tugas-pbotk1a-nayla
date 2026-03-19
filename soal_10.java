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
public class soal_10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tujuan, kelas, jumlah;
        int harga = 0;

        System.out.println("Pilih Tujuan:");
        System.out.println("1. Jakarta");
        System.out.println("2. Yogya");
        System.out.println("3. Surabaya");
        System.out.print("Masukkan pilihan: ");
        tujuan = in.nextInt();

        System.out.println("Pilih Kelas:");
        System.out.println("1. Eksekutif");
        System.out.println("2. Bisnis");
        System.out.println("3. Ekonomi");
        System.out.print("Masukkan pilihan: ");
        kelas = in.nextInt();

        System.out.print("Jumlah tiket: ");
        jumlah = in.nextInt();

        if (tujuan == 1) {
            if (kelas == 1) harga = 70000;
            else if (kelas == 2)harga = 40000;
            else if (kelas == 3) harga = 10000;
        } 
        else if (tujuan == 2) { 
            if (kelas == 1) harga = 80000;
            else if (kelas == 2) harga = 50000;
            else if (kelas == 3) harga = 20000;
        } 
        else if (tujuan == 3) { 
            if (kelas == 1) harga = 90000;
            else if (kelas == 2) harga = 60000;
            else if (kelas == 3) harga = 30000;
        }

        int total = harga * jumlah;
        int diskon = 0;

        if (tujuan == 3 && kelas == 1 && jumlah >= 4) {
            diskon = total * 10 / 100;
        }

        if (tujuan == 2 && kelas == 3 && jumlah >= 4) {
            diskon = total * 10 / 100;
        }

        int bayar = total - diskon;

        System.out.println("Harga tiket = Rp " + harga);
        System.out.println("Total harga = Rp " + total);
        System.out.println("Diskon = Rp " + diskon);
        System.out.println("Total bayar = Rp " + bayar);
    }
}