/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.estacionamentoi.frame;

import javax.swing.JFrame;

/**
 *
 * @author luis
 */
public class FrameMenu extends JFrame {

    public FrameMenu() {
        setTitle("Sistema Estacionamento");
        setSize(300,300);
        setLocationRelativeTo(null);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuBar1 = new javax.swing.JMenuBar();
        cadastrosBar = new javax.swing.JMenu();
        clientesMenu = new javax.swing.JMenuItem();
        usuariosMenu = new javax.swing.JMenuItem();
        opcaoMenu = new javax.swing.JMenu();
        sairMenu = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu3.setText("Edit");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("File");
        jMenuBar3.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar3.add(jMenu5);

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu6.setText("File");
        jMenuBar4.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar4.add(jMenu7);

        jMenu8.setText("File");
        jMenuBar5.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar5.add(jMenu9);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastrosBar.setText("Cadastros");
        cadastrosBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrosBarActionPerformed(evt);
            }
        });

        clientesMenu.setText("Clientes");
        clientesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clientesMenuActionPerformed(evt);
            }
        });
        cadastrosBar.add(clientesMenu);

        usuariosMenu.setText("Usuários");
        usuariosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosMenuActionPerformed(evt);
            }
        });
        cadastrosBar.add(usuariosMenu);

        jMenuBar1.add(cadastrosBar);

        opcaoMenu.setText("Opções");
        jMenuBar1.add(opcaoMenu);

        sairMenu.setBackground(new java.awt.Color(204, 204, 204));
        sairMenu.setText("Sair");
        sairMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairMenuActionPerformed(evt);
            }
        });
        jMenuBar1.add(sairMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 281, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrosBarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrosBarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrosBarActionPerformed

    private void usuariosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuariosMenuActionPerformed
       //
    }//GEN-LAST:event_usuariosMenuActionPerformed

    private void clientesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clientesMenuActionPerformed
        new FrameCadastroCliente();
    }//GEN-LAST:event_clientesMenuActionPerformed

    private void sairMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairMenuActionPerformed
        System.exit(0);
    }//GEN-LAST:event_sairMenuActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu cadastrosBar;
    private javax.swing.JMenuItem clientesMenu;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenu opcaoMenu;
    private javax.swing.JMenu sairMenu;
    private javax.swing.JMenuItem usuariosMenu;
    // End of variables declaration//GEN-END:variables
}
