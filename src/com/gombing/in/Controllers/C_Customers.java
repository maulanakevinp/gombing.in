/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Controllers;

import com.gombing.in.DBUtils.config;
import com.gombing.in.Models.M_Users;
import com.gombing.in.Models.Table_AnimalCare;
import com.gombing.in.Views.V_Customers;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import static java.awt.Frame.ICONIFIED;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author MaulanaKevinPradana
 */
public class C_Customers extends V_Customers {

    private final Table_AnimalCare tableAnimalCare;
    private final M_Users modelUsers;
    private final config connection;

    public C_Customers(int id, int levelId, int status, String name, String email, String phone_number, String Password, String address, InputStream file) {
        Show(true);
        tableAnimalCare = new Table_AnimalCare();

        connection = new config();
        connection.getAnimalCare().setCon(connection.getConnection());
        connection.getUsers().setCon(connection.getConnection());

        modelUsers = new M_Users();
        modelUsers.setId(id);
        modelUsers.setName(name);
        modelUsers.setEmail(email);
        modelUsers.setPhone_number(phone_number);
        modelUsers.setAddress(address);
        modelUsers.setLevelId(levelId);
        modelUsers.setPassword(Password);
        modelUsers.setStatus(status);
        modelUsers.setFileFromDB(file);

        getTextView_name().setText(modelUsers.getName());
        getPicture().setIcon(scaleImage(connection.getUsers().getPhoto(modelUsers.getId()), getPicture()));

        buttonLogout();
        buttonMinimize();
        buttonMaximize();
        buttonExit();
        dragWindow();

        viewAnimalCare();
        tableAnimalCare();

        viewEditProfile();
        choosePhoto();
        cancelEditProfile();
        saveEditProfile();
    }

    // <editor-fold defaultstate="collapsed" desc="Animal Care">
    private void viewAnimalCare() {
        getButton_animalCare().addActionListener((ActionEvent e) -> {
            getColor_animalCare().setBackground(new Color(0, 255, 0));
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_animalCare");
        });
    }

    private void tableAnimalCare() {
        try {
            tableAnimalCare.setList(connection.getAnimalCare().getAllOwnerHave(modelUsers));
            getTable_animalCare().setModel(tableAnimalCare);
            getTable_animalCare().getTableHeader().setOpaque(false);
            getTable_animalCare().getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            getTable_animalCare().getTableHeader().setBackground(Color.white);
        } catch (SQLException ex) {
            Logger.getLogger(C_Customers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Profile"
    private void viewEditProfile() {
        getButton_editProfile().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                getColor_animalCare().setBackground(new Color(255, 255, 255));
                CardLayout card = (CardLayout) getPanel_body().getLayout();
                card.show(getPanel_body(), "panel_profile");
                getEditText_name().setText(modelUsers.getName());
                getEditText_email().setText(modelUsers.getEmail());
                getEditText_phoneNumber().setText(modelUsers.getPhone_number());
                getEditText_address().setText(modelUsers.getAddress());
                getPicture1().setIcon(scaleImage(connection.getUsers().getPhoto(modelUsers.getId()), getPicture1()));
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    private void choosePhoto() {
        getButton_choosePhoto().addActionListener((ActionEvent e) -> {
            browseImageUser(getPicture1());
        });
    }

    private ImageIcon ResizeImage(String imgPath, JLabel label) {
        ImageIcon MyImage = new ImageIcon(imgPath);
        Image img = MyImage.getImage();
        Image newImage = img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImage);
        return image;
    }

    private void browseImageUser(JLabel label) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            label.setIcon(ResizeImage(path, label));
            modelUsers.setPath(path);
            label.setText("");
        } else if (result == JFileChooser.CANCEL_OPTION) {
        }
    }

    private void saveEditProfile() {
        getButton_saveEditProfile().addActionListener((ActionEvent e) -> {
            try {
                getTextView_name().setText(getEditText_name().getText());
                JOptionPane.showMessageDialog(null, "Success to save profile");
                modelUsers.setName(getEditText_name().getText());
                modelUsers.setEmail(getEditText_email().getText());
                modelUsers.setPhone_number(getEditText_phoneNumber().getText());
                modelUsers.setAddress(getEditText_address().getText());
                connection.getUsers().update(modelUsers);
                getPicture().setIcon(scaleImage(connection.getUsers().getPhoto(modelUsers.getId()), getPicture()));
            } catch (SQLException ex) {
                Logger.getLogger(C_Customers.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "ERROR : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void cancelEditProfile() {
        getButton_cancelEditProfile().addActionListener((ActionEvent e) -> {
            getColor_animalCare().setBackground(new Color(0, 255, 0));
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_animalCare");
        });
    }

    private ImageIcon scaleImage(InputStream file, JLabel image) {
        ImageIcon icon = null;
        try {
            if (file == null) {
                image.setIcon(null);
                image.setText("NO IMAGE");
            } else {
                Image im = ImageIO.read(file);
                Image scaledImage = im.getScaledInstance(image.getWidth(), image.getHeight(), Image.SCALE_SMOOTH);
                icon = new ImageIcon(scaledImage);
                image.setText("");
            }
        } catch (IOException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
        return icon;
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
            Show(false);
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
