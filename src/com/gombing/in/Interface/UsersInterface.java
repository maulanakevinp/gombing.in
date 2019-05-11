/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Interface;

import com.gombing.in.Models.M_Users;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MaulanaKevinPradana
 */
public interface UsersInterface {
    public void insert(M_Users m)throws SQLException;
    public void update(M_Users m)throws SQLException;
    public void delete(M_Users m)throws SQLException;
    public void checkLogin(M_Users m)throws SQLException;
    public ArrayList<M_Users> getAll()throws SQLException;
    public ArrayList<String> fillComboBox()throws SQLException;
}
