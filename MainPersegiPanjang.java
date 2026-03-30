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
public class MainPersegiPanjang {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        PersegiPanjang pp1 = new PersegiPanjang();
        pp1.panjang = 20;
        pp1.lebar = 10;
        int luas =pp1.hitungLuas();
        System.out.println("Objek Persegi Panjang pertama");
        System.out.println("Panjang = "+pp1.panjang);
        System.out.println("Lebar   = "+pp1.lebar);
        System.out.println("Luas    = "+    luas);
        System.out.println("Keliling   = "+pp1.hitungKeliling());
       //membuat objek kedua menggunakan konstruktor 2
        PersegiPanjang pp2 = new PersegiPanjang(10,5);
        luas =pp2.hitungLuas();
        System.out.println("Objek Persegi Panjang kedua");
        System.out.println("Panjang = "+pp2.panjang);
        System.out.println("Lebar   = "+pp2.lebar);
        System.out.println("Luas    = "+luas);
        System.out.println("Keliling   = "+pp2.hitungKeliling());
        //membuat objek kedua menggunakan konstruktor 3
        Scanner input = new Scanner (System.in);
        System.out.println("Objek Persegi Panjang ketiga");
        System.out.println("Panjang = ");
        int pj = input.nextInt();
        System.out.println("lebar = ");
        int lb = input.nextInt();
        PersegiPanjang pp3 = new PersegiPanjang(pj,lb);
        System.out.println("Luas ="+pp3.hitungLuas());
        System.out.println("keliling ="+pp3.hitungKeliling());
    }
    
    
    
}
