/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Controllers;

import com.gombing.in.Views.V_Manager;
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
public class C_Manager {
    private final V_Manager viewManager;

    public C_Manager() {
        viewManager = new V_Manager();
        viewManager.setVisible(true);
        
        buttonLogout();
        buttonMinimize();
        buttonMaximize();
        buttonExit();
        dragWindow();
        
        animal();
        animalCare();
    }
    
    // <editor-fold defaultstate="collapsed" desc="Animal">
    private void animal() {
        viewManager.buttonAnimal((ActionEvent e) -> {
            viewManager.setColorAnimal(new Color(0, 255, 0));
            viewManager.setColorAnimalCare(new Color(255, 255, 255));
            CardLayout card = (CardLayout) viewManager.getPanel_body().getLayout();
            card.show(viewManager.getPanel_body(), "panel_animal");
        });
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Animal Care">
    private void animalCare() {
        viewManager.buttonAnimalCare((ActionEvent e) -> {
            viewManager.setColorAnimal(new Color(255, 255, 255));
            viewManager.setColorAnimalCare(new Color(0, 255, 0));
            CardLayout card = (CardLayout) viewManager.getPanel_body().getLayout();
            card.show(viewManager.getPanel_body(), "panel_animalCare");
        });
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Button Logout">
    private void buttonLogout() {
        viewManager.buttonLogout(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                logout();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewManager.setColorButtonLogout(new Color(0, 0, 150));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewManager.setColorButtonLogout(new Color(0, 0, 255));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewManager.setColorButtonLogout(new Color(0, 255, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewManager.setColorButtonLogout(new Color(0, 0, 255));
            }
        });
    }

    private void logout() {
        C_Login login = new C_Login();
        viewManager.dispose();
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Maximize">
    private void buttonMaximize() {
        viewManager.buttonMaximize(new MouseListener() {
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
                viewManager.setIconButtonMaximize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewManager.setIconButtonMaximize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewManager.setIconButtonMaximize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px_1.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewManager.setIconButtonMaximize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px.png")));
            }
        });
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Exit">
    private void buttonExit() {
        viewManager.buttonExit(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exit();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewManager.setIconButtonExit(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewManager.setIconButtonExit(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewManager.setIconButtonExit(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px_1.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewManager.setIconButtonExit(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png")));
            }
        });
    }

    private void exit() {
        System.exit(0);
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Minimize">
    private void buttonMinimize() {
        viewManager.buttonMinimize(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                minimize();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewManager.setIconButtonMinimize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewManager.setIconButtonMinimize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewManager.setIconButtonMinimize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewManager.setIconButtonMinimize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png")));
            }
        });
    }

    private void minimize() {
        viewManager.minimize(ICONIFIED);
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Drag Window">
    private void dragWindow() {

        viewManager.mousePanelUndecorated(new MouseListener() {
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

        viewManager.dragPanelUndecorated(new MouseMotionListener() {
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
