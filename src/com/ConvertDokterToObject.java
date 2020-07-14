/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.exec_dokter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rizal
 */
public class ConvertDokterToObject {
   public String[][]getdokter(){
        List<dokter> mydok = new ArrayList<dokter>();
        exec_dokter edok = new exec_dokter();
        mydok = edok.getAlldokter();
        String[][] datadokter = new String[mydok.size()][4];
        int i=0;
        for(dokter dok : mydok){
            datadokter[i][0] = dok.getId_dokter();
            datadokter[i][1] = dok.getNama();
            datadokter[i][2] = dok.getAlamat();
            datadokter[i][3] = dok.getKeahlian();
            i++;
        }
        return datadokter;
    } 
}
