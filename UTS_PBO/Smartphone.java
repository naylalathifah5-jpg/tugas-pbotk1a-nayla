/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_PBO;

/**
 *
 * @author Nayla latifah hasna
 */
public class Smartphone extends Elektronik {
    private int kapasitasBaterai;
    private int jumlahKamera;
    public Smartphone(){
        
    }
    public Smartphone(String merek, int tahunProduksi, int garansi, int kapasitasBaterai, int jumlahKamera) {
        super(merek, tahunProduksi, garansi);
        this.kapasitasBaterai=kapasitasBaterai;
        this.jumlahKamera=jumlahKamera;
    }
    public int getKapasitasBaterai (){
        return kapasitasBaterai;
    }
    public void setKapasitasBaterai(int kapasitasBaterai){
        this.kapasitasBaterai=kapasitasBaterai;
    }
    public int getJumlahKamera (){
        return jumlahKamera;
    }
    public void setJumlahKamera (int jumlahKamera){
        this.jumlahKamera=jumlahKamera;
    }
}
