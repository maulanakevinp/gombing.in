/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Interface;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MaulanaKevinPradana
 */
public interface LevelInterface {
    public int getId(String name)throws SQLException;
    public ArrayList<String> fillComboBoxLevel()throws SQLException;    
}
