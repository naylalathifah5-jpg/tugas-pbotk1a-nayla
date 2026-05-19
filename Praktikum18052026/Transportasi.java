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
public abstract class Transportasi {
    protected String namaPenumpang;
    protected String tujuan;

    public Transportasi(String namaPenumpang, String tujuan) {
        this.namaPenumpang = namaPenumpang;
        this.tujuan = tujuan;
    }

    public String getNamaPenumpang() {
        return namaPenumpang;
    }

    public void setNamaPenumpang(String namaPenumpang) {
        this.namaPenumpang = namaPenumpang;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }
    
    public abstract void prosesKeberangkatan();
}
