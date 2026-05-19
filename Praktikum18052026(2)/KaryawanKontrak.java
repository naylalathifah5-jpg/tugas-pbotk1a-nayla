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
public class KaryawanKontrak extends Karyawan{
    private double honor;
    private int jam;

    public KaryawanKontrak(double honor, int jam, String nama, int id) {
        super(nama, id);
        this.honor = honor;
        this.jam = jam;
    }

    public double getHonor() {
        return honor;
    }

    public void setHonor(double honor) {
        this.honor = honor;
    }

    public int getJam() {
        return jam;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }
    
    @Override
    public void prosesGaji(){
        System.out.println("Anda Karyawan Kontrak");
        System.out.println("Honor Anda: "+honor);
        double totalGaji=honor*jam;
        System.out.println("Total Gaji Anda: "+totalGaji);
    }
}
