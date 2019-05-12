/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Controllers;

import com.gombing.in.Models.Table_Users;
import com.gombing.in.DBUtils.config;
import com.gombing.in.Models.M_Animal;
import com.gombing.in.Models.M_AnimalType;
import com.gombing.in.Models.M_TypePet;
import com.gombing.in.Models.M_Users;
import com.gombing.in.Models.Table_Animal;
import com.gombing.in.Models.Table_AnimalType;
import com.gombing.in.Models.Table_TypePet;
import com.gombing.in.Views.V_Admin;
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
public class C_Admin {

    private final V_Admin viewAdmin;
    private final M_Users modelUsers;
    private final M_Animal modelAnimal;
    private final M_AnimalType modelAnimalType;
    private final M_TypePet modelTypePet;
    private final Table_Users tableUsers;
    private final Table_Animal tableAnimal;
    private final Table_AnimalType tableAnimalType;
    private final Table_TypePet tableTypePet;
    private final config connection;

    public C_Admin() {
        viewAdmin = new V_Admin();
        viewAdmin.setVisible(true);
        modelUsers = new M_Users();
        modelAnimal = new M_Animal();
        modelAnimalType = new M_AnimalType();
        modelTypePet = new M_TypePet();
        tableUsers = new Table_Users();
        tableAnimal = new Table_Animal();
        tableAnimalType = new Table_AnimalType();
        tableTypePet = new Table_TypePet();
        connection = new config();
        connection.getUsers().setCon(connection.getConnection());
        connection.getAnimal().setCon(connection.getConnection());
        connection.getAnimalType().setCon(connection.getConnection());
        connection.getTypePet().setCon(connection.getConnection());

        comboBoxLevel();
        comboBoxAnimalType();
        comboBoxTypePet();

        viewUsers();
        tableUsers();
        addUsers();
        saveAddUsers();
        cancelAddUsers();
        editUsers();
        saveEditUsers();
        cancelEditUsers();
        deleteUsers();
        refreshUsers();

        viewAnimal();
        addAnimal();
        saveAddAnimal();
        cancelAddAnimal();
        editAnimal();
        saveEditAnimal();
        cancelEditAnimal();
        deleteAnimal();
        refreshAnimal();

        viewAnimalType();
        addAnimalType();
        saveAddAnimalType();
        cancelAddAnimalType();
        editAnimalType();
        saveEditAnimalType();
        cancelEditAnimalType();
        deleteAnimalType();
        refreshAnimalType();

        viewTypePet();
        addTypePet();
        saveAddTypePet();
        cancelAddTypePet();
        editTypePet();
        saveEditTypePet();
        cancelEditTypePet();
        deleteTypePet();
        refreshTypePet();

        buttonMinimize();
        buttonMaximize();
        buttonExit();
        dragWindow();
        buttonLogout();
    }

    // <editor-fold defaultstate="collapsed" desc="Users">
    private void viewUsers() {
        viewAdmin.getButton_users().addActionListener((ActionEvent e) -> {
            viewAdmin.getColor_users().setBackground(new Color(0, 255, 0));
            viewAdmin.getColor_animal().setBackground(new Color(255, 255, 255));
            viewAdmin.getColor_animalType().setBackground(new Color(255, 255, 255));
            viewAdmin.getColor_typePet().setBackground(new Color(255, 255, 255));
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_users");
            tableUsers();
        });
    }

