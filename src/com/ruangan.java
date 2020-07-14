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
public class ruangan {
    private String kode_ruangan;
    private String nama_ruangan;

    public ruangan() {
    }

    public ruangan(String nama_ruangan) {
        this.nama_ruangan = nama_ruangan;
    }

    public ruangan(String kode_ruangan, String nama_ruangan) {
        this.kode_ruangan = kode_ruangan;
        this.nama_ruangan = nama_ruangan;
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

    @Override
    public String toString() {
        return "ruangan{" + "kode_ruangan=" + kode_ruangan + ", nama_ruangan=" + nama_ruangan + '}';
    }
    
    
    
}
