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
public class Table_TypePet extends AbstractTableModel {

    private ArrayList<M_TypePet> list = new ArrayList<>();

    @SuppressWarnings("MismatchedReadAndWriteOfArray")
    private final String[] header = {"Id", "Type Pet"};

    public void setList(ArrayList<M_TypePet> list) {
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
        M_TypePet m = list.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return m.getId();
            case 1:
                return m.getType_pet();
            default:
                return null;
        }
    }

    public void save(M_TypePet m) {
        list.add(m);
        fireTableRowsInserted(list.size()-1, list.size()-1);
    }
}
