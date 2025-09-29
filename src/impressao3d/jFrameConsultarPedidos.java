/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package impressao3d;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.swing.DefaultListSelectionModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

public class jFrameConsultarPedidos extends javax.swing.JFrame {
ListarPedidos listaPedidos = new ListarPedidos();
    DefaultTableModel model;
    ArrayList<PedidosTotais> lista = new ArrayList();
    jFrameCadastrarPedido cadPedidos = new jFrameCadastrarPedido();

    public jFrameConsultarPedidos() {
        initComponents();
        model = (DefaultTableModel) jTableConsulta.getModel(); 
    }

 public void setPedidos(ArrayList<PedidosTotais> lista) {
    for (PedidosTotais pedido : lista) {
            model.addRow(new Object[]{
                pedido.getId(),
                pedido.getNomeModelagem(),
                pedido.getAltura(),
                pedido.getPeso(),
                pedido.getComprimento(),
                pedido.getVolume(),
                pedido.getTaxaEnvio(),
                pedido.getTempoModeladar(),
                pedido.getTaxaDoTempo(),
                pedido.getMaterial(),
                pedido.getTaxaMaterial(),
                pedido.getTempoImpressao(),
                pedido.getDataEntrega(),
                pedido.getValor(),
                pedido.getCliente().getNome(),
                pedido.getCliente().getCPF(),
                pedido.getCliente().getContato()
            });
        }
}  
 
private void lerPedidos() throws IOException {
        String molde;
        try {
            FileReader arqLe = new FileReader("ListaPedidos.txt");
            BufferedReader br = new BufferedReader(arqLe);
            while ((molde = br.readLine()) != null) {
                String campos[] = molde.split(";");
                model.addRow(campos);
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Erro ao ler o arquivo", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextIDbusca = new javax.swing.JTextField();
        jButtonProcurar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableConsulta = new javax.swing.JTable();
        jButtonSalvar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/impressao3d/icons/logo60.png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Consultar pedidos:");

        jLabel2.setText("Digite o ID do pedido ou o CPF do cliente:");

        jButtonProcurar.setText("Procurar");
        jButtonProcurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcurarActionPerformed(evt);
            }
        });

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/impressao3d/icons/logo60.png"))); // NOI18N

        jTableConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome Modelagem", "Altura", "Peso", "Comprimento", "Volume", "Envio", "Tempo para modelar", "Taxa modelagem", "Material", "Taxa Material", "Tempo de impressão", "Data de entrega", "Valor", "Nome Cliente", "CPF", "Contato"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableConsulta);

