/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Controllers;

import com.gombing.in.Views.V_Nurse;
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
public class C_Nurse {
    private final V_Nurse viewNurse;

    public C_Nurse() {
        viewNurse = new V_Nurse();
        viewNurse.setVisible(true);
        
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
        viewNurse.buttonAnimal((ActionEvent e) -> {
            viewNurse.setColorAnimal(new Color(0, 255, 0));
            viewNurse.setColorAnimalCare(new Color(255, 255, 255));
            CardLayout card = (CardLayout) viewNurse.getPanel_body().getLayout();
            card.show(viewNurse.getPanel_body(), "panel_animal");
        });
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Animal Care">
    private void animalCare() {
        viewNurse.buttonAnimalCare((ActionEvent e) -> {
            viewNurse.setColorAnimal(new Color(255, 255, 255));
            viewNurse.setColorAnimalCare(new Color(0, 255, 0));
            CardLayout card = (CardLayout) viewNurse.getPanel_body().getLayout();
            card.show(viewNurse.getPanel_body(), "panel_animalCare");
        });
    }
    //</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="Button Logout">
    private void buttonLogout() {
        viewNurse.buttonLogout(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                logout();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewNurse.setColorButtonLogout(new Color(0, 0, 150));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewNurse.setColorButtonLogout(new Color(0, 0, 255));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewNurse.setColorButtonLogout(new Color(0, 255, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewNurse.setColorButtonLogout(new Color(0, 0, 255));
            }
        });
    }

    private void logout() {
        C_Login login = new C_Login();
        viewNurse.dispose();
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Maximize">
    private void buttonMaximize() {
        viewNurse.buttonMaximize(new MouseListener() {
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
                viewNurse.setIconButtonMaximize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewNurse.setIconButtonMaximize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewNurse.setIconButtonMaximize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px_1.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewNurse.setIconButtonMaximize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px.png")));
            }
        });
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Exit">
    private void buttonExit() {
        viewNurse.buttonExit(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                exit();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewNurse.setIconButtonExit(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewNurse.setIconButtonExit(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewNurse.setIconButtonExit(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px_1.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewNurse.setIconButtonExit(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png")));
            }
        });
    }

    private void exit() {
        System.exit(0);
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Button Minimize">
    private void buttonMinimize() {
        viewNurse.buttonMinimize(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                minimize();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                viewNurse.setIconButtonMinimize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_2.png")));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                viewNurse.setIconButtonMinimize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png")));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                viewNurse.setIconButtonMinimize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px.png")));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                viewNurse.setIconButtonMinimize(new ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png")));
            }
        });
    }

    private void minimize() {
        viewNurse.minimize(ICONIFIED);
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Drag Window">
    private void dragWindow() {

        viewNurse.mousePanelUndecorated(new MouseListener() {
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

        viewNurse.dragPanelUndecorated(new MouseMotionListener() {
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
