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
public class registrasi {
    private String id_pasien;
    private String nama;
    private String alamat;
    private String email;
    private String no_telp;

    public registrasi() {
    }

    public registrasi(String id_pasien, String nama, String alamat, String email, String no_telp) {
        this.id_pasien = id_pasien;
        this.nama = nama;
        this.alamat = alamat;
        this.email = email;
        this.no_telp = no_telp;
    }

    public String getId_pasien() {
        return id_pasien;
    }

    public void setId_pasien(String id_pasien) {
        this.id_pasien = id_pasien;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNo_telp() {
        return no_telp;
    }

    public void setNo_telp(String no_telp) {
        this.no_telp = no_telp;
    }

    @Override
    public String toString() {
        return "registrasi{" + "id_pasien=" + id_pasien + ", nama=" + nama + ", alamat=" + alamat + ", email=" + email + ", no_telp=" + no_telp + '}';
    }
    
    
    
}
