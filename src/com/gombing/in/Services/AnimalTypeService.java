/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Services;

import com.gombing.in.Interface.AnimalTypeInterface;
import com.gombing.in.Models.M_AnimalType;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MaulanaKevinPradana
 */
public class AnimalTypeService implements AnimalTypeInterface {

    private Connection con;
    private final String sql_select = "SELECT id, animal_type FROM public.animal_type order by id;";

    public void setCon(Connection con) {
        this.con = con;
    }

    @Override
    public void insert(M_AnimalType m) throws SQLException {

    }

    @Override
    public void update(M_AnimalType m) throws SQLException {

    }

    @Override
    public void delete(M_AnimalType m) throws SQLException {

    }

    @Override
    public ArrayList<M_AnimalType> getAll() throws SQLException {
        PreparedStatement st = null;
        ResultSet rs = null;
        ArrayList<M_AnimalType> list = null;
        try {
            list = new ArrayList<>();
            st = con.prepareStatement(sql_select);
            rs = st.executeQuery();
            while (rs.next()) {
                M_AnimalType m = new M_AnimalType();

                m.setId(rs.getInt(1));
                m.setAnimal_type(rs.getString(2));

                list.add(m);
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return list;
    }    
    
    @Override
    public ArrayList<String> fillComboBox() throws SQLException {
        ArrayList<String> list = new ArrayList<>();
        try {
            list = new ArrayList<>();
            PreparedStatement st = con.prepareStatement(sql_select);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(rs.getString(2));
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return list;
    }
}
