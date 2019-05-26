/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Interface;

import com.gombing.in.Models.M_Level;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MaulanaKevinPradana
 */
public interface LevelInterface {
    public void getId(M_Level m)throws SQLException;
    public ArrayList<String> fillComboBoxLevel()throws SQLException;    
}
