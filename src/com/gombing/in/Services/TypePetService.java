/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Services;

import com.gombing.in.Interface.TypePetInterface;
import com.gombing.in.Models.M_TypePet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MaulanaKevinPradana
 */
public class TypePetService implements TypePetInterface {

    private Connection con;
    private final String sql_select = "SELECT id, type_pet FROM public.type_pet order by id;",
            sql_insert = "INSERT INTO public.type_pet (type_pet) VALUES (?);",
            sql_update = "UPDATE public.type_pet SET type_pet=? WHERE id=?",
            sql_delete = "DELETE FROM public.type_pet WHERE id=?";
    
    public void setCon(Connection con) {
        this.con = con;
    }

    @Override
    public void insert(M_TypePet m) throws SQLException {
        try {
            PreparedStatement st = con.prepareStatement(sql_insert);
            st.setString(1, m.getType_pet());
            st.executeUpdate();            
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
    }

    @Override
    public void update(M_TypePet m) throws SQLException {
        try {
            PreparedStatement st = con.prepareStatement(sql_update);
            st.setString(1, m.getType_pet());
            st.setInt(2, m.getId());
            st.executeUpdate();            
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
    }

    @Override
    public void delete(M_TypePet m) throws SQLException {
        try {
            PreparedStatement st = con.prepareStatement(sql_delete);
            st.setInt(1, m.getId());
            st.executeUpdate();            
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
    }

    @Override
    public ArrayList<M_TypePet> getAll() throws SQLException {
        PreparedStatement st = null;
        ResultSet rs = null;
        ArrayList<M_TypePet> list = null;
        try {
            list = new ArrayList<>();
            st = con.prepareStatement(sql_select);
            rs = st.executeQuery();
            while (rs.next()) {
                M_TypePet m = new M_TypePet();

                m.setId(rs.getInt(1));
                m.setType_pet(rs.getString(2));

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