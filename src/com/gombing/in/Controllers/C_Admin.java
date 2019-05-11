/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Controllers;

import com.gombing.in.Models.Table_Users;
import com.gombing.in.DBUtils.config;
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
    private final M_Users modelUser;
    private final Table_Users tableUsers;
    private final Table_Animal tableAnimal;
    private final Table_AnimalType tableAnimalType;
    private final Table_TypePet tableTypePet;
    private final config connection;

    public C_Admin() {
        viewAdmin = new V_Admin();
        viewAdmin.setVisible(true);
        modelUser = new M_Users();
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

        viewAnimal();
        addAnimal();
        saveAddAnimal();
        cancelAddAnimal();
        editAnimal();
        saveEditAnimal();
        cancelEditAnimal();

        viewAnimalType();
        addAnimalType();
        saveAddAnimalType();
        cancelAddAnimalType();
        editAnimalType();
        saveEditAnimalType();
        cancelEditAnimalType();

        viewTypePet();
        addTypePet();
        saveAddTypePet();
        cancelAddTypePet();
        editTypePet();
        saveEditTypePet();
        cancelEditTypePet();

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
            viewAdmin.getTableHeader_users().setOpaque(false);
            viewAdmin.getTableHeader_users().setFont(new Font("Segoe UI", Font.BOLD, 12));
            viewAdmin.getTableHeader_users().setBackground(Color.white);
            viewAdmin.getTable_users().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

            });
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void comboBoxLevel(){
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
            viewAdmin.getTableHeader_animal().setOpaque(false);
            viewAdmin.getTableHeader_animal().setFont(new Font("Segoe UI", Font.BOLD, 12));
            viewAdmin.getTableHeader_animal().setBackground(Color.white);
            viewAdmin.getTable_animal().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

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
            viewAdmin.getTableHeader_animalType().setOpaque(false);
            viewAdmin.getTableHeader_animalType().setFont(new Font("Segoe UI", Font.BOLD, 12));
            viewAdmin.getTableHeader_animalType().setBackground(Color.white);
            viewAdmin.getTable_animalType().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

            });
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void comboBoxAnimalType(){
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
    //</editor-fold>

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
            viewAdmin.getTableHeader_typePet().setOpaque(false);
            viewAdmin.getTableHeader_typePet().setFont(new Font("Segoe UI", Font.BOLD, 12));
            viewAdmin.getTableHeader_typePet().setBackground(Color.white);
            viewAdmin.getTable_typePet().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

            });
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    
    private void comboBoxTypePet(){
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

        });
    }

    private void cancelEditTypePet() {
        viewAdmin.getButton_cancelEditTypePet().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) viewAdmin.getPanel_body().getLayout();
            card.show(viewAdmin.getPanel_body(), "panel_typePet");
        });
    }
    //</editor-fold>

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
