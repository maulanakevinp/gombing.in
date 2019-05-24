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
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
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
public class C_Admin extends V_Admin {

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
        Show(true);
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
        connection.getLevel().setCon(connection.getConnection());

        comboBoxLevel();
        comboBoxAnimalType();
        comboBoxTypePet();
        comboBoxAnimalOwner();

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
        addImageUser();
        chooseImageUser();

        viewAnimal();
        addAnimal();
        saveAddAnimal();
        cancelAddAnimal();
        editAnimal();
        saveEditAnimal();
        cancelEditAnimal();
        deleteAnimal();
        refreshAnimal();
        addImageAnimal();
        chooseImageAnimal();

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
        getButton_users().addActionListener((ActionEvent e) -> {
            getColor_users().setBackground(new Color(0, 255, 0));
            getColor_animal().setBackground(new Color(255, 255, 255));
            getColor_animalType().setBackground(new Color(255, 255, 255));
            getColor_typePet().setBackground(new Color(255, 255, 255));
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_users");
            tableUsers();
        });
    }

    private void tableUsers() {
        try {
            tableUsers.setList(connection.getUsers().getAll());
            getTable_users().setModel(tableUsers);
            getTable_users().getTableHeader().setOpaque(false);
            getTable_users().getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            getTable_users().getTableHeader().setBackground(Color.white);
            getTable_users().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = getTable_users().getSelectedRow();
                    int id = Integer.parseInt(getTable_users().getValueAt(row, 0).toString());
                    modelUsers.setId(id);
                    getEditText_name1().setText(getTable_users().getValueAt(row, 1).toString());
                    getEditText_email1().setText(getTable_users().getValueAt(row, 2).toString());
                    getEditText_password1().setText(getTable_users().getValueAt(row, 3).toString());
                    getComboBox_level1().setSelectedItem(getTable_users().getValueAt(row, 4).toString());
                    getComboBox_status1().setSelectedItem(getTable_users().getValueAt(row, 5).toString());
                    getEditText_phoneNumber1().setText(getTable_users().getValueAt(row, 6).toString());
                    getEditText_address1().setText(getTable_users().getValueAt(row, 7).toString());
                    getImage_user1().setIcon(scaleImage(connection.getUsers().getPhoto(id), getImage_user1()));
                    getImage_user1().revalidate();
                }
            });
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void comboBoxLevel() {
        try {
            getComboBox_level().setModel(new DefaultComboBoxModel(connection.getLevel().fillComboBoxLevel().toArray()));
            getComboBox_level1().setModel(new DefaultComboBoxModel(connection.getLevel().fillComboBoxLevel().toArray()));
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addUsers() {
        getButton_addUsers().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_addUsers");
        });
    }

    private void saveAddUsers() {
        getButton_saveAddUsers().addActionListener((ActionEvent e) -> {
            try {
                modelUsers.setName(getEditText_name().getText());
                modelUsers.setEmail(getEditText_email().getText());
                modelUsers.setPassword(getEditText_password().getText());
                modelUsers.setLevelId(connection.getLevel().getId(getComboBox_level().getSelectedItem().toString()));
                modelUsers.setStatus(getComboBox_status().getSelectedIndex());
                modelUsers.setPhone_number(getEditText_phoneNumber().getText());
                modelUsers.setAddress(getEditText_address().getText());
                connection.getUsers().insert(modelUsers);
                tableUsers();
                CardLayout card = (CardLayout) getPanel_body().getLayout();
                card.show(getPanel_body(), "panel_users");
                getEditText_name().setText("");
                getEditText_email().setText("");
                getEditText_password().setText("");
                getEditText_phoneNumber().setText("");
                getEditText_address().setText("");
                JOptionPane.showMessageDialog(null, "Success to save data", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Failed to save data", "Failed", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void cancelAddUsers() {
        getButton_cancelAddUsers().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_users");
        });
    }

    private void editUsers() {
        getButton_editUsers().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_editUsers");
        });
    }

    private void saveEditUsers() {
        getButton_saveEditUsers().addActionListener((ActionEvent e) -> {
            try {
                modelUsers.setName(getEditText_name1().getText());
                modelUsers.setEmail(getEditText_email1().getText());
                modelUsers.setPassword(getEditText_password1().getText());
                modelUsers.setLevelId(connection.getLevel().getId(getComboBox_level1().getSelectedItem().toString()));
                modelUsers.setStatus(getComboBox_status1().getSelectedIndex());
                modelUsers.setPhone_number(getEditText_phoneNumber1().getText());
                modelUsers.setAddress(getEditText_address1().getText());
                connection.getUsers().update(modelUsers);
                tableUsers();
                CardLayout card = (CardLayout) getPanel_body().getLayout();
                card.show(getPanel_body(), "panel_users");
                getEditText_name1().setText("");
                getEditText_email1().setText("");
                getEditText_password1().setText("");
                JOptionPane.showMessageDialog(null, "Success to save data", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Failed to save data", "Failed", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void cancelEditUsers() {
        getButton_cancelEditUsers().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_users");
        });
    }

    private void deleteUsers() {
        getButton_deleteUsers().addActionListener((ActionEvent e) -> {
            try {
                connection.getUsers().delete(modelUsers);
                tableUsers();
                JOptionPane.showMessageDialog(null, "Success to delete data", "Success", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Failed to delete data", "Failed", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void refreshUsers() {
        getButton_refreshUsers().addActionListener((ActionEvent e) -> {
            tableUsers();
        });
    }

    private void addImageUser() {
        getImage_user().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                browseImageUser(getImage_user());
            }

            // <editor-fold defaultstate="collapsed" desc="Unused">
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

            }//</editor-fold>
        });
    }

    private void chooseImageUser() {
        getButton_chooseUserPhoto().addActionListener((ActionEvent e) -> {
            browseImageUser(getImage_user1());
        });
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Animal">
    private void viewAnimal() {
        getButton_animal().addActionListener((ActionEvent e) -> {
            getColor_users().setBackground(new Color(255, 255, 255));
            getColor_animal().setBackground(new Color(0, 255, 0));
            getColor_animalType().setBackground(new Color(255, 255, 255));
            getColor_typePet().setBackground(new Color(255, 255, 255));
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_animal");
            tableAnimal();
        });
    }

    private void tableAnimal() {
        try {
            tableAnimal.setList(connection.getAnimal().getAll());
            getTable_animal().setModel(tableAnimal);
            getTable_animal().getTableHeader().setOpaque(false);
            getTable_animal().getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            getTable_animal().getTableHeader().setBackground(Color.white);
            getTable_animal().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = getTable_animal().getSelectedRow();
                    int id = Integer.parseInt(getTable_animal().getValueAt(row, 0).toString());
                    modelAnimal.setId(id);
                    getEditText_animalName1().setText(getTable_animal().getValueAt(row, 1).toString());
                    getComboBox_animalType1().setSelectedItem(getTable_animal().getValueAt(row, 2).toString());
                    getComboBox_gender1().setSelectedItem(getTable_animal().getValueAt(row, 3).toString());
                    getDateChooser_birthdate1().setDate((Date) getTable_animal().getValueAt(row, 4));
                    getComboBox_animalOwner1().setSelectedItem(getTable_animal().getValueAt(row, 5).toString());
                    getEditText_skinColor1().setText(getTable_animal().getValueAt(row, 6).toString());
                    getComboBox_earType1().setSelectedItem(getTable_animal().getValueAt(row, 7).toString());
                    getComboBox_typePet1().setSelectedItem(getTable_animal().getValueAt(row, 8).toString());
                    getImage_animal1().setIcon(scaleImage(connection.getAnimal().getPhoto(id), getImage_animal1()));
                    getImage_animal1().revalidate();
                }
            });
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void comboBoxAnimalOwner() {
        try {
            getComboBox_animalOwner().setModel(new DefaultComboBoxModel(connection.getUsers().fillComboBoxUser().toArray()));
            getComboBox_animalOwner1().setModel(new DefaultComboBoxModel(connection.getUsers().fillComboBoxUser().toArray()));
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addAnimal() {
        getButton_addAnimal().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_addAnimal");
        });
    }

    private void saveAddAnimal() {
        getButton_saveAddAnimal().addActionListener((ActionEvent e) -> {
            if (getDateChooser_birthdate().getDate() != null && getEditText_animalName().getText() != null
                    && getEditText_skinColor().getText() != null) {
                try {
                    modelAnimal.setAnimal_name(getEditText_animalName().getText());
                    modelAnimal.setId_animal_type(connection.getAnimalType().getId(getComboBox_animalType().getSelectedItem().toString()));
                    modelAnimal.setGender(getComboBox_gender().getSelectedItem().toString());
                    modelAnimal.setBirthdate(getDateChooser_birthdate().getDate());
                    modelAnimal.setId_user(connection.getUsers().getId(getComboBox_animalOwner().getSelectedItem().toString()));
                    modelAnimal.setSkin_color(getEditText_skinColor().getText());
                    modelAnimal.setEar_type(getComboBox_earType().getSelectedItem().toString());
                    modelAnimal.setId_type_pet(connection.getTypePet().getId(getComboBox_typePet().getSelectedItem().toString()));
                    connection.getAnimal().insert(modelAnimal);
                    tableAnimal();
                    CardLayout card = (CardLayout) getPanel_body().getLayout();
                    card.show(getPanel_body(), "panel_animal");
                    getEditText_animalName().setText("");
                    getEditText_skinColor().setText("");
                    JOptionPane.showMessageDialog(null, "Success to save data", "Success", JOptionPane.INFORMATION_MESSAGE);
                } catch (SQLException ex) {
                    Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "Failed to save data", "Failed", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Data must be filled!!!","Error",JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void cancelAddAnimal() {
        getButton_cancelAddAnimal().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_animal");
        });
    }

    private void editAnimal() {
        getButton_editAnimal().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_editAnimal");
        });
    }

    private void saveEditAnimal() {
        getButton_saveEditAnimal().addActionListener((ActionEvent e) -> {
            try {
                modelAnimal.setAnimal_name(getEditText_animalName1().getText());
                modelAnimal.setId_animal_type(connection.getAnimalType().getId(getComboBox_animalType1().getSelectedItem().toString()));
                modelAnimal.setGender(getComboBox_gender1().getSelectedItem().toString());
                modelAnimal.setBirthdate(getDateChooser_birthdate1().getDate());
                modelAnimal.setId_user(connection.getUsers().getId(getComboBox_animalOwner1().getSelectedItem().toString()));
                modelAnimal.setSkin_color(getEditText_skinColor1().getText());
                modelAnimal.setEar_type(getComboBox_earType1().getSelectedItem().toString());
                modelAnimal.setId_type_pet(connection.getTypePet().getId(getComboBox_typePet1().getSelectedItem().toString()));
                connection.getAnimal().update(modelAnimal);
                tableAnimal();
                CardLayout card = (CardLayout) getPanel_body().getLayout();
                card.show(getPanel_body(), "panel_animal");
                getEditText_animalName1().setText("");
                getEditText_skinColor1().setText("");
                JOptionPane.showMessageDialog(null, "Success to save data","Success",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Failed to save data","Failed",JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void cancelEditAnimal() {
        getButton_cancelEditAnimal().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_animal");
        });
    }

    private void deleteAnimal() {
        getButton_deleteAnimal().addActionListener((ActionEvent e) -> {
            try {
                connection.getAnimal().delete(modelAnimal);
                tableAnimal();
                JOptionPane.showMessageDialog(null, "Success to delete data","Success",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Failed to delete data","Failed",JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void refreshAnimal() {
        getButton_refreshAnimal().addActionListener((ActionEvent e) -> {
            tableAnimal();
        });
    }

    private void addImageAnimal() {
        getImage_animal().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                browseImageAnimal(getImage_animal());
            }

            // <editor-fold defaultstate="collapsed" desc="Unused">
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

            }//</editor-fold>
        });
    }

    private void chooseImageAnimal() {
        getButton_chooseImageAnimal().addActionListener((ActionEvent e) -> {
            browseImageAnimal(getImage_animal1());
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
            label.setText("Add Image");
        }
    }

    private void browseImageAnimal(JLabel label) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.IMAGE", "jpg", "gif", "png");
        fileChooser.addChoosableFileFilter(filter);
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            label.setIcon(ResizeImage(path, label));
            modelAnimal.setPath(path);
            label.setText("");
        } else if (result == JFileChooser.CANCEL_OPTION) {
            label.setText("Add Image");
        }
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Animal Type">
    private void viewAnimalType() {
        getButton_animalType().addActionListener((ActionEvent e) -> {
            getColor_users().setBackground(new Color(255, 255, 255));
            getColor_animal().setBackground(new Color(255, 255, 255));
            getColor_animalType().setBackground(new Color(0, 255, 0));
            getColor_typePet().setBackground(new Color(255, 255, 255));
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_animalType");
            tableAnimalType();
        });
    }

    private void tableAnimalType() {
        try {
            tableAnimalType.setList(connection.getAnimalType().getAll());
            getTable_animalType().setModel(tableAnimalType);
            getTable_animalType().getTableHeader().setOpaque(false);
            getTable_animalType().getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            getTable_animalType().getTableHeader().setBackground(Color.white);
            getTable_animalType().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = getTable_animalType().getSelectedRow();
                    int id = Integer.parseInt(getTable_animalType().getValueAt(row, 0).toString());
                    modelAnimalType.setId(id);
                    getEditText_animalType1().setText(getTable_animalType().getValueAt(row, 1).toString());
                }
            });
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void comboBoxAnimalType() {
        try {
            getComboBox_animalType().setModel(new DefaultComboBoxModel(connection.getAnimalType().fillComboBox().toArray()));
            getComboBox_animalType1().setModel(new DefaultComboBoxModel(connection.getAnimalType().fillComboBox().toArray()));
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addAnimalType() {
        getButton_addAnimalType().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_addAnimalType");
        });
    }

    private void saveAddAnimalType() {
        getButton_saveAddAnimalType().addActionListener((ActionEvent e) -> {
            try {
                modelAnimalType.setAnimal_type(getEditText_animalType().getText());
                connection.getAnimalType().insert(modelAnimalType);
                tableAnimalType();
                CardLayout card = (CardLayout) getPanel_body().getLayout();
                card.show(getPanel_body(), "panel_animalType");
                getEditText_animalType().setText("");
                JOptionPane.showMessageDialog(null, "Success to save data","Success",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Failed to save data","Failed",JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void cancelAddAnimalType() {
        getButton_cancelAddAnimalType().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_animalType");
        });
    }

    private void editAnimalType() {
        getButton_editAnimalType().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_editAnimalType");
        });
    }

    private void saveEditAnimalType() {
        getButton_saveEditAnimalType().addActionListener((ActionEvent e) -> {
            try {
                modelAnimalType.setAnimal_type(getEditText_animalType1().getText());
                connection.getAnimalType().update(modelAnimalType);
                tableAnimalType();
                CardLayout card = (CardLayout) getPanel_body().getLayout();
                card.show(getPanel_body(), "panel_animalType");
                getEditText_animalType().setText("");
                JOptionPane.showMessageDialog(null, "Success to save data","Success",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Failed to save data","Failed",JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void cancelEditAnimalType() {
        getButton_cancelEditAnimalType().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_animalType");
        });
    }

    private void deleteAnimalType() {
        getButton_deleteAnimalType().addActionListener((ActionEvent e) -> {
            try {
                connection.getAnimalType().delete(modelAnimalType);
                tableAnimalType();
                JOptionPane.showMessageDialog(null, "Success to delete data","Success",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Failed to delete data","Failed",JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void refreshAnimalType() {
        getButton_refreshAnimalType().addActionListener((ActionEvent e) -> {
            tableAnimalType();
        });
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Type Pet">
    private void viewTypePet() {
        getButton_typePet().addActionListener((ActionEvent e) -> {
            getColor_users().setBackground(new Color(255, 255, 255));
            getColor_animal().setBackground(new Color(255, 255, 255));
            getColor_animalType().setBackground(new Color(255, 255, 255));
            getColor_typePet().setBackground(new Color(0, 255, 0));
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_typePet");
            tableTypePet();
        });
    }

    private void tableTypePet() {
        try {
            tableTypePet.setList(connection.getTypePet().getAll());
            getTable_typePet().setModel(tableTypePet);
            getTable_typePet().getTableHeader().setOpaque(false);
            getTable_typePet().getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            getTable_typePet().getTableHeader().setBackground(Color.white);
            getTable_typePet().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    int row = getTable_typePet().getSelectedRow();
                    int id = Integer.parseInt(getTable_typePet().getValueAt(row, 0).toString());
                    modelTypePet.setId(id);
                    getEditText_typePet1().setText(getTable_typePet().getValueAt(row, 1).toString());
                }

            });
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void comboBoxTypePet() {
        try {
            getComboBox_typePet().setModel(new DefaultComboBoxModel(connection.getTypePet().fillComboBox().toArray()));
            getComboBox_typePet1().setModel(new DefaultComboBoxModel(connection.getTypePet().fillComboBox().toArray()));
        } catch (SQLException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void addTypePet() {
        getButton_addTypePet().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_addTypePet");
        });
    }

    private void saveAddTypePet() {
        getButton_saveAddTypePet().addActionListener((ActionEvent e) -> {
            try {
                modelTypePet.setType_pet(getEditText_typePet().getText());
                connection.getTypePet().insert(modelTypePet);
                tableTypePet();
                CardLayout card = (CardLayout) getPanel_body().getLayout();
                card.show(getPanel_body(), "panel_typePet");
                getEditText_typePet().setText("");
                JOptionPane.showMessageDialog(null, "Success to save data","Success",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Failed to save data","Failed",JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void cancelAddTypePet() {
        getButton_cancelAddTypePet().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_typePet");
        });
    }

    private void editTypePet() {
        getButton_editTypePet().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_editTypePet");
        });
    }

    private void saveEditTypePet() {
        getButton_saveEditTypePet().addActionListener((ActionEvent e) -> {
            try {
                modelTypePet.setType_pet(getEditText_typePet1().getText());
                connection.getTypePet().update(modelTypePet);
                tableTypePet();
                CardLayout card = (CardLayout) getPanel_body().getLayout();
                card.show(getPanel_body(), "panel_typePet");
                getEditText_typePet1().setText("");
                JOptionPane.showMessageDialog(null, "Success to save data","Success",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Failed to save data","Failed",JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void cancelEditTypePet() {
        getButton_cancelEditTypePet().addActionListener((ActionEvent e) -> {
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_typePet");
        });
    }

    private void deleteTypePet() {
        getButton_deleteTypePet().addActionListener((ActionEvent e) -> {
            try {
                connection.getTypePet().delete(modelTypePet);
                tableTypePet();
                JOptionPane.showMessageDialog(null, "Success to delete data","Success",JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException ex) {
                Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Failed to delete data","Failed",JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    private void refreshTypePet() {
        getButton_refreshTypePet().addActionListener((ActionEvent e) -> {
            tableTypePet();
        });
    }//</editor-fold>

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
