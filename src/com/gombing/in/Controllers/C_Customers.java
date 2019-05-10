/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Controllers;

import com.gombing.in.Views.V_Customers;
import java.awt.CardLayout;
import java.awt.Color;
import static java.awt.Frame.ICONIFIED;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author MaulanaKevinPradana
 */
public class C_Customers {
    private final V_Customers viewCustomers;

    public C_Customers() {
        viewCustomers = new V_Customers();
        viewCustomers.setVisible(true);
        buttonLogout();
        buttonMinimize();
        buttonMaximize();
        buttonExit();
        dragWindow();
        
        animalCare();
    }
    
    
    // <editor-fold defaultstate="collapsed" desc="Animal Care">
    private void animalCare() {
        viewCustomers.buttonAnimalCare((ActionEvent e) -> {
            viewCustomers.setColorAnimalCare(new Color(255, 255, 255));
            CardLayout card = (CardLayout) viewCustomers.getPanel_body().getLayout();
            card.show(viewCustomers.getPanel_body(), "panel_animalCare");
        });
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Button Logout">
    private void buttonLogout() {
        viewCustomers.buttonLogout(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                logout();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewCustomers.setColorButtonLogout(new Color(0, 0, 150));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewCustomers.setColorButtonLogout(new Color(0, 0, 255));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewCustomers.setColorButtonLogout(new Color(0, 255, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewCustomers.setColorButtonLogout(new Color(0, 0, 255));
            }
        });
    }

    private void logout() {
        C_Login login = new C_Login();
        viewCustomers.dispose();
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Maximize">
    private void buttonMaximize() {
        viewCustomers.buttonMaximize(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (viewCustomers.isMaximized()) {
                    viewCustomers.setExtendedState(JFrame.MAXIMIZED_BOTH);
                    GraphicsEnvironment env = GraphicsEnvironment.getLocalGraphicsEnvironment();
                    viewCustomers.setMaximizedBounds(env.getMaximumWindowBounds());
                    viewCustomers.setMaximized(false);
                } else {
                    viewCustomers.setExtendedState(JFrame.NORMAL);
                    viewCustomers.setMaximized(true);
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewCustomers.setIconButtonMaximize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewCustomers.setIconButtonMaximize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewCustomers.setIconButtonMaximize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px_1.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewCustomers.setIconButtonMaximize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px.png")));
            }
        });
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Exit">
    private void buttonExit() {
        viewCustomers.buttonExit(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exit();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewCustomers.setIconButtonExit(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewCustomers.setIconButtonExit(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewCustomers.setIconButtonExit(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px_1.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewCustomers.setIconButtonExit(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png")));
            }
        });
    }

    private void exit() {
        System.exit(0);
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Minimize">
    private void buttonMinimize() {
        viewCustomers.buttonMinimize(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                minimize();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewCustomers.setIconButtonMinimize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewCustomers.setIconButtonMinimize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewCustomers.setIconButtonMinimize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewCustomers.setIconButtonMinimize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png")));
            }
        });
    }

    private void minimize() {
        viewCustomers.minimize(ICONIFIED);
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Drag Window">
    private void dragWindow() {

        viewCustomers.mousePanelUndecorated(new MouseListener() {
            // <editor-fold defaultstate="collapsed" desc="Unused">
            @Override
            public void mouseClicked(MouseEvent e) {

            }//</editor-fold>

            @Override
            public void mousePressed(MouseEvent e) {
                viewCustomers.setxMouse(e.getX());
                viewCustomers.setyMouse(e.getY());
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

        viewCustomers.dragPanelUndecorated(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                int kordinatX = e.getXOnScreen();
                int kordinatY = e.getYOnScreen();

                viewCustomers.setLocation(kordinatX - viewCustomers.getxMouse(), kordinatY - viewCustomers.getyMouse());
            }

            // <editor-fold defaultstate="collapsed" desc="Unused">
            @Override
            public void mouseMoved(MouseEvent e) {

            }//</editor-fold>
        });
    }//</editor-fold>
    
}
