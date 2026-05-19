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
public class Bis extends Transportasi{
    private double biayaTiket;

    public Bis(double biayaTiket, String namaPenumpang, String tujuan) {
        super(namaPenumpang, tujuan);
        this.biayaTiket = biayaTiket;
    }

    public double getBiayaTiket() {
        return biayaTiket;
    }

    public void setBiayaTiket(double biayaTiket) {
        this.biayaTiket = biayaTiket;
    }
    
 
    @Override
    public void prosesKeberangkatan(){
        System.out.println("Perjalanan Mobil");
        System.out.println("Biaya transportasi: "+biayaTiket);
    }
}
