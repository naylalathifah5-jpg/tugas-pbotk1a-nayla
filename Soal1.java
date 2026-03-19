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
public class Soal1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int totalHlmn = 50;
        int hargaPerhlmn = 15000;
        
        System.out.print("Masukan jumlah halaman yang sudah selesai(x):");
        int x = in.nextInt();
        
        int uangDiterima = x * hargaPerhlmn;
        int sisaHlmn = totalHlmn - x;
        int uangPotensial = sisaHlmn * hargaPerhlmn;
        
        System.out.println("Uang yang pasti diterima Dina: " + uangDiterima + " Rupiah");
        System.out.println("Uang yang masih bisa didapat : " + uangPotensial + " Rupiah");
    }
}
