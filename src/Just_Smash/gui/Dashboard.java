package Just_Smash.gui;

import javax.swing.*;
import Just_Smash.app.Just_SmashCalculator;
import Just_Smash.menu.Just_Smash_Items;
import java.awt.*;
import java.awt.print.PrinterException;
import java.lang.System.Logger.Level;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Dashboard extends JFrame {

        private double total = 0.0;
        private int x = 0;
        private double tax = 0.0;
        private Just_Smash_Items[] items;
        private final Just_SmashCalculator calculator = new Just_SmashCalculator();

        public Dashboard() {
                initComponents();
                init();
                setImage();
        }

        public void init() {
                setTime();
                items = new Just_Smash_Items[] {
                                new Just_Smash_Items("Single Smash Classic", 120.0,
                                                "/Just_Smash/images2/Single_Smash_Classic.jpg", jLabelImage1),
                                new Just_Smash_Items("Double Smash Classic", 150.0,
                                                "/Just_Smash/images2/Double_Smash_Classic.jpg", jLabelImage2),
                                new Just_Smash_Items("Triple Smash Classic", 185.0,
                                                "/Just_Smash/images2/Triple_Smash_Classic.jpg", jLabelImage3),
                                new Just_Smash_Items("Quatro Smash Classic", 220.0,
                                                "/Just_Smash/images2/Quatro_Smash_Classic.jpg", jLabelImage4),
                                new Just_Smash_Items("Single Mashroom", 125.0,
                                                "/Just_Smash/images2/Single_Mashroom.jpg", jLabelImage5),
                                new Just_Smash_Items("Double Mashroom", 160.0,
                                                "/Just_Smash/images2/Double_Mashroom.jpg", jLabelImage6),
                                new Just_Smash_Items("Triple Mashroom", 200.0,
                                                "/Just_Smash/images2/Triple_Mashroom.JPG", jLabelImage7),
                                new Just_Smash_Items("Quatro Mashroom", 240.0,
                                                "/Just_Smash/images2/Quatro_Mashroom.JPG", jLabelImage8),
                                new Just_Smash_Items("Fries", 35.0, "/Just_Smash/images2/Fries.JPG", jLabelImage9),
                                new Just_Smash_Items("Loaded Fries", 70.0, "/Just_Smash/images2/Loaded_Fries.jpg",
                                                jLabelImage10),
                                new Just_Smash_Items("Single Smash Fries", 110.0,
                                                "/Just_Smash/images2/Single_Smash_Fries.jpg", jLabelImage11),
                                new Just_Smash_Items("Double Smash Fries", 140.0,
                                                "/Just_Smash/images2/Double_Smash_Fries.jpg", jLabelImage12),
                                new Just_Smash_Items("Tasty Sauce", 12.0, "/Just_Smash/images2/Tasty_Sauce.jpg",
                                                jLabelImage13),
                                new Just_Smash_Items("V7 Cola", 20.0, "/Just_Smash/images2/V7_Cola.jpg", jLabelImage14),
                                new Just_Smash_Items("Water", 10.0, "/Just_Smash/images2/Water.jpg", jLabelImage15)
                };
        }

        public void setImage() {
                for (Just_Smash_Items item : items) {
                        ImageIcon icon = item.getIcon();
                        Image img = icon.getImage().getScaledInstance(item.getLabel().getWidth(),
                                        item.getLabel().getHeight(), Image.SCALE_SMOOTH);
                        item.getLabel().setIcon(new ImageIcon(img));
                }
        }

        private JButton btnExit;
        private JButton btnReceipt;
        private JButton btnReset;
        private JButton btnTotal;
        private JCheckBox jCheckBox1;
        private JCheckBox jCheckBox10;
        private JCheckBox jCheckBox11;
        private JCheckBox jCheckBox12;
        private JCheckBox jCheckBox13;
        private JCheckBox jCheckBox14;
        private JCheckBox jCheckBox15;
        private JCheckBox jCheckBox2;
        private JCheckBox jCheckBox3;
        private JCheckBox jCheckBox4;
        private JCheckBox jCheckBox5;
        private JCheckBox jCheckBox6;
        private JCheckBox jCheckBox7;
        private JCheckBox jCheckBox8;
        private JCheckBox jCheckBox9;
        private JInternalFrame jInternalFrame1;
        private JLabel jLabel1;
        private JLabel jLabel100;
        private JLabel jLabel103;
        private JLabel jLabel104;
        private JLabel jLabel105;
        private JLabel jLabel107;
        private JLabel jLabel110;
        private JLabel jLabel111;
        private JLabel jLabel112;
        private JLabel jLabel114;
        private JLabel jLabel117;
        private JLabel jLabel118;
        private JLabel jLabel119;
        private JLabel jLabel12;
        private JLabel jLabel121;
        private JLabel jLabel124;
        private JLabel jLabel125;
        private JLabel jLabel126;
        private JLabel jLabel128;
        private JLabel jLabel13;
        private JLabel jLabel14;
        private JLabel jLabel16;
        private JLabel jLabel2;
        private JLabel jLabel26;
        private JLabel jLabel27;
        private JLabel jLabel28;
        private JLabel jLabel3;
        private JLabel jLabel30;
        private JLabel jLabel4;
        private JLabel jLabel40;
        private JLabel jLabel41;
        private JLabel jLabel42;
        private JLabel jLabel44;
        private JLabel jLabel47;
        private JLabel jLabel48;
        private JLabel jLabel49;
        private JLabel jLabel5;
        private JLabel jLabel51;
        private JLabel jLabel54;
        private JLabel jLabel55;
        private JLabel jLabel56;
        private JLabel jLabel58;
        private JLabel jLabel61;
        private JLabel jLabel62;
        private JLabel jLabel63;
        private JLabel jLabel65;
        private JLabel jLabel68;
        private JLabel jLabel69;
        private JLabel jLabel70;
        private JLabel jLabel72;
        private JLabel jLabel75;
        private JLabel jLabel76;
        private JLabel jLabel77;
        private JLabel jLabel79;
        private JLabel jLabel82;
        private JLabel jLabel83;
        private JLabel jLabel84;
        private JLabel jLabel86;
        private JLabel jLabel89;
        private JLabel jLabel90;
        private JLabel jLabel91;
        private JLabel jLabel93;
        private JLabel jLabel96;
        private JLabel jLabel97;
        private JLabel jLabel98;
        private JLabel jLabelImage1;
        private JLabel jLabelImage10;
        private JLabel jLabelImage11;
        private JLabel jLabelImage12;
        private JLabel jLabelImage13;
        private JLabel jLabelImage14;
        private JLabel jLabelImage15;
        private JLabel jLabelImage2;
        private JLabel jLabelImage3;
        private JLabel jLabelImage4;
        private JLabel jLabelImage5;
        private JLabel jLabelImage6;
        private JLabel jLabelImage7;
        private JLabel jLabelImage8;
        private JLabel jLabelImage9;
        private JLabel jLabelProduk1;
        private JLabel jLabelProduk10;
        private JLabel jLabelProduk11;
        private JLabel jLabelProduk12;
        private JLabel jLabelProduk13;
        private JLabel jLabelProduk14;
        private JLabel jLabelProduk15;
        private JLabel jLabelProduk2;
        private JLabel jLabelProduk3;
        private JLabel jLabelProduk4;
        private JLabel jLabelProduk5;
        private JLabel jLabelProduk6;
        private JLabel jLabelProduk7;
        private JLabel jLabelProduk8;
        private JLabel jLabelProduk9;
        private JPanel jPanel1;
        private JPanel jPanel10;
        private JPanel jPanel11;
        private JPanel jPanel12;
        private JPanel jPanel13;
        private JPanel jPanel14;
        private JPanel jPanel15;
        private JPanel jPanel16;
        private JPanel jPanel17;
        private JPanel jPanel18;
        private JPanel jPanel19;
        private JPanel jPanel2;
        private JPanel jPanel20;
        private JPanel jPanel21;
        private JPanel jPanel3;
        private JPanel jPanel4;
        private JPanel jPanel5;
        private JPanel jPanel6;
        private JPanel jPanel7;
        private JPanel jPanel9;
        private JScrollPane jScrollPane1;
        private JSpinner jSpinner1;
        private JSpinner jSpinner10;
        private JSpinner jSpinner11;
        private JSpinner jSpinner12;
        private JSpinner jSpinner13;
        private JSpinner jSpinner14;
        private JSpinner jSpinner15;
        private JSpinner jSpinner2;
        private JSpinner jSpinner3;
        private JSpinner jSpinner4;
        private JSpinner jSpinner5;
        private JSpinner jSpinner6;
        private JSpinner jSpinner7;
        private JSpinner jSpinner8;
        private JSpinner jSpinner9;
        private JTextArea jTextArea;
        private JTextField jTextFieldSubTotal;
        private JTextField jTextFieldTax;
        private JTextField jTextFieldTotal;
        private JLabel jTxtDate;
        private JLabel jTxtTime;

        public boolean qtyIsZero(int qty) {
                if (qty == 0) {
                        JOptionPane.showMessageDialog(null, "Please increase the item quantity");
                        return false;
                }
                return true;
        }

        public void reset() {
                total = 0.0;
                x = 0;
                tax = 0.0;
                btnTotal.setEnabled(false);
                jSpinner1.setValue(0);
                jSpinner2.setValue(0);
                jSpinner3.setValue(0);
                jSpinner4.setValue(0);
                jSpinner5.setValue(0);
                jSpinner6.setValue(0);
                jSpinner7.setValue(0);
                jSpinner8.setValue(0);
                jSpinner9.setValue(0);
                jSpinner10.setValue(0);
                jSpinner11.setValue(0);
                jSpinner12.setValue(0);
                jSpinner13.setValue(0);
                jSpinner14.setValue(0);
                jSpinner15.setValue(0);
                jTextFieldTax.setText("0.0");
                jTextFieldSubTotal.setText("0.0");
                jTextFieldTotal.setText("0.0");
                jTextArea.setText("");
                jCheckBox1.setSelected(false);
                jCheckBox2.setSelected(false);
                jCheckBox3.setSelected(false);
                jCheckBox4.setSelected(false);
                jCheckBox5.setSelected(false);
                jCheckBox6.setSelected(false);
                jCheckBox7.setSelected(false);
                jCheckBox8.setSelected(false);
                jCheckBox9.setSelected(false);
                jCheckBox10.setSelected(false);
                jCheckBox11.setSelected(false);
                jCheckBox12.setSelected(false);
                jCheckBox13.setSelected(false);
                jCheckBox14.setSelected(false);
                jCheckBox15.setSelected(false);
        }

        private void initComponents() {

                jInternalFrame1 = new JInternalFrame();
                jPanel1 = new JPanel();
                jPanel2 = new JPanel();
                jLabel1 = new JLabel();
                jPanel3 = new JPanel();
                jLabel2 = new JLabel();
                jPanel5 = new JPanel();
                jLabelImage2 = new JLabel();
                jLabel12 = new JLabel();
                jLabel13 = new JLabel();
                jLabel14 = new JLabel();
                jLabelProduk2 = new JLabel();
                jLabel16 = new JLabel();
                jSpinner2 = new JSpinner();
                jCheckBox2 = new JCheckBox();
                jPanel7 = new JPanel();
                jLabelImage1 = new JLabel();
                jLabel26 = new JLabel();
                jLabel27 = new JLabel();
                jLabel28 = new JLabel();
                jLabelProduk1 = new JLabel();
                jLabel30 = new JLabel();
                jSpinner1 = new JSpinner();
                jCheckBox1 = new JCheckBox();
                jPanel9 = new JPanel();
                jLabelImage3 = new JLabel();
                jLabel40 = new JLabel();
                jLabel41 = new JLabel();
                jLabel42 = new JLabel();
                jLabelProduk3 = new JLabel();
                jLabel44 = new JLabel();
                jSpinner3 = new JSpinner();
                jCheckBox3 = new JCheckBox();
                jPanel10 = new JPanel();
                jLabelImage4 = new JLabel();
                jLabel47 = new JLabel();
                jLabel48 = new JLabel();
                jLabel49 = new JLabel();
                jLabelProduk4 = new JLabel();
                jLabel51 = new JLabel();
                jSpinner4 = new JSpinner();
                jCheckBox4 = new JCheckBox();
                jPanel11 = new JPanel();
                jLabelImage5 = new JLabel();
                jLabel54 = new JLabel();
                jLabel55 = new JLabel();
                jLabel56 = new JLabel();
                jLabelProduk5 = new JLabel();
                jLabel58 = new JLabel();
                jSpinner5 = new JSpinner();
                jCheckBox5 = new JCheckBox();
                jPanel12 = new JPanel();
                jLabelImage6 = new JLabel();
                jLabel61 = new JLabel();
                jLabel62 = new JLabel();
                jLabel63 = new JLabel();
                jLabelProduk6 = new JLabel();
                jLabel65 = new JLabel();
                jSpinner6 = new JSpinner();
                jCheckBox6 = new JCheckBox();
                jPanel13 = new JPanel();
                jLabelImage12 = new JLabel();
                jLabel68 = new JLabel();
                jLabel69 = new JLabel();
                jLabel70 = new JLabel();
                jLabelProduk12 = new JLabel();
                jLabel72 = new JLabel();
                jSpinner12 = new JSpinner();
                jCheckBox12 = new JCheckBox();
                jPanel14 = new JPanel();
                jLabelImage7 = new JLabel();
                jLabel75 = new JLabel();
                jLabel76 = new JLabel();
                jLabel77 = new JLabel();
                jLabelProduk7 = new JLabel();
                jLabel79 = new JLabel();
                jSpinner7 = new JSpinner();
                jCheckBox7 = new JCheckBox();
                jPanel15 = new JPanel();
                jLabelImage9 = new JLabel();
                jLabel82 = new JLabel();
                jLabel83 = new JLabel();
                jLabel84 = new JLabel();
                jLabelProduk9 = new JLabel();
                jLabel86 = new JLabel();
                jSpinner9 = new JSpinner();
                jCheckBox9 = new JCheckBox();
                jPanel16 = new JPanel();
                jLabelImage8 = new JLabel();
                jLabel89 = new JLabel();
                jLabel90 = new JLabel();
                jLabel91 = new JLabel();
                jLabelProduk8 = new JLabel();
                jLabel93 = new JLabel();
                jSpinner8 = new JSpinner();
                jCheckBox8 = new JCheckBox();
                jPanel17 = new JPanel();
                jLabelImage10 = new JLabel();
                jLabel96 = new JLabel();
                jLabel97 = new JLabel();
                jLabel98 = new JLabel();
                jLabelProduk10 = new JLabel();
                jLabel100 = new JLabel();
                jSpinner10 = new JSpinner();
                jCheckBox10 = new JCheckBox();
                jPanel18 = new JPanel();
                jLabelImage11 = new JLabel();
                jLabel103 = new JLabel();
                jLabel104 = new JLabel();
                jLabel105 = new JLabel();
                jLabelProduk11 = new JLabel();
                jLabel107 = new JLabel();
                jSpinner11 = new JSpinner();
                jCheckBox11 = new JCheckBox();
                jPanel19 = new JPanel();
                jLabelImage13 = new JLabel();
                jLabel110 = new JLabel();
                jLabel111 = new JLabel();
                jLabel112 = new JLabel();
                jLabelProduk13 = new JLabel();
                jLabel114 = new JLabel();
                jSpinner13 = new JSpinner();
                jCheckBox13 = new JCheckBox();
                jPanel20 = new JPanel();
                jLabelImage14 = new JLabel();
                jLabel117 = new JLabel();
                jLabel118 = new JLabel();
                jLabel119 = new JLabel();
                jLabelProduk14 = new JLabel();
                jLabel121 = new JLabel();
                jSpinner14 = new JSpinner();
                jCheckBox14 = new JCheckBox();
                jPanel21 = new JPanel();
                jLabelImage15 = new JLabel();
                jLabel124 = new JLabel();
                jLabel125 = new JLabel();
                jLabel126 = new JLabel();
                jLabelProduk15 = new JLabel();
                jLabel128 = new JLabel();
                jSpinner15 = new JSpinner();
                jCheckBox15 = new JCheckBox();
                jPanel4 = new JPanel();
                btnTotal = new JButton();
                btnReceipt = new JButton();
                btnReset = new JButton();
                btnExit = new JButton();
                jPanel6 = new JPanel();
                jScrollPane1 = new JScrollPane();
                jTextArea = new JTextArea();
                jTextFieldTax = new JTextField();
                jTextFieldSubTotal = new JTextField();
                jTextFieldTotal = new JTextField();
                jLabel3 = new JLabel();
                jLabel4 = new JLabel();
                jLabel5 = new JLabel();
                jTxtDate = new JLabel();
                jTxtTime = new JLabel();

                jInternalFrame1.setVisible(true);

                GroupLayout jInternalFrame1Layout = new GroupLayout(jInternalFrame1.getContentPane());
                jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
                jInternalFrame1Layout.setHorizontalGroup(
                                jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));
                jInternalFrame1Layout.setVerticalGroup(
                                jInternalFrame1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGap(0, 0, Short.MAX_VALUE));

                setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                setUndecorated(true);

                jPanel1.setBorder(BorderFactory.createLineBorder(new Color(230, 230, 230), 2));

                jPanel2.setBackground(new Color(240, 240, 240));
                jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
                        public void mouseDragged(java.awt.event.MouseEvent evt) {
                                jPanel2MouseDragged(evt);
                        }
                });
                jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mousePressed(java.awt.event.MouseEvent evt) {
                                jPanel2MousePressed(evt);
                        }
                });

                jLabel1.setFont(new Font("Potti Sreeramulu", 1, 25)); // NOI18N
                jLabel1.setText("== Just Smash ==");

                GroupLayout jPanel2Layout = new GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addGap(15, 15, 15)
                                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 212,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel2Layout.setVerticalGroup(
                                jPanel2Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel2Layout.createSequentialGroup()
                                                                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 46,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)));

                jPanel3.setBackground(new Color(250, 250, 250));
                jPanel3.setBorder(BorderFactory.createLineBorder(new Color(230, 230, 230), 2));

                jLabel2.setFont(new Font("Potti Sreeramulu", 1, 24));
                jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel2.setText("Menu Items");
                jLabel2.setVerticalAlignment(SwingConstants.TOP);

                jPanel5.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));

                jLabel12.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel12.setText("Price:");

                jLabel13.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel13.setText("Quantity:");

                jLabel14.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel14.setText("Purchase:");

                jLabelProduk2.setFont(new Font("Potti Sreeramulu", 1, 20));
                jLabelProduk2.setHorizontalAlignment(SwingConstants.CENTER);
                jLabelProduk2.setText("Double Smash Classic");

                jLabel16.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel16.setText("150.0$");

                jSpinner2.setFont(new Font("Rasa Medium", 1, 16));
                jSpinner2.setModel(new SpinnerNumberModel(0, 0, 20, 1));

                jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox2ActionPerformed(evt);
                        }
                });

                GroupLayout jPanel5Layout = new GroupLayout(jPanel5);
                jPanel5.setLayout(jPanel5Layout);
                jPanel5Layout.setHorizontalGroup(
                                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelImage2, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel14)
                                                                                .addComponent(jLabel13)
                                                                                .addComponent(jLabel12))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jSpinner2,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                68,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCheckBox2)
                                                                                .addComponent(jLabel16)))
                                                .addComponent(jLabelProduk2, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel5Layout.setVerticalGroup(
                                jPanel5Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel5Layout.createSequentialGroup()
                                                                .addComponent(jLabelImage2, GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelProduk2)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel12)
                                                                                .addComponent(jLabel16))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel13)
                                                                                .addComponent(jSpinner2,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel5Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel14)
                                                                                .addComponent(jCheckBox2))
                                                                .addContainerGap()));

                jPanel7.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));

                jLabel26.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel26.setText("Price:");

                jLabel27.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel27.setText("Quantity:");

                jLabel28.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel28.setText("Purchase:");

                jLabelProduk1.setFont(new Font("Potti Sreeramulu", 1, 20)); // NOI18N
                jLabelProduk1.setHorizontalAlignment(SwingConstants.CENTER);
                jLabelProduk1.setText("Single Smash Classic");

                jLabel30.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel30.setText("120.0$");

                jSpinner1.setFont(new Font("Rasa Medium", 1, 16)); // NOI18N
                jSpinner1.setModel(new SpinnerNumberModel(0, 0, 20, 1));

                jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox1ActionPerformed(evt);
                        }
                });

                GroupLayout jPanel7Layout = new GroupLayout(jPanel7);
                jPanel7.setLayout(jPanel7Layout);
                jPanel7Layout.setHorizontalGroup(
                                jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelImage1, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel7Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel28)
                                                                                .addComponent(jLabel27)
                                                                                .addComponent(jLabel26))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(jPanel7Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jSpinner1,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                68,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCheckBox1)
                                                                                .addComponent(jLabel30)))
                                                .addComponent(jLabelProduk1, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel7Layout.setVerticalGroup(
                                jPanel7Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                                .addComponent(jLabelImage1, GroupLayout.PREFERRED_SIZE,
                                                                                114, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelProduk1)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel7Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel26)
                                                                                .addComponent(jLabel30))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel7Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel27)
                                                                                .addComponent(jSpinner1,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel7Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel28)
                                                                                .addComponent(jCheckBox1))
                                                                .addContainerGap()));

                jPanel9.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));

                jLabel40.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel40.setText("Price:");

                jLabel41.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel41.setText("Quantity:");

                jLabel42.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel42.setText("Purchase:");

                jLabelProduk3.setFont(new Font("Potti Sreeramulu", 1, 20)); // NOI18N
                jLabelProduk3.setHorizontalAlignment(SwingConstants.CENTER);
                jLabelProduk3.setText("Triple Smash Classic");

                jLabel44.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel44.setText("185.0$");

                jSpinner3.setFont(new Font("Rasa Medium", 1, 16)); // NOI18N
                jSpinner3.setModel(new SpinnerNumberModel(0, 0, 20, 1));

                jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox3ActionPerformed(evt);
                        }
                });

                GroupLayout jPanel9Layout = new GroupLayout(jPanel9);
                jPanel9.setLayout(jPanel9Layout);
                jPanel9Layout.setHorizontalGroup(
                                jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelImage3, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel9Layout.createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel9Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel42)
                                                                                .addComponent(jLabel41)
                                                                                .addComponent(jLabel40))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(jPanel9Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jSpinner3,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                68,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCheckBox3)
                                                                                .addComponent(jLabel44)))
                                                .addComponent(jLabelProduk3, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel9Layout.setVerticalGroup(
                                jPanel9Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel9Layout.createSequentialGroup()
                                                                .addComponent(jLabelImage3, GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelProduk3)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel9Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel40)
                                                                                .addComponent(jLabel44))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel9Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel41)
                                                                                .addComponent(jSpinner3,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel9Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel42)
                                                                                .addComponent(jCheckBox3))
                                                                .addContainerGap()));

                jPanel10.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));

                jLabel47.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel47.setText("Price:");

                jLabel48.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel48.setText("Quantity:");

                jLabel49.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel49.setText("Purchase:");

                jLabelProduk4.setFont(new Font("Potti Sreeramulu", 1, 20)); // NOI18N
                jLabelProduk4.setHorizontalAlignment(SwingConstants.CENTER);
                jLabelProduk4.setText("Quatro Smash Classic");

                jLabel51.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel51.setText("220.0$");

                jSpinner4.setFont(new Font("Rasa Medium", 1, 16)); // NOI18N
                jSpinner4.setModel(new SpinnerNumberModel(0, 0, 20, 1));

                jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox4ActionPerformed(evt);
                        }
                });

                GroupLayout jPanel10Layout = new GroupLayout(jPanel10);
                jPanel10.setLayout(jPanel10Layout);
                jPanel10Layout.setHorizontalGroup(
                                jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelImage4, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel10Layout.createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel10Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel49)
                                                                                .addComponent(jLabel48)
                                                                                .addComponent(jLabel47))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(jPanel10Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jSpinner4,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                68,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCheckBox4)
                                                                                .addComponent(jLabel51)))
                                                .addComponent(jLabelProduk4, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel10Layout.setVerticalGroup(
                                jPanel10Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel10Layout.createSequentialGroup()
                                                                .addComponent(jLabelImage4, GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelProduk4)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel10Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel47)
                                                                                .addComponent(jLabel51))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel10Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel48)
                                                                                .addComponent(jSpinner4,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel10Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel49)
                                                                                .addComponent(jCheckBox4))
                                                                .addContainerGap()));

                jPanel11.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));

                jLabel54.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel54.setText("Price:");

                jLabel55.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel55.setText("Quantity:");

                jLabel56.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel56.setText("Purchase:");

                jLabelProduk5.setFont(new Font("Potti Sreeramulu", 1, 20)); // NOI18N
                jLabelProduk5.setHorizontalAlignment(SwingConstants.CENTER);
                jLabelProduk5.setText("Single Mashroom");

                jLabel58.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel58.setText("125.0$");

                jSpinner5.setFont(new Font("Rasa Medium", 1, 16)); // NOI18N
                jSpinner5.setModel(new SpinnerNumberModel(0, 0, 20, 1));

                jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox5ActionPerformed(evt);
                        }
                });

                GroupLayout jPanel11Layout = new GroupLayout(jPanel11);
                jPanel11.setLayout(jPanel11Layout);
                jPanel11Layout.setHorizontalGroup(
                                jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelImage5, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel11Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel56)
                                                                                .addComponent(jLabel55)
                                                                                .addComponent(jLabel54))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(jPanel11Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jSpinner5,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                68,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCheckBox5)
                                                                                .addComponent(jLabel58)))
                                                .addComponent(jLabelProduk5, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel11Layout.setVerticalGroup(
                                jPanel11Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel11Layout.createSequentialGroup()
                                                                .addComponent(jLabelImage5, GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelProduk5)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel11Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel54)
                                                                                .addComponent(jLabel58))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel11Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel55)
                                                                                .addComponent(jSpinner5,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel11Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel56)
                                                                                .addComponent(jCheckBox5))
                                                                .addContainerGap()));

                jPanel12.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));

                jLabel61.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel61.setText("Price:");

                jLabel62.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel62.setText("Quantity:");

                jLabel63.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel63.setText("Purchase:");

                jLabelProduk6.setFont(new Font("Potti Sreeramulu", 1, 20)); // NOI18N
                jLabelProduk6.setHorizontalAlignment(SwingConstants.CENTER);
                jLabelProduk6.setText("Double Mashroom");

                jLabel65.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel65.setText("160.0$");

                jSpinner6.setFont(new Font("Rasa Medium", 1, 16)); // NOI18N
                jSpinner6.setModel(new SpinnerNumberModel(0, 0, 20, 1));

                jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox6ActionPerformed(evt);
                        }
                });

                GroupLayout jPanel12Layout = new GroupLayout(jPanel12);
                jPanel12.setLayout(jPanel12Layout);
                jPanel12Layout.setHorizontalGroup(
                                jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelImage6, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel12Layout.createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel12Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel63)
                                                                                .addComponent(jLabel62)
                                                                                .addComponent(jLabel61))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(jPanel12Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jSpinner6,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                68,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCheckBox6)
                                                                                .addComponent(jLabel65)))
                                                .addComponent(jLabelProduk6, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel12Layout.setVerticalGroup(
                                jPanel12Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel12Layout.createSequentialGroup()
                                                                .addComponent(jLabelImage6, GroupLayout.DEFAULT_SIZE,
                                                                                78, Short.MAX_VALUE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelProduk6)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel12Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel61)
                                                                                .addComponent(jLabel65))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel12Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel62)
                                                                                .addComponent(jSpinner6,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel12Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel63)
                                                                                .addComponent(jCheckBox6))
                                                                .addContainerGap()));

                jPanel13.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));

                jLabel68.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel68.setText("Price:");

                jLabel69.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel69.setText("Quantity:");

                jLabel70.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel70.setText("Purchase:");

                jLabelProduk12.setFont(new Font("Potti Sreeramulu", 1, 20)); // NOI18N
                jLabelProduk12.setHorizontalAlignment(SwingConstants.CENTER);
                jLabelProduk12.setText("Double Smash Fries");

                jLabel72.setFont(new Font("Potti Sreeramulu", 0, 17)); // NOI18N
                jLabel72.setText("140.0$");

                jSpinner12.setFont(new Font("Rasa Medium", 1, 16)); // NOI18N
                jSpinner12.setModel(new SpinnerNumberModel(0, 0, 20, 1));

                jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox12ActionPerformed(evt);
                        }
                });

                GroupLayout jPanel13Layout = new GroupLayout(jPanel13);
                jPanel13.setLayout(jPanel13Layout);
                jPanel13Layout.setHorizontalGroup(
                                jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelImage12, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel13Layout.createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel13Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel70)
                                                                                .addComponent(jLabel69)
                                                                                .addComponent(jLabel68))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(jPanel13Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jSpinner12,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                68,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCheckBox12)
                                                                                .addComponent(jLabel72)))
                                                .addComponent(jLabelProduk12, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel13Layout.setVerticalGroup(

                                jPanel13Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel13Layout.createSequentialGroup()
                                                                .addComponent(jLabelImage12, GroupLayout.DEFAULT_SIZE,
                                                                                78, Short.MAX_VALUE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelProduk12)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel13Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel68)
                                                                                .addComponent(jLabel72))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel13Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel69)
                                                                                .addComponent(jSpinner12,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel13Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel70)
                                                                                .addComponent(jCheckBox12))
                                                                .addContainerGap()));

                jPanel14.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));

                jLabel75.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel75.setText("Price:");

                jLabel76.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel76.setText("Quantity:");

                jLabel77.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel77.setText("Purchase:");

                jLabelProduk7.setFont(new Font("Potti Sreeramulu", 1, 20));
                jLabelProduk7.setHorizontalAlignment(SwingConstants.CENTER);
                jLabelProduk7.setText("Triple Mashroom");

                jLabel79.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel79.setText("200.0$");

                jSpinner7.setFont(new Font("Rasa Medium", 1, 16));
                jSpinner7.setModel(new SpinnerNumberModel(0, 0, 20, 1));

                jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox7ActionPerformed(evt);
                        }
                });

                GroupLayout jPanel14Layout = new GroupLayout(jPanel14);
                jPanel14.setLayout(jPanel14Layout);
                jPanel14Layout.setHorizontalGroup(
                                jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelImage7, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel14Layout.createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel14Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel77)
                                                                                .addComponent(jLabel76)
                                                                                .addComponent(jLabel75))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(jPanel14Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jSpinner7,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                68,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCheckBox7)
                                                                                .addComponent(jLabel79)))
                                                .addComponent(jLabelProduk7, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel14Layout.setVerticalGroup(
                                jPanel14Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel14Layout.createSequentialGroup()
                                                                .addComponent(jLabelImage7, GroupLayout.DEFAULT_SIZE,
                                                                                78, Short.MAX_VALUE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelProduk7)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel14Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel75)
                                                                                .addComponent(jLabel79))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel14Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel76)
                                                                                .addComponent(jSpinner7,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel14Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel77)
                                                                                .addComponent(jCheckBox7))
                                                                .addContainerGap()));

                jPanel15.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));

                jLabel82.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel82.setText("Price:");

                jLabel83.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel83.setText("Quantity:");

                jLabel84.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel84.setText("Purchase:");

                jLabelProduk9.setFont(new Font("Potti Sreeramulu", 1, 20));
                jLabelProduk9.setHorizontalAlignment(SwingConstants.CENTER);
                jLabelProduk9.setText("Fries");

                jLabel86.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel86.setText("35.0$");

                jSpinner9.setFont(new Font("Rasa Medium", 1, 16));
                jSpinner9.setModel(new SpinnerNumberModel(0, 0, 20, 1));

                jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox9ActionPerformed(evt);
                        }
                });

                GroupLayout jPanel15Layout = new GroupLayout(jPanel15);
                jPanel15.setLayout(jPanel15Layout);
                jPanel15Layout.setHorizontalGroup(
                                jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelImage9, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel15Layout.createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel15Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel84)
                                                                                .addComponent(jLabel83)
                                                                                .addComponent(jLabel82))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(jPanel15Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jSpinner9,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                68,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCheckBox9)
                                                                                .addComponent(jLabel86)))
                                                .addComponent(jLabelProduk9, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel15Layout.setVerticalGroup(
                                jPanel15Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel15Layout.createSequentialGroup()
                                                                .addComponent(jLabelImage9, GroupLayout.DEFAULT_SIZE,
                                                                                78, Short.MAX_VALUE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelProduk9)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel15Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel82)
                                                                                .addComponent(jLabel86))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel15Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel83)
                                                                                .addComponent(jSpinner9,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel15Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel84)
                                                                                .addComponent(jCheckBox9))
                                                                .addContainerGap()));

                jPanel16.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));

                jLabel89.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel89.setText("Price:");

                jLabel90.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel90.setText("Quantity:");

                jLabel91.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel91.setText("Purchase:");

                jLabelProduk8.setFont(new Font("Potti Sreeramulu", 1, 20));
                jLabelProduk8.setHorizontalAlignment(SwingConstants.CENTER);
                jLabelProduk8.setText("Quatro Mashroom");

                jLabel93.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel93.setText("240.0$");

                jSpinner8.setFont(new Font("Rasa Medium", 1, 16));
                jSpinner8.setModel(new SpinnerNumberModel(0, 0, 20, 1));

                jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox8ActionPerformed(evt);
                        }
                });

                GroupLayout jPanel16Layout = new GroupLayout(jPanel16);
                jPanel16.setLayout(jPanel16Layout);
                jPanel16Layout.setHorizontalGroup(
                                jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelImage8, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel16Layout.createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel16Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel91)
                                                                                .addComponent(jLabel90)
                                                                                .addComponent(jLabel89))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(jPanel16Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jSpinner8,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                68,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCheckBox8)
                                                                                .addComponent(jLabel93)))
                                                .addComponent(jLabelProduk8, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel16Layout.setVerticalGroup(
                                jPanel16Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel16Layout.createSequentialGroup()
                                                                .addComponent(jLabelImage8, GroupLayout.DEFAULT_SIZE,
                                                                                78, Short.MAX_VALUE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelProduk8)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel16Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel89)
                                                                                .addComponent(jLabel93))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel16Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel90)
                                                                                .addComponent(jSpinner8,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel16Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel91)
                                                                                .addComponent(jCheckBox8))
                                                                .addContainerGap()));

                jPanel17.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));

                jLabel96.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel96.setText("Price:");

                jLabel97.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel97.setText("Quantity:");

                jLabel98.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel98.setText("Purchase:");

                jLabelProduk10.setFont(new Font("Potti Sreeramulu", 1, 20));
                jLabelProduk10.setHorizontalAlignment(SwingConstants.CENTER);
                jLabelProduk10.setText("Loaded Fries");

                jLabel100.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel100.setText("70.0$");

                jSpinner10.setFont(new Font("Rasa Medium", 1, 16));
                jSpinner10.setModel(new SpinnerNumberModel(0, 0, 20, 1));

                jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox10ActionPerformed(evt);
                        }
                });

                GroupLayout jPanel17Layout = new GroupLayout(jPanel17);
                jPanel17.setLayout(jPanel17Layout);
                jPanel17Layout.setHorizontalGroup(
                                jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelImage10, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel17Layout.createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel17Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel98)
                                                                                .addComponent(jLabel97)
                                                                                .addComponent(jLabel96))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(jPanel17Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jSpinner10,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                68,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCheckBox10)
                                                                                .addComponent(jLabel100)))
                                                .addComponent(jLabelProduk10, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel17Layout.setVerticalGroup(
                                jPanel17Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel17Layout.createSequentialGroup()
                                                                .addComponent(jLabelImage10, GroupLayout.DEFAULT_SIZE,
                                                                                78, Short.MAX_VALUE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelProduk10)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel17Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel96)
                                                                                .addComponent(jLabel100))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel17Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel97)
                                                                                .addComponent(jSpinner10,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel17Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel98)
                                                                                .addComponent(jCheckBox10))
                                                                .addContainerGap()));

                jPanel18.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));

                jLabel103.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel103.setText("Price:");

                jLabel104.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel104.setText("Quantity:");

                jLabel105.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel105.setText("Purchase:");

                jLabelProduk11.setFont(new Font("Potti Sreeramulu", 1, 20));
                jLabelProduk11.setHorizontalAlignment(SwingConstants.CENTER);
                jLabelProduk11.setText("Single Smash Fries");

                jLabel107.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel107.setText("110.0$");

                jSpinner11.setFont(new Font("Rasa Medium", 1, 16));
                jSpinner11.setModel(new SpinnerNumberModel(0, 0, 20, 1));

                jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox11ActionPerformed(evt);
                        }
                });

                GroupLayout jPanel18Layout = new GroupLayout(jPanel18);
                jPanel18.setLayout(jPanel18Layout);
                jPanel18Layout.setHorizontalGroup(
                                jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelImage11, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel18Layout.createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel18Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel105)
                                                                                .addComponent(jLabel104)
                                                                                .addComponent(jLabel103))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(jPanel18Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jSpinner11,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                68,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCheckBox11)
                                                                                .addComponent(jLabel107)))
                                                .addComponent(jLabelProduk11, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel18Layout.setVerticalGroup(
                                jPanel18Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel18Layout.createSequentialGroup()
                                                                .addComponent(jLabelImage11, GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelProduk11)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel18Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel103)
                                                                                .addComponent(jLabel107))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel18Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel104)
                                                                                .addComponent(jSpinner11,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel18Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel105)
                                                                                .addComponent(jCheckBox11))
                                                                .addContainerGap()));

                jPanel19.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));

                jLabel110.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel110.setText("Price:");

                jLabel111.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel111.setText("Quantity:");

                jLabel112.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel112.setText("Purchase:");

                jLabelProduk13.setFont(new Font("Potti Sreeramulu", 1, 20));
                jLabelProduk13.setHorizontalAlignment(SwingConstants.CENTER);
                jLabelProduk13.setText("Tasty Sauce");

                jLabel114.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel114.setText("12.0$");

                jSpinner13.setFont(new Font("Rasa Medium", 1, 16));
                jSpinner13.setModel(new SpinnerNumberModel(0, 0, 20, 1));

                jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox13ActionPerformed(evt);
                        }
                });

                GroupLayout jPanel19Layout = new GroupLayout(jPanel19);
                jPanel19.setLayout(jPanel19Layout);
                jPanel19Layout.setHorizontalGroup(
                                jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelImage13, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel19Layout.createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel19Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel112)
                                                                                .addComponent(jLabel111)
                                                                                .addComponent(jLabel110))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(jPanel19Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jSpinner13,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                68,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCheckBox13)
                                                                                .addComponent(jLabel114)))
                                                .addComponent(jLabelProduk13, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel19Layout.setVerticalGroup(
                                jPanel19Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel19Layout.createSequentialGroup()
                                                                .addComponent(jLabelImage13, GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelProduk13)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel19Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel110)
                                                                                .addComponent(jLabel114))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel19Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel111)
                                                                                .addComponent(jSpinner13,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel19Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel112)
                                                                                .addComponent(jCheckBox13))
                                                                .addContainerGap()));

                jPanel20.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));

                jLabel117.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel117.setText("Price:");

                jLabel118.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel118.setText("Quantity:");

                jLabel119.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel119.setText("Purchase:");

                jLabelProduk14.setFont(new Font("Potti Sreeramulu", 1, 20));
                jLabelProduk14.setHorizontalAlignment(SwingConstants.CENTER);
                jLabelProduk14.setText("V7 Cola");

                jLabel121.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel121.setText("20.0$");

                jSpinner14.setFont(new Font("Rasa Medium", 1, 16));
                jSpinner14.setModel(new SpinnerNumberModel(0, 0, 20, 1));

                jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox14ActionPerformed(evt);
                        }
                });

                GroupLayout jPanel20Layout = new GroupLayout(jPanel20);
                jPanel20.setLayout(jPanel20Layout);
                jPanel20Layout.setHorizontalGroup(
                                jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelImage14, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel20Layout.createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel20Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel119)
                                                                                .addComponent(jLabel118)
                                                                                .addComponent(jLabel117))
                                                                .addGap(70, 70, 70)
                                                                .addGroup(jPanel20Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jSpinner14,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                68,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCheckBox14)
                                                                                .addComponent(jLabel121)))
                                                .addComponent(jLabelProduk14, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel20Layout.setVerticalGroup(
                                jPanel20Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel20Layout.createSequentialGroup()
                                                                .addComponent(jLabelImage14, GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelProduk14)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel20Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel117)
                                                                                .addComponent(jLabel121))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel20Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel118)
                                                                                .addComponent(jSpinner14,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel20Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel119)
                                                                                .addComponent(jCheckBox14))
                                                                .addContainerGap()));

                jPanel21.setBorder(BorderFactory.createLineBorder(new Color(204, 204, 204), 2));

                jLabel124.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel124.setText("Price:");

                jLabel125.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel125.setText("Quantity:");

                jLabel126.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel126.setText("Purchase:");

                jLabelProduk15.setFont(new Font("Potti Sreeramulu", 1, 20));
                jLabelProduk15.setHorizontalAlignment(SwingConstants.CENTER);
                jLabelProduk15.setText("Water");

                jLabel128.setFont(new Font("Potti Sreeramulu", 0, 17));
                jLabel128.setText("10.0$");

                jSpinner15.setFont(new Font("Rasa Medium", 1, 16));
                jSpinner15.setModel(new SpinnerNumberModel(0, 0, 20, 1));

                jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox15ActionPerformed(evt);
                        }
                });

                GroupLayout jPanel21Layout = new GroupLayout(jPanel21);
                jPanel21.setLayout(jPanel21Layout);
                jPanel21Layout.setHorizontalGroup(
                                jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabelImage15, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel21Layout.createSequentialGroup()
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(jPanel21Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel126)
                                                                                .addComponent(jLabel125)
                                                                                .addComponent(jLabel124))
                                                                .addGap(47, 47, 47)
                                                                .addGroup(jPanel21Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jSpinner15,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                68,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jCheckBox15)
                                                                                .addComponent(jLabel128)))
                                                .addComponent(jLabelProduk15, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                jPanel21Layout.setVerticalGroup(
                                jPanel21Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel21Layout.createSequentialGroup()
                                                                .addComponent(jLabelImage15, GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabelProduk15)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel21Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel124)
                                                                                .addComponent(jLabel128))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel21Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jLabel125)
                                                                                .addComponent(jSpinner15,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                24,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel21Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel126)
                                                                                .addComponent(jCheckBox15))
                                                                .addContainerGap()));

                GroupLayout jPanel3Layout = new GroupLayout(jPanel3);
                jPanel3.setLayout(jPanel3Layout);
                jPanel3Layout.setHorizontalGroup(
                                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel2, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGap(25, 25, 25)
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(2, 2, 2)
                                                                                                .addComponent(jPanel7,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jPanel5,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                .addGap(12, 12, 12)
                                                                                                .addComponent(jPanel9,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGroup(jPanel3Layout
                                                                                                                .createParallelGroup(
                                                                                                                                GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jPanel12,
                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jPanel18,
                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addGroup(jPanel3Layout
                                                                                                                .createParallelGroup(
                                                                                                                                GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(jPanel3Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jPanel13,
                                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(jPanel19,
                                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(jPanel3Layout
                                                                                                                                .createSequentialGroup()
                                                                                                                                .addComponent(jPanel14,
                                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                .addComponent(jPanel16,
                                                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                                                GroupLayout.PREFERRED_SIZE)))))
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING, false)
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addGap(12, 12, 12)
                                                                                                .addComponent(jPanel10,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jPanel11,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addPreferredGap(
                                                                                                                LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jPanel15,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jPanel17,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(jPanel3Layout
                                                                                                .createSequentialGroup()
                                                                                                .addPreferredGap(
                                                                                                                LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                .addComponent(jPanel20,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jPanel21,
                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)))
                                                                .addContainerGap(16, Short.MAX_VALUE)));
                jPanel3Layout.setVerticalGroup(
                                jPanel3Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(jLabel2, GroupLayout.PREFERRED_SIZE, 31,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel11,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel10,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel7,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jPanel5,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel9,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(8, 8, 8)
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel12,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jPanel14,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jPanel15,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jPanel16,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jPanel17,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel3Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(jPanel13,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel18,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel19,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel20,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel21,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addGap(18, 18, 18)));

                jPanel4.setBackground(new Color(250, 250, 250));
                jPanel4.setBorder(BorderFactory.createLineBorder(new Color(230, 230, 230), 2));

                btnTotal.setFont(new Font("Potti Sreeramulu", 1, 24));
                btnTotal.setText("Total");
                btnTotal.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnTotalActionPerformed(evt);
                        }
                });

                btnReceipt.setFont(new Font("Potti Sreeramulu", 1, 24));
                btnReceipt.setText("Receipt");
                btnReceipt.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnReceiptActionPerformed(evt);
                        }
                });

                btnReset.setFont(new Font("Potti Sreeramulu", 1, 24));
                btnReset.setText("Reset");
                btnReset.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnResetActionPerformed(evt);
                        }
                });

                btnExit.setFont(new Font("Potti Sreeramulu", 1, 24));
                btnExit.setText("Exit");
                btnExit.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnExitActionPerformed(evt);
                        }
                });

                GroupLayout jPanel4Layout = new GroupLayout(jPanel4);
                jPanel4.setLayout(jPanel4Layout);
                jPanel4Layout.setHorizontalGroup(
                                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGap(22, 22, 22)
                                                                .addComponent(btnTotal, GroupLayout.PREFERRED_SIZE, 120,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnReceipt, GroupLayout.PREFERRED_SIZE,
                                                                                120, GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 120,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 120,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));
                jPanel4Layout.setVerticalGroup(
                                jPanel4Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel4Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(btnTotal,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                56, Short.MAX_VALUE)
                                                                                .addComponent(btnReceipt,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(btnReset,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(btnExit,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap()));

                jPanel6.setBackground(new Color(204, 204, 204));

                jTextArea.setColumns(20);
                jTextArea.setRows(5);
                jScrollPane1.setViewportView(jTextArea);

                jTextFieldTax.setEditable(false);
                jTextFieldTax.setFont(new Font("Rasa Medium", 1, 22));
                jTextFieldTax.setHorizontalAlignment(JTextField.CENTER);
                jTextFieldTax.setText("0.0");
                jTextFieldTax.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextFieldTaxActionPerformed(evt);
                        }
                });

                jTextFieldSubTotal.setEditable(false);
                jTextFieldSubTotal.setFont(new Font("Rasa Medium", 1, 22));
                jTextFieldSubTotal.setHorizontalAlignment(JTextField.CENTER);
                jTextFieldSubTotal.setText("0.0");

                jTextFieldTotal.setEditable(false);
                jTextFieldTotal.setFont(new Font("Rasa Medium", 1, 22));
                jTextFieldTotal.setHorizontalAlignment(JTextField.CENTER);
                jTextFieldTotal.setText("0.0");
                jTextFieldTotal.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextFieldTotalActionPerformed(evt);
                        }
                });

                jLabel3.setFont(new Font("Potti Sreeramulu", 1, 24));
                jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel3.setText("Tax $ ");

                jLabel4.setFont(new Font("Potti Sreeramulu", 1, 24));
                jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel4.setText("Sub Total $");

                jLabel5.setFont(new Font("Potti Sreeramulu", 1, 24));
                jLabel5.setHorizontalAlignment(SwingConstants.CENTER);
                jLabel5.setText("Total $");

                GroupLayout jPanel6Layout = new GroupLayout(jPanel6);
                jPanel6.setLayout(jPanel6Layout);
                jPanel6Layout.setHorizontalGroup(
                                jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jScrollPane1)
                                                .addGroup(GroupLayout.Alignment.TRAILING, jPanel6Layout
                                                                .createSequentialGroup()
                                                                .addGap(16, 16, 16)
                                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel4)
                                                                                .addComponent(jLabel3,
                                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jLabel5,
                                                                                                GroupLayout.Alignment.LEADING))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED,
                                                                                28, Short.MAX_VALUE)
                                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jTextFieldTotal,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                150,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextFieldSubTotal,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                150,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTextFieldTax,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                150,
                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                .addGap(34, 34, 34)));
                jPanel6Layout.setVerticalGroup(
                                jPanel6Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel6Layout.createSequentialGroup()
                                                                .addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE,
                                                                                640, GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jTextFieldTax,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                36,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel3))
                                                                .addPreferredGap(
                                                                                LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jTextFieldSubTotal,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                36,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel4))
                                                                .addPreferredGap(
                                                                                LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel6Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.BASELINE)
                                                                                .addComponent(jTextFieldTotal,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                36,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jLabel5))
                                                                .addContainerGap(GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)));

                jTxtDate.setFont(new Font("Potti Sreeramulu", 1, 21));

                jTxtTime.setFont(new Font("Potti Sreeramulu", 1, 21));

                GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jPanel2, GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTxtTime, GroupLayout.PREFERRED_SIZE, 173,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jTxtDate, GroupLayout.PREFERRED_SIZE, 233,
                                                                                GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING, false)
                                                                                .addComponent(jPanel3,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jPanel4,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel6, GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                .addContainerGap()));
                jPanel1Layout.setVerticalGroup(
                                jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING)
                                                                                .addComponent(jPanel2,
                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jTxtDate,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE)
                                                                                .addComponent(jTxtTime,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                                GroupLayout.Alignment.LEADING, false)
                                                                                .addGroup(jPanel1Layout
                                                                                                .createSequentialGroup()
                                                                                                .addComponent(jPanel3,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jPanel4,
                                                                                                                GroupLayout.PREFERRED_SIZE,
                                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                                GroupLayout.PREFERRED_SIZE))
                                                                                .addComponent(jPanel6,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                                Short.MAX_VALUE))
                                                                .addContainerGap(14, Short.MAX_VALUE)));

                GroupLayout layout = new GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE,
                                                                GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
                layout.setVerticalGroup(
                                layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jPanel1, GroupLayout.PREFERRED_SIZE,
                                                                                GroupLayout.DEFAULT_SIZE,
                                                                                GroupLayout.PREFERRED_SIZE)
                                                                .addGap(0, 0, Short.MAX_VALUE)));

                pack();
                setLocationRelativeTo(null);
        }

        private void handleCheckBoxAction(JCheckBox checkBox, JSpinner spinner, JLabel label, int index) {
                int qty = Integer.parseInt(spinner.getValue().toString());
                if (qtyIsZero(qty) && checkBox.isSelected()) {
                        x++;
                        if (x == 1) {
                                Mahathir_CoffeeShop();
                        }
                        double price = qty * items[index].getPrice();
                        total += price;
                        tax = calculator.calculateTax(total);
                        jTextArea.setText(jTextArea.getText() + x + ". " + label.getText() + "\t\t\t"
                                        + String.format("%.2f", price) + "\n");
                        dudate();
                } else {
                        checkBox.setSelected(false);
                }
        }

        private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {
                handleCheckBoxAction(jCheckBox1, jSpinner1, jLabelProduk1, 0);
        }

        private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {
                handleCheckBoxAction(jCheckBox2, jSpinner2, jLabelProduk2, 1);
        }

        private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {
                handleCheckBoxAction(jCheckBox3, jSpinner3, jLabelProduk3, 2);
        }

        private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {
                handleCheckBoxAction(jCheckBox4, jSpinner4, jLabelProduk4, 3);
        }

        private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {
                handleCheckBoxAction(jCheckBox5, jSpinner5, jLabelProduk5, 4);
        }

        private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {
                handleCheckBoxAction(jCheckBox6, jSpinner6, jLabelProduk6, 5);
        }

        private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {
                handleCheckBoxAction(jCheckBox7, jSpinner7, jLabelProduk7, 6);
        }

        private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {
                handleCheckBoxAction(jCheckBox8, jSpinner8, jLabelProduk8, 7);
        }

        private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {
                handleCheckBoxAction(jCheckBox9, jSpinner9, jLabelProduk9, 8);
        }

        private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {
                handleCheckBoxAction(jCheckBox10, jSpinner10, jLabelProduk10, 9);
        }

        private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {
                handleCheckBoxAction(jCheckBox11, jSpinner11, jLabelProduk11, 10);
        }

        private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {
                handleCheckBoxAction(jCheckBox12, jSpinner12, jLabelProduk12, 11);
        }

        private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {
                handleCheckBoxAction(jCheckBox13, jSpinner13, jLabelProduk13, 12);
        }

        private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {
                handleCheckBoxAction(jCheckBox14, jSpinner14, jLabelProduk14, 13);
        }

        private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {
                handleCheckBoxAction(jCheckBox15, jSpinner15, jLabelProduk15, 14);
        }

        private void btnTotalActionPerformed(java.awt.event.ActionEvent evt) {
                if (total == 0.0) {
                        JOptionPane.showMessageDialog(null, "You haven't selected any item");
                } else {
                        jTextArea.setText(jTextArea.getText()
                                        + "\n**********************************************************************\n"
                                        + "Tax: \t\t\t" + tax + "\n"
                                        + "Sub Total: \t\t\t" + total + "\n"
                                        + "Total: \t\t\t" + (total + tax) + "\n\n"
                                        + "\"**********************************************************************\n");
                        btnTotal.setEnabled(false);
                }
        }

        private void btnReceiptActionPerformed(java.awt.event.ActionEvent evt) {
                if (total != 0) {
                        if (!btnTotal.isEnabled()) {
                                try {
                                        jTextArea.print();
                                } catch (PrinterException ex) {
                                        throw new RuntimeException("Thread interrupted", ex);
                                }
                        } else {
                                JOptionPane.showMessageDialog(null, "First, you should calculate the total price");
                        }

                } else {
                        JOptionPane.showMessageDialog(null, "You haven't purchased any product");
                }
        }

        private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
                System.exit(0);
        }

        private void jTextFieldTaxActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void jTextFieldTotalActionPerformed(java.awt.event.ActionEvent evt) {

        }

        private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {
                reset();
        }

        int xx, xy;

        private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {
                int x = evt.getXOnScreen();
                int y = evt.getYOnScreen();
                this.setLocation(x - xx, y - xy);
        }

        private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {
                xx = evt.getX();
                xy = evt.getY();
        }

        public void setTime() {
                new Thread(new Runnable() {
                        @Override
                        public void run() {
                                while (true) {
                                        try {
                                                Thread.sleep(1000);
                                        } catch (InterruptedException ex) {
                                                throw new RuntimeException("Thread interrupted", ex);
                                        }
                                        Date date = new Date();
                                        SimpleDateFormat tf = new SimpleDateFormat("h:mm:ss aa");
                                        SimpleDateFormat df = new SimpleDateFormat("EEEE, dd-MM-yyyy");
                                        String time = tf.format(date);
                                        jTxtTime.setText(time.split(" ")[0] + " " + time.split(" ")[1]);
                                        jTxtDate.setText(df.format(date));
                                }
                        }
                }).start();
        }

        public void Mahathir_CoffeeShop() {
                int purchaseId = 15020 + (int) (Math.random() * 80800);
                jTextArea.setText("***************Just Smash***************\n"
                                + "Time: " + jTxtTime.getText() + " Date: " + jTxtDate.getText() + "\n"
                                + "Purchase Id: " + purchaseId + "\n"
                                + "****************************************************\n"
                                + "Item Name:\t\t\t" + "Price$\n");
        }

        public void dudate() {
                jTextFieldTax.setText(String.valueOf(String.format("%.2f", tax)));
                jTextFieldSubTotal.setText(String.valueOf(String.format("%.2f", total)));
                jTextFieldTotal.setText(String.valueOf(String.format("%.2f", total + tax)));
        }

        public static void main(String args[]) {
                try {
                        for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        throw new RuntimeException("Thread interrupted", ex);
                } catch (InstantiationException ex) {
                        throw new RuntimeException("Thread interrupted", ex);
                } catch (IllegalAccessException ex) {
                        throw new RuntimeException("Thread interrupted", ex);
                } catch (UnsupportedLookAndFeelException ex) {
                        throw new RuntimeException("Thread interrupted", ex);
                }

                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Dashboard().setVisible(true);
                        }
                });
        }
}
