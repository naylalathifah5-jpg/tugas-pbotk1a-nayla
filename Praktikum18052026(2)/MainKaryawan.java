/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum18052026;
import java.util.Scanner;
/**
 *
 * @author Nayla latifah hasna
 */
public class MainKaryawan {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        Karyawan karyawan=null;
        
        System.out.println("---Penerimaan Gaji Karyawan---");
        System.out.println("Masukkan Nama Karyawan= ");
        String nama=scanner.nextLine();
        System.out.println("Masukkan ID Karyawan= ");
        int id=scanner.nextInt();
        
        System.out.println("Pilih jenis transportas: ");
        System.out.println("1. Karyawan Tetap");
        System.out.println("2. Karyawan Kontrak");
        System.out.println("Pilihan status Karyawa anda (1/2): ");
        int pilihan=scanner.nextInt();
        scanner.nextLine(); //buffer clear
        
        switch(pilihan){
            case 1: {
                System.out.println("Karyawan Tetap");
                System.out.print("masukkan gaji anda: ");
                double gaji=scanner.nextDouble();
                System.out.print("masukkan tunjangan anda: ");
                double tunjangan=scanner.nextDouble();
                karyawan=new KaryawanTetap(gaji,tunjangan,nama,id);
            }
            
            case 2 : {
                System.out.println("Karyawan Kontrak");
                System.out.print("masukkan honor anda: ");
                double honor=scanner.nextDouble();
                System.out.print("masukkan jam kerja anda: ");
                int jam=scanner.nextInt();
                karyawan=new KaryawanKontrak(honor,jam,nama,id);
            }
        }
        System.out.println("\n==konfirmasi Gaji Anda");
        karyawan.prosesGaji();
    }
    
}