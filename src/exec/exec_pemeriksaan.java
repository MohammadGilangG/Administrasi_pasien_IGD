/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;

import com.pemeriksaan;
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
public class exec_pemeriksaan {
    public List<pemeriksaan> getAllpemeriksaan(){
        String query = "select * from pemeriksaan";
        ConnectionManager conMan = new ConnectionManager();
        List<pemeriksaan> lsprksa = new ArrayList<pemeriksaan>();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                pemeriksaan prksa = new pemeriksaan();
                prksa.setId_periksa(rs.getString("Id_periksa"));
                prksa.setTgl_periksa(rs.getString("tgl_periksa"));
                prksa.setRawat(rs.getString("rawat"));
                prksa.setDiagnosa(rs.getString("diagnosa"));
                prksa.setPenyakit(rs.getString("penyakit"));
                lsprksa.add(prksa);
            }
        } catch (SQLException ex) {
            Logger.getLogger(exec_rawatinap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return lsprksa;
    }
    public int insertData(pemeriksaan prksa){

        int hasil = 0;
        String query ="Insert into pemeriksaan(id_periksa, tgl_periksa, rawat, diagnosa, penyakit)"
                +" values('"+prksa.getId_periksa()+"','"+prksa.getTgl_periksa()+"','"+prksa.getRawat()+"','"
                +prksa.getDiagnosa()+"','"+prksa.getPenyakit()+"')";
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
