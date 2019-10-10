package br.estacio.prii.estacionamentoi.frame;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author alunoti
 */
public class FrameCadastroCliente extends JFrame {

    /** Creates new form FrameCadastro */
    public FrameCadastroCliente() {
        setTitle("Cadastro Cliente");
        setSize(300,300);
        setLocationRelativeTo(null);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
        setVisible(true);
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cadastroLabel = new javax.swing.JLabel();
        matriculaText = new javax.swing.JTextField();
        nomeLabel = new javax.swing.JLabel();
        nomeText = new javax.swing.JTextField();
        veiculoLabel = new javax.swing.JLabel();
        motoRadio = new javax.swing.JRadioButton();
        carroRadio = new javax.swing.JRadioButton();
        placaLabel = new javax.swing.JLabel();
        idadeText = new javax.swing.JTextField();
        corLabel = new javax.swing.JLabel();
        buscarCadastroButton = new javax.swing.JButton();
        novoButton = new javax.swing.JButton();
        alterarButton = new javax.swing.JButton();
        excluirButton = new javax.swing.JButton();
        gravarButton = new javax.swing.JButton();
        cancelarButtom = new javax.swing.JButton();
        buscarPlacaButton = new javax.swing.JButton();
        corText = new javax.swing.JTextField();
        cpfLabel = new javax.swing.JLabel();
        cpfText = new javax.swing.JTextField();
        telefoneLabel = new javax.swing.JLabel();
        telefoneText = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cadastroLabel.setText("Cadastro:");

        nomeLabel.setText("Nome:");

        veiculoLabel.setText("Veículo:");

        motoRadio.setSelected(true);
        motoRadio.setText("Moto");

        carroRadio.setText("Carro");

        placaLabel.setText("Placa:");

        corLabel.setText("Cor:");

        buscarCadastroButton.setText("Buscar");

        novoButton.setText("Novo");

        alterarButton.setText("Alterar");

        excluirButton.setText("Excluir");

        gravarButton.setText("Gravar");

        cancelarButtom.setText("Cancelar");
        cancelarButtom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarButtomActionPerformed(evt);
            }
        });

        buscarPlacaButton.setText("Buscar");

        cpfLabel.setText("CPF:");

        telefoneLabel.setText("Telefone:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(veiculoLabel)
                    .addComponent(placaLabel)
                    .addComponent(corLabel)
                    .addComponent(cadastroLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nomeLabel)
                    .addComponent(cpfLabel)
                    .addComponent(telefoneLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(matriculaText, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(buscarCadastroButton))
                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cpfText, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(corText, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(idadeText, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                            .addComponent(telefoneText, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buscarPlacaButton)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(alterarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(novoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(excluirButton, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(motoRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(carroRadio))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(gravarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelarButtom)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addComponent(novoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alterarButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(excluirButton)
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(buscarCadastroButton)
                    .addComponent(cadastroLabel)
                    .addComponent(matriculaText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(nomeLabel)
                    .addComponent(nomeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfLabel)
                    .addComponent(cpfText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefoneLabel)
                    .addComponent(telefoneText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(veiculoLabel)
                    .addComponent(motoRadio)
                    .addComponent(carroRadio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(buscarPlacaButton)
                    .addComponent(idadeText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(placaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(corLabel)
                    .addComponent(corText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(gravarButton)
                    .addComponent(cancelarButtom))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelarButtomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarButtomActionPerformed
        new FrameMenu();
        
        System.exit(0);
    }//GEN-LAST:event_cancelarButtomActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton alterarButton;
    private javax.swing.JButton buscarCadastroButton;
    private javax.swing.JButton buscarPlacaButton;
    private javax.swing.JLabel cadastroLabel;
    private javax.swing.JButton cancelarButtom;
    private javax.swing.JRadioButton carroRadio;
    private javax.swing.JLabel corLabel;
    private javax.swing.JTextField corText;
    private javax.swing.JLabel cpfLabel;
    private javax.swing.JTextField cpfText;
    private javax.swing.JButton excluirButton;
    private javax.swing.JButton gravarButton;
    private javax.swing.JTextField idadeText;
    private javax.swing.JTextField matriculaText;
    private javax.swing.JRadioButton motoRadio;
    private javax.swing.JLabel nomeLabel;
    private javax.swing.JTextField nomeText;
    private javax.swing.JButton novoButton;
    private javax.swing.JLabel placaLabel;
    private javax.swing.JLabel telefoneLabel;
    private javax.swing.JTextField telefoneText;
    private javax.swing.JLabel veiculoLabel;
    // End of variables declaration//GEN-END:variables

}
