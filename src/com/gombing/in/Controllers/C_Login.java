/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Controllers;

import com.gombing.in.DBUtils.config;
import com.gombing.in.Models.M_Users;
import com.gombing.in.Views.V_Login;
import java.awt.CardLayout;
import java.awt.Color;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author MaulanaKevinPradana
 */
public class C_Login extends V_Login{

    private final M_Users modelUser;
    private final config connection;

    public C_Login() {
        Show(true);
        buttonLogin();
        action_passwordL();
        action_emailL();
        buttonRegister();
        buttonSend();
        buttonViewRegistration();
        buttonViewForgotPassword();
        buttonMinimize();
        buttonExit();
        dragWindow();
        buttonViewLogin();
        
        modelUser = new M_Users();
        
        connection = new config();
        connection.getUsers().setCon(connection.getConnection());
    }

    private void buttonLogin() {
        getButton_login().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                login();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                getButton_login().setBackground(new Color(0, 212, 212));
                
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                 getButton_login().setBackground(new Color(0, 255, 255));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                 getButton_login().setBackground(new Color(0, 255, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                 getButton_login().setBackground(new Color(255, 255, 255));
            }
        });        
    }

    private void login() {
        modelUser.setEmail(getEditText_emailL().getText());
        modelUser.setPassword(getEditText_passwordL().getText());
        try {
            connection.getUsers().checkLogin(modelUser);
        } catch (SQLException e) {
            System.out.println("Error : " +e);
        }
        int level = modelUser.getLevelId();
        switch (level) {
            case 1:
                C_Admin admin = new C_Admin();
                Show(false);
                break;
            case 2:
                C_Manager manager = new C_Manager();
                Show(false);
                break;
            case 3:
                C_Nurse nurse = new C_Nurse();
                Show(false);
                break;
            case 4:
                C_Customers customers = new C_Customers(modelUser.getId());
                Show(false);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                break;
        }
    }
    
    private void action_emailL(){
        getEditText_emailL().addActionListener((ActionEvent e) -> {
            getEditText_passwordL().requestFocusInWindow();
        });
    }
    
    private void action_passwordL(){
        getEditText_passwordL().addActionListener(((ActionEvent e) -> {
            login();
        }));
    }
    
    private void buttonViewLogin() {
        getButton_viewLoginF().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                viewLogin();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                getButton_viewLoginF().setForeground(new Color(255, 200, 0));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getButton_viewLoginF().setForeground(new Color(255, 255, 0));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                getButton_viewLoginF().setForeground(new Color(255, 255, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getButton_viewLoginF().setForeground(new Color(255, 255, 255));
            }
        });
        
        getButton_viewLoginR().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                viewLogin();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                getButton_viewLoginR().setForeground(new Color(255, 200, 0));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getButton_viewLoginR().setForeground(new Color(255, 255, 0));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                getButton_viewLoginR().setForeground(new Color(255, 255, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getButton_viewLoginR().setForeground(new Color(255, 255, 255));
            }
        });
    }

    private void viewLogin() {
        CardLayout card = (CardLayout) getPanel_body().getLayout();
        card.show(getPanel_body(), "panel_login");
    }
    
    private void buttonRegister(){
        getButton_register().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                getButton_register().setBackground(new Color(0, 212, 212));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getButton_register().setBackground(new Color(0, 255, 255));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                getButton_register().setBackground(new Color(0, 255, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getButton_register().setBackground(new Color(255, 255, 255));
            }
        });
    }
    
    private void buttonViewRegistration() {
        
        getButton_viewRegister().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                viewRegistration();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                getButton_viewRegister().setForeground(new Color(255, 200, 0));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getButton_viewRegister().setForeground(new Color(255, 255, 0));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                getButton_viewRegister().setForeground(new Color(255, 255, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getButton_viewRegister().setForeground(new Color(255, 255, 255));
            }
        });
    }

    private void viewRegistration() {
        CardLayout card = (CardLayout) getPanel_body().getLayout();
        card.show(getPanel_body(), "panel_registration");
    }
    
    private void buttonSend(){
        getButton_send().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                getButton_send().setBackground(new Color(0, 212, 212));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getButton_send().setBackground(new Color(0, 255, 255));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                getButton_send().setBackground(new Color(0, 255, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getButton_send().setBackground(new Color(255, 255, 255));
            }
        });
    }

    private void buttonViewForgotPassword() {
        getButton_viewForgotPassword().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                viewForgotPassword();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                getButton_viewForgotPassword().setForeground(new Color(255, 200, 0));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getButton_viewForgotPassword().setForeground(new Color(255, 255, 0));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                getButton_viewForgotPassword().setForeground(new Color(255, 255, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getButton_viewForgotPassword().setForeground(new Color(0, 0, 0));
            }
        });
    }

    private void viewForgotPassword() {
        CardLayout card = (CardLayout) getPanel_body().getLayout();
        card.show(getPanel_body(), "panel_forgotPassword");
    }

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
                minimze();
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

    private void minimze() {
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
