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
public class MainTransportasi {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        
        Transportasi transportasi=null;
        
        System.out.println("====Perjalanan Via Darat====");
        System.out.println("Masukkan Nama Penumpang= ");
        String nama=scanner.nextLine();
        
        System.out.println("Masukkan Tujuan Penumpang= ");
        String tujuan=scanner.nextLine();
        
        System.out.println("Pilih jenis transportas Darat: ");
        System.out.println("1. Mobil");
        System.out.println("2. Motor");
        System.out.println("3. Bis");
        System.out.println("4. Kereta");
        System.out.println("Pilih metode perjalanan anda (1/2/3/4): ");
        int pilihan=scanner.nextInt();
        scanner.nextLine(); //buffer clear
        
        switch(pilihan){
            case 1 : System.out.println("Perjalanan Menggunakan Mobil");
                     System.out.print("masukkan biaya perjalanan: ");
                     double biaya=scanner.nextDouble();
                     transportasi=new Mobil(biaya,nama,tujuan);
                     break;
            
            case 2 : System.out.println("Perjalanan Menggunakan Motor");
                     System.out.print("masukkan biaya perjalanan: ");
                     double harga=scanner.nextDouble();
                     transportasi=new Motor(harga,nama,tujuan);
                     break;
                     
            case 3 : System.out.println("Perjalanan Menggunakan Bis");
                     System.out.print("masukkan biaya perjalanan: ");
                     double biayaTiket=scanner.nextDouble();
                     transportasi=new Bis(biayaTiket,nama,tujuan);
                     break;
        
            case 4 : System.out.println("Perjalanan Menggunakan Kereta");
                     System.out.print("masukkan biaya perjalanan: ");
                     double hargaTiket=scanner.nextDouble();
                     transportasi=new Kereta(hargaTiket,nama,tujuan);
                     break;
        }
        System.out.println("\n===Konfirmasi Bukti Pembayaran===");
        transportasi.prosesKeberangkatan();
    }
    
}

