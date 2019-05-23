/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Controllers;

import com.gombing.in.DBUtils.config;
import com.gombing.in.Models.M_AnimalCare;
import com.gombing.in.Models.Table_Animal;
import com.gombing.in.Models.Table_AnimalCare;
import com.gombing.in.Views.V_Nurse;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Frame.ICONIFIED;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MaulanaKevinPradana
 */
public class C_Nurse extends V_Nurse{
    
    private final Table_Animal tableAnimal;
    private final Table_AnimalCare tableAnimalCare;
    private final M_AnimalCare modelAnimalCare;
    private final config connection;

    public C_Nurse() {
        Show(true);
        connection = new config();
        connection.getAnimal().setCon(connection.getConnection());
        connection.getAnimalCare().setCon(connection.getConnection());
        connection.getUsers().setCon(connection.getConnection());
        tableAnimal = new Table_Animal();
        tableAnimalCare = new Table_AnimalCare();
        modelAnimalCare = new M_AnimalCare();
        
        comboBoxAnimal();
        comboBoxAnimalOwner();
        
        buttonLogout();
        buttonMinimize();
        buttonMaximize();
        buttonExit();
        dragWindow();

        viewAnimal();
        tableAnimal();
        viewAnimalCare();
        addAnimalCare();
        saveAddAnimalCare();
        cancelAddAnimalCare();
        deleteAnimalCare();
        editAnimalCare();
        saveEditAnimalCare();
        cancelEditAnimalCare();
        refreshAnimalCare();
    }

    // <editor-fold defaultstate="collapsed" desc="Animal">
    private void viewAnimal() {
        getButton_animal().addActionListener((ActionEvent e) -> {
            getColor_animal().setBackground(new Color(0, 255, 0));
            getColor_animalCare().setBackground(new Color(255, 255, 255));
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_animal");
            tableAnimal();
        });
    }

    private void tableAnimal() {
         try {
            tableAnimal.setList(connection.getAnimal().getAll());
            getTable_animal().setModel(tableAnimal);
            getTable_animal().getTableHeader().setOpaque(false);
            getTable_animal().getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            getTable_animal().getTableHeader().setBackground(Color.white);
            getTable_animal().addMouseListener(new MouseAdapter() {
            });
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Animal Care">
    private void viewAnimalCare() {
        getButton_animalCare().addActionListener((ActionEvent e) -> {
            getColor_animalCare().setBackground(new Color(0, 255, 0));
            getColor_animal().setBackground(new Color(255, 255, 255));
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_animalCare");
            tableAnimalCare();
        });
    }

    private void tableAnimalCare() {
        try {
            tableAnimalCare.setList(connection.getAnimalCare().getAll());
            getTable_animalCare().setModel(tableAnimalCare);
            getTable_animalCare().getTableHeader().setOpaque(false);
            getTable_animalCare().getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            getTable_animalCare().getTableHeader().setBackground(Color.white);
            getTable_animalCare().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = getTable_animalCare().getSelectedRow();
                    int id = Integer.parseInt(getTable_animalCare().getValueAt(row, 0).toString());
                    modelAnimalCare.setId(id);
                    getComboBox_animalName1().setSelectedItem(getTable_animalCare().getValueAt(row, 1).toString());
                    getComboBox_animalOwner1().setSelectedItem(getTable_animalCare().getValueAt(row, 2).toString());
                    getEditText_weight1().setText(getTable_animalCare().getValueAt(row, 3).toString());
                    getEditText_bodyLength1().setText(getTable_animalCare().getValueAt(row, 4).toString());
                    getEditText_chestSize1().setText(getTable_animalCare().getValueAt(row, 5).toString());
                    getEditText_height1().setText(getTable_animalCare().getValueAt(row, 6).toString());
                    getEditText_comment1().setText(getTable_animalCare().getValueAt(row, 7).toString());
                }
                
            });
        } catch (SQLException ex) {
            Logger.getLogger(C_Nurse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addAnimalCare() {
        getButton_addAnimalCare().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_addAnimalCare");
        });
    }

    private void saveAddAnimalCare() {
        getButton_saveAddAnimalCare().addActionListener((ActionEvent e) -> {
            try {
                double weight = Double.parseDouble(getEditText_weight().getText());
                double bodyLength = Double.parseDouble(getEditText_bodyLength().getText());
                double chestSize = Double.parseDouble(getEditText_chestSize().getText());
                double Height = Double.parseDouble(getEditText_height().getText());
                modelAnimalCare.setId_animal(connection.getAnimal().getId(getComboBox_animalName().getSelectedItem().toString()));
                modelAnimalCare.setId_user(connection.getUsers().getId(getComboBox_animalOwner().getSelectedItem().toString()));                
                modelAnimalCare.setWeight(weight);
                modelAnimalCare.setBody_length(bodyLength);
                modelAnimalCare.setChest_size(chestSize);
                modelAnimalCare.setHeight(Height);
                modelAnimalCare.setComment(getEditText_comment().getText());                
                connection.getAnimalCare().insert(modelAnimalCare);
                tableAnimalCare();
                CardLayout card = (CardLayout) getPanel_body().getLayout();
                card.show(getPanel_body(), "panel_animalCare");
                getEditText_bodyLength().setText("");
                getEditText_chestSize().setText("");
                getEditText_comment().setText("");
                getEditText_height().setText("");
                getEditText_weight().setText("");
                JOptionPane.showMessageDialog(null, "Success to save data");
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Failed to save data");
            }
        });
    }

