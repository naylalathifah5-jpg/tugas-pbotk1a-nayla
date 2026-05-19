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
public class Mobil extends Transportasi{
    private double biaya;

    public Mobil(double biaya, String namaPenumpang, String tujuan) {
        super(namaPenumpang, tujuan);
        this.biaya = biaya;
    }

    public double getBiaya() {
        return biaya;
    }

    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }
    
    @Override
    public void prosesKeberangkatan(){
        System.out.println("Perjalanan Mobil");
        System.out.println("Biaya transportasi: "+biaya);
    }
}
