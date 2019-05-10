/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Interface;

import com.gombing.in.Models.M_Animal;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MaulanaKevinPradana
 */
public interface RecordingAnimalInterface {
    public void insert(M_Animal m)throws SQLException;
    public void update(M_Animal m)throws SQLException;
    public void delete(M_Animal m)throws SQLException;
    public ArrayList<M_Animal> getAll()throws SQLException;
}
