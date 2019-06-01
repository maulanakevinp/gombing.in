/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Views;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author MaulanaKevinPradana
 */
public class V_Manager extends javax.swing.JFrame {

    private int xMouse;
    private int yMouse;
    static boolean maximized = true;

    /**
     * Creates new form V_Manager
     */
    public V_Manager() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="ANIMAL">

    protected JTextField getEditText_searchAnimal() {
        return editText_searchAnimal;
    }    

    protected JButton getButton_printAnimal() {
        return button_printAnimal;
    }    

    protected JButton getButton_refreshAnimal() {
        return button_refreshAnimal;
    }    

    protected JTable getTable_animal() {
        return table_animal;
    }    
    
    protected JButton getButton_animal() {
        return button_animal;
    }

    protected JLabel getColor_animal() {
        return color_animal;
    }//</editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="ANIMAL CARE">  
    
    protected JTextField getEditText_searchAnimalCare() {
        return editText_searchAnimalCare;
    }

    protected JButton getButton_printAnimalCare() {
        return button_printAnimalCare;
    }

    protected JButton getButton_refreshAnimalCare() {
        return button_refreshAnimalCare;
    }

    protected JTable getTable_animalCare() {
        return table_animalCare;
    }

    protected JButton getButton_animalCare() {
        return button_animalCare;
    }
    
