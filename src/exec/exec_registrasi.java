/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exec;
import com.registrasi;
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
public class exec_registrasi {
     public List<registrasi> getAllregistrasi(){
        String query = "select * from registrasi";
        ConnectionManager conMan = new ConnectionManager();
        List<registrasi> lsregis = new ArrayList<registrasi>();
        Connection conn = conMan.logOn();
        try {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery(query);
            while(rs.next()){
                registrasi regis = new registrasi();
                regis.setId_pasien(rs.getString("id_pasien"));
                regis.setNama(rs.getString("nama"));
                regis.setAlamat(rs.getString("alamat"));
                regis.setEmail(rs.getString("email"));
                regis.setNo_telp(rs.getString("no_telp"));
                lsregis.add(regis);
            }
        } catch (SQLException ex) {
            Logger.getLogger(exec_rawatinap.class.getName()).log(Level.SEVERE, null, ex);
        }
        conMan.logOff();
        return lsregis;
    }
     public int insertData(registrasi regis){

        int hasil = 0;
        String query ="Insert into registrasi(id_pasien, nama, alamat, email, no_telp)"
                +" values('"+regis.getId_pasien()+"','"+regis.getNama()+"','"+regis.getAlamat()
                +"','"+regis.getEmail()+"','"+regis.getNo_telp()+"')";
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
