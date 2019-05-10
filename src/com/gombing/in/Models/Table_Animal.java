/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Models;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author MaulanaKevinPradana
 */
public class Table_Animal extends AbstractTableModel{

    private ArrayList<M_Animal> list = new ArrayList<>();
    
    @SuppressWarnings("MismatchedReadAndWriteOfArray")
    private final String[] header = {"ID", "Animal Name", "Animal Type", "Gender", "Birthdate", "Animal Owner", "Skin Color", "Ear Type", "Type Pet", "Update at","Created at"};

    public void setList(ArrayList<M_Animal> list) {
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public String getColumnName(int column) {
        return header[column];
    }
    
    @Override
    public int getColumnCount() {
        return header.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        M_Animal m = list.get(rowIndex);
        switch (columnIndex) {
            case 0: return m.getId();
            case 1: return m.getAnimal_name();
            case 2: return m.getAnimal_type();
            case 3: return m.getGender();
            case 4: return m.getBirthdate();
            case 5: return m.getAnimal_owner();
            case 6: return m.getSkin_color();
            case 7: return m.getEar_type();
            case 8: return m.getType_pet();
            case 9: return m.getCreated_at();
            case 10: return m.getCreated_at();
            default: return null;
        }

    }
    
}
