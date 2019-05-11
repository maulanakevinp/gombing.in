/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Controllers;

import com.gombing.in.DBUtils.config;
import com.gombing.in.Models.Table_Animal;
import com.gombing.in.Models.Table_AnimalCare;
import com.gombing.in.Views.V_Manager;
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
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author MaulanaKevinPradana
 */
public class C_Manager {

    private final V_Manager viewManager;
    private final Table_Animal tableAnimal;
    private final Table_AnimalCare tableAnimalCare;
    private final config connection;

    public C_Manager() {
        viewManager = new V_Manager();
        viewManager.setVisible(true);
        connection = new config();
        connection.getAnimal().setCon(connection.getConnection());
        tableAnimal = new Table_Animal();
        tableAnimalCare = new Table_AnimalCare();

        buttonLogout();
        buttonMinimize();
        buttonMaximize();
        buttonExit();
        dragWindow();

        viewAnimal();
        tableAnimal();
        viewAnimalCare();
    }

    // <editor-fold defaultstate="collapsed" desc="Animal">
    private void viewAnimal() {
        viewManager.getButton_animal().addActionListener((ActionEvent e) -> {
            viewManager.getColor_animal().setBackground(new Color(0, 255, 0));
            viewManager.getColor_animalCare().setBackground(new Color(255, 255, 255));
            CardLayout card = (CardLayout) viewManager.getPanel_body().getLayout();
            card.show(viewManager.getPanel_body(), "panel_animal");
            tableAnimal();
        });
    }

    private void tableAnimal() {
        try {
            tableAnimal.setList(connection.getAnimal().getAll());
            viewManager.getTable_animal().setModel(tableAnimal);
            viewManager.getTable_animal().getTableHeader().setOpaque(false);
            viewManager.getTable_animal().getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            viewManager.getTable_animal().getTableHeader().setBackground(Color.white);
            viewManager.getTable_animal().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {

                }

            });
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Animal Care">
    private void viewAnimalCare() {
        viewManager.getButton_animalCare().addActionListener((ActionEvent e) -> {
            viewManager.getColor_animalCare().setBackground(new Color(0, 255, 0));
            viewManager.getColor_animal().setBackground(new Color(255, 255, 255));
            CardLayout card = (CardLayout) viewManager.getPanel_body().getLayout();
            card.show(viewManager.getPanel_body(), "panel_animalCare");
            tableAnimalCare();
        });
    }

    private void tableAnimalCare() {
        //            tableAnimalCare.setList(connection.getAnimalCare().getAll());
        viewManager.getTable_animalCare().setModel(tableAnimalCare);
        viewManager.getTable_animalCare().getTableHeader().setOpaque(false);
        viewManager.getTable_animalCare().getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
        viewManager.getTable_animalCare().getTableHeader().setBackground(Color.white);
        viewManager.getTable_animalCare().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }
            
        });
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Logout">
    private void buttonLogout() {
        viewManager.getButton_logout().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                logout();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewManager.getButton_logout().setForeground(new Color(0, 0, 150));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewManager.getButton_logout().setForeground(new Color(0, 0, 255));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewManager.getButton_logout().setForeground(new Color(0, 255, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewManager.getButton_logout().setForeground(new Color(0, 0, 255));
            }
        });
    }

    private void logout() {
        int pilihan = JOptionPane.showConfirmDialog(viewManager, "Are you sure to logout?", "Logout", JOptionPane.YES_NO_OPTION);
        if (pilihan == JOptionPane.YES_OPTION) {
            C_Login login = new C_Login();
            viewManager.dispose();
        } else {

        }
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Maximize">
    private void buttonMaximize() {
        viewManager.getButton_maximize().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (viewManager.isMaximized()) {
                    viewManager.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    viewManager.setMaximizedBounds(env.getMaximumWindowBounds());
                    viewManager.setMaximized(false);
                } else {
                    viewManager.setExtendedState(JFrame.NORMAL);
                    viewManager.setMaximized(true);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewManager.getButton_maximize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewManager.getButton_maximize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewManager.getButton_maximize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px_1.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewManager.getButton_maximize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px.png")));
            }
        });
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Exit">
    private void buttonExit() {
        viewManager.getButton_exit().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exit();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewManager.getButton_exit().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewManager.getButton_exit().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewManager.getButton_exit().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px_1.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewManager.getButton_exit().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png")));
            }
        });
    }

    private void exit() {
        System.exit(0);
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Minimize">
    private void buttonMinimize() {
        viewManager.getButton_minimize().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                minimize();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewManager.getButton_minimize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewManager.getButton_minimize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewManager.getButton_minimize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewManager.getButton_minimize().setIcon(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png")));
            }
        });
    }

    private void minimize() {
        viewManager.minimize(ICONIFIED);
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Drag Window">
    private void dragWindow() {

        viewManager.getPanel_undecorated().addMouseListener(new MouseListener() {
            // <editor-fold defaultstate="collapsed" desc="Unused">
            @Override
            public void mouseClicked(MouseEvent e) {

            }//</editor-fold>

            @Override
            public void mousePressed(MouseEvent e) {
                viewManager.setxMouse(e.getX());
                viewManager.setyMouse(e.getY());
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

        viewManager.getPanel_undecorated().addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int kordinatX = e.getXOnScreen();
                int kordinatY = e.getYOnScreen();

                viewManager.setLocation(kordinatX - viewManager.getxMouse(), kordinatY - viewManager.getyMouse());
            }

            // <editor-fold defaultstate="collapsed" desc="Unused">
            @Override
            public void mouseMoved(MouseEvent e) {

            }//</editor-fold>
        });
    }//</editor-fold>
}
