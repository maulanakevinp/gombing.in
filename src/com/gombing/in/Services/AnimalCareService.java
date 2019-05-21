/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Services;

import com.gombing.in.Interface.AnimalCareInterface;
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
    private final String sql_select = "SELECT ac.id, animal.animal_name, users.name , ac.weight, ac.body_length, "
            + "ac.chest_size, ac.height, ac.comment, ac.timestamp "
            + "FROM public.animal_care ac join public.animal on ac.id_animal=animal.id "
            + "join public.users ON users.id = ac.id_user;",
            sql_insert = "INSERT INTO public.animal_care (id_animal, id_users, weight, body_length, chest_size, height, comment, timestamp) VALUES (?,?,?,?,?,?,?,?)",
            sql_update = "UPDATE public.animal_care SET id_animal = ?, id_users = ?, weight = ?, body_length = ?, chest_size = ?, height = ?, comment = ?, timestamp = ? WHERE id = ?",
            sql_delete = "DELETE FROM public.animal_care WHERE id = ?";

    public void setCon(Connection con) {
        this.con = con;
    }

    @Override
    public void insert(M_AnimalCare m) throws SQLException {
        try {
            PreparedStatement st = con.prepareCall(sql_insert);
            st.setInt(1, m.getId_animal());
            st.setInt(2, m.getId_user());
            st.setDouble(3, m.getWeight());
            st.setDouble(4, m.getBody_length());
            st.setDouble(5, m.getChest_size());
            st.setDouble(6, m.getHeight());
            st.setString(7, m.getComment());
            st.setTimestamp(8, m.getTimestamp1());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR : " + e);
        }
    }

    @Override
    public void update(M_AnimalCare m) throws SQLException {
        try {
            PreparedStatement st = con.prepareCall(sql_update);
            st.setInt(1, m.getId_animal());
            st.setInt(2, m.getId_user());
            st.setDouble(3, m.getWeight());
            st.setDouble(4, m.getBody_length());
            st.setDouble(5, m.getChest_size());
            st.setDouble(6, m.getHeight());
            st.setString(7, m.getComment());
            st.setTimestamp(8, m.getTimestamp1());
            st.setInt(9, m.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR : " + e);
        }
    }

    @Override
    public void delete(M_AnimalCare m) throws SQLException {
        try {
            PreparedStatement st = con.prepareCall(sql_delete);
            st.setInt(1, m.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println("ERROR : "+e);
        }
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

                m.setId(rs.getInt("id"));
                m.setAnimal_name(rs.getString("animal_name"));
                m.setAnimal_owner(rs.getString("name"));
                m.setWeight(rs.getDouble("weight"));
                m.setBody_length(rs.getDouble("body_length"));
                m.setChest_size(rs.getDouble("chest_size"));
                m.setHeight(rs.getDouble("height"));
                m.setComment(rs.getString("comment"));
                m.setTimestamp(rs.getTimestamp("timestamp"));

                list.add(m);

            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return list;
    }

}
