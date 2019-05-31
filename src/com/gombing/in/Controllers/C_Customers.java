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
import java.awt.Component;
import java.awt.Font;
import static java.awt.Frame.ICONIFIED;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.print.PrinterException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.SwingWorker;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author MaulanaKevinPradana
 */
public class C_Customers extends V_Customers {

    private final Table_AnimalCare tableAnimalCare;
    private final M_Users modelUsers;
    private final config connection;
    private SwingWorker sw;

    public C_Customers(int id) {
        
        frame().setVisible(true);
        
        connection = new config();
        connection.getAnimalCare().setCon(connection.getConnection());
        connection.getUsers().setCon(connection.getConnection());

        modelUsers = new M_Users();
        modelUsers.setId(id);

        tableAnimalCare = new Table_AnimalCare();

        profilHeader();

        buttonLogout();
        buttonMinimize();
        buttonMaximize();
        buttonExit();
        dragWindow();

        viewAnimalCare();
        tableAnimalCare();
        refreshAnimalCare();
        printAnimalCare();
        searchAnimalCare();

        viewEditProfile();
        choosePhoto();
        cancelEditProfile();
        saveEditProfile();
        
//        showFrame();
    }

    private void showFrame() {
        sw = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                getSplashScreen().pack();
                getSplashScreen().setLocationRelativeTo(null);
                getSplashScreen().setVisible(true);
                getProgressBar().setIndeterminate(true);
                Thread.sleep(6000);
                return null;
            }

            @Override
            public void done() {
                getSplashScreen().setVisible(false);
                getProgressBar().setIndeterminate(false);
                frame().setVisible(true);
            }
        };
        sw.execute();
    }

    private void refresh() {
        this.dispose();
        sw = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                frame().setVisible(false);
                getSplashScreen().pack();
                getSplashScreen().setLocationRelativeTo(null);
                getSplashScreen().setVisible(true);
                getProgressBar().setIndeterminate(true);
                C_Customers customer = new C_Customers(modelUsers.getId());
                return null;
            }

            @Override
            public void done() {
                getSplashScreen().setVisible(false);
                getProgressBar().setIndeterminate(false);
            }
        };
        sw.execute();
    }

    private void print(JTable tabel, String judul) {
        try {
            tabel.print(JTable.PrintMode.FIT_WIDTH, new MessageFormat(judul), null);
        } catch (PrinterException ex) {
            Logger.getLogger(C_Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void search(JTable tabel, String search) {
        try {
            AbstractTableModel table = (AbstractTableModel) tabel.getModel();
            TableRowSorter<AbstractTableModel> tr = new TableRowSorter<>(table);
            tabel.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(search));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Not Found", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void profilHeader() {
        try {
            connection.getUsers().getUser(modelUsers);
            getTextView_name().setText(modelUsers.getName());
            connection.getUsers().getPhoto(modelUsers);
            getPicture().setIcon(scaleImage(modelUsers.getFile(), getPicture()));
        } catch (SQLException ex) {
            Logger.getLogger(C_Customers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void resizeColumnWidth(JTable table) {
        final TableColumnModel columnModel = table.getColumnModel();
        for (int column = 0; column < table.getColumnCount(); column++) {
            int width = 15; // Min width
            for (int row = 0; row < table.getRowCount(); row++) {
                TableCellRenderer renderer = table.getCellRenderer(row, column);
                Component comp = table.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width + 1, width);
            }
            if (width > 300) {
                width = 300;
            }
            columnModel.getColumn(column).setPreferredWidth(width);
        }
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
            resizeColumnWidth(getTable_animalCare());
            getTable_animalCare().setAutoCreateRowSorter(true);
            getTable_animalCare().getTableHeader().setOpaque(false);
            getTable_animalCare().getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
            getTable_animalCare().getTableHeader().setBackground(Color.white);
        } catch (SQLException ex) {
            Logger.getLogger(C_Customers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void refreshAnimalCare() {
        getButton_refreshAnimalCare().addActionListener((ActionEvent e) -> {
            refresh();
        });
    }

    private void printAnimalCare() {
        getButton_printAnimalCare().addActionListener((ActionEvent e) -> {
            print(getTable_animalCare(), "Animal Care Report");
        });
    }

    private void searchAnimalCare() {
        getEditText_searchAnimalCare().addKeyListener(new KeyListener() {
            // <editor-fold defaultstate="collapsed" desc="UNUSED">
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }//</editor-fold>

            @Override
            public void keyReleased(KeyEvent e) {
                search(getTable_animalCare(), getEditText_searchAnimalCare().getText());
            }
        });
    }
    //</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Profile">
    private void viewEditProfile() {
        getButton_editProfile().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                try {
                    getColor_animalCare().setBackground(new Color(255, 255, 255));
                    CardLayout card = (CardLayout) getPanel_body().getLayout();
                    card.show(getPanel_body(), "panel_profile");
                    getEditText_name().setText(modelUsers.getName());
                    getEditText_email().setText(modelUsers.getEmail());
                    getEditText_phoneNumber().setText(modelUsers.getPhone_number());
                    getEditText_address().setText(modelUsers.getAddress());
                    connection.getUsers().getPhoto(modelUsers);
                    getPicture1().setIcon(scaleImage(modelUsers.getFile(), getPicture1()));
                } catch (SQLException ex) {
                    Logger.getLogger(C_Customers.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "ERROR : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
                }
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
            try {
                browseImageUser(getPicture1());
                if (modelUsers.getPath() != null) {
                    connection.getUsers().updatePhoto(modelUsers);
                }
            } catch (SQLException ex) {
                Logger.getLogger(C_Customers.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "ERROR : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
            }
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
            if (getEditText_name().getText().isEmpty()
                    && getEditText_email().getText().isEmpty()
                    && getEditText_phoneNumber().getText().isEmpty()
                    && getEditText_address().getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Data must be filled", "Failed", JOptionPane.ERROR_MESSAGE);
            } else {
                try {
                    getTextView_name().setText(getEditText_name().getText());
                    JOptionPane.showMessageDialog(null, "Success to save profile");
                    modelUsers.setName(getEditText_name().getText());
                    modelUsers.setEmail(getEditText_email().getText());
                    modelUsers.setPhone_number(getEditText_phoneNumber().getText());
                    modelUsers.setAddress(getEditText_address().getText());
                    connection.getUsers().update(modelUsers);
                    connection.getUsers().getPhoto(modelUsers);
                    getPicture().setIcon(scaleImage(modelUsers.getFile(), getPicture()));
                } catch (SQLException ex) {
                    Logger.getLogger(C_Customers.class.getName()).log(Level.SEVERE, null, ex);
                    JOptionPane.showMessageDialog(null, "ERROR : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
                }
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
    } //</editor-fold>

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
            frame().setVisible(false);
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
