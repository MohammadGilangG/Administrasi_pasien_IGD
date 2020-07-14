/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import com.rawatinap;
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
public class exec_rawatinap {
  public List<rawatinap> getAllrawatinap(){
        String query = "select * from rawatinap";
        ConnectionManager conMan = new ConnectionManager();
        List<rawatinap> lsrawatinap = new ArrayList<rawatinap>();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                rawatinap ri = new rawatinap();
                ri.setKode_ruangan(rs.getString("kode_ruangan"));
                ri.setNama_ruangan(rs.getString("nama_ruangan"));
                ri.setId_pasien(rs.getString("id_pasien"));
                ri.setNama_pasien(rs.getString("nama_pasien"));
                lsrawatinap.add(ri);
            }
        } catch (SQLException ex) {
            Logger.getLogger(exec_rawatinap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return lsrawatinap;
    }
  
  public int insertData(rawatinap ri){

        int hasil = 0;
        String query ="Insert into rawatinap(kode_ruangan, nama_ruangan, id_pasien, nama_pasien)"
                +" values('"+ri.getKode_ruangan()+"','"+ri.getNama_ruangan()+"','"+ri.getId_pasien()+"','"+ri.getNama_pasien()+"')";
        ConnectionManager conMan = new ConnectionManager();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            hasil = stm.executeUpdate(query);
            System.out.println(query);
        } catch (SQLException ex) {
            Logger.getLogger(exec_rawatinap.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(query);
        }
        conMan.logOff();
        return hasil;
    }
}
