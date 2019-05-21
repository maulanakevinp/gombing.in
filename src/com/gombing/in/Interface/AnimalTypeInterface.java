/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Interface;

import com.gombing.in.Models.M_AnimalType;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MaulanaKevinPradana
 */
public interface AnimalTypeInterface {
    public void insert(M_AnimalType m)throws SQLException;
    public void update(M_AnimalType m)throws SQLException;
    public void delete(M_AnimalType m)throws SQLException;
    public ArrayList<M_AnimalType> getAll()throws SQLException;
    public ArrayList<String> fillComboBox()throws SQLException;
    public int getId(String name)throws SQLException;
}
