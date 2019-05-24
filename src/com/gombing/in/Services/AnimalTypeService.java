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
import javax.swing.JOptionPane;

/**
 *
 * @author MaulanaKevinPradana
 */
public class AnimalTypeService implements AnimalTypeInterface {

    private Connection con;
    private final String sql_select = "SELECT id, animal_type FROM public.animal_type order by id;",
            sql_insert = "INSERT INTO public.animal_type (animal_type) VALUES (?);",
            sql_update = "UPDATE public.animal_type SET animal_type=? WHERE id=?",
            sql_delete = "DELETE FROM public.animal_type WHERE id=?",
            sql_getIdAnimalType = "SELECT id FROM public.animal_type Where animal_type = ?";

    public void setCon(Connection con) {
        this.con = con;
    }

    @Override
    public void insert(M_AnimalType m) throws SQLException {
        try {
            PreparedStatement st = con.prepareStatement(sql_insert);
            st.setString(1, m.getAnimal_type());
            st.executeUpdate();            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR : " + e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(M_AnimalType m) throws SQLException {
        try {
            PreparedStatement st = con.prepareStatement(sql_update);
            st.setString(1, m.getAnimal_type());
            st.setInt(2, m.getId());
            st.executeUpdate();            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR : " + e,"Error",JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(M_AnimalType m) throws SQLException {
        try {
            PreparedStatement st = con.prepareStatement(sql_delete);
            st.setInt(1, m.getId());
            st.executeUpdate();            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR : " + e,"Error",JOptionPane.ERROR_MESSAGE);
        }
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
            JOptionPane.showMessageDialog(null, "ERROR : " + e,"Error",JOptionPane.ERROR_MESSAGE);
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
            JOptionPane.showMessageDialog(null, "ERROR : " + e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }

    @Override    
    public int getId(String name) throws SQLException {
        int hasil = 0;
        try {
            PreparedStatement st = con.prepareStatement(sql_getIdAnimalType);
            st.setString(1, name);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                hasil = rs.getInt(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR : " + e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return hasil;
    }
}
