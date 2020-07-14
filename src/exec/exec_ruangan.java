/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import com.ruangan;
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
public class exec_ruangan {
  public List<ruangan> getAllruangan(){
        String query = "select * from ruangan";
        ConnectionManager conMan = new ConnectionManager();
        List<ruangan> lsruangan = new ArrayList<ruangan>();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                ruangan ruang = new ruangan();
                ruang.setKode_ruangan(rs.getString("kode_ruangan"));
                ruang.setNama_ruangan(rs.getString("nama_ruangan"));
                lsruangan.add(ruang);
            }
        } catch (SQLException ex) {
            Logger.getLogger(exec_rawatinap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return lsruangan;
    }
}  

