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
public class C_Nurse {
    private final V_Nurse viewNurse;
    private final Table_Animal tableAnimal;
    private final Table_AnimalCare tableAnimalCare;
    private final M_AnimalCare modelAnimalCare;
    private final config connection;


    public C_Nurse() {
        viewNurse = new V_Nurse();
        viewNurse.setVisible(true);
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
        viewNurse.getButton_animal().addActionListener((ActionEvent e) -> {
            viewNurse.getColor_animal().setBackground(new Color(0, 255, 0));
            viewNurse.getColor_animalCare().setBackground(new Color(255, 255, 255));
            CardLayout card = (CardLayout) viewNurse.getPanel_body().getLayout();
            card.show(viewNurse.getPanel_body(), "panel_animal");
            tableAnimal();
        });
    }

    private void tableAnimal() {
         try {
            tableAnimal.setList(connection.getAnimal().getAll());
            viewNurse.getTable_animal().setModel(tableAnimal);
            viewNurse.getTable_animal().getTableHeader().setOpaque(false);
            viewNurse.getTable_animal().getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            viewNurse.getTable_animal().getTableHeader().setBackground(Color.white);
            viewNurse.getTable_animal().addMouseListener(new MouseAdapter() {
            });
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Animal Care">
    private void viewAnimalCare() {
        viewNurse.getButton_animalCare().addActionListener((ActionEvent e) -> {
            viewNurse.getColor_animalCare().setBackground(new Color(0, 255, 0));
            viewNurse.getColor_animal().setBackground(new Color(255, 255, 255));
            CardLayout card = (CardLayout) viewNurse.getPanel_body().getLayout();
            card.show(viewNurse.getPanel_body(), "panel_animalCare");
            tableAnimalCare();
        });
    }

    private void tableAnimalCare() {
        try {
            tableAnimalCare.setList(connection.getAnimalCare().getAll());
            viewNurse.getTable_animalCare().setModel(tableAnimalCare);
            viewNurse.getTable_animalCare().getTableHeader().setOpaque(false);
            viewNurse.getTable_animalCare().getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            viewNurse.getTable_animalCare().getTableHeader().setBackground(Color.white);
            viewNurse.getTable_animalCare().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = viewNurse.getTable_animalCare().getSelectedRow();
                    int id = Integer.parseInt(viewNurse.getTable_animalCare().getValueAt(row, 0).toString());
                    modelAnimalCare.setId(id);
                    viewNurse.getComboBox_animalName1().setSelectedItem(viewNurse.getTable_animalCare().getValueAt(row, 1).toString());
                    viewNurse.getComboBox_animalOwner1().setSelectedItem(viewNurse.getTable_animalCare().getValueAt(row, 2).toString());
                    viewNurse.getEditText_weight1().setText(viewNurse.getTable_animalCare().getValueAt(row, 3).toString());
                    viewNurse.getEditText_bodyLength1().setText(viewNurse.getTable_animalCare().getValueAt(row, 4).toString());
                    viewNurse.getEditText_chestSize1().setText(viewNurse.getTable_animalCare().getValueAt(row, 5).toString());
                    viewNurse.getEditText_height1().setText(viewNurse.getTable_animalCare().getValueAt(row, 6).toString());
                    viewNurse.getEditText_comment1().setText(viewNurse.getTable_animalCare().getValueAt(row, 7).toString());
                }
                
            });
        } catch (SQLException ex) {
            Logger.getLogger(C_Nurse.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addAnimalCare() {
        viewNurse.getButton_addAnimalCare().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewNurse.getPanel_body().getLayout();
            card.show(viewNurse.getPanel_body(), "panel_addAnimalCare");
        });
    }

