/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum300326;

/**
 *
 * @author Nayla latifah hasna
 */
import java.util.Scanner;
public class MainkelasMahasiswa {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        kelasMahasiswa pp1 = new kelasMahasiswa();
        
        System.out.print("Nama =");
        String n = in.nextLine();
        System.out.print("NIM = ");
        String ni = in.nextLine();
        
        System.out.println("Masukkan Nilai");
        System.out.print("Tugas = ");
        pp1.tugas = in.nextInt();
        System.out.print("Uts = ");
        pp1.uts = in.nextInt();
        System.out.print("Uas = ");
        pp1.uas = in.nextInt();
        
        int nilai = pp1.hitungNilaiAkhir();
        System.out.println("nilai akhir = "+nilai);
        
    }
    
}
