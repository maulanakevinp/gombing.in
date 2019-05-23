/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Services;

import com.gombing.in.Interface.UsersInterface;
import com.gombing.in.Models.M_Users;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MaulanaKevinPradana
 */
public class UsersService implements UsersInterface {

    private Connection con;
    private final String sql_login = "SELECT id, level, email, password, phone_number, address, user_photo FROM public.users WHERE email=? AND password=?;",
            sql_select = "SELECT u.id, u.name, u.email, u.password, level.level, u.status, u.updated_at, u.created_at FROM public.users u join public.level on u.level = level.id;",
            sql_insert = "INSERT INTO public.users (name, email, password, level, status, updated_at, created_at) VALUES (?,?,?,?,?,?,?)",
            sql_update = "UPDATE public.users SET name = ?, email = ?, password = ?, level = ?, status = ?, updated_at = ? WHERE id = ?",
            sql_delete = "DELETE FROM public.users WHERE id = ?",
            sql_getIdUser = "SELECT id FROM public.users Where name = ?";
    
    public void setCon(Connection con) {
        this.con = con;
    }

    @Override
    public void insert(M_Users m) throws SQLException {
        try {
            PreparedStatement st = con.prepareStatement(sql_insert);
            st.setString(1, m.getName());
            st.setString(2, m.getEmail());
            st.setString(3, m.getPassword());
            st.setInt(4, m.getLevelId());
            st.setInt(5, m.getStatus());
            st.setDate(6, new java.sql.Date(m.getUpdated_at1().getTime()));
            st.setDate(7, new java.sql.Date(m.getCreated_at1().getTime()));
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
    }

    @Override
    public void update(M_Users m) throws SQLException {
        try {
            PreparedStatement st = con.prepareStatement(sql_update);
            st.setString(1, m.getName());
            st.setString(2, m.getEmail());
            st.setString(3, m.getPassword());
            st.setInt(4, m.getLevelId());
            st.setInt(5, m.getStatus());
            st.setDate(6, new java.sql.Date(m.getUpdated_at1().getTime()));
            st.setInt(7, m.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
    }

    @Override
    public void delete(M_Users m) throws SQLException {
        try {
            PreparedStatement st = con.prepareStatement(sql_delete);
            st.setInt(1, m.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
    }

    @Override
    public ArrayList<M_Users> getAll() throws SQLException {
        PreparedStatement st = null;
        ResultSet rs = null;
        ArrayList<M_Users> list = null;
        try {
            list = new ArrayList<>();
            st = con.prepareStatement(sql_select);
            rs = st.executeQuery();
            while (rs.next()) {
                M_Users user = new M_Users();

                user.setId(rs.getInt(1));
                user.setName(rs.getString(2));
                user.setEmail(rs.getString(3));
                user.setPassword(rs.getString(4));
                user.setLevelName(rs.getString(5));
                user.setStatus(rs.getInt(6));
                user.setUpdated_at(rs.getDate(7));
                user.setCreated_at(rs.getDate(8));

                list.add(user);
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return list;
    }

    @Override
    public void checkLogin(M_Users m) throws SQLException {
        try {
            PreparedStatement st = con.prepareStatement(sql_login);
            st.setString(1, m.getEmail());
            st.setString(2, m.getPassword());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                m.setId(rs.getInt(1));
                m.setLevelId(rs.getInt(2));
                m.setEmail(rs.getString(3));
                m.setPassword(rs.getString(4));
                m.setPhone_number(rs.getString(5));
                m.setAddress(rs.getString(6));
                m.setUser_photo(rs.getBlob(7));
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
    }
    
    @Override
    public ArrayList<String> fillComboBoxUser() throws SQLException {
        ArrayList<String> list = new ArrayList<>();
        String query = "SELECT name FROM public.users where level = 4";
        try {
            list = new ArrayList<>();
            PreparedStatement st = con.prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(rs.getString(1));
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return list;
    }

    @Override
    public int getId(String name) throws SQLException {
        int hasil = 0;
        try {
            PreparedStatement st = con.prepareStatement(sql_getIdUser);
            st.setString(1, name);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                hasil = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return hasil;
    }

}
