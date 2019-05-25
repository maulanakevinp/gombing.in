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
import java.awt.FlowLayout;
import static java.awt.Frame.ICONIFIED;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author MaulanaKevinPradana
 */
public class C_Login extends V_Login {

    private final M_Users modelUser;
    private final config connection;

    public C_Login() {
        Show(true);
        action_passwordL();
        action_emailL();
        action_usernameR();
        action_emailR();
        action_passwordR();
        action_cpasswordR();
        action_phoneNumber();

        addImageUser();

        buttonLogin();
        buttonNext();
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
        connecting();
    }
    
    private void connecting(){
        JFrame frame = new JFrame("Connection");
        frame.setLayout(new FlowLayout());
        frame.setAlwaysOnTop(true);
        frame.setUndecorated(true);
        frame.setLocationRelativeTo(null);
        frame.setBackground(Color.WHITE);

        final JProgressBar jProgressBar = new JProgressBar();
        final JLabel status = new JLabel("Connecting...");
        frame.add(status);
        frame.add("jProgressBar", jProgressBar);

        frame.pack();
        frame.setVisible(true);

        SwingWorker sw = new SwingWorker() {
            @Override
            protected Object doInBackground() throws Exception {
                jProgressBar.setIndeterminate(true);
                connection.getUsers().setCon(connection.getConnection());
                return null;
            }

            @Override
            public void done() {
                jProgressBar.setIndeterminate(false);
                status.setText("Successful");
                jProgressBar.setValue(100); // 100%
                frame.dispose();
            }
        };
        sw.execute();
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
            JOptionPane.showMessageDialog(null, "ERROR : " + e, "Error", JOptionPane.ERROR_MESSAGE);
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
                C_Customers customers = new C_Customers(modelUser.getId(), modelUser.getLevelId(), modelUser.getStatus(), modelUser.getName(), modelUser.getEmail(), modelUser.getPhone_number(), modelUser.getPassword(), modelUser.getAddress(), modelUser.getFileFromDB());
                Show(false);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid Username or Password","Error",JOptionPane.ERROR_MESSAGE);
                break;
        }
    }

    private void action_emailL() {
        getEditText_emailL().addActionListener((ActionEvent e) -> {
            getEditText_passwordL().requestFocusInWindow();
        });
    }

    private void action_passwordL() {
        getEditText_passwordL().addActionListener(((ActionEvent e) -> {
            getButton_login().setBackground(new Color(0, 255, 255));
            login();
        }));
    }

    private void action_usernameR() {
        getEditText_usernameR().addActionListener((ActionEvent e) -> {
            getEditText_emailR().requestFocusInWindow();
        });
    }

    private void action_emailR() {
        getEditText_emailR().addActionListener((ActionEvent e) -> {
            getEditText_passwordR().requestFocusInWindow();
        });
    }

    private void action_passwordR() {
        getEditText_passwordR().addActionListener((ActionEvent e) -> {
            getEditText_confirmPassword().requestFocusInWindow();
        });
    }

    private void action_cpasswordR() {
        getEditText_confirmPassword().addActionListener((ActionEvent e) -> {
            buttonNext();
        });
    }

    private void action_phoneNumber() {
        getEditText_phoneNumber().addActionListener((ActionEvent e) -> {
            getEditText_address().requestFocusInWindow();
        });
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

    private void buttonRegister() {
        getButton_register().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                register();
                CardLayout card = (CardLayout) getPanel_body().getLayout();
                card.show(getPanel_body(), "panel_login");
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

    private void register() {
        try {
            modelUser.setPhone_number(getEditText_phoneNumber().getText());
            modelUser.setAddress(getEditText_address().getText());
            connection.getUsers().insert(modelUser);
            CardLayout card = (CardLayout) getPanel_body().getLayout();
            card.show(getPanel_body(), "panel_users");
            getEditText_usernameR().setText("");
            getEditText_emailR().setText("");
            getEditText_passwordR().setText("");
            getEditText_phoneNumber().setText("");
            getEditText_address().setText("");
            JOptionPane.showMessageDialog(null, "Registration Success");
        } catch (SQLException ex) {
            Logger.getLogger(C_Login.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "ERROR : " + ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void buttonNext() {
        getButton_next().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (getEditText_usernameR().getText().isEmpty()
                        && getEditText_emailR().getText().isEmpty()
                        && getEditText_passwordR().getText().isEmpty()
                        && getEditText_confirmPassword().getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Data must be filled","Warning",JOptionPane.WARNING_MESSAGE);
                } else if (!getEditText_passwordR().getText().equals(getEditText_confirmPassword().getText())) {
                    JOptionPane.showMessageDialog(null, "Invalid Password");
                } else {
                    modelUser.setName(getEditText_usernameR().getText());
                    modelUser.setEmail(getEditText_emailR().getText());
                    modelUser.setPassword(getEditText_passwordR().getText());
                    modelUser.setLevelId(4);
                    modelUser.setStatus(1);
                    CardLayout card = (CardLayout) getPanel_body().getLayout();
                    card.show(getPanel_body(), "panel_registration1");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {
                getButton_next().setBackground(new Color(0, 212, 212));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getButton_next().setBackground(new Color(0, 255, 255));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                getButton_next().setBackground(new Color(0, 255, 255));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getButton_next().setBackground(new Color(255, 255, 255));
            }
        });
    }

    private void buttonViewRegistration() {
        getButton_viewRegister().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                viewRegistration();
                getEditText_usernameR().requestFocusInWindow();
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
        getButton_back().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                viewRegistration();
            }

            @Override
            public void mousePressed(MouseEvent e) {
                getButton_back().setForeground(new Color(255, 200, 0));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                getButton_back().setForeground(new Color(255, 255, 0));
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                getButton_back().setForeground(new Color(255, 255, 0));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                getButton_back().setForeground(new Color(255, 255, 255));
            }
        });
    }

    private void viewRegistration() {
        CardLayout card = (CardLayout) getPanel_body().getLayout();
        card.show(getPanel_body(), "panel_registration");
    }

    private void buttonSend() {
        getButton_send().addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (getEditText_emailF().getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Email must be filled","Warning",JOptionPane.WARNING_MESSAGE);
                } else {
                    String pass = connection.getUsers().getPass(getEditText_emailF().getText());
                    if (pass == null) {
                        JOptionPane.showMessageDialog(null, "Sorry you not member","Error",JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Password has been send to your email");
                    }
                }
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
            modelUser.setPath(path);
            label.setText("");
        } else if (result == JFileChooser.CANCEL_OPTION) {
            label.setText("Add Image");
        }
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