    private void saveAddAnimalCare() {
        viewNurse.getButton_saveAddAnimalCare().addActionListener((ActionEvent e) -> {
            try {
                modelAnimalCare.setId_animal(connection.getAnimal().getId( viewNurse.getComboBox_animalName().getSelectedItem().toString()));
                modelAnimalCare.setId_user(connection.getUsers().getId(viewNurse.getComboBox_animalOwner().getSelectedItem().toString()));                
                modelAnimalCare.setWeight(Double.parseDouble(viewNurse.getEditText_weight().getText()));
                modelAnimalCare.setBody_length(Double.parseDouble(viewNurse.getEditText_bodyLength().getText()));
                modelAnimalCare.setChest_size(Double.parseDouble(viewNurse.getEditText_chestSize().getText()));
                modelAnimalCare.setHeight(Double.parseDouble(viewNurse.getEditText_height1().getText()));
                modelAnimalCare.setComment(viewNurse.getEditText_comment().getText());
                connection.getAnimalCare().insert(modelAnimalCare);
                tableAnimalCare();
                CardLayout card = (CardLayout) viewNurse.getPanel_body().getLayout();
                card.show(viewNurse.getPanel_body(), "panel_animal");
                viewNurse.getEditText_bodyLength().setText("");
                viewNurse.getEditText_chestSize().setText("");
                viewNurse.getEditText_comment().setText("");
                viewNurse.getEditText_height1().setText("");
                viewNurse.getEditText_weight().setText("");
                JOptionPane.showMessageDialog(viewNurse, "Success to save data");
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(viewNurse, "Failed to save data");
            }
        });
    }