        jButtonSalvar.setBackground(new java.awt.Color(255, 51, 0));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jLabel16)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addContainerGap(860, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTextIDbusca)
                        .addGap(1064, 1064, 1064))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonProcurar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonExcluir)
                        .addGap(1062, 1062, 1062))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextIDbusca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonProcurar)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonExcluir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTableConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableConsultaMouseClicked
        jButtonExcluir.setEnabled(true);
    }//GEN-LAST:event_jTableConsultaMouseClicked

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        int i = 0;
        int linha = model.getRowCount();
        try{
            if (linha == 0) {
                throw new SemCadastro("erro!");
            } else {
                try {
                    FileWriter arquivo = new FileWriter("ListaPedidos.txt", false);
                    PrintWriter arq = new PrintWriter(arquivo);
                    do {
                        arq.println(model.getValueAt(i, 0) + ";" + model.getValueAt(i, 1) + ";" + model.getValueAt(i, 2)
                            + ";" + model.getValueAt(i, 3) + ";" + model.getValueAt(i, 4) +";"+model.getValueAt(i, 5) + ";" +
                            model.getValueAt(i, 6) + ";" + model.getValueAt(i, 7)
                            + ";" +model.getValueAt(i, 8)+ ";" + model.getValueAt(i, 9) + ";" + model.getValueAt(i, 10)
                            + ";" + model.getValueAt(i, 11) + ";" + model.getValueAt(i, 12) +";"+model.getValueAt(i, 13) + ";" +
                            model.getValueAt(i, 14) + ";" + model.getValueAt(i, 15)
                            + ";" +model.getValueAt(i, 16)) ;
                        i++;

                    } while (i != linha);

                    arq.close();
                    arquivo.close();
                    JOptionPane.showMessageDialog(this, "Informações salvadas com sucesso no ListaPedidos.txt!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao salvar!\nTente novamente!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(SemCadastro SM){
            JOptionPane.showMessageDialog(this, "Não há moldes para salvar!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        int linha = jTableConsulta.getSelectedRow();
        if (jTableConsulta.getSelectedRow() >= 0) {
             if (linha >= 0) {
        int idPedido = Integer.parseInt(model.getValueAt(linha, 0).toString());
        for (PedidosTotais pedido : lista) {
            if (pedido.getId() == idPedido) {
                lista.remove(pedido);
            }
        }}
            model.removeRow(linha);
            jButtonExcluir.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para excluir!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        int i = 0;
        try{
            if (linha == 0) {
                throw new SemCadastro("erro!");
            } else {
                try {
                    FileWriter arquivo = new FileWriter("ListaPedidos.txt", false);
                    PrintWriter arq = new PrintWriter(arquivo);
                    do {
                        arq.println(model.getValueAt(i, 0) + ";" + model.getValueAt(i, 1) + ";" + model.getValueAt(i, 2)
                            + ";" + model.getValueAt(i, 3) + ";" + model.getValueAt(i, 4) +";"+model.getValueAt(i, 5) + ";" +
                            model.getValueAt(i, 6) + ";" + model.getValueAt(i, 7)
                            + ";" +model.getValueAt(i, 8)+ ";" + model.getValueAt(i, 9) + ";" + model.getValueAt(i, 10)
                            + ";" + model.getValueAt(i, 11) + ";" + model.getValueAt(i, 12) +";"+model.getValueAt(i, 13) + ";" +
                            model.getValueAt(i, 14) + ";" + model.getValueAt(i, 15)
                            + ";" +model.getValueAt(i, 16)) ;
                        i++;

                    } while (i != linha);
                    arq.close();
                    arquivo.close();

                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(this, "Erro ao salvar!\nTente novamente!", "ERRO", JOptionPane.ERROR_MESSAGE);
                }
            }
        }catch(SemCadastro SM){
            JOptionPane.showMessageDialog(this, "Não há lista para salvar!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        jButtonExcluir.setEnabled(false);
        try {
            this.lerPedidos();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao ler arquivo!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jButtonProcurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcurarActionPerformed
        String idTexto = jTextIDbusca.getText().trim();
        String cpfTexto="";
        ArrayList<Integer> linhasSelecionadas = new ArrayList<>();
   try{
   
    if ( idTexto.isEmpty() ) {
        JOptionPane.showMessageDialog(this, "Preencha o campo de pesquisa (ID ou CPF)!", "Informação", JOptionPane.INFORMATION_MESSAGE);
    }else{
        if(jTextIDbusca.getText().length()==14){
            cpfTexto=jTextIDbusca.getText();
        }
      // Crie um modelo de seleção que permita seleção múltipla
            ListSelectionModel selectionModel = new DefaultListSelectionModel();
            selectionModel.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

            // Configure o modelo de seleção da tabela
            jTableConsulta.setSelectionModel(selectionModel);

            // Percorre a lista de pedidos em busca de correspondências
            for (int row = 0; row < jTableConsulta.getRowCount(); row++) {
                String idValue = jTableConsulta.getValueAt(row, 0).toString();
                String cpfValue = jTableConsulta.getValueAt(row, 15).toString(); // Supondo que a coluna 15 contenha o CPF

                if ((!idTexto.isEmpty() && idValue.equals(idTexto)) || (!idTexto.isEmpty() && cpfValue.equals(cpfTexto))) {
                    // Se a correspondência for encontrada no ID ou no CPF, selecione a linha
                    jTableConsulta.addRowSelectionInterval(row, row);
                    jTableConsulta.scrollRectToVisible(jTableConsulta.getCellRect(row, 0, true));
                }
            }

            if (jTableConsulta.getSelectedRowCount() == 0) {
                JOptionPane.showMessageDialog(this, "Nenhum pedido encontrado com base na pesquisa.", "Informação", JOptionPane.INFORMATION_MESSAGE);
            }
        }
   }catch(Exception e){
       // Se nenhum resultado for encontrado, exibe uma mensagem
    JOptionPane.showMessageDialog(this, "Nenhum pedido encontrado com base na pesquisa.", "Informação", JOptionPane.INFORMATION_MESSAGE);
   }
    }//GEN-LAST:event_jButtonProcurarActionPerformed

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
            java.util.logging.Logger.getLogger(jFrameConsultarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameConsultarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameConsultarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameConsultarPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameConsultarPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonProcurar;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JTable jTableConsulta;
    private javax.swing.JTextField jTextIDbusca;
    // End of variables declaration//GEN-END:variables
}