    private void tableUsers() {
        try {
            tableUsers.setList(connection.getUsers().getAll());
            viewAdmin.getTable_users().setModel(tableUsers);
            viewAdmin.getTable_users().getTableHeader().setOpaque(false);
            viewAdmin.getTable_users().getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            viewAdmin.getTable_users().getTableHeader().setBackground(Color.white);
            viewAdmin.getTable_users().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = viewAdmin.getTable_users().getSelectedRow();
                    int id = Integer.parseInt(viewAdmin.getTable_users().getValueAt(row, 0).toString());
                    modelUsers.setId(id);
                    viewAdmin.getEditText_name1().setText(viewAdmin.getTable_users().getValueAt(row, 1).toString());
                    viewAdmin.getEditText_email1().setText(viewAdmin.getTable_users().getValueAt(row, 2).toString());
                    viewAdmin.getEditText_password1().setText(viewAdmin.getTable_users().getValueAt(row, 3).toString());
                    viewAdmin.getComboBox_level1().setSelectedItem(viewAdmin.getTable_users().getValueAt(row, 4).toString());
                    viewAdmin.getComboBox_status1().setSelectedItem(viewAdmin.getTable_users().getValueAt(row, 5).toString());
                }
            });
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void comboBoxLevel() {
        try {
            viewAdmin.getComboBox_level().setModel(new DefaultComboBoxModel(connection.getUsers().fillComboBox().toArray()));
            viewAdmin.getComboBox_level1().setModel(new DefaultComboBoxModel(connection.getUsers().fillComboBox().toArray()));
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addUsers() {
        viewAdmin.getButton_addUsers().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_addUsers");
        });
    }

    private void saveAddUsers() {
        viewAdmin.getButton_saveAddUsers().addActionListener((ActionEvent e) -> {

        });
    }

    private void cancelAddUsers() {
        viewAdmin.getButton_cancelAddUsers().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_users");
        });
    }

    private void editUsers() {
        viewAdmin.getButton_editUsers().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_editUsers");
        });
    }

    private void saveEditUsers() {
        viewAdmin.getButton_saveEditUsers().addActionListener((ActionEvent e) -> {

        });
    }

    private void cancelEditUsers() {
        viewAdmin.getButton_cancelEditUsers().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_users");
        });
    }

    private void deleteUsers() {
        viewAdmin.getButton_deleteUsers().addActionListener((ActionEvent e) -> {

        });
    }

    private void refreshUsers() {
        viewAdmin.getButton_refreshUsers().addActionListener((ActionEvent e) -> {
            tableUsers();
        });
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Animal">
    private void viewAnimal() {
        viewAdmin.getButton_animal().addActionListener((ActionEvent e) -> {
            viewAdmin.getColor_users().setBackground(new Color(255, 255, 255));
            viewAdmin.getColor_animal().setBackground(new Color(0, 255, 0));
            viewAdmin.getColor_animalType().setBackground(new Color(255, 255, 255));
            viewAdmin.getColor_typePet().setBackground(new Color(255, 255, 255));
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_animal");
            tableAnimal();
        });
    }

    private void tableAnimal() {
        try {
            tableAnimal.setList(connection.getAnimal().getAll());
            viewAdmin.getTable_animal().setModel(tableAnimal);
            viewAdmin.getTable_animal().getTableHeader().setOpaque(false);
            viewAdmin.getTable_animal().getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            viewAdmin.getTable_animal().getTableHeader().setBackground(Color.white);
            viewAdmin.getTable_animal().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = viewAdmin.getTable_animal().getSelectedRow();
                    int id = Integer.parseInt(viewAdmin.getTable_animal().getValueAt(row, 0).toString());
                    modelAnimal.setId(id);
                    viewAdmin.getEditText_animalName1().setText(viewAdmin.getTable_animal().getValueAt(row, 1).toString());
                    viewAdmin.getComboBox_animalType1().setSelectedItem(viewAdmin.getTable_animal().getValueAt(row, 2).toString());
                    viewAdmin.getComboBox_gender1().setSelectedItem(viewAdmin.getTable_animal().getValueAt(row, 3).toString());
                    viewAdmin.getEditText_birthdate1().setText(viewAdmin.getTable_animal().getValueAt(row, 4).toString());
                    viewAdmin.getEditText_animalOwner1().setText(viewAdmin.getTable_animal().getValueAt(row, 5).toString());
                    viewAdmin.getEditText_skinColor1().setText(viewAdmin.getTable_animal().getValueAt(row, 6).toString());
                    viewAdmin.getComboBox_earType1().setSelectedItem(viewAdmin.getTable_animal().getValueAt(row, 7).toString());
                    viewAdmin.getComboBox_typePet1().setSelectedItem(viewAdmin.getTable_animal().getValueAt(row, 8).toString());
                }

            });
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addAnimal() {
        viewAdmin.getButton_addAnimal().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_addAnimal");
        });
    }

    private void saveAddAnimal() {
        viewAdmin.getButton_saveAddAnimal().addActionListener((ActionEvent e) -> {

        });
    }

    private void cancelAddAnimal() {
        viewAdmin.getButton_cancelAddAnimal().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_animal");
        });
    }

    private void editAnimal() {
        viewAdmin.getButton_editAnimal().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_editAnimal");
        });
    }

    private void saveEditAnimal() {
        viewAdmin.getButton_saveEditAnimal().addActionListener((ActionEvent e) -> {

        });
    }

    private void cancelEditAnimal() {
        viewAdmin.getButton_cancelEditAnimal().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_animal");
        });
    }

    private void deleteAnimal() {
        viewAdmin.getButton_deleteAnimal().addActionListener((ActionEvent e) -> {

        });
    }

    private void refreshAnimal() {
        viewAdmin.getButton_refreshAnimal().addActionListener((ActionEvent e) -> {
            tableAnimal();
        });
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Animal Type">
    private void viewAnimalType() {
        viewAdmin.getButton_animalType().addActionListener((ActionEvent e) -> {
            viewAdmin.getColor_users().setBackground(new Color(255, 255, 255));
            viewAdmin.getColor_animal().setBackground(new Color(255, 255, 255));
            viewAdmin.getColor_animalType().setBackground(new Color(0, 255, 0));
            viewAdmin.getColor_typePet().setBackground(new Color(255, 255, 255));
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_animalType");
            tableAnimalType();
        });
    }

    private void tableAnimalType() {
        try {
            tableAnimalType.setList(connection.getAnimalType().getAll());
            viewAdmin.getTable_animalType().setModel(tableAnimalType);
            viewAdmin.getTable_animalType().getTableHeader().setOpaque(false);
            viewAdmin.getTable_animalType().getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            viewAdmin.getTable_animalType().getTableHeader().setBackground(Color.white);
            viewAdmin.getTable_animalType().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = viewAdmin.getTable_animalType().getSelectedRow();
                    int id = Integer.parseInt(viewAdmin.getTable_animalType().getValueAt(row, 0).toString());
                    modelAnimalType.setId(id);
                    viewAdmin.getEditText_animalType1().setText(viewAdmin.getTable_animalType().getValueAt(row, 1).toString());
                }
            });
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void comboBoxAnimalType() {
        try {
            viewAdmin.getComboBox_animalType().setModel(new DefaultComboBoxModel(connection.getAnimalType().fillComboBox().toArray()));
            viewAdmin.getComboBox_animalType1().setModel(new DefaultComboBoxModel(connection.getAnimalType().fillComboBox().toArray()));
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addAnimalType() {
        viewAdmin.getButton_addAnimalType().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_addAnimalType");
        });
    }

    private void saveAddAnimalType() {
        viewAdmin.getButton_saveAddAnimalType().addActionListener((ActionEvent e) -> {

        });
    }

    private void cancelAddAnimalType() {
        viewAdmin.getButton_cancelAddAnimalType().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_animalType");
        });
    }

    private void editAnimalType() {
        viewAdmin.getButton_editAnimalType().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_editAnimalType");
        });
    }

    private void saveEditAnimalType() {
        viewAdmin.getButton_saveEditAnimalType().addActionListener((ActionEvent e) -> {

        });
    }

    private void cancelEditAnimalType() {
        viewAdmin.getButton_cancelEditAnimalType().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_animalType");
        });
    }

    private void deleteAnimalType() {
        viewAdmin.getButton_deleteAnimalType().addActionListener((ActionEvent e) -> {

        });
    }

    private void refreshAnimalType() {
        viewAdmin.getButton_refreshAnimalType().addActionListener((ActionEvent e) -> {
            tableAnimalType();
        });
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Type Pet">
    private void viewTypePet() {
        viewAdmin.getButton_typePet().addActionListener((ActionEvent e) -> {
            viewAdmin.getColor_users().setBackground(new Color(255, 255, 255));
            viewAdmin.getColor_animal().setBackground(new Color(255, 255, 255));
            viewAdmin.getColor_animalType().setBackground(new Color(255, 255, 255));
            viewAdmin.getColor_typePet().setBackground(new Color(0, 255, 0));
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_typePet");
            tableTypePet();
        });
    }

    private void tableTypePet() {
        try {
            tableTypePet.setList(connection.getTypePet().getAll());
            viewAdmin.getTable_typePet().setModel(tableTypePet);
            viewAdmin.getTable_typePet().getTableHeader().setOpaque(false);
            viewAdmin.getTable_typePet().getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            viewAdmin.getTable_typePet().getTableHeader().setBackground(Color.white);
            viewAdmin.getTable_typePet().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = viewAdmin.getTable_typePet().getSelectedRow();
                    int id = Integer.parseInt(viewAdmin.getTable_typePet().getValueAt(row, 0).toString());
                    modelTypePet.setId(id);
                    viewAdmin.getEditText_typePet1().setText(viewAdmin.getTable_typePet().getValueAt(row, 1).toString());
                }

            });
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void comboBoxTypePet() {
        try {
            viewAdmin.getComboBox_typePet().setModel(new DefaultComboBoxModel(connection.getTypePet().fillComboBox().toArray()));
            viewAdmin.getComboBox_typePet1().setModel(new DefaultComboBoxModel(connection.getTypePet().fillComboBox().toArray()));
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void addTypePet() {
        viewAdmin.getButton_addTypePet().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_addTypePet");
        });
    }

    private void saveAddTypePet() {
        viewAdmin.getButton_saveAddTypePet().addActionListener((ActionEvent e) -> {
            try {
                modelTypePet.setType_pet(viewAdmin.getEditText_typePet().getText());
                connection.getTypePet().insert(modelTypePet);
                tableTypePet();
                CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
                card.show(viewAdmin.getPanel_body(), "panel_typePet");
                viewAdmin.getEditText_typePet().setText("");
                JOptionPane.showMessageDialog(viewAdmin, "Success to save data");
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(viewAdmin, "Failed to save data");
            }
        });
    }

    private void cancelAddTypePet() {
        viewAdmin.getButton_cancelAddTypePet().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_typePet");
        });
    }

    private void editTypePet() {
        viewAdmin.getButton_editTypePet().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_editTypePet");
        });
    }

    private void saveEditTypePet() {
        viewAdmin.getButton_saveEditTypePet().addActionListener((ActionEvent e) -> {
            try {
                modelTypePet.setType_pet(viewAdmin.getEditText_typePet1().getText());
                connection.getTypePet().update(modelTypePet);
                tableTypePet();
                CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
                card.show(viewAdmin.getPanel_body(), "panel_typePet");
                viewAdmin.getEditText_typePet1().setText("");
                JOptionPane.showMessageDialog(viewAdmin, "Success to save data");
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(viewAdmin, "Failed to save data");
            }
        });
    }

    private void cancelEditTypePet() {
        viewAdmin.getButton_cancelEditTypePet().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_typePet");
        });
    }

    private void deleteTypePet() {
        viewAdmin.getButton_deleteTypePet().addActionListener((ActionEvent e) -> {
            try {                
                connection.getTypePet().delete(modelTypePet);
                tableTypePet();
                JOptionPane.showMessageDialog(viewAdmin, "Success to save data");
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(viewAdmin, "Failed to delete data");
            }
        });
    }

    private void refreshTypePet() {
        viewAdmin.getButton_refreshTypePet().addActionListener((ActionEvent e) -> {
            tableTypePet();
        });
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Logout">
    private void buttonLogout() {
        viewAdmin.getButton_logout().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                logout();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewAdmin.getButton_logout().setForeground(new Color(0, 0, 150));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewAdmin.getButton_logout().setForeground(new Color(0, 0, 255));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewAdmin.getButton_logout().setForeground(new Color(0, 255, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewAdmin.getButton_logout().setForeground(new Color(0, 0, 255));
            }
        });
    }

    private void logout() {
        int pilihan = JOptionPane.showConfirmDialog(viewAdmin, "Are you sure to logout?", "Logout", JOptionPane.YES_NO_OPTION);
        if (pilihan == JOptionPane.YES_OPTION) {
            C_Login login = new C_Login();
            viewAdmin.dispose();
        } else {

        }
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Maximize">
    private void buttonMaximize() {
        viewAdmin.getButton_maximize().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (viewAdmin.isMaximized()) {
                    viewAdmin.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    viewAdmin.setMaximizedBounds(env.getMaximumWindowBounds());
                    viewAdmin.setMaximized(false);
                } else {
                    viewAdmin.setExtendedState(JFrame.NORMAL);
                    viewAdmin.setMaximized(true);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewAdmin.getButton_maximize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewAdmin.getButton_maximize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewAdmin.getButton_maximize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px_1.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewAdmin.getButton_maximize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px.png")));
            }
        });
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Exit">
    private void buttonExit() {
        viewAdmin.getButton_exit().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exit();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewAdmin.getButton_exit().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewAdmin.getButton_exit().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewAdmin.getButton_exit().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px_1.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewAdmin.getButton_exit().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png")));
            }
        });
    }

    private void exit() {
        System.exit(0);
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Minimize">
    private void buttonMinimize() {
        viewAdmin.getButton_minimize().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                minimize();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewAdmin.getButton_minimize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewAdmin.getButton_minimize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewAdmin.getButton_minimize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewAdmin.getButton_minimize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png")));
            }
        });
    }

    private void minimize() {
        viewAdmin.minimize(ICONIFIED);
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Drag Window">
    private void dragWindow() {

        viewAdmin.getPanel_undecorated().addMouseListener(new MouseListener() {
            // <editor-fold defaultstate="collapsed" desc="Unused">
            @Override
            public void mouseClicked(MouseEvent e) {

            }//</editor-fold>

            @Override
            public void mousePressed(MouseEvent e) {
                viewAdmin.setxMouse(e.getX());
                viewAdmin.setyMouse(e.getY());
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

        viewAdmin.getPanel_undecorated().addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int kordinatX = e.getXOnScreen();
                int kordinatY = e.getYOnScreen();

                viewAdmin.setLocation(kordinatX - viewAdmin.getxMouse(), kordinatY - viewAdmin.getyMouse());
            }

            // <editor-fold defaultstate="collapsed" desc="Unused">
            @Override
            public void mouseMoved(MouseEvent e) {

            }//</editor-fold>
        });
    }//</editor-fold>
}
