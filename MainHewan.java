/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum27042026;

/**
 *
 * @author Nayla latifah hasna
 */
public class MainHewan {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            //pembuatan objek
            Hewan hewanku = new Hewan ("Makhluk Hidup");
            Kucing kucingku = new Kucing ("Bobby");
            Anjing anjingku = new Anjing ("Helly");
            //mengakses super class
            System.out.println("Tampilkan akses super class Hewan");
            hewanku.tampilkanNama();
            hewanku.bersuara();
            
            //mengakses sub class kucing
            System.out.println("\nTampilkan akses sub class kucing");
            kucingku.tampilkanNama();
            kucingku.bersuara();
        }
  }
