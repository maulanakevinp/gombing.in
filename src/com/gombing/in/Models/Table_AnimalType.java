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
public class Table_AnimalType extends AbstractTableModel{

    private ArrayList<M_AnimalType> list = new ArrayList<>();
    
    @SuppressWarnings("MismatchedReadAndWriteOfArray")
    private final String[] header = {"Id", "Animal Type"};

    public void setList(ArrayList<M_AnimalType> list) {
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
        M_AnimalType m = list.get(rowIndex);
        switch (columnIndex) {
            case 0: return m.getId();
            case 1: return m.getAnimal_type();
            default: return null;
        }

    }
}