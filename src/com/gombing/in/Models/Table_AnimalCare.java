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
public class Table_AnimalCare extends AbstractTableModel {

    private ArrayList<M_AnimalCare> list = new ArrayList<>();

    @SuppressWarnings("MismatchedReadAndWriteOfArray")
    private final String[] header = {"Id","Animal Name","User","Weight","Body Length","Chest Size","Height","Comment","Timestamp"};

    public void setList(ArrayList<M_AnimalCare> list) {
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
        M_AnimalCare m = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return m.getId();
            case 1:
                return m.getAnimal_name();
            case 2:
                return m.getAnimal_owner();
            case 3:
                return m.getWeight();
            case 4:
                return m.getBody_length();
            case 5:
                return m.getChest_size();
            case 6:
                return m.getHeight();
            case 7:
                return m.getComment();
            case 8:
                return m.getTimestamp();
            default:
                return null;
        }

    }
}
