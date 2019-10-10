package br.estacio.prii.estacionamentoi.frame;

import javax.swing.JFrame;

public class FramePrincipal extends JFrame {

    public FramePrincipal(){
        setTitle("Aplicaçao GUI Swing");
        setSize(300,300);
        setLocationRelativeTo(null);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nomeLabel = new javax.swing.JLabel();
        senhaLabel = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        nomeText = new javax.swing.JTextField();
        acessaButton = new javax.swing.JToggleButton();
        cancelaButton = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nomeLabel.setText("Usuário:");

        senhaLabel.setText("Senha:");

        jPasswordField1.setForeground(new java.awt.Color(204, 204, 204));
        jPasswordField1.setText("senhaPassword");

        nomeText.setForeground(new java.awt.Color(204, 204, 204));
        nomeText.setText("Usuário");

        acessaButton.setText("Acessar");

        cancelaButton.setText("Cancelar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(acessaButton)
                        .addGap(28, 28, 28)
                        .addComponent(cancelaButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nomeLabel)
                            .addComponent(senhaLabel))
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nomeText)
                            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(49, 49, 49))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(nomeLabel))
                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(senhaLabel))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cancelaButton, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(acessaButton, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(68, Short.MAX_VALUE))
        );

        nomeLabel.getAccessibleContext().setAccessibleName("Nome:");

        setBounds(0, 0, 300, 300);
    }// </editor-fold>//GEN-END:initComponents
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton acessaButton;
    private javax.swing.JToggleButton cancelaButton;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeText;
    private javax.swing.JLabel senhaLabel;
    // End of variables declaration//GEN-END:variables
}
