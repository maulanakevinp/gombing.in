/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Services;

import com.gombing.in.Interface.UsersInterface;
import com.gombing.in.Models.M_Users;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.tomcat.util.http.fileupload.IOUtils;

/**
 *
 * @author MaulanaKevinPradana
 */
public class UsersService implements UsersInterface {

    private Connection con;
    private final String sql_login = "SELECT id, level, name, email, password, phone_number, address, user_photo, status FROM public.users WHERE email=? AND password=?;",
            sql_select = "SELECT u.id, u.name, u.email, u.password, level.level, u.status, u.updated_at, u.created_at, u.phone_number, u.address, u.user_photo FROM public.users u join public.level on u.level = level.id;",
            sql_insert = "INSERT INTO public.users (name, email, password, level, status, updated_at, created_at, phone_number, address, user_photo) VALUES (?,?,?,?,?,?,?,?,?,?)",
            sql_update = "UPDATE public.users SET name = ?, email = ?, password = ?, level = ?, status = ?, updated_at = ?, phone_number = ?, address = ? WHERE id = ?",
            sql_delete = "DELETE FROM public.users WHERE id = ?",
            sql_getIdUser = "SELECT id FROM public.users Where name = ?",
            sql_getPhoto = "SELECT user_photo FROM public.users WHERE id = ?",
            sql_getPass = "SELECT password FROM public.users WHERE email = ?",
            sql_updatePhoto = "UPDATE public.users SET user_photo = ? WHERE id = ?";
    
    public void setCon(Connection con) {
        this.con = con;
    }

    @Override
    public void insert(M_Users m) throws SQLException {
        try {
            InputStream is = new FileInputStream(new File(m.getPath()));
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            IOUtils.copy(is, output);
            byte[] filecontent = output.toByteArray();
            PreparedStatement st = con.prepareStatement(sql_insert);
            st.setString(1, m.getName());
            st.setString(2, m.getEmail());
            st.setString(3, m.getPassword());
            st.setInt(4, m.getLevelId());
            st.setInt(5, m.getStatus());
            st.setDate(6, new java.sql.Date(m.getUpdated_at1().getTime()));
            st.setDate(7, new java.sql.Date(m.getCreated_at1().getTime()));
            st.setString(8, m.getPhone_number());
            st.setString(9, m.getAddress());
            st.setBytes(10, filecontent);
            st.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR : " + e,"Error",JOptionPane.ERROR_MESSAGE);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UsersService.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR : " + ex,"Error",JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(UsersService.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR : " + ex,"Error",JOptionPane.ERROR_MESSAGE);
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
            st.setString(7, m.getPhone_number());
            st.setString(8, m.getAddress());
            st.setInt(9, m.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR : " + e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(M_Users m) throws SQLException {
        try {
            PreparedStatement st = con.prepareStatement(sql_delete);
            st.setInt(1, m.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR : " + e,"Error",JOptionPane.ERROR_MESSAGE);
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
                user.setPhone_number(rs.getString(9));
                user.setAddress(rs.getString(10));
                user.setFile(rs.getBinaryStream(11));

                list.add(user);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR : " + e,"Error",JOptionPane.ERROR_MESSAGE);
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
                m.setName(rs.getString(3));
                m.setEmail(rs.getString(4));
                m.setPassword(rs.getString(5));
                m.setPhone_number(rs.getString(6));
                m.setAddress(rs.getString(7));
                m.setFile(rs.getBinaryStream(8));
                m.setStatus(rs.getInt(9));
            }
        } catch (SQLException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "ERROR : " + e,"Error",JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "ERROR : " + e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }

    @Override
    public void getId(M_Users m) throws SQLException {
        try {
            PreparedStatement st = con.prepareStatement(sql_getIdUser);
            st.setString(1, m.getName());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                m.setId(rs.getInt(1)); 
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR : " + e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void getPhoto(M_Users m)throws SQLException{
        try {
            PreparedStatement st = con.prepareStatement(sql_getPhoto);
            st.setInt(1, m.getId());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                m.setFile(rs.getBinaryStream(1));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR : " + e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void getPass(M_Users m)throws SQLException{
        try {
            PreparedStatement st = con.prepareStatement(sql_getPass);
            st.setString(1, m.getEmail());
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                m.setPassword(rs.getString(1));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR : " + e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void updatePhoto(M_Users m) throws SQLException {
        try {
            InputStream is = new FileInputStream(new File(m.getPath()));
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            IOUtils.copy(is, output);
            byte[] filecontent = output.toByteArray();
            PreparedStatement st = con.prepareStatement(sql_updatePhoto);            
            st.setBytes(1, filecontent);
            st.setInt(2, m.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR : " + e,"Error",JOptionPane.ERROR_MESSAGE);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UsersService.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR : " + ex,"Error",JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            Logger.getLogger(UsersService.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR : " + ex,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
}
