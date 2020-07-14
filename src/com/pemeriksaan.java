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
public class pemeriksaan {
    private String id_periksa;
    private String tgl_periksa;
    private String rawat;
    private String diagnosa;
    private String penyakit;
    
    public pemeriksaan() {
    }

    public pemeriksaan(String tgl_periksa, String rawat, String diagnosa, String penyakit) {
        this.tgl_periksa = tgl_periksa;
        this.rawat = rawat;
        this.diagnosa = diagnosa;
        this.penyakit = penyakit;
    }

    public pemeriksaan(String id_periksa, String tgl_periksa, String rawat, String diagnosa, String penyakit) {
        this.id_periksa = id_periksa;
        this.tgl_periksa = tgl_periksa;
        this.rawat = rawat;
        this.diagnosa = diagnosa;
        this.penyakit = penyakit;
    }

    public String getId_periksa() {
        return id_periksa;
    }

    public void setId_periksa(String id_periksa) {
        this.id_periksa = id_periksa;
    }

    public String getTgl_periksa() {
        return tgl_periksa;
    }

    public void setTgl_periksa(String tgl_periksa) {
        this.tgl_periksa = tgl_periksa;
    }

    public String getRawat() {
        return rawat;
    }

    public void setRawat(String rawat) {
        this.rawat = rawat;
    }

    public String getDiagnosa() {
        return diagnosa;
    }

    public void setDiagnosa(String diagnosa) {
        this.diagnosa = diagnosa;
    }

    public String getPenyakit() {
        return penyakit;
    }

    public void setPenyakit(String penyakit) {
        this.penyakit = penyakit;
    }

    @Override
    public String toString() {
        return "pemeriksaan{" + "id_periksa=" + id_periksa + ", tgl_periksa=" + tgl_periksa + ", rawat=" + rawat + ", diagnosa=" + diagnosa + ", penyakit=" + penyakit + '}';
    }
    
    
    
    
    
    
}
