/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLDataException;
/**
 *
 * @author Lab Informatika
 */
public class connec {
    static Connection con;
    public static Connection connection(){
        if(con==null){
            MysqlDataSourcedata=new MysqlDataSource;
            data.setDataName("gym_db");
            data.setUser("root");
            data.setPassword("");
            try{
                con=data.getConnection();
                System.out.println("koneksi berhasil");
            }catch(SQLException ex){
                ex.printStackTrace();
                System.out.println("koneksi gagal");
            }
        }
        return con;
    }
    
}
