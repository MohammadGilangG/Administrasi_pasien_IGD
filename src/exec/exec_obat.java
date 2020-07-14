/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import com.obat;
import db.ConnectionManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rizal
 */
public class exec_obat {
     public List<obat> getAllobat(){
        String query = "select * from obat";
        ConnectionManager conMan = new ConnectionManager();
        List<obat> lsobat = new ArrayList<obat>();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                obat ob = new obat();
                ob.setId_obat(rs.getString("id_obat"));
                ob.setNama_obat(rs.getString("nama_obat"));
                ob.setJenis_obat(rs.getString("jenis_obat"));
                lsobat.add(ob);
            }
        } catch (SQLException ex) {
            Logger.getLogger(exec_rawatinap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return lsobat;
    }
}
