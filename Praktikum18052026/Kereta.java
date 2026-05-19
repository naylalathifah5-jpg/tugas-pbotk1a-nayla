/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum18052026;

/**
 *
 * @author Nayla latifah hasna
 */
public class Kereta extends Transportasi{
    private double hargaTiket;

    public Kereta(double hargaTiket, String namaPenumpang, String tujuan) {
        super(namaPenumpang, tujuan);
        this.hargaTiket = hargaTiket;
    }

    public double getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(double hargaTiket) {
        this.hargaTiket = hargaTiket;
    }
    
    public void prosesKeberangkatan(){
        System.out.println("Perjalanan Mobil");
        System.out.println("Biaya transportasi: "+hargaTiket);
    }
}
