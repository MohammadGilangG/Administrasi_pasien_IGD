/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.exec_pemeriksaan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rizal
 */
public class ConvertPemeriksaanToObject {
   public String[][]getpemeriksaan(){
        List<pemeriksaan> myprksa = new ArrayList<pemeriksaan>();
        exec_pemeriksaan eprksa = new exec_pemeriksaan();
        myprksa = eprksa.getAllpemeriksaan();
        String[][] dataperiksa = new String[myprksa.size()][5];
        int i=0;
        for(pemeriksaan prksa : myprksa){
            dataperiksa[i][0] = prksa.getId_periksa();
            dataperiksa[i][1] = prksa.getTgl_periksa();
            dataperiksa[i][2] = prksa.getDiagnosa();
            dataperiksa[i][3] = prksa.getRawat();
            dataperiksa[i][4] = prksa.getPenyakit();
            i++;
        }
        return dataperiksa;
    }  
}
