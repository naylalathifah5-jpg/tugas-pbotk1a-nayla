/*
 * Program : Kelas Mahasiswa.java
 * pembuat : nayla lathifah hasna
 * Tanggal : 30 maret 2026
 * Deskripsi : Kelas Mahasiswa
 */
package Praktikum300326;

/**
 *
 * @author Nayla latifah hasna
 */
public class kelasMahasiswa {
    
    int tugas, uts, uas;
    //kontruktor
    
    kelasMahasiswa(){
        
    }
    kelasMahasiswa(int a, int b, int c){
        tugas = a;
        uts = b;
        uas = c;
    }
    
    //method
    int hitungNilaiAkhir(){
        return (int) ((tugas*0.25)+(uts*0.35)+(uas*0.4));
    }
}
