/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.exec_ruangan;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rizal
 */
public class ConvertRuanganToObject {
   public String[][]getruangan(){
        List<ruangan> myruang = new ArrayList<ruangan>();
        exec_ruangan eruang = new exec_ruangan();
        myruang = eruang.getAllruangan();
        String[][] dataruangan = new String[myruang.size()][2];
        int i=0;
        for(ruangan ruang : myruang){
            dataruangan[i][0] = ruang.getKode_ruangan();
            dataruangan[i][1] = ruang.getNama_ruangan();
            i++;
        }
        return dataruangan;
    }  
}
