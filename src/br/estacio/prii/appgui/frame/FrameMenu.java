/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.prii.appgui.frame;

import javax.swing.JFrame;

/**
 *
 * @author luis
 */
public class FrameMenu extends JFrame {

    public FrameMenu() {
        setTitle("Histórico Acadêmico");
        setSize(300,300);
        setLocationRelativeTo(null);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        cadastrosBar = new javax.swing.JMenu();
        alunoMenu = new javax.swing.JMenuItem();
        usuariosMenu = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastrosBar.setText("Cadastros");
        cadastrosBar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrosBarActionPerformed(evt);
            }
        });

        alunoMenu.setText("Alunos");
        alunoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alunoMenuActionPerformed(evt);
            }
        });
        cadastrosBar.add(alunoMenu);

        usuariosMenu.setText("Usuários");
        usuariosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuariosMenuActionPerformed(evt);
            }
        });
        cadastrosBar.add(usuariosMenu);

        jMenuBar1.add(cadastrosBar);

        jMenu2.setText("Opções");
        jMenuBar1.add(jMenu2);

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
        new FrameCadastroAluno();
    }//GEN-LAST:event_usuariosMenuActionPerformed

    private void alunoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alunoMenuActionPerformed
        new FrameCadastroAluno();
    }//GEN-LAST:event_alunoMenuActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem alunoMenu;
    private javax.swing.JMenu cadastrosBar;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem usuariosMenu;
    // End of variables declaration//GEN-END:variables
}