    protected JLabel getColor_animalCare() {
        return color_animalCare;
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
        editText_name = new javax.swing.JLabel();
        button_animal = new javax.swing.JButton();
        color_animal = new javax.swing.JLabel();
        button_animalCare = new javax.swing.JButton();
        color_animalCare = new javax.swing.JLabel();
        panel_body = new javax.swing.JPanel();
        panel_animal = new javax.swing.JPanel();
        editText_subtitle2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        button_refreshAnimal = new javax.swing.JButton();
        scrollPane_animal = new javax.swing.JScrollPane();
        table_animal = new javax.swing.JTable();
        button_printAnimal = new javax.swing.JButton();
        editText_searchAnimal = new javax.swing.JTextField();
        textView_searchAnimal = new javax.swing.JLabel();
        panel_animalCare = new javax.swing.JPanel();
        editText_subtitle1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        scrollPane_animal1 = new javax.swing.JScrollPane();
        table_animalCare = new javax.swing.JTable();
        button_refreshAnimalCare = new javax.swing.JButton();
        button_printAnimalCare = new javax.swing.JButton();
        editText_searchAnimalCare = new javax.swing.JTextField();
        textView_searchAnimalCare = new javax.swing.JLabel();

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
        setMinimumSize(new java.awt.Dimension(1184, 661));
        setUndecorated(true);

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

        textView_user.setText("You are login as Manager,");

        button_logout.setForeground(new java.awt.Color(0, 0, 255));
        button_logout.setText("Logout?");
        button_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        picture.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/icons8_donald_trump_100px.png"))); // NOI18N

        editText_name.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        editText_name.setText("MANAGER");

        button_animal.setBackground(new java.awt.Color(255, 255, 255));
        button_animal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_animal.setText("ANIMAL");
        button_animal.setBorder(null);
        button_animal.setBorderPainted(false);
        button_animal.setContentAreaFilled(false);
        button_animal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_animal.setFocusable(false);

        color_animal.setBackground(new java.awt.Color(0, 255, 0));
        color_animal.setOpaque(true);

        button_animalCare.setBackground(new java.awt.Color(255, 255, 255));
        button_animalCare.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        button_animalCare.setText("ANIMAL CARE");
        button_animalCare.setBorder(null);
        button_animalCare.setBorderPainted(false);
        button_animalCare.setContentAreaFilled(false);
        button_animalCare.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        button_animalCare.setFocusable(false);

        color_animalCare.setBackground(new java.awt.Color(255, 255, 255));
        color_animalCare.setOpaque(true);

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
                        .addComponent(editText_name, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textView_user)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button_logout))
                    .addGroup(panel_headerLayout.createSequentialGroup()
                        .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(color_animal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_animal, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(color_animalCare, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(button_animalCare, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_headerLayout.setVerticalGroup(
            panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_headerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(picture, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textView_user)
                        .addComponent(button_logout)
                        .addComponent(editText_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_headerLayout.createSequentialGroup()
                        .addComponent(button_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(color_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_headerLayout.createSequentialGroup()
                        .addComponent(button_animalCare, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(color_animalCare, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        panel_body.setBackground(new java.awt.Color(255, 255, 255));
        panel_body.setMinimumSize(new java.awt.Dimension(1184, 476));
        panel_body.setPreferredSize(new java.awt.Dimension(1184, 476));
        panel_body.setLayout(new java.awt.CardLayout());

        panel_animal.setBackground(new java.awt.Color(255, 255, 255));

        editText_subtitle2.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        editText_subtitle2.setText("ANIMAL");

        button_refreshAnimal.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_refreshAnimal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/refresh.png"))); // NOI18N
        button_refreshAnimal.setText("Refresh");
        button_refreshAnimal.setContentAreaFilled(false);
        button_refreshAnimal.setFocusable(false);

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
                .addGroup(panel_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_animalLayout.createSequentialGroup()
                        .addComponent(button_refreshAnimal)
                        .addGap(0, 0, 0)
                        .addComponent(button_printAnimal))
                    .addGroup(panel_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(scrollPane_animal)
                        .addComponent(editText_subtitle2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_animalLayout.createSequentialGroup()
                        .addComponent(textView_searchAnimal)
                        .addGap(18, 18, 18)
                        .addComponent(editText_searchAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panel_animalLayout.setVerticalGroup(
            panel_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_animalLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(editText_subtitle2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editText_searchAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textView_searchAnimal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane_animal, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 35, Short.MAX_VALUE)
                .addGroup(panel_animalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_refreshAnimal)
                    .addComponent(button_printAnimal))
                .addGap(50, 50, 50))
        );

        panel_body.add(panel_animal, "panel_animal");

        panel_animalCare.setBackground(new java.awt.Color(255, 255, 255));

        editText_subtitle1.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 14)); // NOI18N
        editText_subtitle1.setText("ANIMAL CARE");

        scrollPane_animal1.setBackground(new java.awt.Color(255, 255, 255));
        scrollPane_animal1.setBorder(null);

        table_animalCare.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_animalCare.setFocusable(false);
        table_animalCare.setGridColor(new java.awt.Color(255, 255, 255));
        table_animalCare.setIntercellSpacing(new java.awt.Dimension(0, 0));
        table_animalCare.setSelectionBackground(new java.awt.Color(0, 255, 0));
        table_animalCare.setShowVerticalLines(false);
        table_animalCare.getTableHeader().setResizingAllowed(false);
        table_animalCare.getTableHeader().setReorderingAllowed(false);
        scrollPane_animal1.setViewportView(table_animalCare);

        button_refreshAnimalCare.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_refreshAnimalCare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/refresh.png"))); // NOI18N
        button_refreshAnimalCare.setText("Refresh");
        button_refreshAnimalCare.setContentAreaFilled(false);
        button_refreshAnimalCare.setFocusable(false);

        button_printAnimalCare.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        button_printAnimalCare.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/gombing/in/resources/images/Print.png"))); // NOI18N
        button_printAnimalCare.setText("Print");
        button_printAnimalCare.setContentAreaFilled(false);
        button_printAnimalCare.setFocusable(false);

        textView_searchAnimalCare.setText("Search");

        javax.swing.GroupLayout panel_animalCareLayout = new javax.swing.GroupLayout(panel_animalCare);
        panel_animalCare.setLayout(panel_animalCareLayout);
        panel_animalCareLayout.setHorizontalGroup(
            panel_animalCareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_animalCareLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(button_refreshAnimalCare)
                .addGap(0, 0, 0)
                .addComponent(button_printAnimalCare)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panel_animalCareLayout.createSequentialGroup()
                .addGroup(panel_animalCareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_animalCareLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(textView_searchAnimalCare)
                        .addGap(18, 18, 18)
                        .addComponent(editText_searchAnimalCare, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_animalCareLayout.createSequentialGroup()
                        .addContainerGap(53, Short.MAX_VALUE)
                        .addGroup(panel_animalCareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(scrollPane_animal1, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
                            .addGroup(panel_animalCareLayout.createSequentialGroup()
                                .addComponent(editText_subtitle1)
                                .addGap(0, 986, Short.MAX_VALUE))
                            .addComponent(jSeparator2))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        panel_animalCareLayout.setVerticalGroup(
            panel_animalCareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_animalCareLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(editText_subtitle1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_animalCareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editText_searchAnimalCare, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textView_searchAnimalCare))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPane_animal1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(panel_animalCareLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(button_refreshAnimalCare)
                    .addComponent(button_printAnimalCare))
                .addGap(50, 50, 50))
        );

        panel_body.add(panel_animalCare, "panel_animalCare");

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(V_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(V_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(V_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(V_Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new V_Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel base;
    private javax.swing.JLabel bg;
    private javax.swing.JButton button_animal;
    private javax.swing.JButton button_animalCare;
    private javax.swing.JLabel button_exit;
    private javax.swing.JLabel button_logout;
    private javax.swing.JLabel button_maximize;
    private javax.swing.JLabel button_minimize;
    private javax.swing.JButton button_printAnimal;
    private javax.swing.JButton button_printAnimalCare;
    private javax.swing.JButton button_refreshAnimal;
    private javax.swing.JButton button_refreshAnimalCare;
    private javax.swing.JLabel color_animal;
    private javax.swing.JLabel color_animalCare;
    private javax.swing.JLabel editText_name;
    private javax.swing.JTextField editText_searchAnimal;
    private javax.swing.JTextField editText_searchAnimalCare;
    private javax.swing.JLabel editText_subtitle1;
    private javax.swing.JLabel editText_subtitle2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel panel_animal;
    private javax.swing.JPanel panel_animalCare;
    private javax.swing.JPanel panel_body;
    private javax.swing.JPanel panel_header;
    private javax.swing.JPanel panel_undecorated;
    private javax.swing.JLabel picture;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JScrollPane scrollPane_animal;
    private javax.swing.JScrollPane scrollPane_animal1;
    private javax.swing.JDialog splashScreen;
    private javax.swing.JTable table_animal;
    private javax.swing.JTable table_animalCare;
    private javax.swing.JLabel textView_searchAnimal;
    private javax.swing.JLabel textView_searchAnimalCare;
    private javax.swing.JLabel textView_user;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
