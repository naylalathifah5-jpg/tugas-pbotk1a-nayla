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
public class SmartWatch extends Smartphone {
    private int ukuranLayar;
    private boolean tahanAir;
    public SmartWatch(){
        
    }
    public SmartWatch(String merek, int tahunProduksi, int garansi, int kapasitasBaterai, int jumlahKamera, int ukuranLayar, boolean tahanAir) {
        super(merek, tahunProduksi, garansi, kapasitasBaterai, jumlahKamera);
        this.ukuranLayar=ukuranLayar;
        this.tahanAir=tahanAir;
    }
    public int getUkuranLayar(){
        return ukuranLayar;
    }
    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar=ukuranLayar;
    }
    public boolean isTahanAir(){
        return tahanAir;
    }
    public void setTahanAir(boolean tahanAir){
        this.tahanAir=tahanAir;
    }
    
}
