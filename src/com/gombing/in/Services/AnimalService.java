/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Services;

import com.gombing.in.Interface.RecordingAnimalInterface;
import com.gombing.in.Models.M_Animal;
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
import org.apache.tomcat.util.http.fileupload.IOUtils;

/**
 *
 * @author MaulanaKevinPradana
 */
public class AnimalService implements RecordingAnimalInterface {

    private Connection con;
    private final String sql_select = "Select a.id, a.animal_name, animal_type.animal_type, a.gender, a.birth_date, "
            + "users.name, a.skin_color, a.ear_type, type_pet.type_pet, a.updated_at, a.created_at "
            + "From public.animal a join public.animal_type on a.animal_type = animal_type.id "
            + "join public.users on a.id_user = users.id join public.type_pet on a.type_pet = type_pet.id;",
            sql_insert = "INSERT INTO public.animal (animal_name, animal_type, gender, birth_date, id_user, skin_color, ear_type, type_pet, updated_at, created_at, animal_photo) "
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?);",
            sql_update = "UPDATE public.animal SET animal_name=?, animal_type=?, gender=?, birth_date=?, id_user=?, skin_color=?, ear_type=?, type_pet=?, updated_at=?, animal_photo=?  WHERE id=?",
            sql_delete = "DELETE FROM public.animal WHERE id=?",
            sql_getId = "SELECT id FROM public.animal WHERE animal_name = ?",
            sql_getPhoto = "SELECT animal_photo FROM public.animal WHERE id = ?";

    public void setCon(Connection con) {
        this.con = con;
    }

    @Override
    public void insert(M_Animal m) throws SQLException {
        try {
            InputStream is = new FileInputStream(new File(m.getImage()));
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            IOUtils.copy(is, output);
            byte[] filecontent = output.toByteArray();
            PreparedStatement st = con.prepareStatement(sql_insert);
            st.setString(1, m.getAnimal_name());
            st.setInt(2, m.getId_animal_type());
            st.setString(3, m.getGender());
            st.setDate(4, new java.sql.Date(m.getBirthdate().getTime()));
            st.setInt(5, m.getId_user());
            st.setString(6, m.getSkin_color());
            st.setString(7, m.getEar_type());
            st.setInt(8, m.getId_type_pet());
            st.setDate(9, new java.sql.Date(m.getCreated_at1().getTime()));
            st.setDate(10, new java.sql.Date(m.getUpdated_at1().getTime()));
            st.setBytes(11, filecontent);
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AnimalService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnimalService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(M_Animal m) throws SQLException {
        try {
            InputStream is = new FileInputStream(new File(m.getImage()));
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            IOUtils.copy(is, output);
            byte[] filecontent = output.toByteArray();
            PreparedStatement st = con.prepareStatement(sql_update);
            st.setString(1, m.getAnimal_name());
            st.setInt(2, m.getId_animal_type());
            st.setString(3, m.getGender());
            st.setDate(4, new java.sql.Date(m.getBirthdate().getTime()));
            st.setInt(5, m.getId_user());
            st.setString(6, m.getSkin_color());
            st.setString(7, m.getEar_type());
            st.setInt(8, m.getId_type_pet());
            st.setDate(9, new java.sql.Date(m.getUpdated_at1().getTime()));
            st.setBytes(10, filecontent);
            st.setInt(11, m.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AnimalService.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(AnimalService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(M_Animal m) throws SQLException {
        try {
            PreparedStatement st = con.prepareStatement(sql_delete);
            st.setInt(1, m.getId());
            st.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
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
                m.setUpdated_at(rs.getString(10));
                m.setCreated_at(rs.getString(11));

                list.add(m);
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return list;
    }

    @Override
    public int getId(String name) {
        int hasil = 0;
        try {
            PreparedStatement st = con.prepareStatement(sql_getId);
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

    public InputStream getPhoto(int id) {
        InputStream is = null;
        try {
            PreparedStatement st = con.prepareStatement(sql_getPhoto);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                M_Animal m = new M_Animal();
                is = rs.getBinaryStream(1);
            }
        } catch (SQLException e) {
            System.out.println("Something was wrong. Error: " + e);
        }
        return is;
    }
}
