/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import com.dokter;
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
public class exec_dokter {
    public List<dokter> getAlldokter(){
        String query = "select * from dokter";
        ConnectionManager conMan = new ConnectionManager();
        List<dokter> lsdokter = new ArrayList<dokter>();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                dokter dok = new dokter();
                dok.setId_dokter(rs.getString("id_dokter"));
                dok.setNama(rs.getString("nama"));
                dok.setAlamat(rs.getString("alamat"));
                dok.setKeahlian(rs.getString("keahlian"));
                lsdokter.add(dok);
            }
        } catch (SQLException ex) {
            Logger.getLogger(exec_rawatinap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return lsdokter;
    }
}
