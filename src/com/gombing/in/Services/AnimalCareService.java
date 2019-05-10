/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Services;

import com.gombing.in.Interface.AnimalCareInterface;
import com.gombing.in.Models.M_Animal;
import com.gombing.in.Models.M_AnimalCare;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MaulanaKevinPradana
 */
public class AnimalCareService implements AnimalCareInterface {

    private Connection con;
    private final String sql_select = "SELECT ac.id, animal.animal_name, users.name , ac.weight, ac.body_length, \n"
            + "ac.chest_size, ac.height, ac.comment, ac.timestamp\n"
            + "FROM public.animal_care ac join public.animal on ac.id_animal=animal.id\n"
            + "join public.users ON users.id = ac.id_user;";

    public void setCon(Connection con) {
        this.con = con;
    }

    @Override
    public void insert(M_AnimalCare m) throws SQLException {

    }

    @Override
    public void update(M_AnimalCare m) throws SQLException {

    }

    @Override
    public void delete(M_AnimalCare m) throws SQLException {

    }

    @Override
    public ArrayList<M_AnimalCare> getAll() throws SQLException {
        PreparedStatement st = null;
        ResultSet rs = null;
        ArrayList<M_AnimalCare> list = null;
        try {
            list = new ArrayList<>();
            st = con.prepareStatement(sql_select);
            rs = st.executeQuery();
            while (rs.next()) {
                M_AnimalCare m = new M_AnimalCare();

                m.setId(rs.getInt(1));
                m.setAnimal_name(rs.getString(2));
                m.setAnimal_owner(rs.getString(3));
                m.setWeight(rs.getDouble(4));
                m.setBody_length(rs.getDouble(5));
                m.setChest_size(rs.getDouble(6));
                m.setHeight(rs.getDouble(7));
                m.setComment(rs.getString(8));
                m.setTimestamp(rs.getTimestamp(9));

                list.add(m);
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return list;
    }

}
