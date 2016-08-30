/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EER;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author rafael
 */
public class Calculo extends javax.swing.JFrame {

    /**
     * Creates new form Calculo
     */
    public Calculo() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jCSelecao = new javax.swing.JComboBox<>();
        jBCalcula = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTxtPeso = new javax.swing.JFormattedTextField();
        jTxtPa = new javax.swing.JFormattedTextField();
        jTxtAltura = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTxtReer = new java.awt.TextField();
        jTxtRpi = new java.awt.TextField();
        jTxtRtee = new java.awt.TextField();
        jTxtRimc = new java.awt.TextField();
        lblImc = new java.awt.Label();
        jLabel20 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTxtIdade = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jTxtImc = new javax.swing.JFormattedTextField();

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

        jLabel2.setFont(new java.awt.Font("Microsoft Sans Serif", 3, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 102));
        jLabel2.setText("Sistema de Cálculo de EER");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel1.setText("Selecione o Perfil do Paciente");

        jCSelecao.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        jCSelecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Criança", "Adolescente (F)", "Adolescente (M)", "Adulto / Idoso (F)", "Adulto / Idoso (M)", "Gestante", "Nutriz" }));
        jCSelecao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCSelecaoActionPerformed(evt);
            }
        });

        jBCalcula.setBackground(new java.awt.Color(0, 153, 102));
        jBCalcula.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
        jBCalcula.setText("Calcular");
        jBCalcula.setToolTipText("");
        jBCalcula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCalculaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel4.setText("Peso(Kg):");

        jLabel5.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel5.setText("Altura:");

        jLabel8.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel8.setText("PA:");

        jTxtPeso.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 2));
        jTxtPeso.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jTxtPeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPesoActionPerformed(evt);
            }
        });

        jTxtPa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 2));
        jTxtPa.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jTxtPa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtPaActionPerformed(evt);
            }
        });

        jTxtAltura.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 2));
        jTxtAltura.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jTxtAltura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtAlturaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));

        jLabel9.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel9.setText("Valores PA de Referência a Ultilizar:");

        jLabel3.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel3.setText("PA= 1,00 (sedentário)");

        jLabel10.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel10.setText("PA= 1,11 (pouco ativo)");

        jLabel11.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel11.setText("PA= 1,25 (ativo)");

        jLabel12.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jLabel12.setText("PA= 1,48 (muito ativo)");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(40, 40, 40))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));

        jLabel14.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 22)); // NOI18N
        jLabel14.setText("O IMC do Paciente é :");

        jLabel15.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 22)); // NOI18N
        jLabel15.setText("O PI do Paciente é:");

        jLabel16.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 22)); // NOI18N
        jLabel16.setText("O EER Eutróficos do Paciente é:");

        jLabel17.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 22)); // NOI18N
        jLabel17.setText("O TEE Sobr/Obes do Paciente é:");

        jLabel18.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));

        jLabel19.setFont(new java.awt.Font("Marion", 3, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(15, 124, 33));
        jLabel19.setText("CRN - 0000");

        jLabel22.setFont(new java.awt.Font("Marion", 3, 36)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(15, 124, 33));
        jLabel22.setText("Mabel Nilson Alves");

        jTxtReer.setBackground(new java.awt.Color(0, 153, 102));
        jTxtReer.setEnabled(false);
        jTxtReer.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jTxtReer.setForeground(new java.awt.Color(204, 0, 0));

        jTxtRpi.setBackground(new java.awt.Color(0, 153, 102));
        jTxtRpi.setEnabled(false);
        jTxtRpi.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jTxtRpi.setForeground(new java.awt.Color(204, 0, 0));
        jTxtRpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtRpiActionPerformed(evt);
            }
        });

        jTxtRtee.setBackground(new java.awt.Color(0, 153, 102));
        jTxtRtee.setEnabled(false);
        jTxtRtee.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jTxtRtee.setForeground(new java.awt.Color(204, 0, 0));

        jTxtRimc.setBackground(new java.awt.Color(0, 153, 102));
        jTxtRimc.setEnabled(false);
        jTxtRimc.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jTxtRimc.setForeground(new java.awt.Color(204, 0, 0));
        jTxtRimc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtRimcActionPerformed(evt);
            }
        });

        lblImc.setVisible(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel16)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15))
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel18))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTxtReer, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(jTxtRpi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTxtRimc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTxtRtee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(308, 308, 308)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(lblImc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 374, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(432, 432, 432))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(29, 29, 29)
                        .addComponent(lblImc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jTxtRimc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTxtRpi, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jTxtReer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17)
                            .addComponent(jTxtRtee, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addGap(1, 1, 1)))
                .addComponent(jLabel19)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jLabel20.setIcon(new javax.swing.ImageIcon("/Users/rafael/Desktop/logo.png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel7.setText("Idade:");

        jTxtIdade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 2));
        jTxtIdade.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jTxtIdade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtIdadeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 18)); // NOI18N
        jLabel6.setText("IMC Ref.:");

        jTxtImc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 102), 2));
        jTxtImc.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 18)); // NOI18N
        jTxtImc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxtImcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel4)
                                                    .addComponent(jLabel5)
                                                    .addComponent(jLabel7)
                                                    .addComponent(jLabel6))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTxtPa, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTxtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTxtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTxtImc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jBCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(66, 66, 66)
                                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jCSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(115, 115, 115)
                                .addComponent(jLabel20))
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jCSelecao, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(jTxtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(jTxtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(jTxtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jTxtPa, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(jTxtImc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addComponent(jBCalcula, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabel20)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel13)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1002, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 664, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxtAlturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtAlturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtAlturaActionPerformed

    private void jTxtPaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPaActionPerformed

    private void jTxtIdadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtIdadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtIdadeActionPerformed

    private void jTxtImcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtImcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtImcActionPerformed

    private void jTxtPesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtPesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtPesoActionPerformed

    private void jBCalculaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCalculaActionPerformed

        DecimalFormat df = new DecimalFormat("##.##");
        double pa;
        double imc;
        double imcCalculado;
        double imcRef;
        double piCalculado;
        double peso;
        double altura;
        int idade;
        double eutroficos;
        double tee;
        
            

        String opcao = jCSelecao.getSelectedItem().toString();
        if (opcao == "Adulto / Idoso (M)") {
            pa =  Double.parseDouble(jTxtPa.getText());
            peso = Double.parseDouble(jTxtPeso.getText());
            altura = Double.parseDouble(jTxtAltura.getText());
            idade = Integer.parseInt(jTxtIdade.getText());
            imcRef = Double.parseDouble(jTxtImc.getText());
            
            imcCalculado = peso / (altura * altura);
            piCalculado = imcRef * altura * altura;
            eutroficos = 662 - (9.53 * idade) + pa * (15.91 * peso + 593.6 * altura);
            tee = 1086 - (10.1 * idade) + pa * (13.7 * peso + 416 * altura);
            imc = peso * (altura * altura);
            
            jTxtRimc.setText(String.format("%.2f",imcCalculado));
            jTxtRpi.setText(String.format("%.2f",piCalculado));
            jTxtReer.setText(String.format("%.2f" ,eutroficos));
            jTxtRtee.setText(String.format("%.2f" ,tee));
            jTxtImc.setText(String.format("%.2f", imc));
        }
        
//        if (opcao.equals("Criança")) {
//            pa =  Double.parseDouble(jTxtPa.getText());
//            peso = Double.parseDouble(jTxtPeso.getText());
//            altura = Double.parseDouble(jTxtAltura.getText());
//            idade = Integer.parseInt(jTxtIdade.getText());
//            //imcRef = Double.parseDouble(jTxtImc.getText());
//            jLabel6.setEnabled(false);
//            jTxtImc.setEnabled(false);
//            imcCalculado = peso / (altura * altura);
//            //piCalculado = imcRef * altura * altura;
//            eutroficos = 88.5 - (61.9 * idade) + pa * (15.91 * peso + 593.6 * altura);
//            tee = 1086 - (10.1 * idade) + pa * (26.7 * peso + 903 * altura);
//            imc = peso * (altura * altura);
//            
//            //jTxtRimc.setText(String.format("%.2f",imcCalculado));
//            //jTxtRpi.setText(String.format("%.2f",piCalculado));
//            jTxtReer.setText(String.format("%.2f" ,eutroficos));
//jTxtReer.setEnabled(false);
////jTxtRtee.setText(String.format("%.2f" ,tee));
//            //jTxtImc.setText(String.format("%.2f", imc));
//        }
        
        if (opcao.equals("Adolescente (F)")) {
            pa =  Double.parseDouble(jTxtPa.getText());
            peso = Double.parseDouble(jTxtPeso.getText());
            altura = Double.parseDouble(jTxtAltura.getText());
            idade = Integer.parseInt(jTxtIdade.getText());
            eutroficos = 88.5 - (61.9 * idade) + pa * (26.7 * peso + 903 * altura)+ 25;
            jTxtReer.setText(String.format("%.2f" ,eutroficos));
        }

        
    }//GEN-LAST:event_jBCalculaActionPerformed

    private void jTxtRimcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtRimcActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtRimcActionPerformed

    private void jTxtRpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxtRpiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxtRpiActionPerformed

    private void jCSelecaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCSelecaoActionPerformed
    //jTxtImc.setEnabled(false);  
    String opcao = jCSelecao.getSelectedItem().toString();
        if (opcao.equals("Adolescente (F)")) {
        jTxtImc.setEnabled(false);
            jLabel6.setEnabled(false);
            jPanel4.setVisible(false);
            jTxtRimc.setEnabled(false);
            jLabel14.setEnabled(false);
            jTxtRpi.setEnabled(false);
            jLabel15.setEnabled(false);
            jTxtRtee.setEnabled(false);
            jLabel17.setEnabled(false);
        }
    }//GEN-LAST:event_jCSelecaoActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBCalcula;
    private javax.swing.JComboBox<String> jCSelecao;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JFormattedTextField jTxtAltura;
    private javax.swing.JFormattedTextField jTxtIdade;
    private javax.swing.JFormattedTextField jTxtImc;
    private javax.swing.JFormattedTextField jTxtPa;
    private javax.swing.JFormattedTextField jTxtPeso;
    private java.awt.TextField jTxtReer;
    private java.awt.TextField jTxtRimc;
    private java.awt.TextField jTxtRpi;
    private java.awt.TextField jTxtRtee;
    private java.awt.Label lblImc;
    // End of variables declaration//GEN-END:variables
}
