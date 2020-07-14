/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

/**
 *
 * @author rizal
 */
public class dokter {
    private String id_dokter;
    private String nama;
    private String alamat;
    private String keahlian;

    public dokter() {               //Wadah Variable
    }

    public dokter(String nama, String alamat, String keahlian) {    //Wadah selain primary
        this.nama = nama;
        this.alamat = alamat;
        this.keahlian = keahlian;
    }

    public dokter(String id_dokter, String nama, String alamat, String keahlian) {      //Wadah semua variable
        this.id_dokter = id_dokter;
        this.nama = nama;
        this.alamat = alamat;
        this.keahlian = keahlian;
    }

    public String getId_dokter() {      //getter & setter 
        return id_dokter;
    }

    public void setId_dokter(String id_dokter) {
        this.id_dokter = id_dokter;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getKeahlian() {
        return keahlian;
    }

    public void setKeahlian(String keahlian) { //getter & setter
        this.keahlian = keahlian;
    }

    @Override
    public String toString() {
        return "dokter{" + "id_dokter=" + id_dokter + ", nama=" + nama + ", alamat=" + alamat + ", keahlian=" + keahlian + '}';
    }

}

    

