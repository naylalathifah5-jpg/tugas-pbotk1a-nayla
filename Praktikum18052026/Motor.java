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
public class Motor extends Transportasi{
    private double harga;

    public Motor(double harga, String namaPenumpang, String tujuan) {
        super(namaPenumpang, tujuan);
        this.harga = harga;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
    
    @Override
    public void prosesKeberangkatan(){
        System.out.println("Perjalanan Mobil");
        System.out.println("Biaya transportasi: "+harga);
    }
}