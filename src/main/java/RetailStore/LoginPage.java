package RetailStore;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.util.*;
/**
 *
 * @author Reinaldo Taslim
 */
public class LoginPage extends JFrame {
    private Random g = new Random();
    public LoginPage() {
        super("Login Form");
        setSize(1280, 720);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
        LoginPanel.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        LoginPanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        UsernameLabel = new javax.swing.JLabel();
        PasswordLabel = new javax.swing.JLabel();
        UsernameField = new javax.swing.JTextField();
        PasswordField = new javax.swing.JPasswordField();
        CancelButton = new javax.swing.JButton();
        LoginButton = new javax.swing.JButton();
        LockLogo = new javax.swing.JLabel();
        HorizontalSeperator = new javax.swing.JSeparator();
        VerticalSeperator = new javax.swing.JSeparator();
        AdminPanel = new javax.swing.JPanel();
        ProducLogo = new javax.swing.JLabel();
        AdminLoginText = new javax.swing.JLabel();
        CustomerPanel = new javax.swing.JPanel();
        CustomerLogo = new javax.swing.JLabel();
        CustomerLogintext = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        jPanel29 = new javax.swing.JPanel();
        jPanel30 = new javax.swing.JPanel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel33 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jPanel35 = new javax.swing.JPanel();
        jPanel36 = new javax.swing.JPanel();
        jPanel37 = new javax.swing.JPanel();
        jPanel38 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        Background.setBackground(new java.awt.Color(153, 153, 153));
        Background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackgroundMouseClicked(evt);
            }
        });
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoginPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Title.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("<title>");

        UsernameLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        UsernameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        UsernameLabel.setText("Username");

        PasswordLabel.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        PasswordLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PasswordLabel.setText("Password");

        UsernameField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        UsernameField.setMargin(new java.awt.Insets(2, 5, 2, 2));

        PasswordField.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        PasswordField.setEchoChar('\u2610');
        PasswordField.setMargin(new java.awt.Insets(2, 5, 2, 2));
        PasswordField.setName(""); // NOI18N
        PasswordField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PasswordFieldKeyPressed(evt);
            }
        });

        CancelButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        CancelButton.setText("Cancel");
        CancelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CancelButtonMouseClicked(evt);
            }
        });

        LoginButton.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        LoginButton.setText("Login");
        LoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoginButtonMouseClicked(evt);
            }
        });

        LockLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lock.png"))); // NOI18N

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(180, 180, 180)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(LockLogo))
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(UsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(UsernameField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginPanelLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(LockLogo)))
                .addGap(28, 28, 28)
                .addGroup(LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Background.add(LoginPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 480, 280));

        HorizontalSeperator.setBackground(new java.awt.Color(0, 0, 0));
        Background.add(HorizontalSeperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 1280, 10));

        VerticalSeperator.setBackground(new java.awt.Color(0, 0, 0));
        VerticalSeperator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        Background.add(VerticalSeperator, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, 10, 430));

        AdminPanel.setBackground(new java.awt.Color(204, 204, 204));
        AdminPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AdminPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AdminPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AdminPanelMouseExited(evt);
            }
        });

        ProducLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ProducLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/admin.png"))); // NOI18N

        AdminLoginText.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        AdminLoginText.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        AdminLoginText.setText("Login as Admin");

        javax.swing.GroupLayout AdminPanelLayout = new javax.swing.GroupLayout(AdminPanel);
        AdminPanel.setLayout(AdminPanelLayout);
        AdminPanelLayout.setHorizontalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AdminPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(AdminLoginText, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ProducLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        AdminPanelLayout.setVerticalGroup(
            AdminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AdminPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(AdminLoginText, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ProducLogo)
                .addGap(47, 47, 47))
        );

        Background.add(AdminPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 260, 340));

        CustomerPanel.setBackground(new java.awt.Color(204, 204, 204));
        CustomerPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CustomerPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CustomerPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CustomerPanelMouseExited(evt);
            }
        });

        CustomerLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomerLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/customer.png"))); // NOI18N

        CustomerLogintext.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 18)); // NOI18N
        CustomerLogintext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CustomerLogintext.setText("Login as Customer");

        javax.swing.GroupLayout CustomerPanelLayout = new javax.swing.GroupLayout(CustomerPanel);
        CustomerPanel.setLayout(CustomerPanelLayout);
        CustomerPanelLayout.setHorizontalGroup(
            CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CustomerPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CustomerLogintext, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CustomerLogo, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        CustomerPanelLayout.setVerticalGroup(
            CustomerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CustomerPanelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(CustomerLogintext, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CustomerLogo)
                .addGap(47, 47, 47))
        );

        Background.add(CustomerPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 340, 260, 340));

        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel1MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 20, 20));

        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel2MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 20, 20, 20));

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 20, 20));

        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 40, -1, -1));

        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, -1, -1));

        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 40, -1, -1));

        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 60, -1, -1));

        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 80, -1, -1));

        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 80, -1, -1));

        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel11MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        jPanel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel12MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel13MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 20, 20, 20));

        jPanel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel14MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, -1, -1));

        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel15MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 140, -1, -1));

        jPanel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel16MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, -1));

        jPanel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel17MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, -1, -1));

        jPanel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel18MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        jPanel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel19MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, -1));

        jPanel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel20MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, -1));

        jPanel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel21MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 100, 20, 20));

        jPanel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel22MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, -1, -1));

        jPanel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel23MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 60, -1, -1));

        jPanel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel24MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 80, -1, -1));

        jPanel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel25MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, -1));

        jPanel26.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel26MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel26Layout = new javax.swing.GroupLayout(jPanel26);
        jPanel26.setLayout(jPanel26Layout);
        jPanel26Layout.setHorizontalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel26Layout.setVerticalGroup(
            jPanel26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 120, -1, -1));

        jPanel27.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel27MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, -1, -1));

        jPanel28.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel28MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, -1));

        jPanel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel29MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel29Layout = new javax.swing.GroupLayout(jPanel29);
        jPanel29.setLayout(jPanel29Layout);
        jPanel29Layout.setHorizontalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel29Layout.setVerticalGroup(
            jPanel29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 90, -1, -1));

        jPanel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel30MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel30Layout = new javax.swing.GroupLayout(jPanel30);
        jPanel30.setLayout(jPanel30Layout);
        jPanel30Layout.setHorizontalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel30Layout.setVerticalGroup(
            jPanel30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 90, -1, -1));

        jPanel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel31MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 60, -1, -1));

        jPanel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel32MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 40, -1, -1));

        jPanel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel33MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel33Layout = new javax.swing.GroupLayout(jPanel33);
        jPanel33.setLayout(jPanel33Layout);
        jPanel33Layout.setHorizontalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel33Layout.setVerticalGroup(
            jPanel33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, -1, -1));

        jPanel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel34MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel34Layout = new javax.swing.GroupLayout(jPanel34);
        jPanel34.setLayout(jPanel34Layout);
        jPanel34Layout.setHorizontalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel34Layout.setVerticalGroup(
            jPanel34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, -1));

        jPanel35.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel35MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel35Layout = new javax.swing.GroupLayout(jPanel35);
        jPanel35.setLayout(jPanel35Layout);
        jPanel35Layout.setHorizontalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel35Layout.setVerticalGroup(
            jPanel35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 20, 20));

        jPanel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel36MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel36Layout = new javax.swing.GroupLayout(jPanel36);
        jPanel36.setLayout(jPanel36Layout);
        jPanel36Layout.setHorizontalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel36Layout.setVerticalGroup(
            jPanel36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, -1, -1));

        jPanel37.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel37MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel37Layout = new javax.swing.GroupLayout(jPanel37);
        jPanel37.setLayout(jPanel37Layout);
        jPanel37Layout.setHorizontalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel37Layout.setVerticalGroup(
            jPanel37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 140, -1, -1));

        jPanel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel38MouseEntered(evt);
            }
        });

        javax.swing.GroupLayout jPanel38Layout = new javax.swing.GroupLayout(jPanel38);
        jPanel38.setLayout(jPanel38Layout);
        jPanel38Layout.setHorizontalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );
        jPanel38Layout.setVerticalGroup(
            jPanel38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 20, Short.MAX_VALUE)
        );

        Background.add(jPanel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 160, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AdminPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminPanelMouseEntered
        AdminPanel.setBackground(Color.WHITE);
    }//GEN-LAST:event_AdminPanelMouseEntered

    private void AdminPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminPanelMouseExited
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        AdminPanel.setBackground(BaseColor);
    }//GEN-LAST:event_AdminPanelMouseExited

    private void CustomerPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerPanelMouseEntered
        CustomerPanel.setBackground(Color.WHITE);
    }//GEN-LAST:event_CustomerPanelMouseEntered

    private void CustomerPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerPanelMouseExited
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        CustomerPanel.setBackground(BaseColor);
    }//GEN-LAST:event_CustomerPanelMouseExited

    private void AdminPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AdminPanelMouseClicked
        LoginPanel.setVisible(true);
        UsernameField.setText("");
        PasswordField.setText("");
        Title.setText("Admin");
        
    }//GEN-LAST:event_AdminPanelMouseClicked

    private void LoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginButtonMouseClicked
        String pw = new String(PasswordField.getPassword());
        if (UsernameField.getText().equals("hello") && pw.equals("world")){
            JOptionPane.showMessageDialog(null, "Login Successfull");
            this.dispose();
            new AdminPage(Title.getText()).setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, "Login Failed");
        }
    }//GEN-LAST:event_LoginButtonMouseClicked

    private void CancelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CancelButtonMouseClicked
        UsernameField.setText("");
        PasswordField.setText("");
        LoginPanel.setVisible(false);
    }//GEN-LAST:event_CancelButtonMouseClicked

    private void CustomerPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CustomerPanelMouseClicked
        LoginPanel.setVisible(true);
        UsernameField.setText("");
        PasswordField.setText("");
        Title.setText("Customer");
    }//GEN-LAST:event_CustomerPanelMouseClicked

    private void BackgroundMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackgroundMouseClicked
        UsernameField.setText("");
        PasswordField.setText("");
        LoginPanel.setVisible(false);
    }//GEN-LAST:event_BackgroundMouseClicked

    private void PasswordFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PasswordFieldKeyPressed
        if (evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            String pw = new String(PasswordField.getPassword());
            if (UsernameField.getText().equals("hello") && pw.equals("world")){
                JOptionPane.showMessageDialog(null, "Login Successfull");
                this.dispose();
                new AdminPage(Title.getText()).setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Login Failed");
            }
        }
    }//GEN-LAST:event_PasswordFieldKeyPressed

    private void jPanel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel1.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel1MouseEntered

    private void jPanel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel2.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel2MouseEntered

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel3.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel4.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel5.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel6.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel7.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel8.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel9.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel10.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel11.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel11MouseEntered

    private void jPanel12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel12MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel12.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel12MouseEntered

    private void jPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel13.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel13MouseEntered

    private void jPanel14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel14MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel14.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel14MouseEntered

    private void jPanel15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel15.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel15MouseEntered

    private void jPanel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel16MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel16.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel16MouseEntered

    private void jPanel17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel17MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel17.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel17MouseEntered

    private void jPanel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel18MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel18.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel18MouseEntered

    private void jPanel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel19MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel19.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel19MouseEntered

    private void jPanel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel20MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel20.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel20MouseEntered

    private void jPanel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel21MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel21.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel21MouseEntered

    private void jPanel22MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel22MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel22.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel22MouseEntered

    private void jPanel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel23MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel23.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel23MouseEntered

    private void jPanel24MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel24MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel24.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel24MouseEntered

    private void jPanel25MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel25MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel25.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel25MouseEntered

    private void jPanel26MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel26MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel26.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel26MouseEntered

    private void jPanel27MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel27MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel27.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel27MouseEntered

    private void jPanel28MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel28MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel28.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel28MouseEntered

    private void jPanel29MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel29MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel29.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel29MouseEntered

    private void jPanel30MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel30MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel30.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel30MouseEntered

    private void jPanel31MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel31MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel31.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel31MouseEntered

    private void jPanel32MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel32MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel32.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel32MouseEntered

    private void jPanel33MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel33MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel33.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel33MouseEntered

    private void jPanel34MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel34MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel34.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel34MouseEntered

    private void jPanel35MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel35MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel35.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel35MouseEntered

    private void jPanel36MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel36MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel36.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel36MouseEntered

    private void jPanel37MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel37MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel37.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel37MouseEntered

    private void jPanel38MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel38MouseEntered
        int red = g.nextInt(255);
        int green = g.nextInt(255);
        int blue = g.nextInt(255);
        Color BaseColor = new Color(red, green, blue);
        jPanel38.setBackground(BaseColor);
    }//GEN-LAST:event_jPanel38MouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AdminLoginText;
    private javax.swing.JPanel AdminPanel;
    private javax.swing.JPanel Background;
    private javax.swing.JButton CancelButton;
    private javax.swing.JLabel CustomerLogintext;
    private javax.swing.JLabel CustomerLogo;
    private javax.swing.JPanel CustomerPanel;
    private javax.swing.JSeparator HorizontalSeperator;
    private javax.swing.JLabel LockLogo;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JLabel PasswordLabel;
    private javax.swing.JLabel ProducLogo;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField UsernameField;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JSeparator VerticalSeperator;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel36;
    private javax.swing.JPanel jPanel37;
    private javax.swing.JPanel jPanel38;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
}