    private void cancelAddAnimalCare() {
        viewNurse.getButton_cancelAddAnimalCare().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewNurse.getPanel_body().getLayout();
            card.show(viewNurse.getPanel_body(), "panel_animalCare");
        });
    }

    private void editAnimalCare() {
        viewNurse.getButton_editAnimalCare().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewNurse.getPanel_body().getLayout();
            card.show(viewNurse.getPanel_body(), "panel_editAnimalCare");
        });
    }

    private void saveEditAnimalCare() {
        viewNurse.getButton_saveEditAnimalCare().addActionListener((ActionEvent e) -> {
            try {
                modelAnimalCare.setId_animal(connection.getAnimal().getId( viewNurse.getComboBox_animalName1().getSelectedItem().toString()));
                modelAnimalCare.setId_user(connection.getUsers().getId(viewNurse.getComboBox_animalOwner1().getSelectedItem().toString()));                
                modelAnimalCare.setWeight(Double.parseDouble(viewNurse.getEditText_weight1().getText()));
                modelAnimalCare.setBody_length(Double.parseDouble(viewNurse.getEditText_bodyLength1().getText()));
                modelAnimalCare.setChest_size(Double.parseDouble(viewNurse.getEditText_chestSize1().getText()));
                modelAnimalCare.setHeight(Double.parseDouble(viewNurse.getEditText_height().getText()));
                modelAnimalCare.setComment(viewNurse.getEditText_comment1().getText());
                connection.getAnimalCare().update(modelAnimalCare);
                tableAnimalCare();
                CardLayout card = (CardLayout) viewNurse.getPanel_body().getLayout();
                card.show(viewNurse.getPanel_body(), "panel_animal");
                viewNurse.getEditText_bodyLength1().setText("");
                viewNurse.getEditText_chestSize1().setText("");
                viewNurse.getEditText_comment1().setText("");
                viewNurse.getEditText_height().setText("");
                viewNurse.getEditText_weight1().setText("");
                JOptionPane.showMessageDialog(viewNurse, "Success to save data");
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(viewNurse, "Failed to save data");
            }
        });
    }

    private void cancelEditAnimalCare() {
        viewNurse.getButton_cancelEditAnimalCare().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewNurse.getPanel_body().getLayout();
            card.show(viewNurse.getPanel_body(), "panel_animalCare");
        });
    }
    
    private void deleteAnimalCare(){
        viewNurse.getButton_deleteAnimalCare().addActionListener((ActionEvent e) -> {
            try {
                connection.getAnimalCare().delete(modelAnimalCare);
                tableAnimal();
                JOptionPane.showMessageDialog(viewNurse, "Success to delete data");
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(viewNurse, "Failed to delete data");
            }
        });
    }
    
    private void refreshAnimalCare(){
        viewNurse.getButton_refreshAnimalCare().addActionListener((ActionEvent e) -> {
            tableAnimalCare();
        });
    }
    
    private void comboBoxAnimalOwner(){
        try {
            viewNurse.getComboBox_animalOwner().setModel(new DefaultComboBoxModel(connection.getUsers().fillComboBoxUser().toArray()));
            viewNurse.getComboBox_animalOwner1().setModel(new DefaultComboBoxModel(connection.getUsers().fillComboBoxUser().toArray()));
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void comboBoxAnimal(){
        try {
            viewNurse.getComboBox_animalName().setModel(new DefaultComboBoxModel(connection.getAnimal().fillComboBox().toArray()));
            viewNurse.getComboBox_animalName1().setModel(new DefaultComboBoxModel(connection.getAnimal().fillComboBox().toArray()));
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Button Logout">
    private void buttonLogout() {
        viewNurse.getButton_logout().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                logout();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewNurse.getButton_logout().setForeground(new Color(0, 0, 150));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewNurse.getButton_logout().setForeground(new Color(0, 0, 255));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewNurse.getButton_logout().setForeground(new Color(0, 255, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewNurse.getButton_logout().setForeground(new Color(0, 0, 255));
            }
        });
    }

    private void logout() {
        int pilihan = JOptionPane.showConfirmDialog(viewNurse, "Are you sure to logout?", "Logout", JOptionPane.YES_NO_OPTION);
        if (pilihan == JOptionPane.YES_OPTION) {
            C_Login login = new C_Login();
            viewNurse.dispose();
        } else {
            
        }
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Maximize">
    private void buttonMaximize() {
        viewNurse.getButton_maximize().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (viewNurse.isMaximized()) {
                    viewNurse.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    viewNurse.setMaximizedBounds(env.getMaximumWindowBounds());
                    viewNurse.setMaximized(false);
                } else {
                    viewNurse.setExtendedState(JFrame.NORMAL);
                    viewNurse.setMaximized(true);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewNurse.getButton_maximize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewNurse.getButton_maximize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewNurse.getButton_maximize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px_1.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewNurse.getButton_maximize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px.png")));
            }
        });
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Exit">
    private void buttonExit() {
        viewNurse.getButton_exit().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exit();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewNurse.getButton_exit().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewNurse.getButton_exit().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewNurse.getButton_exit().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px_1.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewNurse.getButton_exit().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png")));
            }
        });
    }

    private void exit() {
        System.exit(0);
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Minimize">
    private void buttonMinimize() {
        viewNurse.getButton_minimize().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                minimize();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewNurse.getButton_minimize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewNurse.getButton_minimize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewNurse.getButton_minimize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewNurse.getButton_minimize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png")));
            }
        });
    }

    private void minimize() {
        viewNurse.minimize(ICONIFIED);
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Drag Window">
    private void dragWindow() {

        viewNurse.getPanel_undecorated().addMouseListener(new MouseListener() {
            // <editor-fold defaultstate="collapsed" desc="Unused">
            @Override
            public void mouseClicked(MouseEvent e) {

            }//</editor-fold>

            @Override
            public void mousePressed(MouseEvent e) {
                viewNurse.setxMouse(e.getX());
                viewNurse.setyMouse(e.getY());
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

        viewNurse.getPanel_undecorated().addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int kordinatX = e.getXOnScreen();
                int kordinatY = e.getYOnScreen();

                viewNurse.setLocation(kordinatX - viewNurse.getxMouse(), kordinatY - viewNurse.getyMouse());
            }

            // <editor-fold defaultstate="collapsed" desc="Unused">
            @Override
            public void mouseMoved(MouseEvent e) {

            }//</editor-fold>
        });
    }//</editor-fold>
    
}
