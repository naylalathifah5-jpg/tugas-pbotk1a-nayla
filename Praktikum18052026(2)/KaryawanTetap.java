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
public class KaryawanTetap extends Karyawan{
    private double gaji;
    private double tunjangan;

    public KaryawanTetap(double gaji, double tunjangan, String nama, int id) {
        super(nama, id);
        this.gaji = gaji;
        this.tunjangan = tunjangan;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }
    
    @Override
    public void prosesGaji(){
        System.out.println("Anda Karyawan Tetap");
        System.out.println("Gaji Anda: "+gaji);
        System.out.println("Tunjangan Anda: "+tunjangan);
        double totalGaji=gaji+tunjangan;
        System.out.println("Total Gaji Anda: "+totalGaji);
    }
}
