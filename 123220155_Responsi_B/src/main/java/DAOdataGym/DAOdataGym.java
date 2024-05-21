/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOdataGym;
import java.sql.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import koneksi.connec;
import Bulk.*;
import DAOImplements.DAOGym;
    
/**
 *
 * @author Lab Informatika
 */
public class DAOdataGym implements DAOGym{
    Connection connection;
    final String select = "SELECT * FROM gym";
    final String create = "INSERT INTO gym (nama, alat, nomor, waktu, biaya) VALUES (?, ?, ?, ?, ?);";
    public DAOdataGym(){
        connection = connec.connection();
    }
}
