/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Interface;

import com.gombing.in.Models.M_AnimalCare;
import com.gombing.in.Models.M_Users;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MaulanaKevinPradana
 */
public interface AnimalCareInterface {
    public void insert(M_AnimalCare m)throws SQLException;
    public void update(M_AnimalCare m)throws SQLException;
    public void delete(M_AnimalCare m)throws SQLException;
    public ArrayList<M_AnimalCare> getAll()throws SQLException;    
    public ArrayList<M_AnimalCare> getAllOwnerHave(M_Users mu)throws SQLException;
}
