/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import exec.exec_obat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rizal
 */
public class ConvertObatToObject {
    public String[][]getobat(){
        List<obat> myob = new ArrayList<obat>();
        exec_obat eob = new exec_obat();
        myob = eob.getAllobat();
        String[][] dataobat = new String[myob.size()][3];
        int i=0;
        for(obat ob : myob){
            dataobat[i][0] = ob.getId_obat();
            dataobat[i][1] = ob.getNama_obat();
            dataobat[i][2] = ob.getJenis_obat();
            i++;
        }
        return dataobat;
    } 
}
