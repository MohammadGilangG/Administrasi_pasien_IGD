/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.exec_rawatinap;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author rizal
 */
public class ConvertRawatInapToObject {
        public String[][]getrawatinap(){
        List<rawatinap> myri = new ArrayList<rawatinap>(); //Membuat ROW tabel
        exec_rawatinap eri = new exec_rawatinap();
        myri = eri.getAllrawatinap();
        String[][] datarawatinap = new String[myri.size()][4];
        int i=0;
        for(rawatinap ri : myri){
            datarawatinap[i][0] = ri.getKode_ruangan();
            datarawatinap[i][1] = ri.getNama_ruangan();
            datarawatinap[i][2] = ri.getId_pasien();
            datarawatinap[i][3] = ri.getNama_pasien();
            i++;
        }
        return datarawatinap;
    }
}
