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
public class Table_Users extends AbstractTableModel {

    private ArrayList<M_Users> list = new ArrayList<>();
    
    @SuppressWarnings("MismatchedReadAndWriteOfArray")
    private final String[] header = {"ID", "Name", "Email", "Password", "Level", "Status", "Update at", "Created at"};

    public void setList(ArrayList<M_Users> list) {
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
        M_Users m = list.get(rowIndex);
        switch (columnIndex) {
            case 0: return m.getId();
            case 1: return m.getName();
            case 2: return m.getEmail();
            case 3: return m.getPassword();
            case 4: return m.getLevelName();
            case 5: return m.getStatus();
            case 6: return m.getUpdated_at();
            case 7: return m.getCreated_at();
            default: return null;
        }

    }
    
}
