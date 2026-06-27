/*
 * Program : kelipatan5.java
 * pembuat : nayla lathifah hasna
 * Tanggal : 2 maret 2026
 * Deskripsi : Menentukan sebuah bilangan merupakan kelipatan 5 atau bukan
 */
package Praktikum02032026;

/**
 *
 * @author LAB-SI-PC
 */

import java.util.Scanner;

public class bilangankelipatan {
    public static void main(String[] args){
        int bilangan;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("===Program Menentukan Kelipatan 5 atau bukan===");
        System.out.print("Bilangan = ");
        bilangan = in.nextInt();
        if (bilangan%5==0)
            System.out.println(bilangan +" merupakan bilangan kelipatan 5");
        else //bilangan%5!=0
            System.out.println(bilangan +" BUKAN bilangan kelipatan 5");
        //endif
    }
    
}
