/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum06042026;
import java.util.Scanner;
/**
 *
 * @author Nayla latifah hasna
 */
public class MainMahasiswaEnkapsulasi {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

        //INPUT MAHASISWA 1
        System.out.println("=== Input Data Mahasiswa 1 ===");
        System.out.print("Nama       : ");
        String nama1 = in.nextLine();
        System.out.print("NIM        : ");
        String nim1 = in.nextLine();
        System.out.print("Jurusan    : ");
        String jurusan1 = in.nextLine();
        System.out.print("Umur       : ");
        int umur1 = in.nextInt();
        System.out.print("IPK        : ");
        double ipk1 = in.nextDouble();
        in.nextLine(); 

        //konstruktor parameter
        MahasiswaEnkapsulasi mhs1 = new MahasiswaEnkapsulasi
        (nama1, nim1, jurusan1, umur1, ipk1);

        System.out.println("\n=== Data Mahasiswa 1 ===");
        mhs1.info();
        System.out.println("Status Kelulusan : " + mhs1.statusKelulusan());
        System.out.println();

        // INPUT MAHASISWA 2 
        System.out.println("=== Input Data Mahasiswa 2 ===");
        MahasiswaEnkapsulasi mhs2 = new MahasiswaEnkapsulasi();

        System.out.print("Nama       : ");
        mhs2.setNama(in.nextLine());
        System.out.print("NIM        : ");
        mhs2.setNim(in.nextLine());
        System.out.print("Jurusan    : ");
        mhs2.setJurusan(in.nextLine());
        System.out.print("Umur       : ");
        mhs2.setUmur(in.nextInt());
        System.out.print("IPK        : ");
        mhs2.setIpk(in.nextDouble());

        // Tampilkan data
        System.out.println("\n=== Data Mahasiswa 2 ===");
        mhs2.info();
        System.out.println("Status Kelulusan : " + mhs2.statusKelulusan());
        in.close();
    }
}
