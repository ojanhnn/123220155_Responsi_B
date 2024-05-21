/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.util.List;
import javax.swing.JOptionPane;
import DAOdataGym.DAOdataGym;
import DAOImplements.DAOGym;
import Bulk.*;
import View.*;
/**
 *
 * @author Lab Informatika
 */
public class GymController {
    MainView frame;
    DAOMovie impldataGym;
    List<dataMovie>dp;
    public dataGymcontroller(MainView Frame){
        this.frame = frame;
        impldataGym= new DAOdataGym();
        dp=impldataGym;
    }
    public void isitable(){
        dp=impldataGym.getALL()
                tabledataGym mp = new tabledataGym;
                frame.getGymTable().setModel(mp);
    }
}
