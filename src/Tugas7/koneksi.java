package Tugas7;

import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author Asus
 */
public class koneksi {
    public static Connection con;
    
    public static Connection getConnection(){
        try{
            con = DriverManager.getConnection(
            "jdbc:mysql://localhost:3306/praktikum_visual","root","");
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Koneksi Gagal: "
                +e.getMessage());
        }
        return con;
    }
}
