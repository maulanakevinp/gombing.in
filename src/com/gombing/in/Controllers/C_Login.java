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
public class C_Login {

    private final V_Login viewLogin;
    private final M_Users modelUser;
    private final config connection;

    public C_Login() {
        viewLogin = new V_Login();
        viewLogin.setVisible(true);
        buttonLogin();
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
        viewLogin.buttonLogin(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                login();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewLogin.setColorButtonLogin(new Color(0, 212, 212));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewLogin.setColorButtonLogin(new Color(0, 255, 255));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewLogin.setColorButtonLogin(new Color(0, 255, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewLogin.setColorButtonLogin(new Color(255, 255, 255));
            }
        });
    }

    private void login() {
        modelUser.setEmail(viewLogin.getEditText_emailL().getText());
        modelUser.setPassword(viewLogin.getEditText_passwordL().getText());
        try {
            connection.getUsers().checkLogin(modelUser);
        } catch (SQLException e) {
            System.out.println("Error : " +e);
        }
        int level = modelUser.getLevelId();
        switch (level) {
            case 1:
                C_Admin admin = new C_Admin();
                viewLogin.dispose();
                break;
            case 2:
                C_Manager manager = new C_Manager();
                viewLogin.dispose();
                break;
            case 3:
                C_Nurse nurse = new C_Nurse();
                viewLogin.dispose();
                break;
            case 4:
                C_Customers customers = new C_Customers();
                viewLogin.dispose();
                break;
            default:
                JOptionPane.showMessageDialog(viewLogin, "Username atau Password Salah");
                break;
        }
    }

    private void buttonViewLogin() {
        viewLogin.buttonViewLogin(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                viewLogin();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewLogin.setColorButtonViewLogin(new Color(255, 200, 0));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewLogin.setColorButtonViewLogin(new Color(255, 255, 0));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewLogin.setColorButtonViewLogin(new Color(255, 255, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewLogin.setColorButtonViewLogin(new Color(255, 255, 255));
            }
        });
    }

    private void viewLogin() {
        CardLayout card = (CardLayout) viewLogin.getPanel_body().getLayout();
        card.show(viewLogin.getPanel_body(), "panel_login");
    }

    private void buttonRegister(){
        viewLogin.buttonRegister(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewLogin.setColorButtonRegister(new Color(0, 212, 212));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewLogin.setColorButtonRegister(new Color(0, 255, 255));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewLogin.setColorButtonRegister(new Color(0, 255, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewLogin.setColorButtonRegister(new Color(255, 255, 255));
            }
        });
    }
    
    private void buttonViewRegistration() {
        viewLogin.buttonViewRegister(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                viewRegistration();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewLogin.setColorButtonViewRegister(new Color(255, 200, 0));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewLogin.setColorButtonViewRegister(new Color(255, 255, 0));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewLogin.setColorButtonViewRegister(new Color(255, 255, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewLogin.setColorButtonViewRegister(new Color(255, 255, 255));
            }
        });
    }

    private void viewRegistration() {
        CardLayout card = (CardLayout) viewLogin.getPanel_body().getLayout();
        card.show(viewLogin.getPanel_body(), "panel_registration");
    }
    
    private void buttonSend(){
        viewLogin.buttonSend(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewLogin.setColorButtonSend(new Color(0, 212, 212));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewLogin.setColorButtonSend(new Color(0, 255, 255));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewLogin.setColorButtonSend(new Color(0, 255, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewLogin.setColorButtonSend(new Color(255, 255, 255));
            }
        });
    }

    private void buttonViewForgotPassword() {
        viewLogin.buttonViewForgotPassword(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                viewForgotPassword();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewLogin.setColorButtonViewForgotPassword(new Color(255, 200, 0));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewLogin.setColorButtonViewForgotPassword(new Color(255, 255, 0));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewLogin.setColorButtonViewForgotPassword(new Color(255, 255, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewLogin.setColorButtonViewForgotPassword(new Color(0, 0, 0));
            }
        });
    }

    private void viewForgotPassword() {
        CardLayout card = (CardLayout) viewLogin.getPanel_body().getLayout();
        card.show(viewLogin.getPanel_body(), "panel_forgotPassword");
    }

    // <editor-fold defaultstate="collapsed" desc="Button Exit">
    private void buttonExit() {
        viewLogin.buttonExit(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exit();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewLogin.setIconButtonExit(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewLogin.setIconButtonExit(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewLogin.setIconButtonExit(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px_1.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewLogin.setIconButtonExit(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png")));
            }
        });
    }

    private void exit() {
        System.exit(0);
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Minimize">
    private void buttonMinimize() {
        viewLogin.buttonMinimize(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                minimze();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewLogin.setIconButtonMinimize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewLogin.setIconButtonMinimize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewLogin.setIconButtonMinimize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewLogin.setIconButtonMinimize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png")));
            }
        });
    }

    private void minimze() {
        viewLogin.minimize(ICONIFIED);
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Drag Window">
    private void dragWindow() {

        viewLogin.mousePanelUndecorated(new MouseListener() {
            // <editor-fold defaultstate="collapsed" desc="Unused">
            @Override
            public void mouseClicked(MouseEvent e) {

            }//</editor-fold>

            @Override
            public void mousePressed(MouseEvent e) {
                viewLogin.setxMouse(e.getX());
                viewLogin.setyMouse(e.getY());
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

        viewLogin.dragPanelUndecorated(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int kordinatX = e.getXOnScreen();
                int kordinatY = e.getYOnScreen();

                viewLogin.setLocation(kordinatX - viewLogin.getxMouse(), kordinatY - viewLogin.getyMouse());
            }

            // <editor-fold defaultstate="collapsed" desc="Unused">
            @Override
            public void mouseMoved(MouseEvent e) {

            }//</editor-fold>
        });
    }//</editor-fold>
}
