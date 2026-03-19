/*
 * Nama          : Nayla Lathifah Hasna
 * NIM           : 2501081005
 * Kelas         : Teknik Komputer 1A
 * Tanggal Tugas : 19 Maret 2026
 */
package PraktikumOnlineDeadline27maret2026;

/**
 *
 * @author Nayla latifah hasna
 */

public class soal8 {
    public static void main(String[] args) {
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                
                if(i == 0 || i == 4){
                    System.out.print(" 0 ");
                }
                else if(i == j){
                    System.out.print(" 0 ");
                }
                else{
                    System.out.print(" x ");
                }
            }
            System.out.println();
        }
    }   
}
