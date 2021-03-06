/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Views;

import com.toedter.calendar.JDateChooser;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author MaulanaKevinPradana
 */
public class V_Admin extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    static boolean maximized = true;

    /**
     * Creates new form V_Admin
     */
    public V_Admin() {
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="USERS">   
    
    protected JTextField getEditText_searchUsers() {
        return editText_searchUsers;
    }

    protected JTable getTable_users() {
        return table_users;
    }

    protected JComboBox<String> getComboBox_level() {
        return comboBox_level;
    }

    protected JComboBox<String> getComboBox_level1() {
        return comboBox_level1;
    }

    protected JComboBox<String> getComboBox_status() {
        return comboBox_status;
    }

    protected JComboBox<String> getComboBox_status1() {
        return comboBox_status1;
    }

    protected JTextArea getEditText_address() {
        return editText_address;
    }

    protected JTextArea getEditText_address1() {
        return editText_address1;
    }

    protected JTextField getEditText_phoneNumber() {
        return editText_phoneNumber;
    }

    protected JTextField getEditText_phoneNumber1() {
        return editText_phoneNumber1;
    }

    protected JLabel getImage_user() {
        return image_user;
    }

    protected JLabel getImage_user1() {
        return image_user1;
    }

    protected JButton getButton_chooseUserPhoto() {
        return button_chooseUserPhoto;
    }

    protected JTextField getEditText_email() {
        return editText_email;
    }

    protected JTextField getEditText_email1() {
        return editText_email1;
    }

    protected JTextField getEditText_name() {
        return editText_name;
    }

    protected JTextField getEditText_name1() {
        return editText_name1;
    }

    protected JPasswordField getEditText_password() {
        return editText_password;
    }

    protected JPasswordField getEditText_password1() {
        return editText_password1;
    }

    protected JButton getButton_addUsers() {
        return button_addUsers;
    }

    protected JButton getButton_cancelAddUsers() {
        return button_cancelAddUsers;
    }

    protected JButton getButton_cancelEditUsers() {
        return button_cancelEditUsers;
    }

    protected JButton getButton_deleteUsers() {
        return button_deleteUsers;
    }

    protected JButton getButton_editUsers() {
        return button_editUsers;
    }

    protected JButton getButton_refreshUsers() {
        return button_refreshUsers;
    }

    protected JButton getButton_printUsers() {
        return button_printUsers;
    }

    protected JButton getButton_saveAddUsers() {
        return button_saveAddUsers;
    }

    protected JButton getButton_saveEditUsers() {
        return button_saveEditUsers;
    }

    protected JButton getButton_users() {
        return button_users;
    }

    protected JLabel getColor_users() {
        return color_users;
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="ANIMAL">  
    
    protected JTextField getEditText_searchAnimal() {
        return editText_searchAnimal;
    }

    protected JTable getTable_animal() {
        return table_animal;
    }

    protected JButton getButton_chooseAnimalPhoto() {
        return button_chooseAnimalPhoto;
    }

    protected JLabel getImage_animal() {
        return image_animal;
    }

    protected JLabel getImage_animal1() {
        return image_animal1;
    }

    protected JComboBox<String> getComboBox_animalOwner() {
        return comboBox_animalOwner;
    }

    protected JComboBox<String> getComboBox_animalOwner1() {
        return comboBox_animalOwner1;
    }

    protected JDateChooser getDateChooser_birthdate() {
        return dateChooser_birthdate;
    }

    protected JDateChooser getDateChooser_birthdate1() {
        return dateChooser_birthdate1;
    }

    protected JComboBox<String> getComboBox_earType() {
        return comboBox_earType;
    }

    protected JComboBox<String> getComboBox_earType1() {
        return comboBox_earType1;
    }

    protected JComboBox<String> getComboBox_gender() {
        return comboBox_gender;
    }

    protected JComboBox<String> getComboBox_gender1() {
        return comboBox_gender1;
    }

    protected JTextField getEditText_animalName() {
        return editText_animalName;
    }

    protected JTextField getEditText_animalName1() {
        return editText_animalName1;
    }

    protected JTextField getEditText_skinColor() {
        return editText_skinColor;
    }

    protected JTextField getEditText_skinColor1() {
        return editText_skinColor1;
    }

    protected JComboBox<String> getComboBox_animalType() {
        return comboBox_animalType;
    }

    protected JComboBox<String> getComboBox_animalType1() {
        return comboBox_animalType1;
    }

    protected JComboBox<String> getComboBox_typePet() {
        return comboBox_typePet;
    }

    protected JComboBox<String> getComboBox_typePet1() {
        return comboBox_typePet1;
    }

    protected JButton getButton_addAnimal() {
        return button_addAnimal;
    }

    protected JButton getButton_cancelAddAnimal() {
        return button_cancelAddAnimal;
    }

    protected JButton getButton_cancelEditAnimal() {
        return button_cancelEditAnimal;
    }

    protected JButton getButton_deleteAnimal() {
        return button_deleteAnimal;
    }

    protected JButton getButton_printAnimal() {
        return button_printAnimal;
    }

    protected JButton getButton_editAnimal() {
        return button_editAnimal;
    }

    protected JButton getButton_refreshAnimal() {
        return button_refreshAnimal;
    }

    protected JButton getButton_saveAddAnimal() {
        return button_saveAddAnimal;
    }

    protected JButton getButton_saveEditAnimal() {
        return button_saveEditAnimal;
    }

    protected JButton getButton_animal() {
        return button_animal;
    }

    protected JLabel getColor_animal() {
        return color_animal;
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="ANIMAL TYPE">   
    
    protected JTextField getEditText_searchAnimalType() {
        return editText_searchAnimalType;
    }

    protected JTable getTable_animalType() {
        return table_animalType;
    }

    protected JTextField getEditText_animalType() {
        return editText_animalType;
    }

    protected JTextField getEditText_animalType1() {
        return editText_animalType1;
    }

    protected JButton getButton_addAnimalType() {
        return button_addAnimalType;
    }

    protected JButton getButton_cancelAddAnimalType() {
        return button_cancelAddAnimalType;
    }

    protected JButton getButton_cancelEditAnimalType() {
        return button_cancelEditAnimalType;
    }

    protected JButton getButton_deleteAnimalType() {
        return button_deleteAnimalType;
    }

    protected JButton getButton_editAnimalType() {
        return button_editAnimalType;
    }

    protected JButton getButton_refreshAnimalType() {
        return button_refreshAnimalType;
    }

    protected JButton getButton_printAnimalType() {
        return button_printAnimalType;
    }

    protected JButton getButton_saveAddAnimalType() {
        return button_saveAddAnimalType;
    }

    protected JButton getButton_saveEditAnimalType() {
        return button_saveEditAnimalType;
    }

    protected JButton getButton_animalType() {
        return button_animalType;
    }

    protected JLabel getColor_animalType() {
        return color_animalType;
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="TYPE PET">   
    
    protected JTextField getEditText_searchTypePet() {
        return editText_searchTypePet;
    }

    protected JTable getTable_typePet() {
        return table_typePet;
    }

    protected JTextField getEditText_typePet() {
        return editText_typePet;
    }

    protected JTextField getEditText_typePet1() {
        return editText_typePet1;
    }

    protected JButton getButton_addTypePet() {
        return button_addTypePet;
    }

    protected JButton getButton_cancelAddTypePet() {
        return button_cancelAddTypePet;
    }

    protected JButton getButton_cancelEditTypePet() {
        return button_cancelEditTypePet;
    }

    protected JButton getButton_deleteTypePet() {
        return button_deleteTypePet;
    }

    protected JButton getButton_editTypePet() {
        return button_editTypePet;
    }

    protected JButton getButton_refreshTypePet() {
        return button_refreshTypePet;
    }

    protected JButton getButton_printTypePet() {
        return button_printTypePet;
    }

    protected JButton getButton_saveAddTypePet() {
        return button_saveAddTypePet;
    }

    protected JButton getButton_saveEditTypePet() {
        return button_saveEditTypePet;
    }

    protected JButton getButton_typePet() {
        return button_typePet;
    }

    protected JLabel getColor_typePet() {
        return color_typePet;
    }//</editor-fold>

    // <editor-fold defaultstate="collapsed" desc="WINDOW">
    protected JDialog getSplashScreen() {
        return splashScreen;
    }

    protected JProgressBar getProgressBar() {
        return progressBar;
    }

    protected JFrame frame() {
        return this;
    }

    protected void Show(Boolean a) {
        this.setVisible(a);
    }

    protected JLabel getButton_logout() {
        return button_logout;
    }

    protected JPanel getPanel_body() {
        return panel_body;
    }

    protected int getxMouse() {
        return xMouse;
    }

    protected void setxMouse(int xMouse) {
        this.xMouse = xMouse;
    }

    protected int getyMouse() {
        return yMouse;
    }

    protected void setyMouse(int yMouse) {
        this.yMouse = yMouse;
    }

    protected JLabel getButton_minimize() {
        return button_minimize;
    }

    protected void minimize(int State) {
        this.setState(State);
    }

    protected JLabel getButton_maximize() {
        return button_maximize;
    }

    protected void naximize(int State) {
        this.setState(State);
    }

    protected boolean isMaximized() {
        return maximized;
    }

    protected void setMaximized(boolean maximized) {
        V_Admin.maximized = maximized;
    }

    protected JLabel getButton_exit() {
        return button_exit;
    }

    protected JPanel getPanel_undecorated() {
        return panel_undecorated;
    }//</editor-fold>

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        splashScreen = new javax.swing.JDialog();
        base = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        bg = new javax.swing.JLabel();
        panel_undecorated = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        button_exit = new javax.swing.JLabel();
        button_minimize = new javax.swing.JLabel();
        button_maximize = new javax.swing.JLabel();
        panel_header = new javax.swing.JPanel();
        textView_user = new javax.swing.JLabel();
        button_logout = new javax.swing.JLabel();
        picture = new javax.swing.JLabel();
        textView_username = new javax.swing.JLabel();
        button_users = new javax.swing.JButton();
        color_users = new javax.swing.JLabel();
        button_animal = new javax.swing.JButton();
        color_animal = new javax.swing.JLabel();
        button_animalType = new javax.swing.JButton();
        color_animalType = new javax.swing.JLabel();
        button_typePet = new javax.swing.JButton();
        color_typePet = new javax.swing.JLabel();
        panel_body = new javax.swing.JPanel();
        panel_users = new javax.swing.JPanel();
        textUsers_subtitle = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        scrollPane_users = new javax.swing.JScrollPane();
        table_users = new javax.swing.JTable();
        button_deleteUsers = new javax.swing.JButton();
        button_addUsers = new javax.swing.JButton();
        button_refreshUsers = new javax.swing.JButton();
        button_editUsers = new javax.swing.JButton();
        button_printUsers = new javax.swing.JButton();
        editText_searchUsers = new javax.swing.JTextField();
        textView_searchUsers = new javax.swing.JLabel();
        panel_addUsers = new javax.swing.JPanel();
        textView_addUsers = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();
        panel_formAddUsers = new javax.swing.JPanel();
        textView_name = new javax.swing.JLabel();
        editText_name = new javax.swing.JTextField();
        textView_email = new javax.swing.JLabel();
        editText_email = new javax.swing.JTextField();
        textView_password = new javax.swing.JLabel();
        editText_password = new javax.swing.JPasswordField();
        textView_level = new javax.swing.JLabel();
        textView_status = new javax.swing.JLabel();
        comboBox_level = new javax.swing.JComboBox<>();
        comboBox_status = new javax.swing.JComboBox<>();
        button_cancelAddUsers = new javax.swing.JButton();
        button_saveAddUsers = new javax.swing.JButton();
        image_user = new javax.swing.JLabel();
        editText_phoneNumber = new javax.swing.JTextField();
        textView_phoneNumber = new javax.swing.JLabel();
        textView_address = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        editText_address = new javax.swing.JTextArea();
        panel_editUsers = new javax.swing.JPanel();
        textView_editUsers = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        panel_formEditUsers = new javax.swing.JPanel();
        textView_name1 = new javax.swing.JLabel();
        editText_name1 = new javax.swing.JTextField();
        textView_email1 = new javax.swing.JLabel();
        editText_email1 = new javax.swing.JTextField();
        textView_password1 = new javax.swing.JLabel();
        editText_password1 = new javax.swing.JPasswordField();
        textView_level1 = new javax.swing.JLabel();
        textView_status1 = new javax.swing.JLabel();
        comboBox_level1 = new javax.swing.JComboBox<>();
        comboBox_status1 = new javax.swing.JComboBox<>();
        button_cancelEditUsers = new javax.swing.JButton();
        button_saveEditUsers = new javax.swing.JButton();
        image_user1 = new javax.swing.JLabel();
        editText_phoneNumber1 = new javax.swing.JTextField();
        textView_phoneNumber1 = new javax.swing.JLabel();
        textView_address1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        editText_address1 = new javax.swing.JTextArea();
        button_chooseUserPhoto = new javax.swing.JButton();
        panel_animal = new javax.swing.JPanel();
        textView_animal = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        scrollPane_animal = new javax.swing.JScrollPane();
        table_animal = new javax.swing.JTable();
        button_addAnimal = new javax.swing.JButton();
        button_deleteAnimal = new javax.swing.JButton();
        button_editAnimal = new javax.swing.JButton();
        button_refreshAnimal = new javax.swing.JButton();
        button_printAnimal = new javax.swing.JButton();
        editText_searchAnimal = new javax.swing.JTextField();
        textView_searchAnimal = new javax.swing.JLabel();
        panel_addAnimal = new javax.swing.JPanel();
        textView_addAnimal = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        panel_formAddAnimal = new javax.swing.JPanel();
        button_cancelAddAnimal = new javax.swing.JButton();
        button_saveAddAnimal = new javax.swing.JButton();
        textView_animalName = new javax.swing.JLabel();
        editText_animalName = new javax.swing.JTextField();
        textView_animalType = new javax.swing.JLabel();
        comboBox_animalType = new javax.swing.JComboBox<>();
        textView_gender = new javax.swing.JLabel();
        comboBox_gender = new javax.swing.JComboBox<>();
        textView_birthdate = new javax.swing.JLabel();
        textView_animalOwner = new javax.swing.JLabel();
        textView_skinColor = new javax.swing.JLabel();
        editText_skinColor = new javax.swing.JTextField();
        textView_earType = new javax.swing.JLabel();
        comboBox_earType = new javax.swing.JComboBox<>();
        textView_typePet = new javax.swing.JLabel();
        comboBox_typePet = new javax.swing.JComboBox<>();
        dateChooser_birthdate = new com.toedter.calendar.JDateChooser();
        comboBox_animalOwner = new javax.swing.JComboBox<>();
        image_animal = new javax.swing.JLabel();
        panel_editAnimal = new javax.swing.JPanel();
        textView_editAnimal = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        panel_formEditAnimal = new javax.swing.JPanel();
        button_cancelEditAnimal = new javax.swing.JButton();
        button_saveEditAnimal = new javax.swing.JButton();
        textView_animalName1 = new javax.swing.JLabel();
        editText_animalName1 = new javax.swing.JTextField();
        textView_animalType1 = new javax.swing.JLabel();
        comboBox_animalType1 = new javax.swing.JComboBox<>();
        textView_gender1 = new javax.swing.JLabel();
        comboBox_gender1 = new javax.swing.JComboBox<>();
        textView_birthdate1 = new javax.swing.JLabel();
        textView_animalOwner1 = new javax.swing.JLabel();
        textView_skinColor1 = new javax.swing.JLabel();
        editText_skinColor1 = new javax.swing.JTextField();
        textView_earType1 = new javax.swing.JLabel();
        comboBox_earType1 = new javax.swing.JComboBox<>();
        textView_typePet1 = new javax.swing.JLabel();
        comboBox_typePet1 = new javax.swing.JComboBox<>();
        dateChooser_birthdate1 = new com.toedter.calendar.JDateChooser();
        comboBox_animalOwner1 = new javax.swing.JComboBox<>();
        image_animal1 = new javax.swing.JLabel();
        button_chooseAnimalPhoto = new javax.swing.JButton();
        panel_animalType = new javax.swing.JPanel();
        textView_subAnimalType = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        scrollPane_animalType = new javax.swing.JScrollPane();
        table_animalType = new javax.swing.JTable();
        button_addAnimalType = new javax.swing.JButton();
        button_deleteAnimalType = new javax.swing.JButton();
        button_editAnimalType = new javax.swing.JButton();
        button_refreshAnimalType = new javax.swing.JButton();
        button_printAnimalType = new javax.swing.JButton();
        editText_searchAnimalType = new javax.swing.JTextField();
        textView_searchAnimalType = new javax.swing.JLabel();
        panel_addAnimalType = new javax.swing.JPanel();
        textView_addAnimalType = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        panel_formAddAnimalType = new javax.swing.JPanel();
        textView_animaType = new javax.swing.JLabel();
        editText_animalType = new javax.swing.JTextField();
        button_cancelAddAnimalType = new javax.swing.JButton();
        button_saveAddAnimalType = new javax.swing.JButton();
        panel_editAnimalType = new javax.swing.JPanel();
        textView_editAnimalType = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        panel_formEditAnimalType = new javax.swing.JPanel();
        textView_animaType1 = new javax.swing.JLabel();
        editText_animalType1 = new javax.swing.JTextField();
        button_cancelEditAnimalType = new javax.swing.JButton();
        button_saveEditAnimalType = new javax.swing.JButton();
        panel_TypePet = new javax.swing.JPanel();
        textView_subTypePet = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        scrollPane_typePet = new javax.swing.JScrollPane();
        table_typePet = new javax.swing.JTable();
        button_addTypePet = new javax.swing.JButton();
        button_deleteTypePet = new javax.swing.JButton();
        button_editTypePet = new javax.swing.JButton();
        button_refreshTypePet = new javax.swing.JButton();
        button_printTypePet = new javax.swing.JButton();
        editText_searchTypePet = new javax.swing.JTextField();
        textView_searchTypePet = new javax.swing.JLabel();
        panel_addTypePet = new javax.swing.JPanel();
        textView_addTypePet = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        panel_formAddTypePet = new javax.swing.JPanel();
        textView_typePet2 = new javax.swing.JLabel();
        editText_typePet = new javax.swing.JTextField();
        button_cancelAddTypePet = new javax.swing.JButton();
        button_saveAddTypePet = new javax.swing.JButton();
        panel_editTypePet = new javax.swing.JPanel();
        textView_editTypePet = new javax.swing.JLabel();
        jSeparator12 = new javax.swing.JSeparator();
        panel_formEditTypePet = new javax.swing.JPanel();
        textView_typePet3 = new javax.swing.JLabel();
        editText_typePet1 = new javax.swing.JTextField();
        button_cancelEditTypePet = new javax.swing.JButton();
        button_saveEditTypePet = new javax.swing.JButton();

        splashScreen.setMinimumSize(new java.awt.Dimension(370, 460));
        splashScreen.setUndecorated(true);

        base.setBackground(new java.awt.Color(255, 255, 255));
        base.setMinimumSize(new java.awt.Dimension(370, 460));

        jLabel1.setText("LOADING...");

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/logo.png"))); // NOI18N

        javax.swing.GroupLayout baseLayout = new javax.swing.GroupLayout(base);
        base.setLayout(baseLayout);
        baseLayout.setHorizontalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(baseLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(progressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, baseLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        baseLayout.setVerticalGroup(
            baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(baseLayout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout splashScreenLayout = new javax.swing.GroupLayout(splashScreen.getContentPane());
        splashScreen.getContentPane().setLayout(splashScreenLayout);
        splashScreenLayout.setHorizontalGroup(
            splashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        splashScreenLayout.setVerticalGroup(
            splashScreenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, splashScreenLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1200, 700));
        setUndecorated(true);
        setSize(new java.awt.Dimension(1200, 700));

        panel_undecorated.setBackground(new java.awt.Color(255, 255, 255));

        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/title.png"))); // NOI18N

        button_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_close_window_30px.png"))); // NOI18N
        button_exit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        button_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_minimize_window_30px_1.png"))); // NOI18N

        button_maximize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_maximize_window_30px.png"))); // NOI18N

        javax.swing.GroupLayout panel_undecoratedLayout = new javax.swing.GroupLayout(panel_undecorated);
        panel_undecorated.setLayout(panel_undecoratedLayout);
        panel_undecoratedLayout.setHorizontalGroup(
            panel_undecoratedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_undecoratedLayout.createSequentialGroup()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_minimize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_maximize, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_exit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_undecoratedLayout.setVerticalGroup(
            panel_undecoratedLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button_exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button_minimize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(button_maximize, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        panel_header.setBackground(new java.awt.Color(255, 255, 255));

        textView_user.setText("You are login as Admin,");

        button_logout.setForeground(new java.awt.Color(0, 0, 255));
        button_logout.setText("Logout?");
        button_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_administrator_male_100px.png"))); // NOI18N

        textView_username.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        textView_username.setText("ADMINISTRATOR");

        button_users.setBackground(new java.awt.Color(255, 255, 255));
        button_users.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_users.setText("USERS");
        button_users.setBorder(null);
        button_users.setBorderPainted(false);
        button_users.setContentAreaFilled(false);
        button_users.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_users.setFocusable(false);

        color_users.setBackground(new java.awt.Color(0, 255, 0));
        color_users.setOpaque(true);

        button_animal.setBackground(new java.awt.Color(255, 255, 255));
        button_animal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_animal.setText("ANIMAL");
        button_animal.setBorder(null);
        button_animal.setBorderPainted(false);
        button_animal.setContentAreaFilled(false);
        button_animal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_animal.setFocusable(false);

        color_animal.setBackground(new java.awt.Color(255, 255, 255));
        color_animal.setOpaque(true);

        button_animalType.setBackground(new java.awt.Color(255, 255, 255));
        button_animalType.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_animalType.setText("ANIMAL TYPE");
        button_animalType.setBorder(null);
        button_animalType.setBorderPainted(false);
        button_animalType.setContentAreaFilled(false);
        button_animalType.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_animalType.setFocusable(false);

        color_animalType.setBackground(new java.awt.Color(255, 255, 255));
        color_animalType.setOpaque(true);

        button_typePet.setBackground(new java.awt.Color(255, 255, 255));
        button_typePet.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_typePet.setText("TYPE PET");
        button_typePet.setBorder(null);
        button_typePet.setBorderPainted(false);
        button_typePet.setContentAreaFilled(false);
        button_typePet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_typePet.setFocusable(false);

        color_typePet.setBackground(new java.awt.Color(255, 255, 255));
        color_typePet.setOpaque(true);

        javax.swing.GroupLayout panel_headerLayout = new javax.swing.GroupLayout(panel_header);
        panel_header.setLayout(panel_headerLayout);
        panel_headerLayout.setHorizontalGroup(
            panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_headerLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(picture, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_headerLayout.createSequentialGroup()
                        .addComponent(textView_username, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textView_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_logout))
                    .addGroup(panel_headerLayout.createSequentialGroup()
                        .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(color_users, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_users, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(color_animal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(color_animalType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_animalType, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(color_typePet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_typePet, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_headerLayout.setVerticalGroup(
            panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_headerLayout.createSequentialGroup()
                        .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(picture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(textView_user)
                                .addComponent(button_logout)
                                .addComponent(textView_username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_headerLayout.createSequentialGroup()
                                .addComponent(button_users, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(color_users, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_headerLayout.createSequentialGroup()
                                .addComponent(button_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(color_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_headerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_headerLayout.createSequentialGroup()
                                .addComponent(button_animalType, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(color_animalType, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_headerLayout.createSequentialGroup()
                                .addComponent(button_typePet, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(color_typePet, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );

        panel_body.setBackground(new java.awt.Color(255, 255, 255));
        panel_body.setMinimumSize(new java.awt.Dimension(1184, 476));
        panel_body.setLayout(new java.awt.CardLayout());

        panel_users.setBackground(new java.awt.Color(255, 255, 255));

        textUsers_subtitle.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        textUsers_subtitle.setText("USERS");

        scrollPane_users.setBackground(new java.awt.Color(255, 255, 255));
        scrollPane_users.setBorder(null);

        table_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_users.setFocusable(false);
        table_users.setGridColor(new java.awt.Color(255, 255, 255));
        table_users.setIntercellSpacing(new java.awt.Dimension(0, 0));
        table_users.setSelectionBackground(new java.awt.Color(0, 255, 0));
        table_users.setShowVerticalLines(false);
        table_users.getTableHeader().setResizingAllowed(false);
        table_users.getTableHeader().setReorderingAllowed(false);
        scrollPane_users.setViewportView(table_users);

        button_deleteUsers.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_deleteUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/hapus.png"))); // NOI18N
        button_deleteUsers.setText("Delete");
        button_deleteUsers.setContentAreaFilled(false);
        button_deleteUsers.setFocusable(false);

        button_addUsers.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_addUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/add.png"))); // NOI18N
        button_addUsers.setText("Add");
        button_addUsers.setContentAreaFilled(false);
        button_addUsers.setFocusable(false);

        button_refreshUsers.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_refreshUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/refresh.png"))); // NOI18N
        button_refreshUsers.setText("Refresh");
        button_refreshUsers.setContentAreaFilled(false);
        button_refreshUsers.setFocusable(false);

        button_editUsers.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_editUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/edit.png"))); // NOI18N
        button_editUsers.setText("Edit");
        button_editUsers.setContentAreaFilled(false);
        button_editUsers.setFocusable(false);

        button_printUsers.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_printUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/Print.png"))); // NOI18N
        button_printUsers.setText("Print");
        button_printUsers.setContentAreaFilled(false);
        button_printUsers.setFocusable(false);

        textView_searchUsers.setText("Search");

        javax.swing.GroupLayout panel_usersLayout = new javax.swing.GroupLayout(panel_users);
        panel_users.setLayout(panel_usersLayout);
        panel_usersLayout.setHorizontalGroup(
            panel_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_usersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_usersLayout.createSequentialGroup()
                        .addComponent(textView_searchUsers)
                        .addGap(18, 18, 18)
                        .addComponent(editText_searchUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textUsers_subtitle)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
                        .addComponent(scrollPane_users)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_usersLayout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addComponent(button_addUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_deleteUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_editUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_refreshUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_printUsers)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        panel_usersLayout.setVerticalGroup(
            panel_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_usersLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(textUsers_subtitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editText_searchUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textView_searchUsers))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane_users, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panel_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_addUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_deleteUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_editUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_refreshUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_printUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        panel_body.add(panel_users, "panel_users");

        panel_addUsers.setBackground(new java.awt.Color(255, 255, 255));

        textView_addUsers.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        textView_addUsers.setText("ADD USERS");

        panel_formAddUsers.setBackground(new java.awt.Color(255, 255, 255));

        textView_name.setText("Name");
        textView_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        editText_name.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        editText_name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textView_email.setText("E-Mail");
        textView_email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        editText_email.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        editText_email.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textView_password.setText("Password");
        textView_password.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        editText_password.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        textView_level.setText("Level");
        textView_level.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textView_status.setText("Status");
        textView_status.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        comboBox_level.setEditable(true);
        comboBox_level.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboBox_status.setEditable(true);
        comboBox_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Non Aktif", "Aktif" }));

        button_cancelAddUsers.setBackground(new java.awt.Color(255, 255, 255));
        button_cancelAddUsers.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_cancelAddUsers.setText("CANCEL");
        button_cancelAddUsers.setContentAreaFilled(false);
        button_cancelAddUsers.setFocusable(false);

        button_saveAddUsers.setBackground(new java.awt.Color(255, 255, 255));
        button_saveAddUsers.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_saveAddUsers.setText("SAVE");
        button_saveAddUsers.setContentAreaFilled(false);
        button_saveAddUsers.setFocusable(false);

        image_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_user.setText("Add User Photo");
        image_user.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        image_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        image_user.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        editText_phoneNumber.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        editText_phoneNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textView_phoneNumber.setText("Phone Number");
        textView_phoneNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textView_address.setText("Address");
        textView_address.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        editText_address.setColumns(20);
        editText_address.setRows(5);
        jScrollPane1.setViewportView(editText_address);

        javax.swing.GroupLayout panel_formAddUsersLayout = new javax.swing.GroupLayout(panel_formAddUsers);
        panel_formAddUsers.setLayout(panel_formAddUsersLayout);
        panel_formAddUsersLayout.setHorizontalGroup(
            panel_formAddUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_formAddUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image_user, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(panel_formAddUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textView_password)
                    .addComponent(textView_email)
                    .addComponent(textView_name)
                    .addComponent(textView_phoneNumber))
                .addGap(46, 46, 46)
                .addGroup(panel_formAddUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editText_phoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(editText_name)
                    .addComponent(editText_email)
                    .addComponent(editText_password))
                .addGroup(panel_formAddUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formAddUsersLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_cancelAddUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_saveAddUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_formAddUsersLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panel_formAddUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textView_level)
                            .addComponent(textView_status)
                            .addComponent(textView_address))
                        .addGap(46, 46, 46)
                        .addGroup(panel_formAddUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_formAddUsersLayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(comboBox_status, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox_level, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel_formAddUsersLayout.setVerticalGroup(
            panel_formAddUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_formAddUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_formAddUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(image_user, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_formAddUsersLayout.createSequentialGroup()
                        .addGroup(panel_formAddUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_formAddUsersLayout.createSequentialGroup()
                                .addGroup(panel_formAddUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(editText_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textView_name)
                                    .addComponent(textView_address))
                                .addGap(20, 20, 20)
                                .addGroup(panel_formAddUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(editText_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textView_email)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(panel_formAddUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editText_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textView_password)
                            .addComponent(textView_level)
                            .addComponent(comboBox_level, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(panel_formAddUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editText_phoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textView_phoneNumber)
                            .addComponent(textView_status)
                            .addComponent(comboBox_status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(panel_formAddUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_cancelAddUsers)
                    .addComponent(button_saveAddUsers))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_addUsersLayout = new javax.swing.GroupLayout(panel_addUsers);
        panel_addUsers.setLayout(panel_addUsersLayout);
        panel_addUsersLayout.setHorizontalGroup(
            panel_addUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addUsersLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(panel_addUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textView_addUsers)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(panel_addUsersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_formAddUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_addUsersLayout.setVerticalGroup(
            panel_addUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addUsersLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(textView_addUsers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(panel_formAddUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        panel_body.add(panel_addUsers, "panel_addUsers");

        panel_editUsers.setBackground(new java.awt.Color(255, 255, 255));

        textView_editUsers.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        textView_editUsers.setText("EDIT USERS");

        panel_formEditUsers.setBackground(new java.awt.Color(255, 255, 255));

        textView_name1.setText("Name");
        textView_name1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        editText_name1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        editText_name1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textView_email1.setText("E-Mail");
        textView_email1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        editText_email1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        editText_email1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textView_password1.setText("Password");
        textView_password1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        editText_password1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        textView_level1.setText("Level");
        textView_level1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textView_status1.setText("Status");
        textView_status1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        comboBox_level1.setEditable(true);
        comboBox_level1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        comboBox_status1.setEditable(true);
        comboBox_status1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Non Aktif", "Aktif" }));

        button_cancelEditUsers.setBackground(new java.awt.Color(255, 255, 255));
        button_cancelEditUsers.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_cancelEditUsers.setText("CANCEL");
        button_cancelEditUsers.setContentAreaFilled(false);
        button_cancelEditUsers.setFocusable(false);

        button_saveEditUsers.setBackground(new java.awt.Color(255, 255, 255));
        button_saveEditUsers.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_saveEditUsers.setText("SAVE");
        button_saveEditUsers.setContentAreaFilled(false);
        button_saveEditUsers.setFocusable(false);

        image_user1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_user1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        image_user1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        image_user1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        editText_phoneNumber1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        editText_phoneNumber1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textView_phoneNumber1.setText("Phone Number");
        textView_phoneNumber1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textView_address1.setText("Address");
        textView_address1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        editText_address1.setColumns(20);
        editText_address1.setRows(5);
        jScrollPane2.setViewportView(editText_address1);

        button_chooseUserPhoto.setBackground(new java.awt.Color(255, 255, 255));
        button_chooseUserPhoto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_chooseUserPhoto.setText("Choose Photo");
        button_chooseUserPhoto.setContentAreaFilled(false);
        button_chooseUserPhoto.setFocusable(false);

        javax.swing.GroupLayout panel_formEditUsersLayout = new javax.swing.GroupLayout(panel_formEditUsers);
        panel_formEditUsers.setLayout(panel_formEditUsersLayout);
        panel_formEditUsersLayout.setHorizontalGroup(
            panel_formEditUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_formEditUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_formEditUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(image_user1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                    .addComponent(button_chooseUserPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(30, 30, 30)
                .addGroup(panel_formEditUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textView_password1)
                    .addComponent(textView_email1)
                    .addComponent(textView_name1)
                    .addComponent(textView_phoneNumber1))
                .addGap(46, 46, 46)
                .addGroup(panel_formEditUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(editText_phoneNumber1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                    .addComponent(editText_name1)
                    .addComponent(editText_email1)
                    .addComponent(editText_password1))
                .addGroup(panel_formEditUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formEditUsersLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(button_cancelEditUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button_saveEditUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_formEditUsersLayout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(panel_formEditUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textView_level1)
                            .addComponent(textView_status1)
                            .addComponent(textView_address1))
                        .addGap(46, 46, 46)
                        .addGroup(panel_formEditUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_formEditUsersLayout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(comboBox_status1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox_level1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel_formEditUsersLayout.setVerticalGroup(
            panel_formEditUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_formEditUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_formEditUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(image_user1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel_formEditUsersLayout.createSequentialGroup()
                        .addGroup(panel_formEditUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_formEditUsersLayout.createSequentialGroup()
                                .addGroup(panel_formEditUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(editText_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textView_name1)
                                    .addComponent(textView_address1))
                                .addGap(20, 20, 20)
                                .addGroup(panel_formEditUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(editText_email1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textView_email1)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(panel_formEditUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editText_password1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textView_password1)
                            .addComponent(textView_level1)
                            .addComponent(comboBox_level1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(panel_formEditUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editText_phoneNumber1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textView_phoneNumber1)
                            .addComponent(textView_status1)
                            .addComponent(comboBox_status1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20)
                .addGroup(panel_formEditUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_cancelEditUsers)
                    .addComponent(button_saveEditUsers)
                    .addComponent(button_chooseUserPhoto))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_editUsersLayout = new javax.swing.GroupLayout(panel_editUsers);
        panel_editUsers.setLayout(panel_editUsersLayout);
        panel_editUsersLayout.setHorizontalGroup(
            panel_editUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editUsersLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(panel_editUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textView_editUsers)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(panel_editUsersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_formEditUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_editUsersLayout.setVerticalGroup(
            panel_editUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editUsersLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(textView_editUsers)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(panel_formEditUsers, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        panel_body.add(panel_editUsers, "panel_editUsers");

        panel_animal.setBackground(new java.awt.Color(255, 255, 255));

        textView_animal.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        textView_animal.setText("ANIMAL");

        scrollPane_animal.setBackground(new java.awt.Color(255, 255, 255));
        scrollPane_animal.setBorder(null);

        table_animal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_animal.setFocusable(false);
        table_animal.setGridColor(new java.awt.Color(255, 255, 255));
        table_animal.setIntercellSpacing(new java.awt.Dimension(0, 0));
        table_animal.setSelectionBackground(new java.awt.Color(0, 255, 0));
        table_animal.setShowVerticalLines(false);
        table_animal.getTableHeader().setResizingAllowed(false);
        table_animal.getTableHeader().setReorderingAllowed(false);
        scrollPane_animal.setViewportView(table_animal);

        button_addAnimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_addAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/add.png"))); // NOI18N
        button_addAnimal.setText("Add");
        button_addAnimal.setContentAreaFilled(false);
        button_addAnimal.setFocusable(false);

        button_deleteAnimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_deleteAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/hapus.png"))); // NOI18N
        button_deleteAnimal.setText("Delete");
        button_deleteAnimal.setContentAreaFilled(false);
        button_deleteAnimal.setFocusable(false);

        button_editAnimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_editAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/edit.png"))); // NOI18N
        button_editAnimal.setText("Edit");
        button_editAnimal.setContentAreaFilled(false);
        button_editAnimal.setFocusable(false);

        button_refreshAnimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_refreshAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/refresh.png"))); // NOI18N
        button_refreshAnimal.setText("Refresh");
        button_refreshAnimal.setContentAreaFilled(false);
        button_refreshAnimal.setFocusable(false);

        button_printAnimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_printAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/Print.png"))); // NOI18N
        button_printAnimal.setText("Print");
        button_printAnimal.setContentAreaFilled(false);
        button_printAnimal.setFocusable(false);

        textView_searchAnimal.setText("Search");

        javax.swing.GroupLayout panel_animalLayout = new javax.swing.GroupLayout(panel_animal);
        panel_animal.setLayout(panel_animalLayout);
        panel_animalLayout.setHorizontalGroup(
            panel_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_animalLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(panel_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_animalLayout.createSequentialGroup()
                        .addComponent(textView_searchAnimal)
                        .addGap(18, 18, 18)
                        .addComponent(editText_searchAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(scrollPane_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textView_animal)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_animalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_addAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_deleteAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_editAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_refreshAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_printAnimal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_animalLayout.setVerticalGroup(
            panel_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_animalLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(textView_animal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editText_searchAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textView_searchAnimal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panel_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_addAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_deleteAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_editAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_refreshAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_printAnimal))
                .addGap(50, 50, 50))
        );

        panel_body.add(panel_animal, "panel_animal");

        panel_addAnimal.setBackground(new java.awt.Color(255, 255, 255));

        textView_addAnimal.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        textView_addAnimal.setText("ADD ANIMAL");

        panel_formAddAnimal.setBackground(new java.awt.Color(255, 255, 255));

        button_cancelAddAnimal.setBackground(new java.awt.Color(255, 255, 255));
        button_cancelAddAnimal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_cancelAddAnimal.setText("CANCEL");
        button_cancelAddAnimal.setContentAreaFilled(false);
        button_cancelAddAnimal.setFocusable(false);

        button_saveAddAnimal.setBackground(new java.awt.Color(255, 255, 255));
        button_saveAddAnimal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_saveAddAnimal.setText("SAVE");
        button_saveAddAnimal.setContentAreaFilled(false);
        button_saveAddAnimal.setFocusable(false);

        textView_animalName.setText("Animal Name");
        textView_animalName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        editText_animalName.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        editText_animalName.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textView_animalType.setText("Animal Type");
        textView_animalType.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        comboBox_animalType.setEditable(true);
        comboBox_animalType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Goat", "Cow" }));
        comboBox_animalType.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        textView_gender.setText("Gender");
        textView_gender.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        comboBox_gender.setEditable(true);
        comboBox_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        comboBox_gender.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        textView_birthdate.setText("Birthdate");
        textView_birthdate.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textView_animalOwner.setText("Animal Owner");
        textView_animalOwner.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textView_skinColor.setText("Skin Color");
        textView_skinColor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        editText_skinColor.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        editText_skinColor.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textView_earType.setText("Ear Type");
        textView_earType.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        comboBox_earType.setEditable(true);
        comboBox_earType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Big", "Small" }));
        comboBox_earType.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        textView_typePet.setText("Type Pet");
        textView_typePet.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        comboBox_typePet.setEditable(true);
        comboBox_typePet.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Boer", "Etawa" }));
        comboBox_typePet.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        dateChooser_birthdate.setDateFormatString("yyyy-MM-dd");

        comboBox_animalOwner.setEditable(true);
        comboBox_animalOwner.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Goat", "Cow" }));
        comboBox_animalOwner.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        image_animal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_animal.setText("Add Animal Image");
        image_animal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        image_animal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        image_animal.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panel_formAddAnimalLayout = new javax.swing.GroupLayout(panel_formAddAnimal);
        panel_formAddAnimal.setLayout(panel_formAddAnimalLayout);
        panel_formAddAnimalLayout.setHorizontalGroup(
            panel_formAddAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formAddAnimalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(image_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(panel_formAddAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textView_birthdate)
                    .addComponent(textView_gender)
                    .addComponent(textView_animalType)
                    .addComponent(textView_animalName))
                .addGap(18, 18, 18)
                .addGroup(panel_formAddAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editText_animalName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateChooser_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox_animalType, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBox_gender, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(panel_formAddAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_formAddAnimalLayout.createSequentialGroup()
                        .addComponent(textView_earType)
                        .addGap(41, 41, 41)
                        .addComponent(comboBox_earType, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_formAddAnimalLayout.createSequentialGroup()
                        .addComponent(textView_skinColor)
                        .addGap(37, 37, 37)
                        .addComponent(editText_skinColor, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_formAddAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formAddAnimalLayout.createSequentialGroup()
                            .addComponent(button_cancelAddAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(button_saveAddAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formAddAnimalLayout.createSequentialGroup()
                            .addComponent(textView_typePet)
                            .addGap(41, 41, 41)
                            .addComponent(comboBox_typePet, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(panel_formAddAnimalLayout.createSequentialGroup()
                            .addComponent(textView_animalOwner)
                            .addGap(18, 18, 18)
                            .addComponent(comboBox_animalOwner, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        panel_formAddAnimalLayout.setVerticalGroup(
            panel_formAddAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formAddAnimalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_formAddAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_formAddAnimalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(panel_formAddAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textView_animalName)
                            .addComponent(textView_animalOwner)
                            .addComponent(editText_animalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox_animalOwner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_formAddAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBox_animalType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editText_skinColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textView_skinColor)
                            .addComponent(textView_animalType))
                        .addGap(18, 18, 18)
                        .addGroup(panel_formAddAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBox_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox_earType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textView_earType)
                            .addComponent(textView_gender))
                        .addGap(18, 18, 18)
                        .addGroup(panel_formAddAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_formAddAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboBox_typePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textView_typePet)
                                .addComponent(textView_birthdate))
                            .addComponent(dateChooser_birthdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(image_animal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(panel_formAddAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_cancelAddAnimal)
                    .addComponent(button_saveAddAnimal))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_addAnimalLayout = new javax.swing.GroupLayout(panel_addAnimal);
        panel_addAnimal.setLayout(panel_addAnimalLayout);
        panel_addAnimalLayout.setHorizontalGroup(
            panel_addAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addAnimalLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(panel_addAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textView_addAnimal)
                    .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(panel_addAnimalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_formAddAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_addAnimalLayout.setVerticalGroup(
            panel_addAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addAnimalLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(textView_addAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(panel_formAddAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        panel_body.add(panel_addAnimal, "panel_addAnimal");

        panel_editAnimal.setBackground(new java.awt.Color(255, 255, 255));

        textView_editAnimal.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        textView_editAnimal.setText("EDIT ANIMAL");

        panel_formEditAnimal.setBackground(new java.awt.Color(255, 255, 255));

        button_cancelEditAnimal.setBackground(new java.awt.Color(255, 255, 255));
        button_cancelEditAnimal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_cancelEditAnimal.setText("CANCEL");
        button_cancelEditAnimal.setContentAreaFilled(false);
        button_cancelEditAnimal.setFocusable(false);

        button_saveEditAnimal.setBackground(new java.awt.Color(255, 255, 255));
        button_saveEditAnimal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_saveEditAnimal.setText("SAVE");
        button_saveEditAnimal.setContentAreaFilled(false);
        button_saveEditAnimal.setFocusable(false);

        textView_animalName1.setText("Animal Name");
        textView_animalName1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        editText_animalName1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        editText_animalName1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textView_animalType1.setText("Animal Type");
        textView_animalType1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        comboBox_animalType1.setEditable(true);
        comboBox_animalType1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Goat", "Cow" }));
        comboBox_animalType1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        textView_gender1.setText("Gender");
        textView_gender1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        comboBox_gender1.setEditable(true);
        comboBox_gender1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        comboBox_gender1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        textView_birthdate1.setText("Birthdate");
        textView_birthdate1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textView_animalOwner1.setText("Animal Owner");
        textView_animalOwner1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textView_skinColor1.setText("Skin Color");
        textView_skinColor1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        editText_skinColor1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        editText_skinColor1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        textView_earType1.setText("Ear Type");
        textView_earType1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        comboBox_earType1.setEditable(true);
        comboBox_earType1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Big", "Small" }));
        comboBox_earType1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        textView_typePet1.setText("Type Pet");
        textView_typePet1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        comboBox_typePet1.setEditable(true);
        comboBox_typePet1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Boer", "Etawa" }));
        comboBox_typePet1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        comboBox_animalOwner1.setEditable(true);
        comboBox_animalOwner1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choose", "Goat", "Cow" }));
        comboBox_animalOwner1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        image_animal1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        image_animal1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        image_animal1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        image_animal1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        button_chooseAnimalPhoto.setBackground(new java.awt.Color(255, 255, 255));
        button_chooseAnimalPhoto.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_chooseAnimalPhoto.setText("CHOOSE IMAGE");
        button_chooseAnimalPhoto.setContentAreaFilled(false);
        button_chooseAnimalPhoto.setFocusable(false);

        javax.swing.GroupLayout panel_formEditAnimalLayout = new javax.swing.GroupLayout(panel_formEditAnimal);
        panel_formEditAnimal.setLayout(panel_formEditAnimalLayout);
        panel_formEditAnimalLayout.setHorizontalGroup(
            panel_formEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formEditAnimalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_formEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(button_chooseAnimalPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(image_animal1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
                .addGroup(panel_formEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_formEditAnimalLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(panel_formEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textView_birthdate1)
                            .addComponent(textView_gender1)
                            .addComponent(textView_animalType1)
                            .addComponent(textView_animalName1))
                        .addGap(18, 18, 18)
                        .addGroup(panel_formEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(editText_animalName1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dateChooser_birthdate1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboBox_animalType1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox_gender1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formEditAnimalLayout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addGroup(panel_formEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_formEditAnimalLayout.createSequentialGroup()
                                .addComponent(textView_skinColor1)
                                .addGap(37, 37, 37)
                                .addComponent(editText_skinColor1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_formEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formEditAnimalLayout.createSequentialGroup()
                                    .addComponent(button_cancelEditAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(button_saveEditAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel_formEditAnimalLayout.createSequentialGroup()
                                    .addComponent(textView_animalOwner1)
                                    .addGap(18, 18, 18)
                                    .addComponent(comboBox_animalOwner1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formEditAnimalLayout.createSequentialGroup()
                                    .addGroup(panel_formEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(textView_earType1)
                                        .addComponent(textView_typePet1))
                                    .addGap(41, 41, 41)
                                    .addGroup(panel_formEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboBox_typePet1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboBox_earType1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        panel_formEditAnimalLayout.setVerticalGroup(
            panel_formEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formEditAnimalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_formEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_formEditAnimalLayout.createSequentialGroup()
                        .addGroup(panel_formEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textView_animalName1)
                            .addComponent(textView_animalOwner1)
                            .addComponent(editText_animalName1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox_animalOwner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(panel_formEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBox_animalType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editText_skinColor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textView_skinColor1)
                            .addComponent(textView_animalType1))
                        .addGap(18, 18, 18)
                        .addGroup(panel_formEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboBox_gender1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboBox_earType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textView_earType1)
                            .addComponent(textView_gender1))
                        .addGap(18, 18, 18)
                        .addGroup(panel_formEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_formEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comboBox_typePet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textView_typePet1)
                                .addComponent(textView_birthdate1))
                            .addComponent(dateChooser_birthdate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(image_animal1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_formEditAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_cancelEditAnimal)
                    .addComponent(button_saveEditAnimal)
                    .addComponent(button_chooseAnimalPhoto))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_editAnimalLayout = new javax.swing.GroupLayout(panel_editAnimal);
        panel_editAnimal.setLayout(panel_editAnimalLayout);
        panel_editAnimalLayout.setHorizontalGroup(
            panel_editAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editAnimalLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(panel_editAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textView_editAnimal)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(panel_editAnimalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_formEditAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_editAnimalLayout.setVerticalGroup(
            panel_editAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editAnimalLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(textView_editAnimal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(panel_formEditAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        panel_body.add(panel_editAnimal, "panel_editAnimal");

        panel_animalType.setBackground(new java.awt.Color(255, 255, 255));

        textView_subAnimalType.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        textView_subAnimalType.setText("ANIMAL TYPE");

        scrollPane_animalType.setBackground(new java.awt.Color(255, 255, 255));
        scrollPane_animalType.setBorder(null);

        table_animalType.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_animalType.setFocusable(false);
        table_animalType.setGridColor(new java.awt.Color(255, 255, 255));
        table_animalType.setIntercellSpacing(new java.awt.Dimension(0, 0));
        table_animalType.setSelectionBackground(new java.awt.Color(0, 255, 0));
        table_animalType.setShowVerticalLines(false);
        table_animalType.getTableHeader().setResizingAllowed(false);
        table_animalType.getTableHeader().setReorderingAllowed(false);
        scrollPane_animalType.setViewportView(table_animalType);

        button_addAnimalType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_addAnimalType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/add.png"))); // NOI18N
        button_addAnimalType.setText("Add");
        button_addAnimalType.setContentAreaFilled(false);
        button_addAnimalType.setFocusable(false);

        button_deleteAnimalType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_deleteAnimalType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/hapus.png"))); // NOI18N
        button_deleteAnimalType.setText("Delete");
        button_deleteAnimalType.setContentAreaFilled(false);
        button_deleteAnimalType.setFocusable(false);

        button_editAnimalType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_editAnimalType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/edit.png"))); // NOI18N
        button_editAnimalType.setText("Edit");
        button_editAnimalType.setContentAreaFilled(false);
        button_editAnimalType.setFocusable(false);

        button_refreshAnimalType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_refreshAnimalType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/refresh.png"))); // NOI18N
        button_refreshAnimalType.setText("Refresh");
        button_refreshAnimalType.setContentAreaFilled(false);
        button_refreshAnimalType.setFocusable(false);

        button_printAnimalType.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_printAnimalType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/Print.png"))); // NOI18N
        button_printAnimalType.setText("Print");
        button_printAnimalType.setContentAreaFilled(false);
        button_printAnimalType.setFocusable(false);

        textView_searchAnimalType.setText("Search");

        javax.swing.GroupLayout panel_animalTypeLayout = new javax.swing.GroupLayout(panel_animalType);
        panel_animalType.setLayout(panel_animalTypeLayout);
        panel_animalTypeLayout.setHorizontalGroup(
            panel_animalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_animalTypeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_animalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_animalTypeLayout.createSequentialGroup()
                        .addComponent(textView_searchAnimalType)
                        .addGap(18, 18, 18)
                        .addComponent(editText_searchAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_animalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textView_subAnimalType)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
                        .addComponent(scrollPane_animalType)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_animalTypeLayout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addComponent(button_addAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_deleteAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_editAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_refreshAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_printAnimalType)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        panel_animalTypeLayout.setVerticalGroup(
            panel_animalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_animalTypeLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(textView_subAnimalType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_animalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editText_searchAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textView_searchAnimalType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane_animalType, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panel_animalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_addAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_deleteAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_editAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_refreshAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_printAnimalType))
                .addGap(50, 50, 50))
        );

        panel_body.add(panel_animalType, "panel_animalType");

        panel_addAnimalType.setBackground(new java.awt.Color(255, 255, 255));

        textView_addAnimalType.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        textView_addAnimalType.setText("ADD ANIMAL TYPE");

        panel_formAddAnimalType.setBackground(new java.awt.Color(255, 255, 255));

        textView_animaType.setText("Animal Type");
        textView_animaType.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        editText_animalType.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        editText_animalType.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        button_cancelAddAnimalType.setBackground(new java.awt.Color(255, 255, 255));
        button_cancelAddAnimalType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_cancelAddAnimalType.setText("CANCEL");
        button_cancelAddAnimalType.setContentAreaFilled(false);
        button_cancelAddAnimalType.setFocusable(false);

        button_saveAddAnimalType.setBackground(new java.awt.Color(255, 255, 255));
        button_saveAddAnimalType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_saveAddAnimalType.setText("SAVE");
        button_saveAddAnimalType.setContentAreaFilled(false);
        button_saveAddAnimalType.setFocusable(false);

        javax.swing.GroupLayout panel_formAddAnimalTypeLayout = new javax.swing.GroupLayout(panel_formAddAnimalType);
        panel_formAddAnimalType.setLayout(panel_formAddAnimalTypeLayout);
        panel_formAddAnimalTypeLayout.setHorizontalGroup(
            panel_formAddAnimalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_formAddAnimalTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textView_animaType)
                .addGap(66, 66, 66)
                .addGroup(panel_formAddAnimalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editText_animalType, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_formAddAnimalTypeLayout.createSequentialGroup()
                        .addComponent(button_cancelAddAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_saveAddAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_formAddAnimalTypeLayout.setVerticalGroup(
            panel_formAddAnimalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formAddAnimalTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_formAddAnimalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editText_animalType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textView_animaType))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_formAddAnimalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_cancelAddAnimalType)
                    .addComponent(button_saveAddAnimalType))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout panel_addAnimalTypeLayout = new javax.swing.GroupLayout(panel_addAnimalType);
        panel_addAnimalType.setLayout(panel_addAnimalTypeLayout);
        panel_addAnimalTypeLayout.setHorizontalGroup(
            panel_addAnimalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addAnimalTypeLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(panel_addAnimalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textView_addAnimalType)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(panel_addAnimalTypeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_formAddAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_addAnimalTypeLayout.setVerticalGroup(
            panel_addAnimalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addAnimalTypeLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(textView_addAnimalType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(panel_formAddAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        panel_body.add(panel_addAnimalType, "panel_addAnimalType");

        panel_editAnimalType.setBackground(new java.awt.Color(255, 255, 255));

        textView_editAnimalType.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        textView_editAnimalType.setText("EDIT ANIMAL TYPE");

        panel_formEditAnimalType.setBackground(new java.awt.Color(255, 255, 255));

        textView_animaType1.setText("Animal Type");
        textView_animaType1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        editText_animalType1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        editText_animalType1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        button_cancelEditAnimalType.setBackground(new java.awt.Color(255, 255, 255));
        button_cancelEditAnimalType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_cancelEditAnimalType.setText("CANCEL");
        button_cancelEditAnimalType.setContentAreaFilled(false);
        button_cancelEditAnimalType.setFocusable(false);

        button_saveEditAnimalType.setBackground(new java.awt.Color(255, 255, 255));
        button_saveEditAnimalType.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_saveEditAnimalType.setText("SAVE");
        button_saveEditAnimalType.setContentAreaFilled(false);
        button_saveEditAnimalType.setFocusable(false);

        javax.swing.GroupLayout panel_formEditAnimalTypeLayout = new javax.swing.GroupLayout(panel_formEditAnimalType);
        panel_formEditAnimalType.setLayout(panel_formEditAnimalTypeLayout);
        panel_formEditAnimalTypeLayout.setHorizontalGroup(
            panel_formEditAnimalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_formEditAnimalTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textView_animaType1)
                .addGap(66, 66, 66)
                .addGroup(panel_formEditAnimalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editText_animalType1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_formEditAnimalTypeLayout.createSequentialGroup()
                        .addComponent(button_cancelEditAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_saveEditAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_formEditAnimalTypeLayout.setVerticalGroup(
            panel_formEditAnimalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formEditAnimalTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_formEditAnimalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editText_animalType1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textView_animaType1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_formEditAnimalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_cancelEditAnimalType)
                    .addComponent(button_saveEditAnimalType))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout panel_editAnimalTypeLayout = new javax.swing.GroupLayout(panel_editAnimalType);
        panel_editAnimalType.setLayout(panel_editAnimalTypeLayout);
        panel_editAnimalTypeLayout.setHorizontalGroup(
            panel_editAnimalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editAnimalTypeLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(panel_editAnimalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textView_editAnimalType)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(panel_editAnimalTypeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_formEditAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_editAnimalTypeLayout.setVerticalGroup(
            panel_editAnimalTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editAnimalTypeLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(textView_editAnimalType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(panel_formEditAnimalType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        panel_body.add(panel_editAnimalType, "panel_editAnimalType");

        panel_TypePet.setBackground(new java.awt.Color(255, 255, 255));

        textView_subTypePet.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        textView_subTypePet.setText("TYPE PET");

        scrollPane_typePet.setBackground(new java.awt.Color(255, 255, 255));
        scrollPane_typePet.setBorder(null);

        table_typePet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_typePet.setFocusable(false);
        table_typePet.setGridColor(new java.awt.Color(255, 255, 255));
        table_typePet.setIntercellSpacing(new java.awt.Dimension(0, 0));
        table_typePet.setSelectionBackground(new java.awt.Color(0, 255, 0));
        table_typePet.setShowVerticalLines(false);
        table_typePet.getTableHeader().setResizingAllowed(false);
        table_typePet.getTableHeader().setReorderingAllowed(false);
        scrollPane_typePet.setViewportView(table_typePet);

        button_addTypePet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_addTypePet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/add.png"))); // NOI18N
        button_addTypePet.setText("Add");
        button_addTypePet.setContentAreaFilled(false);
        button_addTypePet.setFocusable(false);

        button_deleteTypePet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_deleteTypePet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/hapus.png"))); // NOI18N
        button_deleteTypePet.setText("Delete");
        button_deleteTypePet.setContentAreaFilled(false);
        button_deleteTypePet.setFocusable(false);

        button_editTypePet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_editTypePet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/edit.png"))); // NOI18N
        button_editTypePet.setText("Edit");
        button_editTypePet.setContentAreaFilled(false);
        button_editTypePet.setFocusable(false);

        button_refreshTypePet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_refreshTypePet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/refresh.png"))); // NOI18N
        button_refreshTypePet.setText("Refresh");
        button_refreshTypePet.setContentAreaFilled(false);
        button_refreshTypePet.setFocusable(false);

        button_printTypePet.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_printTypePet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/Print.png"))); // NOI18N
        button_printTypePet.setText("Print");
        button_printTypePet.setContentAreaFilled(false);
        button_printTypePet.setFocusable(false);

        textView_searchTypePet.setText("Search");

        javax.swing.GroupLayout panel_TypePetLayout = new javax.swing.GroupLayout(panel_TypePet);
        panel_TypePet.setLayout(panel_TypePetLayout);
        panel_TypePetLayout.setHorizontalGroup(
            panel_TypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_TypePetLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_TypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_TypePetLayout.createSequentialGroup()
                        .addComponent(textView_searchTypePet)
                        .addGap(18, 18, 18)
                        .addComponent(editText_searchTypePet, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_TypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(textView_subTypePet)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
                        .addComponent(scrollPane_typePet)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_TypePetLayout.createSequentialGroup()
                .addContainerGap(304, Short.MAX_VALUE)
                .addComponent(button_addTypePet, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_deleteTypePet, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_editTypePet, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_refreshTypePet, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(button_printTypePet)
                .addContainerGap(305, Short.MAX_VALUE))
        );
        panel_TypePetLayout.setVerticalGroup(
            panel_TypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_TypePetLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(textView_subTypePet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_TypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editText_searchTypePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textView_searchTypePet))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane_typePet, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panel_TypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_addTypePet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_deleteTypePet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_editTypePet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_refreshTypePet, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button_printTypePet))
                .addGap(50, 50, 50))
        );

        panel_body.add(panel_TypePet, "panel_typePet");

        panel_addTypePet.setBackground(new java.awt.Color(255, 255, 255));

        textView_addTypePet.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        textView_addTypePet.setText("ADD TYPE PET");

        panel_formAddTypePet.setBackground(new java.awt.Color(255, 255, 255));

        textView_typePet2.setText("Type Pet");
        textView_typePet2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        editText_typePet.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        editText_typePet.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        button_cancelAddTypePet.setBackground(new java.awt.Color(255, 255, 255));
        button_cancelAddTypePet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_cancelAddTypePet.setText("CANCEL");
        button_cancelAddTypePet.setContentAreaFilled(false);
        button_cancelAddTypePet.setFocusable(false);

        button_saveAddTypePet.setBackground(new java.awt.Color(255, 255, 255));
        button_saveAddTypePet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_saveAddTypePet.setText("SAVE");
        button_saveAddTypePet.setContentAreaFilled(false);
        button_saveAddTypePet.setFocusable(false);

        javax.swing.GroupLayout panel_formAddTypePetLayout = new javax.swing.GroupLayout(panel_formAddTypePet);
        panel_formAddTypePet.setLayout(panel_formAddTypePetLayout);
        panel_formAddTypePetLayout.setHorizontalGroup(
            panel_formAddTypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_formAddTypePetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textView_typePet2)
                .addGap(66, 66, 66)
                .addGroup(panel_formAddTypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editText_typePet, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_formAddTypePetLayout.createSequentialGroup()
                        .addComponent(button_cancelAddTypePet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_saveAddTypePet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_formAddTypePetLayout.setVerticalGroup(
            panel_formAddTypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formAddTypePetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_formAddTypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editText_typePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textView_typePet2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_formAddTypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_cancelAddTypePet)
                    .addComponent(button_saveAddTypePet))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout panel_addTypePetLayout = new javax.swing.GroupLayout(panel_addTypePet);
        panel_addTypePet.setLayout(panel_addTypePetLayout);
        panel_addTypePetLayout.setHorizontalGroup(
            panel_addTypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addTypePetLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(panel_addTypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textView_addTypePet)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(panel_addTypePetLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_formAddTypePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_addTypePetLayout.setVerticalGroup(
            panel_addTypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_addTypePetLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(textView_addTypePet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(panel_formAddTypePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        panel_body.add(panel_addTypePet, "panel_addTypePet");

        panel_editTypePet.setBackground(new java.awt.Color(255, 255, 255));

        textView_editTypePet.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        textView_editTypePet.setText("EDIT TYPE PET");

        panel_formEditTypePet.setBackground(new java.awt.Color(255, 255, 255));

        textView_typePet3.setText("Type Pet");
        textView_typePet3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        editText_typePet1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        editText_typePet1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        button_cancelEditTypePet.setBackground(new java.awt.Color(255, 255, 255));
        button_cancelEditTypePet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_cancelEditTypePet.setText("CANCEL");
        button_cancelEditTypePet.setContentAreaFilled(false);
        button_cancelEditTypePet.setFocusable(false);

        button_saveEditTypePet.setBackground(new java.awt.Color(255, 255, 255));
        button_saveEditTypePet.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        button_saveEditTypePet.setText("SAVE");
        button_saveEditTypePet.setContentAreaFilled(false);
        button_saveEditTypePet.setFocusable(false);

        javax.swing.GroupLayout panel_formEditTypePetLayout = new javax.swing.GroupLayout(panel_formEditTypePet);
        panel_formEditTypePet.setLayout(panel_formEditTypePetLayout);
        panel_formEditTypePetLayout.setHorizontalGroup(
            panel_formEditTypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_formEditTypePetLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(textView_typePet3)
                .addGap(66, 66, 66)
                .addGroup(panel_formEditTypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editText_typePet1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_formEditTypePetLayout.createSequentialGroup()
                        .addComponent(button_cancelEditTypePet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_saveEditTypePet, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panel_formEditTypePetLayout.setVerticalGroup(
            panel_formEditTypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_formEditTypePetLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_formEditTypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editText_typePet1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textView_typePet3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_formEditTypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_cancelEditTypePet)
                    .addComponent(button_saveEditTypePet))
                .addGap(15, 15, 15))
        );

        javax.swing.GroupLayout panel_editTypePetLayout = new javax.swing.GroupLayout(panel_editTypePet);
        panel_editTypePet.setLayout(panel_editTypePetLayout);
        panel_editTypePetLayout.setHorizontalGroup(
            panel_editTypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editTypePetLayout.createSequentialGroup()
                .addContainerGap(53, Short.MAX_VALUE)
                .addGroup(panel_editTypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textView_editTypePet)
                    .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 1077, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(panel_editTypePetLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_formEditTypePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_editTypePetLayout.setVerticalGroup(
            panel_editTypePetLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_editTypePetLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(textView_editTypePet)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(panel_formEditTypePet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(247, Short.MAX_VALUE))
        );

        panel_body.add(panel_editTypePet, "panel_editTypePet");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_undecorated, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_undecorated, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panel_body, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1184, 661));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base;
    private javax.swing.JLabel bg;
    private javax.swing.JButton button_addAnimal;
    private javax.swing.JButton button_addAnimalType;
    private javax.swing.JButton button_addTypePet;
    private javax.swing.JButton button_addUsers;
    private javax.swing.JButton button_animal;
    private javax.swing.JButton button_animalType;
    private javax.swing.JButton button_cancelAddAnimal;
    private javax.swing.JButton button_cancelAddAnimalType;
    private javax.swing.JButton button_cancelAddTypePet;
    private javax.swing.JButton button_cancelAddUsers;
    private javax.swing.JButton button_cancelEditAnimal;
    private javax.swing.JButton button_cancelEditAnimalType;
    private javax.swing.JButton button_cancelEditTypePet;
    private javax.swing.JButton button_cancelEditUsers;
    private javax.swing.JButton button_chooseAnimalPhoto;
    private javax.swing.JButton button_chooseUserPhoto;
    private javax.swing.JButton button_deleteAnimal;
    private javax.swing.JButton button_deleteAnimalType;
    private javax.swing.JButton button_deleteTypePet;
    private javax.swing.JButton button_deleteUsers;
    private javax.swing.JButton button_editAnimal;
    private javax.swing.JButton button_editAnimalType;
    private javax.swing.JButton button_editTypePet;
    private javax.swing.JButton button_editUsers;
    private javax.swing.JLabel button_exit;
    private javax.swing.JLabel button_logout;
    private javax.swing.JLabel button_maximize;
    private javax.swing.JLabel button_minimize;
    private javax.swing.JButton button_printAnimal;
    private javax.swing.JButton button_printAnimalType;
    private javax.swing.JButton button_printTypePet;
    private javax.swing.JButton button_printUsers;
    private javax.swing.JButton button_refreshAnimal;
    private javax.swing.JButton button_refreshAnimalType;
    private javax.swing.JButton button_refreshTypePet;
    private javax.swing.JButton button_refreshUsers;
    private javax.swing.JButton button_saveAddAnimal;
    private javax.swing.JButton button_saveAddAnimalType;
    private javax.swing.JButton button_saveAddTypePet;
    private javax.swing.JButton button_saveAddUsers;
    private javax.swing.JButton button_saveEditAnimal;
    private javax.swing.JButton button_saveEditAnimalType;
    private javax.swing.JButton button_saveEditTypePet;
    private javax.swing.JButton button_saveEditUsers;
    private javax.swing.JButton button_typePet;
    private javax.swing.JButton button_users;
    private javax.swing.JLabel color_animal;
    private javax.swing.JLabel color_animalType;
    private javax.swing.JLabel color_typePet;
    private javax.swing.JLabel color_users;
    private javax.swing.JComboBox<String> comboBox_animalOwner;
    private javax.swing.JComboBox<String> comboBox_animalOwner1;
    private javax.swing.JComboBox<String> comboBox_animalType;
    private javax.swing.JComboBox<String> comboBox_animalType1;
    private javax.swing.JComboBox<String> comboBox_earType;
    private javax.swing.JComboBox<String> comboBox_earType1;
    private javax.swing.JComboBox<String> comboBox_gender;
    private javax.swing.JComboBox<String> comboBox_gender1;
    private javax.swing.JComboBox<String> comboBox_level;
    private javax.swing.JComboBox<String> comboBox_level1;
    private javax.swing.JComboBox<String> comboBox_status;
    private javax.swing.JComboBox<String> comboBox_status1;
    private javax.swing.JComboBox<String> comboBox_typePet;
    private javax.swing.JComboBox<String> comboBox_typePet1;
    private com.toedter.calendar.JDateChooser dateChooser_birthdate;
    private com.toedter.calendar.JDateChooser dateChooser_birthdate1;
    private javax.swing.JTextArea editText_address;
    private javax.swing.JTextArea editText_address1;
    private javax.swing.JTextField editText_animalName;
    private javax.swing.JTextField editText_animalName1;
    private javax.swing.JTextField editText_animalType;
    private javax.swing.JTextField editText_animalType1;
    private javax.swing.JTextField editText_email;
    private javax.swing.JTextField editText_email1;
    private javax.swing.JTextField editText_name;
    private javax.swing.JTextField editText_name1;
    private javax.swing.JPasswordField editText_password;
    private javax.swing.JPasswordField editText_password1;
    private javax.swing.JTextField editText_phoneNumber;
    private javax.swing.JTextField editText_phoneNumber1;
    private javax.swing.JTextField editText_searchAnimal;
    private javax.swing.JTextField editText_searchAnimalType;
    private javax.swing.JTextField editText_searchTypePet;
    private javax.swing.JTextField editText_searchUsers;
    private javax.swing.JTextField editText_skinColor;
    private javax.swing.JTextField editText_skinColor1;
    private javax.swing.JTextField editText_typePet;
    private javax.swing.JTextField editText_typePet1;
    private javax.swing.JLabel image_animal;
    private javax.swing.JLabel image_animal1;
    private javax.swing.JLabel image_user;
    private javax.swing.JLabel image_user1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel panel_TypePet;
    private javax.swing.JPanel panel_addAnimal;
    private javax.swing.JPanel panel_addAnimalType;
    private javax.swing.JPanel panel_addTypePet;
    private javax.swing.JPanel panel_addUsers;
    private javax.swing.JPanel panel_animal;
    private javax.swing.JPanel panel_animalType;
    private javax.swing.JPanel panel_body;
    private javax.swing.JPanel panel_editAnimal;
    private javax.swing.JPanel panel_editAnimalType;
    private javax.swing.JPanel panel_editTypePet;
    private javax.swing.JPanel panel_editUsers;
    private javax.swing.JPanel panel_formAddAnimal;
    private javax.swing.JPanel panel_formAddAnimalType;
    private javax.swing.JPanel panel_formAddTypePet;
    private javax.swing.JPanel panel_formAddUsers;
    private javax.swing.JPanel panel_formEditAnimal;
    private javax.swing.JPanel panel_formEditAnimalType;
    private javax.swing.JPanel panel_formEditTypePet;
    private javax.swing.JPanel panel_formEditUsers;
    private javax.swing.JPanel panel_header;
    private javax.swing.JPanel panel_undecorated;
    private javax.swing.JPanel panel_users;
    private javax.swing.JLabel picture;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JScrollPane scrollPane_animal;
    private javax.swing.JScrollPane scrollPane_animalType;
    private javax.swing.JScrollPane scrollPane_typePet;
    private javax.swing.JScrollPane scrollPane_users;
    private javax.swing.JDialog splashScreen;
    private javax.swing.JTable table_animal;
    private javax.swing.JTable table_animalType;
    private javax.swing.JTable table_typePet;
    private javax.swing.JTable table_users;
    private javax.swing.JLabel textUsers_subtitle;
    private javax.swing.JLabel textView_addAnimal;
    private javax.swing.JLabel textView_addAnimalType;
    private javax.swing.JLabel textView_addTypePet;
    private javax.swing.JLabel textView_addUsers;
    private javax.swing.JLabel textView_address;
    private javax.swing.JLabel textView_address1;
    private javax.swing.JLabel textView_animaType;
    private javax.swing.JLabel textView_animaType1;
    private javax.swing.JLabel textView_animal;
    private javax.swing.JLabel textView_animalName;
    private javax.swing.JLabel textView_animalName1;
    private javax.swing.JLabel textView_animalOwner;
    private javax.swing.JLabel textView_animalOwner1;
    private javax.swing.JLabel textView_animalType;
    private javax.swing.JLabel textView_animalType1;
    private javax.swing.JLabel textView_birthdate;
    private javax.swing.JLabel textView_birthdate1;
    private javax.swing.JLabel textView_earType;
    private javax.swing.JLabel textView_earType1;
    private javax.swing.JLabel textView_editAnimal;
    private javax.swing.JLabel textView_editAnimalType;
    private javax.swing.JLabel textView_editTypePet;
    private javax.swing.JLabel textView_editUsers;
    private javax.swing.JLabel textView_email;
    private javax.swing.JLabel textView_email1;
    private javax.swing.JLabel textView_gender;
    private javax.swing.JLabel textView_gender1;
    private javax.swing.JLabel textView_level;
    private javax.swing.JLabel textView_level1;
    private javax.swing.JLabel textView_name;
    private javax.swing.JLabel textView_name1;
    private javax.swing.JLabel textView_password;
    private javax.swing.JLabel textView_password1;
    private javax.swing.JLabel textView_phoneNumber;
    private javax.swing.JLabel textView_phoneNumber1;
    private javax.swing.JLabel textView_searchAnimal;
    private javax.swing.JLabel textView_searchAnimalType;
    private javax.swing.JLabel textView_searchTypePet;
    private javax.swing.JLabel textView_searchUsers;
    private javax.swing.JLabel textView_skinColor;
    private javax.swing.JLabel textView_skinColor1;
    private javax.swing.JLabel textView_status;
    private javax.swing.JLabel textView_status1;
    private javax.swing.JLabel textView_subAnimalType;
    private javax.swing.JLabel textView_subTypePet;
    private javax.swing.JLabel textView_typePet;
    private javax.swing.JLabel textView_typePet1;
    private javax.swing.JLabel textView_typePet2;
    private javax.swing.JLabel textView_typePet3;
    private javax.swing.JLabel textView_user;
    private javax.swing.JLabel textView_username;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