    private void cancelAddAnimalCare() {
        getButton_cancelAddAnimalCare().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_animalCare");
        });
    }

    private void editAnimalCare() {
        getButton_editAnimalCare().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_editAnimalCare");
        });
    }

    private void saveEditAnimalCare() {
        getButton_saveEditAnimalCare().addActionListener((ActionEvent e) -> {
            try {
                double weight = Double.parseDouble(getEditText_weight1().getText());
                double bodyLength = Double.parseDouble(getEditText_bodyLength1().getText());
                double chestSize = Double.parseDouble(getEditText_chestSize1().getText());
                double Height = Double.parseDouble(getEditText_height1().getText());
                
                modelAnimalCare.setId_animal(connection.getAnimal().getId( getComboBox_animalName1().getSelectedItem().toString()));
                modelAnimalCare.setId_user(connection.getUsers().getId(getComboBox_animalOwner1().getSelectedItem().toString()));                
                modelAnimalCare.setWeight(weight);
                modelAnimalCare.setBody_length(bodyLength);
                modelAnimalCare.setChest_size(chestSize);
                modelAnimalCare.setHeight(Height);
                modelAnimalCare.setComment(getEditText_comment1().getText());                
                connection.getAnimalCare().update(modelAnimalCare);
                tableAnimalCare();
                CardLayout card = (CardLayout) getPanel_body().getLayout();
                card.show(getPanel_body(), "panel_animalCare");
                getEditText_bodyLength1().setText("");
                getEditText_chestSize1().setText("");
                getEditText_comment1().setText("");
                getEditText_height().setText("");
                getEditText_weight1().setText("");
                JOptionPane.showMessageDialog(null, "Success to save data");
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Failed to save data");
            }
        });
    }

    private void cancelEditAnimalCare() {
        getButton_cancelEditAnimalCare().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_animalCare");
        });
    }
    
    private void deleteAnimalCare(){
        getButton_deleteAnimalCare().addActionListener((ActionEvent e) -> {
            try {
                connection.getAnimalCare().delete(modelAnimalCare);
                tableAnimal();
                JOptionPane.showMessageDialog(null, "Success to delete data");
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Failed to delete data");
            }
        });
    }
    
    private void refreshAnimalCare(){
        getButton_refreshAnimalCare().addActionListener((ActionEvent e) -> {
            tableAnimalCare();
        });
    }
    
    private void comboBoxAnimalOwner(){
        try {
            getComboBox_animalOwner().setModel(new DefaultComboBoxModel(connection.getUsers().fillComboBoxUser().toArray()));
            getComboBox_animalOwner1().setModel(new DefaultComboBoxModel(connection.getUsers().fillComboBoxUser().toArray()));
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void comboBoxAnimal(){
        try {
            getComboBox_animalName().setModel(new DefaultComboBoxModel(connection.getAnimal().fillComboBox().toArray()));
            getComboBox_animalName1().setModel(new DefaultComboBoxModel(connection.getAnimal().fillComboBox().toArray()));
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Logout">
    private void buttonLogout() {
        getButton_logout().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                logout();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                getButton_logout().setForeground(new Color(0, 0, 150));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getButton_logout().setForeground(new Color(0, 0, 255));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                getButton_logout().setForeground(new Color(0, 255, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getButton_logout().setForeground(new Color(0, 0, 255));
            }
        });
    }

    private void logout() {
        int pilihan = JOptionPane.showConfirmDialog(null, "Are you sure to logout?", "Logout", JOptionPane.YES_NO_OPTION);
        if (pilihan == JOptionPane.YES_OPTION) {
            C_Login login = new C_Login();
            dispose();
        } else {

        }
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Maximize">
    private void buttonMaximize() {
        getButton_maximize().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (isMaximized()) {
                    setExtendedState(JFrame.MAXIMIZED_BOTH);
                    GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    setMaximizedBounds(env.getMaximumWindowBounds());
                    setMaximized(false);
                } else {
                    setExtendedState(JFrame.NORMAL);
                    setMaximized(true);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                getButton_maximize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getButton_maximize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                getButton_maximize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px_1.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getButton_maximize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px.png")));
            }
        });
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Exit">
    private void buttonExit() {
        getButton_exit().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exit();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                getButton_exit().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getButton_exit().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                getButton_exit().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px_1.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getButton_exit().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png")));
            }
        });
    }

    private void exit() {
        System.exit(0);
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Minimize">
    private void buttonMinimize() {
        getButton_minimize().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                minimize();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                getButton_minimize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getButton_minimize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                getButton_minimize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getButton_minimize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png")));
            }
        });
    }

    private void minimize() {
        minimize(ICONIFIED);
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Drag Window">
    private void dragWindow() {

        getPanel_undecorated().addMouseListener(new MouseListener() {
            // <editor-fold defaultstate="collapsed" desc="Unused">
            @Override
            public void mouseClicked(MouseEvent e) {

            }//</editor-fold>

            @Override
            public void mousePressed(MouseEvent e) {
                setxMouse(e.getX());
                setyMouse(e.getY());
            }

            // <editor-fold defaultstate="collapsed" desc="Unused">
            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }//</editor-fold>
        });

        getPanel_undecorated().addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int kordinatX = e.getXOnScreen();
                int kordinatY = e.getYOnScreen();

                setLocation(kordinatX - getxMouse(), kordinatY - getyMouse());
            }

            // <editor-fold defaultstate="collapsed" desc="Unused">
            @Override
            public void mouseMoved(MouseEvent e) {

            }//</editor-fold>
        });
    }//</editor-fold>
    
}
