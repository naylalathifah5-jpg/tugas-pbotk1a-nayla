/*
 * Program : PersegiPanjang.java
 * pembuat : nayla lathifah hasna
 * Tanggal : 30 maret 2026
 * Deskripsi : Persegi Panjang
 */
package Praktikum300326;

/**
 *
 * @author Nayla latifah hasna
 */

//atribut
public class PersegiPanjang {
    int panjang; //atribut
    int lebar; //atribut
    
    //konstruktor
    PersegiPanjang(){
        
    }
    
    PersegiPanjang(int a, int b){
        panjang = a;
        lebar = b;
    }
    
    //method
    int hitungLuas(){
        return(panjang*lebar);
    }
    
    int hitungKeliling(){
        return (2*(panjang*lebar));
    }
}
