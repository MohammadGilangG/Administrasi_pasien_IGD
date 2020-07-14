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
public class rawatinap {
    private String kode_ruangan;
    private String nama_ruangan;
    private String id_pasien;
    private String nama_pasien;

    public rawatinap() {
    }

    public rawatinap(String nama_ruangan, String id_pasien, String nama_pasien) {
        this.nama_ruangan = nama_ruangan;
        this.id_pasien = id_pasien;
        this.nama_pasien = nama_pasien;
    }

    public rawatinap(String kode_ruangan, String nama_ruangan, String id_pasien, String nama_pasien) {
        this.kode_ruangan = kode_ruangan;
        this.nama_ruangan = nama_ruangan;
        this.id_pasien = id_pasien;
        this.nama_pasien = nama_pasien;
    }

    public String getKode_ruangan() {
        return kode_ruangan;
    }

    public void setKode_ruangan(String kode_ruangan) {
        this.kode_ruangan = kode_ruangan;
    }

    public String getNama_ruangan() {
        return nama_ruangan;
    }

    public void setNama_ruangan(String nama_ruangan) {
        this.nama_ruangan = nama_ruangan;
    }

    public String getId_pasien() {
        return id_pasien;
    }

    public void setId_pasien(String id_pasien) {
        this.id_pasien = id_pasien;
    }

    public String getNama_pasien() {
        return nama_pasien;
    }

    public void setNama_pasien(String nama_pasien) {
        this.nama_pasien = nama_pasien;
    }

    @Override
    public String toString() {
        return "rawatinap{" + "kode_ruangan=" + kode_ruangan + ", nama_ruangan=" + nama_ruangan + ", id_pasien=" + id_pasien + ", nama_pasien=" + nama_pasien + '}';
    }
    
    

    
    
}
