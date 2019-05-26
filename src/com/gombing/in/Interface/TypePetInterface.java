/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Interface;

import com.gombing.in.Models.M_TypePet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MaulanaKevinPradana
 */
public interface TypePetInterface {
    public void insert(M_TypePet m)throws SQLException;
    public void update(M_TypePet m)throws SQLException;
    public void delete(M_TypePet m)throws SQLException;
    public ArrayList<M_TypePet> getAll()throws SQLException;
    public ArrayList<String> fillComboBox()throws SQLException;
    public void getId(M_TypePet m)throws SQLException;
}
