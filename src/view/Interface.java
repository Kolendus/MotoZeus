package view;

import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Controller.Controller;
import model.Motorcycle;
import model.User;

public class Interface extends javax.swing.JFrame {

    static Controller Control = new Controller();
    User tester;
    private boolean userFlag = false;

    private Motorcycle motorFlag;

    public Interface() {
        initComponents();
        this.hide();
        Control.startCreatingMotorcycles();
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);

        sMoto12loading();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Login = new javax.swing.JFrame();
        userPassword = new javax.swing.JPasswordField();
        userLogin = new javax.swing.JFormattedTextField();
        shopStart = new javax.swing.JButton();
        Register = new javax.swing.JToggleButton();
        Motozeus = new javax.swing.JLabel();
        UserLoginLabel = new javax.swing.JLabel();
        UserLoginPassword = new javax.swing.JLabel();
        RegisterTip = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Registration = new javax.swing.JFrame();
        passwordSpace = new javax.swing.JTextField();
        addressSpace = new javax.swing.JTextField();
        postcodeSpace = new javax.swing.JTextField();
        mailSpace = new javax.swing.JTextField();
        citySpace = new javax.swing.JTextField();
        usernameSpace = new javax.swing.JTextField();
        Address = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        PostCode = new javax.swing.JLabel();
        City = new javax.swing.JLabel();
        Mail = new javax.swing.JLabel();
        registerBatton = new javax.swing.JButton();
        guestShoper = new javax.swing.JButton();
        title = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();
        jDialog1 = new javax.swing.JDialog();
        techData = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        crossEndu = new javax.swing.JPanel();
        crossMoto4 = new javax.swing.JButton();
        crossMoto3 = new javax.swing.JButton();
        crossMoto2 = new javax.swing.JButton();
        crossMoto1 = new javax.swing.JButton();
        sportTouristic = new javax.swing.JPanel();
        sMoto1 = new javax.swing.JButton();
        sMoto3 = new javax.swing.JButton();
        sMoto2 = new javax.swing.JButton();
        sMoto4 = new javax.swing.JButton();
        chopperBobby = new javax.swing.JPanel();
        chopperMoto4 = new javax.swing.JButton();
        chopperMoto3 = new javax.swing.JButton();
        chopperMoto2 = new javax.swing.JButton();
        chopperMoto1 = new javax.swing.JButton();
        motorcycleSpec = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mass = new javax.swing.JTextField();
        fuel = new javax.swing.JTextField();
        engine = new javax.swing.JTextField();
        prodYear = new javax.swing.JTextField();
        Power = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        powerKM = new javax.swing.JTextField();
        capacity = new javax.swing.JTextField();
        orderMotorcycle = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        goToRegister = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        UserLoggedIn = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();

        Login.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Login.setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Login.setMinimumSize(new java.awt.Dimension(660, 480));
        Login.setResizable(false);
        Login.getContentPane().setLayout(null);

        userPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userPasswordActionPerformed(evt);
            }
        });
        Login.getContentPane().add(userPassword);
        userPassword.setBounds(227, 234, 137, 22);
        Login.getContentPane().add(userLogin);
        userLogin.setBounds(227, 194, 137, 22);

        shopStart.setText("Let's Shop!");
        shopStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shopStartActionPerformed(evt);
            }
        });
        Login.getContentPane().add(shopStart);
        shopStart.setBounds(238, 279, 117, 47);

        Register.setText("Register");
        Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegisterActionPerformed(evt);
            }
        });
        Login.getContentPane().add(Register);
        Register.setBounds(238, 379, 117, 47);

        Motozeus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Front/MotoZeus.png"))); // NOI18N
        Motozeus.setText("jLabel1");
        Login.getContentPane().add(Motozeus);
        Motozeus.setBounds(120, 40, 339, 112);

        UserLoginLabel.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        UserLoginLabel.setForeground(new java.awt.Color(246, 243, 243));
        UserLoginLabel.setText("Login:");
        Login.getContentPane().add(UserLoginLabel);
        UserLoginLabel.setBounds(180, 190, 60, 30);

        UserLoginPassword.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        UserLoginPassword.setForeground(new java.awt.Color(246, 243, 243));
        UserLoginPassword.setText("Password:");
        Login.getContentPane().add(UserLoginPassword);
        UserLoginPassword.setBounds(150, 240, 73, 20);

        RegisterTip.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        RegisterTip.setForeground(new java.awt.Color(254, 254, 254));
        RegisterTip.setText("Do not have an account yet?");
        RegisterTip.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Login.getContentPane().add(RegisterTip);
        RegisterTip.setBounds(200, 340, 262, 29);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Front/Background.jpg"))); // NOI18N
        jLabel6.setMaximumSize(null);
        jLabel6.setMinimumSize(null);
        jLabel6.setOpaque(true);
        jLabel6.setPreferredSize(null);
        Login.getContentPane().add(jLabel6);
        jLabel6.setBounds(-30, 0, 690, 480);

        Registration.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Registration.setMinimumSize(new java.awt.Dimension(710, 580));
        Registration.setResizable(false);
        Registration.getContentPane().setLayout(null);
        Registration.getContentPane().add(passwordSpace);
        passwordSpace.setBounds(390, 300, 300, 22);
        Registration.getContentPane().add(addressSpace);
        addressSpace.setBounds(390, 220, 300, 22);
        Registration.getContentPane().add(postcodeSpace);
        postcodeSpace.setBounds(390, 340, 300, 22);
        Registration.getContentPane().add(mailSpace);
        mailSpace.setBounds(390, 420, 300, 22);
        Registration.getContentPane().add(citySpace);
        citySpace.setBounds(390, 380, 300, 22);
        Registration.getContentPane().add(usernameSpace);
        usernameSpace.setBounds(390, 260, 300, 22);

        Address.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        Address.setText("Address:");
        Registration.getContentPane().add(Address);
        Address.setBounds(300, 220, 90, 27);

        Username.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        Username.setText("Username:");
        Registration.getContentPane().add(Username);
        Username.setBounds(290, 260, 100, 30);

        Password.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        Password.setText("Password:");
        Registration.getContentPane().add(Password);
        Password.setBounds(290, 300, 100, 17);

        PostCode.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        PostCode.setText("Post-Code:");
        Registration.getContentPane().add(PostCode);
        PostCode.setBounds(290, 340, 110, 17);

        City.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        City.setText("            City:");
        Registration.getContentPane().add(City);
        City.setBounds(280, 380, 110, 20);

        Mail.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        Mail.setText("   E-mail:");
        Registration.getContentPane().add(Mail);
        Mail.setBounds(310, 420, 90, 30);

        registerBatton.setText("REGISTER");
        registerBatton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerBattonActionPerformed(evt);
            }
        });
        Registration.getContentPane().add(registerBatton);
        registerBatton.setBounds(560, 460, 120, 60);

        guestShoper.setText("Continue as a guest :(");
        guestShoper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guestShoperActionPerformed(evt);
            }
        });
        Registration.getContentPane().add(guestShoper);
        guestShoper.setBounds(350, 490, 170, 30);

        title.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        title.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Front/Register.jpg"))); // NOI18N
        Registration.getContentPane().add(title);
        title.setBounds(0, 0, 710, 580);

        Background.setText("Register");
        Registration.getContentPane().add(Background);
        Background.setBounds(-150, 0, 790, 510);

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        techData.setText("Dane techniczne");

        crossMoto4.setText("jButton2");
        crossMoto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crossMoto4ActionPerformed(evt);
            }
        });

        crossMoto3.setText("jButton2");
        crossMoto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crossMoto3ActionPerformed(evt);
            }
        });

        crossMoto2.setText("jButton2");
        crossMoto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crossMoto2ActionPerformed(evt);
            }
        });

        crossMoto1.setText("jButton2");
        crossMoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crossMoto1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout crossEnduLayout = new javax.swing.GroupLayout(crossEndu);
        crossEndu.setLayout(crossEnduLayout);
        crossEnduLayout.setHorizontalGroup(
            crossEnduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crossEnduLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(crossEnduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crossMoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crossMoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(crossEnduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(crossMoto4, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crossMoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(125, 125, 125))
        );
        crossEnduLayout.setVerticalGroup(
            crossEnduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crossEnduLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(crossEnduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crossMoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crossMoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(crossEnduLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crossMoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crossMoto4, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        jTabbedPane1.addTab("Motocross-enduro", crossEndu);

        sMoto1.setText("jButton2");
        sMoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sMoto1ActionPerformed(evt);
            }
        });

        sMoto3.setText("jButton2");
        sMoto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sMoto3ActionPerformed(evt);
            }
        });

        sMoto2.setText("jButton2");
        sMoto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sMoto2ActionPerformed(evt);
            }
        });

        sMoto4.setText("jButton2");
        sMoto4.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        sMoto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sMoto4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sportTouristicLayout = new javax.swing.GroupLayout(sportTouristic);
        sportTouristic.setLayout(sportTouristicLayout);
        sportTouristicLayout.setHorizontalGroup(
            sportTouristicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sportTouristicLayout.createSequentialGroup()
                .addGroup(sportTouristicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sportTouristicLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sMoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(sportTouristicLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(sMoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                        .addComponent(sMoto4, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93))
            .addGroup(sportTouristicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sportTouristicLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(sMoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(628, Short.MAX_VALUE)))
        );
        sportTouristicLayout.setVerticalGroup(
            sportTouristicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sportTouristicLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(sMoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(sportTouristicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sMoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sMoto4, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62))
            .addGroup(sportTouristicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(sportTouristicLayout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(sMoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(472, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Sportowy-turystk", sportTouristic);

        chopperMoto4.setText("jButton2");
        chopperMoto4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chopperMoto4ActionPerformed(evt);
            }
        });

        chopperMoto3.setText("jButton2");
        chopperMoto3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chopperMoto3ActionPerformed(evt);
            }
        });

        chopperMoto2.setText("jButton2");
        chopperMoto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chopperMoto2ActionPerformed(evt);
            }
        });

        chopperMoto1.setText("jButton2");
        chopperMoto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chopperMoto1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout chopperBobbyLayout = new javax.swing.GroupLayout(chopperBobby);
        chopperBobby.setLayout(chopperBobbyLayout);
        chopperBobbyLayout.setHorizontalGroup(
            chopperBobbyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chopperBobbyLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(chopperBobbyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(chopperBobbyLayout.createSequentialGroup()
                        .addComponent(chopperMoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chopperMoto4, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(chopperBobbyLayout.createSequentialGroup()
                        .addComponent(chopperMoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(135, 135, 135)
                        .addComponent(chopperMoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 62, Short.MAX_VALUE))
        );
        chopperBobbyLayout.setVerticalGroup(
            chopperBobbyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chopperBobbyLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(chopperBobbyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chopperMoto1, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chopperMoto2, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(chopperBobbyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chopperBobbyLayout.createSequentialGroup()
                        .addComponent(chopperMoto3, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, chopperBobbyLayout.createSequentialGroup()
                        .addComponent(chopperMoto4, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );

        jTabbedPane1.addTab("Chopper - cafe racer", chopperBobby);

        jLabel1.setText("Silnik:");

        jLabel4.setText("Pojemność:");

        jLabel8.setText("Zbiornik paliwa:");

        jLabel9.setText("Masa całkowita:");

        jLabel10.setText("Moc ( KM) :");

        jLabel11.setText("Moc ( kW ):");

        jLabel12.setText("Rok produkcji:");

        jLabel13.setText("Nazwa:");

        mass.setEditable(false);
        mass.setFocusable(false);

        fuel.setEditable(false);
        fuel.setFocusable(false);

        engine.setEditable(false);
        engine.setFocusable(false);

        prodYear.setEditable(false);
        prodYear.setFocusable(false);

        Power.setEditable(false);
        Power.setFocusable(false);

        name.setEditable(false);
        name.setFocusable(false);

        powerKM.setEditable(false);
        powerKM.setFocusable(false);

        capacity.setEditable(false);
        capacity.setFocusable(false);

        javax.swing.GroupLayout motorcycleSpecLayout = new javax.swing.GroupLayout(motorcycleSpec);
        motorcycleSpec.setLayout(motorcycleSpecLayout);
        motorcycleSpecLayout.setHorizontalGroup(
            motorcycleSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(motorcycleSpecLayout.createSequentialGroup()
                .addGroup(motorcycleSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, motorcycleSpecLayout.createSequentialGroup()
                        .addGroup(motorcycleSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(motorcycleSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8))
                            .addComponent(jLabel11)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18))
                    .addGroup(motorcycleSpecLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(motorcycleSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(26, 26, 26)))
                .addGroup(motorcycleSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(motorcycleSpecLayout.createSequentialGroup()
                        .addGroup(motorcycleSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fuel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Power, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mass, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(powerKM, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(130, Short.MAX_VALUE))
                    .addComponent(engine)
                    .addGroup(motorcycleSpecLayout.createSequentialGroup()
                        .addGroup(motorcycleSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prodYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        motorcycleSpecLayout.setVerticalGroup(
            motorcycleSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(motorcycleSpecLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(motorcycleSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(motorcycleSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prodYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(motorcycleSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fuel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(motorcycleSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(motorcycleSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(powerKM))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(motorcycleSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Power, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(motorcycleSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(capacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(motorcycleSpecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(engine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        orderMotorcycle.setText("Let's order that beast!");
        orderMotorcycle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderMotorcycleActionPerformed(evt);
            }
        });

        jLabel2.setText("Logged in as:");

        goToRegister.setText("Register");
        goToRegister.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goToRegisterActionPerformed(evt);
            }
        });

        jLabel3.setText("Not logged in? ");

        loginButton.setText("Log in");
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(motorcycleSpec, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(techData, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(101, 101, 101))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(102, 102, 102)
                                .addComponent(orderMotorcycle)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(2, 2, 2)
                        .addComponent(goToRegister)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(loginButton)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(UserLoggedIn, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(goToRegister)
                            .addComponent(jLabel3)
                            .addComponent(UserLoggedIn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginButton))
                        .addGap(13, 13, 13)
                        .addComponent(techData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(motorcycleSpec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(orderMotorcycle, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sMoto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sMoto3ActionPerformed
        setUpOnClickMoto("Kawasaki H2");
    }//GEN-LAST:event_sMoto3ActionPerformed

    private void sMoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sMoto1ActionPerformed
        setUpOnClickMoto("Yamaha YZF-R6");
    }//GEN-LAST:event_sMoto1ActionPerformed

    private void sMoto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sMoto2ActionPerformed
        setUpOnClickMoto("Kawasaki Ninja ZX-6R 636");
    }//GEN-LAST:event_sMoto2ActionPerformed

    private void sMoto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sMoto4ActionPerformed
        setUpOnClickMoto("BMW S1000RR");
    }//GEN-LAST:event_sMoto4ActionPerformed

    private void crossMoto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crossMoto4ActionPerformed
        setUpOnClickMoto("Aprilia SX 125");
    }//GEN-LAST:event_crossMoto4ActionPerformed

    private void crossMoto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crossMoto3ActionPerformed
        setUpOnClickMoto("Kawasaki KLX 250");
    }//GEN-LAST:event_crossMoto3ActionPerformed

    private void crossMoto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crossMoto2ActionPerformed
        setUpOnClickMoto("KTM SX 250");
    }//GEN-LAST:event_crossMoto2ActionPerformed

    private void crossMoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crossMoto1ActionPerformed
        setUpOnClickMoto("Yamaha Virago 535");
    }//GEN-LAST:event_crossMoto1ActionPerformed

    private void chopperMoto4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chopperMoto4ActionPerformed
        setUpOnClickMoto("Suzuki Intruder 800");
    }//GEN-LAST:event_chopperMoto4ActionPerformed

    private void chopperMoto3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chopperMoto3ActionPerformed
        setUpOnClickMoto("Kawasaki Vulcan 800");
    }//GEN-LAST:event_chopperMoto3ActionPerformed

    private void chopperMoto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chopperMoto2ActionPerformed
        setUpOnClickMoto("Harley-Davidson 883");
    }//GEN-LAST:event_chopperMoto2ActionPerformed

    private void chopperMoto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chopperMoto1ActionPerformed
        setUpOnClickMoto("Yamaha Virago 535");
    }//GEN-LAST:event_chopperMoto1ActionPerformed

    private void RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegisterActionPerformed
        Login.setVisible(false);
        Registration.setVisible(true);
        Registration.setLocationRelativeTo(null);
    }//GEN-LAST:event_RegisterActionPerformed

    private void registerBattonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerBattonActionPerformed
        String address = addressSpace.getText();
        String username = usernameSpace.getText();
        String password = passwordSpace.getText();
        String postcode = postcodeSpace.getText();
        String city = citySpace.getText();
        String mail = mailSpace.getText();
        tester = Control.createUser(username, password, address, postcode, city, mail);
        UserLoggedIn.setText(tester.getUsername());
        Registration.setVisible(false);
        this.show();
    }//GEN-LAST:event_registerBattonActionPerformed

    private void orderMotorcycleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderMotorcycleActionPerformed
        if (tester != null) {
            Control.queryOrder(Control.findMotorcycle(motorFlag.getName()), tester);
            Control.connClose();
        } else {
            JOptionPane.showMessageDialog(new JFrame(), "You cannot order a vehicle without logging in. Where are we going to send it ,huh? ", "Login", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_orderMotorcycleActionPerformed

    private void guestShoperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guestShoperActionPerformed
        tester = null;
        UserLoggedIn.setText("Gość");
        Registration.setVisible(false);
        this.show();
    }//GEN-LAST:event_guestShoperActionPerformed

    private void goToRegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goToRegisterActionPerformed
        this.hide();
        Registration.setVisible(true);
        Registration.setLocationRelativeTo(null);
    }//GEN-LAST:event_goToRegisterActionPerformed

    private void shopStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shopStartActionPerformed
        String username = userLogin.getText();
        String password = userPassword.getText();
        tester = Control.loginUser(username, password);
        UserLoggedIn.setText(tester.getUsername());
        if (Control.isLogged()) {
            this.show();
        }
    }//GEN-LAST:event_shopStartActionPerformed

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        Login.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_loginButtonActionPerformed

    private void userPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userPasswordActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interface();

            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel City;
    private javax.swing.JFrame Login;
    private javax.swing.JLabel Mail;
    private javax.swing.JLabel Motozeus;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel PostCode;
    private javax.swing.JTextField Power;
    private javax.swing.JToggleButton Register;
    private javax.swing.JLabel RegisterTip;
    private javax.swing.JFrame Registration;
    private javax.swing.JTextField UserLoggedIn;
    private javax.swing.JLabel UserLoginLabel;
    private javax.swing.JLabel UserLoginPassword;
    private javax.swing.JLabel Username;
    private javax.swing.JTextField addressSpace;
    private javax.swing.JTextField capacity;
    private javax.swing.JPanel chopperBobby;
    private javax.swing.JButton chopperMoto1;
    private javax.swing.JButton chopperMoto2;
    private javax.swing.JButton chopperMoto3;
    private javax.swing.JButton chopperMoto4;
    private javax.swing.JTextField citySpace;
    private javax.swing.JPanel crossEndu;
    private javax.swing.JButton crossMoto1;
    private javax.swing.JButton crossMoto2;
    private javax.swing.JButton crossMoto3;
    private javax.swing.JButton crossMoto4;
    private javax.swing.JTextField engine;
    private javax.swing.JTextField fuel;
    private javax.swing.JButton goToRegister;
    private javax.swing.JButton guestShoper;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton loginButton;
    private javax.swing.JTextField mailSpace;
    private javax.swing.JTextField mass;
    private javax.swing.JPanel motorcycleSpec;
    private javax.swing.JTextField name;
    private javax.swing.JButton orderMotorcycle;
    private javax.swing.JTextField passwordSpace;
    private javax.swing.JTextField postcodeSpace;
    private javax.swing.JTextField powerKM;
    private javax.swing.JTextField prodYear;
    private javax.swing.JButton registerBatton;
    private javax.swing.JButton sMoto1;
    private javax.swing.JButton sMoto2;
    private javax.swing.JButton sMoto3;
    private javax.swing.JButton sMoto4;
    private javax.swing.JButton shopStart;
    private javax.swing.JPanel sportTouristic;
    private javax.swing.JLabel techData;
    private javax.swing.JLabel title;
    private javax.swing.JFormattedTextField userLogin;
    private javax.swing.JPasswordField userPassword;
    private javax.swing.JTextField usernameSpace;
    // End of variables declaration//GEN-END:variables

    private void sMoto12loading() {
        sMoto1.setIcon(Control.scaleIcon(Control.findMotorcycle("Yamaha YZF-R6")));
        sMoto2.setIcon(Control.scaleIcon(Control.findMotorcycle("Kawasaki Ninja ZX-6R 636")));
        sMoto3.setIcon(Control.scaleIcon(Control.findMotorcycle("Kawasaki H2")));
        sMoto4.setIcon(Control.scaleIcon(Control.findMotorcycle("BMW S1000RR")));
        crossMoto1.setIcon(Control.scaleIcon(Control.findMotorcycle("Yamaha DT 125")));
        crossMoto2.setIcon(Control.scaleIcon(Control.findMotorcycle("KTM SX 250")));
        crossMoto3.setIcon(Control.scaleIcon(Control.findMotorcycle("Kawasaki KLX 250")));
        crossMoto4.setIcon(Control.scaleIcon(Control.findMotorcycle("Aprilia SX 125")));
        chopperMoto1.setIcon(Control.scaleIcon(Control.findMotorcycle("Yamaha Virago 535")));
        chopperMoto2.setIcon(Control.scaleIcon(Control.findMotorcycle("Harley-Davidson 883")));
        chopperMoto3.setIcon(Control.scaleIcon(Control.findMotorcycle("Kawasaki Vulcan 800")));
        chopperMoto4.setIcon(Control.scaleIcon(Control.findMotorcycle("Suzuki Intruder 800")));
    }

    private void setUpTechData(String motorcycle) {
        ArrayList<String> data = Control.techData(motorcycle);
        name.setText(data.get(0));
        prodYear.setText(data.get(1));
        fuel.setText(data.get(2));
        mass.setText(data.get(3));
        powerKM.setText(data.get(4));
        Power.setText(data.get(5));
        capacity.setText(data.get(6));
        engine.setText(data.get(7));
    }

    private void setUpOnClickMoto(String motoname) {
        setUpTechData(motoname);
        motorFlag = Control.findMotorcycle(motoname);
    }

}
