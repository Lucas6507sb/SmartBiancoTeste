/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package smartbianco2.pkg0.Funcionario;

import smartbianco2.pkg0.Chefe.*;
import java.awt.Color;
import smartbianco2.pkg0.Chefe.Clientes;
import smartbianco2.pkg0.Chefe.Funcionarios;
import smartbianco2.pkg0.Login;

public class DashboardFuncionario extends javax.swing.JFrame {
    
    Color DefaultColor, ClickedColor;
    
    public DashboardFuncionario() {
        initComponents();
    
        DefaultColor = new Color(0,0,102);
        ClickedColor = new Color(14,14,123);
        
        Clientes.setBackground (DefaultColor);
        Funcionarios.setBackground (DefaultColor);
        Assinaturas.setBackground (DefaultColor);
        Pagamentos.setBackground (DefaultColor);
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        Clientes = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Funcionarios = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Assinaturas = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Pagamentos = new javax.swing.JPanel();
        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Clientes.setBackground(new java.awt.Color(0, 0, 102));
        Clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClientesMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ClientesMousePressed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Clientes");

        javax.swing.GroupLayout ClientesLayout = new javax.swing.GroupLayout(Clientes);
        Clientes.setLayout(ClientesLayout);
        ClientesLayout.setHorizontalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ClientesLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ClientesLayout.setVerticalGroup(
            ClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        Funcionarios.setBackground(new java.awt.Color(0, 0, 102));
        Funcionarios.setPreferredSize(new java.awt.Dimension(134, 43));
        Funcionarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FuncionariosMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FuncionariosMousePressed(evt);
            }
        });

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Treinos");

        javax.swing.GroupLayout FuncionariosLayout = new javax.swing.GroupLayout(Funcionarios);
        Funcionarios.setLayout(FuncionariosLayout);
        FuncionariosLayout.setHorizontalGroup(
            FuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FuncionariosLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        FuncionariosLayout.setVerticalGroup(
            FuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        Assinaturas.setBackground(new java.awt.Color(0, 0, 102));
        Assinaturas.setPreferredSize(new java.awt.Dimension(134, 43));
        Assinaturas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AssinaturasMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AssinaturasMousePressed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Assinaturas");

        javax.swing.GroupLayout AssinaturasLayout = new javax.swing.GroupLayout(Assinaturas);
        Assinaturas.setLayout(AssinaturasLayout);
        AssinaturasLayout.setHorizontalGroup(
            AssinaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AssinaturasLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        AssinaturasLayout.setVerticalGroup(
            AssinaturasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );

        Pagamentos.setBackground(new java.awt.Color(0, 0, 102));
        Pagamentos.setPreferredSize(new java.awt.Dimension(134, 43));
        Pagamentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                PagamentosMousePressed(evt);
            }
        });

        javax.swing.GroupLayout PagamentosLayout = new javax.swing.GroupLayout(Pagamentos);
        Pagamentos.setLayout(PagamentosLayout);
        PagamentosLayout.setHorizontalGroup(
            PagamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 204, Short.MAX_VALUE)
        );
        PagamentosLayout.setVerticalGroup(
            PagamentosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(58, Short.MAX_VALUE))
            .addComponent(Clientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(Funcionarios, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
            .addComponent(Assinaturas, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
            .addComponent(Pagamentos, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(Clientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Funcionarios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Assinaturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Pagamentos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 222, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(38, 38, 38))
        );

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 645, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jDesktopPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Login LoginFrame = new Login ();
        LoginFrame.setVisible(true);
        LoginFrame.pack();
        LoginFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ClientesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesMousePressed
        Clientes.setBackground (ClickedColor);
        Funcionarios.setBackground (DefaultColor);
        Assinaturas.setBackground (DefaultColor);
        Pagamentos.setBackground (DefaultColor);
    }//GEN-LAST:event_ClientesMousePressed

    private void FuncionariosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FuncionariosMousePressed
        Clientes.setBackground (DefaultColor);
        Funcionarios.setBackground (ClickedColor);
        Assinaturas.setBackground (DefaultColor);
        Pagamentos.setBackground (DefaultColor);
 
    }//GEN-LAST:event_FuncionariosMousePressed

    private void AssinaturasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AssinaturasMousePressed
        Clientes.setBackground (DefaultColor);
        Funcionarios.setBackground (DefaultColor);
        Assinaturas.setBackground (ClickedColor);
        Pagamentos.setBackground (DefaultColor);

    }//GEN-LAST:event_AssinaturasMousePressed

    private void PagamentosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PagamentosMousePressed
        Clientes.setBackground (DefaultColor);
        Funcionarios.setBackground (DefaultColor);
        Assinaturas.setBackground (DefaultColor);
        Pagamentos.setBackground (ClickedColor);

    }//GEN-LAST:event_PagamentosMousePressed

    private void ClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClientesMouseClicked
        Clientes cliente = new Clientes();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(cliente).setVisible(true);
    }//GEN-LAST:event_ClientesMouseClicked

    private void FuncionariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FuncionariosMouseClicked
        Funcionarios func = new Funcionarios();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(func).setVisible(true);
    }//GEN-LAST:event_FuncionariosMouseClicked

    private void AssinaturasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AssinaturasMouseClicked
        Assinatura ass = new Assinatura();
        jDesktopPane1.removeAll();
        jDesktopPane1.add(ass).setVisible(true);
    }//GEN-LAST:event_AssinaturasMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Assinaturas;
    private javax.swing.JPanel Clientes;
    private javax.swing.JPanel Funcionarios;
    private javax.swing.JPanel Pagamentos;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
