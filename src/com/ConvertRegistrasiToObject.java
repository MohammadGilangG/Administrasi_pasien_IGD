/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.exec_registrasi;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author rizal
 */
public class ConvertRegistrasiToObject {
    public String[][]getregistrasi(){
        List<registrasi> myregis = new ArrayList<registrasi>();
        exec_registrasi eregis = new exec_registrasi();
        myregis = eregis.getAllregistrasi();
        String[][] dataregis = new String[myregis.size()][5];
        int i=0;
        for(registrasi regis : myregis){
            dataregis[i][0] = regis.getId_pasien();
            dataregis[i][1] = regis.getNama();
            dataregis[i][2] = regis.getAlamat();
            dataregis[i][3] = regis.getEmail();
            dataregis[i][4] = regis.getNo_telp();
            i++;
        }
        return dataregis;
    }  
}
