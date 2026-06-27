/*
 * Program : gajipegawai.java
 * Pembuat : nayla lathifah hasna
 * Tanggal : 2 maret 2026
 * Deskripsi : menghitung gaji bulanan pegawai berdasarkan jam kerja
 */
package Praktikum02032026;

/**
 *
 * @author LAB-SI-PC
 */

import java.util.Scanner;
public class gajipegawai {
    public static void main(String[] args){
        int upahreguler = 50000;
        int upahlembur = 70000;
        int jamkerjareguler, jamkerjalembur, gajisebulan;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("===Program Menghitung Gaji Pegawai===");
        System.out.print("\tJam kerja reguler\t=");
        jamkerjareguler = input.nextInt();
        System.out.print("\tjam kerja lembur\t=");
        jamkerjalembur = input.nextInt();
        gajisebulan = (jamkerjareguler*upahreguler)+(jamkerjalembur*upahlembur);
        System.out.println("\tGaji pegawai bulan ini\t ="+gajisebulan);
      
    }
    
}
