/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Services;

import com.gombing.in.Interface.RecordingAnimalInterface;
import com.gombing.in.Models.M_Animal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MaulanaKevinPradana
 */
public class AnimalService implements RecordingAnimalInterface{

    private Connection con;
    private final String sql_select = "Select a.id, a.animal_name, animal_type.animal_type, a.gender, a.birth_date, "
                + "users.name, a.skin_color, a.ear_type, type_pet.type_pet, a.updated_at, a.created_at "
                + "From public.animal a join public.animal_type on a.animal_type = animal_type.id "
                + "join public.users on a.id_user = users.id join public.type_pet on a.type_pet = type_pet.id;";

    public void setCon(Connection con) {
        this.con = con;
    }
    
    @Override
    public void insert(M_Animal m) throws SQLException {
        
    }

    @Override
    public void update(M_Animal m) throws SQLException {
        
    }

    @Override
    public void delete(M_Animal m) throws SQLException {
        
    }

    @Override
    public ArrayList<M_Animal> getAll() throws SQLException {
        PreparedStatement st = null;
        ResultSet rs = null;
        ArrayList<M_Animal> list = null;
        try {
            list = new ArrayList<>();
            st = con.prepareStatement(sql_select);
            rs = st.executeQuery();
            while (rs.next()) {
                M_Animal m = new M_Animal();
                
                m.setId(rs.getInt(1));
                m.setAnimal_name(rs.getString(2));
                m.setAnimal_type(rs.getString(3));
                m.setGender(rs.getString(4));
                m.setBirthdate(rs.getDate(5));
                m.setAnimal_owner(rs.getString(6));
                m.setSkin_color(rs.getString(7));
                m.setEar_type(rs.getString(8));
                m.setType_pet(rs.getString(9));
                m.setUpdated_at(rs.getDate(10));
                m.setCreated_at(rs.getDate(11));
                
                list.add(m);
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return list;        
    }
    
}
