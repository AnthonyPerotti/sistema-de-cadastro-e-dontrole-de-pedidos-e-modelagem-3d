/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package impressao3d;

import java.awt.Image;
import java.awt.List;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class jFrameCadastrarPedido extends javax.swing.JFrame {
    FiltroArqFoto filtro = new FiltroArqFoto();
    
    DefaultTableModel tabelaModelado;
    DefaultTableModel tabelaClientes;
    
    Cliente cliente;
    Pedidos pedido;
    PedidoMaterialEspecial pedidoEspecial;
    PedidoExterno externo ;
    PedidoModelagemZero modelZero ;
    jFrameConsultarPedidos consultarPedidos;
    
    ListarPedidos listaPedidos = new ListarPedidos();
    ArrayList<Pedidos> listaModelado = new ArrayList<>();
    ArrayList<PedidosTotais> listaTotal = new ArrayList<>();
    
    
    public jFrameCadastrarPedido() {
        initComponents();
        jFileChooser1.setFileFilter(filtro);
        tabelaModelado = (DefaultTableModel) jTable1.getModel();
        tabelaClientes = (DefaultTableModel) jTable2.getModel();
        buttonGroup2.add(jRadioMatEspecial);
        buttonGroup2.add(jRadioMatNormal);
       
    }

    private void lerModelagens() throws IOException {
        String molde;
        try {
            FileReader arqLe = new FileReader("Moldes.txt");
            BufferedReader br = new BufferedReader(arqLe);
            while ((molde = br.readLine()) != null) {
                String campos[] = molde.split(";");
                tabelaModelado.addRow(campos);
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Erro ao ler o arquivo", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void lerClientes() throws IOException {
        String molde;
        try {
            FileReader arqLe = new FileReader("Clientes.txt");
            BufferedReader br = new BufferedReader(arqLe);

            while ((molde = br.readLine()) != null) {
                String campos[] = molde.split(";");
                tabelaClientes.addRow(campos);
            }
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(this, "Erro ao ler o arquivo", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        jFileChooser2 = new javax.swing.JFileChooser();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelPedido = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextAltura = new javax.swing.JTextField();
        jFormattedDataEntrega = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextObs = new javax.swing.JTextPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextComprimento = new javax.swing.JTextField();
        jTextVolume = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextPeso = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextTempoImpressao = new javax.swing.JTextField();
        jLabelFoto = new javax.swing.JLabel();
        jButtonSelFoto = new javax.swing.JButton();
        jRadioExterno = new javax.swing.JRadioButton();
        jRadioZero = new javax.swing.JRadioButton();
        jRadioMatNormal = new javax.swing.JRadioButton();
        jRadioMatEspecial = new javax.swing.JRadioButton();
        jComboMaterialNormal = new javax.swing.JComboBox<>();
        jComboMaterialEspecial = new javax.swing.JComboBox<>();
        jTextTaxaMaterial = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextTempoModelagem = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jTextTaxaModelagem = new javax.swing.JTextField();
        jTextNomeMolde = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jTextValor = new javax.swing.JTextField();
        jTextTaxaEnvio = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        jPanelModelado = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonRemoveMolde = new javax.swing.JButton();
        jButtonAltMolde = new javax.swing.JButton();
        jButtonAdcMolde = new javax.swing.JButton();
        jButtonSalvarTxtMolde = new javax.swing.JButton();
        jPanelEndereço = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jTextRua = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jTextCidade = new javax.swing.JTextField();
        jTextEstado = new javax.swing.JTextField();
        jButtonSalva = new javax.swing.JButton();
        jFormattedCPF = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextNomeCliente1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextContato = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jTextEmail = new javax.swing.JTextField();
        jTextNumero = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jFormattedCEP = new javax.swing.JFormattedTextField();
        jTextBairro = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButtonSalvarCliente = new javax.swing.JButton();
        jButtonAlterarCliente = new javax.swing.JButton();
        jButtonRemoveCliente = new javax.swing.JButton();
        jButtonAdcCliente = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Cadastrar pedidos:");

        jLabel2.setText("Tamanho da altura desejada:");

        try {
            jFormattedDataEntrega.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel6.setText("Data esperada para entrega:");

        jScrollPane1.setViewportView(jTextObs);

        jLabel5.setText("Observações:");

        jLabel7.setText("ID do pedido:");

        jLabel3.setText("Comprimento:");

        jLabel10.setText("Volume:");

        jLabel11.setText("Peso:");

        jLabel12.setText("Material:");

        jLabel13.setText("Tempo de impressão:");

        jLabelFoto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButtonSelFoto.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        jButtonSelFoto.setText("Selecionar foto");
        jButtonSelFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSelFotoActionPerformed(evt);
            }
        });

        jRadioExterno.setText("Externo");
        jRadioExterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioExternoActionPerformed(evt);
            }
        });

        jRadioZero.setText("Modelagem do zero");
        jRadioZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioZeroActionPerformed(evt);
            }
        });

        jRadioMatNormal.setText("Material normal");
        jRadioMatNormal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMatNormalActionPerformed(evt);
            }
        });

        jRadioMatEspecial.setText("Material Especial");
        jRadioMatEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioMatEspecialActionPerformed(evt);
            }
        });

        jComboMaterialEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboMaterialEspecialActionPerformed(evt);
            }
        });

        jLabel26.setText("Taxa do Material:");

        jLabel27.setText("Tempo de modelagem (em horas):");

        jLabel28.setText("Taxa da Modelagem:");

        jLabel21.setText("Nome da modelagem:");

        jLabel29.setText("Valor de impressão:");

        jLabel30.setText("Taxa da Envio:");

        javax.swing.GroupLayout jPanelPedidoLayout = new javax.swing.GroupLayout(jPanelPedido);
        jPanelPedido.setLayout(jPanelPedidoLayout);
        jPanelPedidoLayout.setHorizontalGroup(
            jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPedidoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPedidoLayout.createSequentialGroup()
                        .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNomeMolde, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelPedidoLayout.createSequentialGroup()
                                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextAltura, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelPedidoLayout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(260, 260, 260))))
                    .addGroup(jPanelPedidoLayout.createSequentialGroup()
                        .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFormattedDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextTempoImpressao, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelPedidoLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonSelFoto))
                            .addGroup(jPanelPedidoLayout.createSequentialGroup()
                                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelPedidoLayout.createSequentialGroup()
                                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanelPedidoLayout.createSequentialGroup()
                                        .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioMatNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jRadioMatEspecial))
                                    .addGroup(jPanelPedidoLayout.createSequentialGroup()
                                        .addComponent(jComboMaterialNormal, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addComponent(jComboMaterialEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextTaxaMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanelPedidoLayout.createSequentialGroup()
                                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextTaxaModelagem, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextTempoModelagem, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel27)
                                            .addComponent(jTextTaxaEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioExterno, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jRadioZero, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addContainerGap())))
            .addGroup(jPanelPedidoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanelPedidoLayout.setVerticalGroup(
            jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPedidoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPedidoLayout.createSequentialGroup()
                        .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioExterno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextNomeMolde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jTextComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPedidoLayout.createSequentialGroup()
                        .addComponent(jLabel30)
                        .addGap(9, 9, 9)
                        .addComponent(jTextTaxaEnvio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioZero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextTempoModelagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPedidoLayout.createSequentialGroup()
                        .addComponent(jTextVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jTextPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPedidoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel28)
                        .addGap(9, 9, 9)
                        .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioMatEspecial)
                            .addComponent(jLabel26)
                            .addComponent(jTextTaxaModelagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPedidoLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioMatNormal)))
                .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelPedidoLayout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jButtonSelFoto)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPedidoLayout.createSequentialGroup()
                        .addGroup(jPanelPedidoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboMaterialNormal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboMaterialEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextTaxaMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jTextTempoImpressao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedDataEntrega, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jTextValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147))
        );

        jTabbedPane1.addTab("Pedido", jPanelPedido);

        jLabel4.setText("Selecione o molde:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "ID", "Altura", "Comprimento", "Peso", "Volume", "Tempo de impressão", "Material", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jButtonRemoveMolde.setText("Remover modelagem");
        jButtonRemoveMolde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveMoldeActionPerformed(evt);
            }
        });

        jButtonAltMolde.setText("Alterar modelagem");
        jButtonAltMolde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltMoldeActionPerformed(evt);
            }
        });

        jButtonAdcMolde.setText("Adicionar modelagem");
        jButtonAdcMolde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdcMoldeActionPerformed(evt);
            }
        });

        jButtonSalvarTxtMolde.setBackground(new java.awt.Color(255, 102, 0));
        jButtonSalvarTxtMolde.setText("Salvar ");
        jButtonSalvarTxtMolde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarTxtMoldeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelModeladoLayout = new javax.swing.GroupLayout(jPanelModelado);
        jPanelModelado.setLayout(jPanelModeladoLayout);
        jPanelModeladoLayout.setHorizontalGroup(
            jPanelModeladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModeladoLayout.createSequentialGroup()
                .addGroup(jPanelModeladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanelModeladoLayout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanelModeladoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAdcMolde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSalvarTxtMolde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12)
                .addComponent(jButtonAltMolde)
                .addGap(18, 18, 18)
                .addComponent(jButtonRemoveMolde)
                .addGap(53, 53, 53))
        );
        jPanelModeladoLayout.setVerticalGroup(
            jPanelModeladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelModeladoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanelModeladoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonRemoveMolde)
                    .addComponent(jButtonAltMolde)
                    .addComponent(jButtonAdcMolde)
                    .addComponent(jButtonSalvarTxtMolde))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(272, 272, 272))
        );

        jTabbedPane1.addTab("Pedido Modelado", jPanelModelado);

        jLabel17.setText("Rua:");

        jLabel18.setText("CEP:");

        jLabel19.setText("Cidade:");

        jLabel20.setText("Estado:");

        jButtonSalva.setBackground(new java.awt.Color(255, 102, 51));
        jButtonSalva.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonSalva.setText("Salvar pedido");
        jButtonSalva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvaActionPerformed(evt);
            }
        });

        try {
            jFormattedCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel8.setText("CPF:");

        jLabel9.setText("Nome cliente:");

        jLabel22.setText("Contato:");

        jLabel23.setText("E-mail:");

        jLabel24.setText("Número:");

        try {
            jFormattedCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel25.setText("Bairro");

        jLabel14.setText("Clientes cadastrados:");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Contato", "E-mail", "Rua", "Número", "CEP", "Bairro", "Cidade", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jButtonSalvarCliente.setBackground(new java.awt.Color(255, 102, 0));
        jButtonSalvarCliente.setText("Salvar");
        jButtonSalvarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarClienteActionPerformed(evt);
            }
        });

        jButtonAlterarCliente.setText("Alterar cliente");
        jButtonAlterarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAlterarClienteActionPerformed(evt);
            }
        });

        jButtonRemoveCliente.setText("Remover cliente");
        jButtonRemoveCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveClienteActionPerformed(evt);
            }
        });

        jButtonAdcCliente.setText("Adicionar cliente");
        jButtonAdcCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdcClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelEndereçoLayout = new javax.swing.GroupLayout(jPanelEndereço);
        jPanelEndereço.setLayout(jPanelEndereçoLayout);
        jPanelEndereçoLayout.setHorizontalGroup(
            jPanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEndereçoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelEndereçoLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButtonSalva, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(jPanelEndereçoLayout.createSequentialGroup()
                        .addGroup(jPanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelEndereçoLayout.createSequentialGroup()
                                .addGroup(jPanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(jTextBairro)
                                    .addComponent(jTextNomeCliente1)
                                    .addComponent(jTextRua)
                                    .addComponent(jTextEmail))
                                .addGap(36, 36, 36)
                                .addGroup(jPanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedCPF, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(jTextContato)
                                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextNumero)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFormattedCEP)
                                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextEstado)))
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelEndereçoLayout.createSequentialGroup()
                                .addComponent(jButtonAdcCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonSalvarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonAlterarCliente)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonRemoveCliente)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelEndereçoLayout.setVerticalGroup(
            jPanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelEndereçoLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelEndereçoLayout.createSequentialGroup()
                        .addGroup(jPanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelEndereçoLayout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextNomeCliente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelEndereçoLayout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextContato, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addComponent(jLabel23)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEndereçoLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEndereçoLayout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEndereçoLayout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEndereçoLayout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEndereçoLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFormattedCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelEndereçoLayout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelEndereçoLayout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTextEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanelEndereçoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAlterarCliente)
                    .addComponent(jButtonRemoveCliente)
                    .addComponent(jButtonAdcCliente)
                    .addComponent(jButtonSalvarCliente))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonSalva, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        jTabbedPane1.addTab("Informações do cliente", jPanelEndereço);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/impressao3d/icons/logo60.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 634, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel15)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel15))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 742, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultComboBoxModel<String> comboModelMN = (DefaultComboBoxModel<String>) jComboMaterialNormal.getModel();
         DefaultComboBoxModel<String> comboModelME = (DefaultComboBoxModel<String>) jComboMaterialEspecial.getModel();
        jTextTaxaMaterial.setEnabled(false);
        jTextTempoModelagem.setEnabled(false);
        jTextTaxaModelagem.setEnabled(false);
        jButtonRemoveMolde.setEnabled(false);
        jButtonAltMolde.setEnabled(false);
        jButtonRemoveCliente.setEnabled(false);
        jButtonAlterarCliente.setEnabled(false);
        jComboMaterialEspecial.setEnabled(false);
        jComboMaterialNormal.setEnabled(false);
        jTextTaxaEnvio.setEnabled(false);

        try {
            this.lerModelagens();
            this.lerClientes();

            comboModelMN.addElement("ABS");
            comboModelMN.addElement("PLA");
            comboModelMN.addElement("PETG");
            comboModelME.addElement("PC");
            comboModelME.addElement("Nylon");
            comboModelME.addElement("PC-ABS");
            comboModelME.addElement("PC-ISSO");
            comboModelME.addElement("PSU");

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao ler arquivo!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_formWindowOpened

    private void jRadioZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioZeroActionPerformed
        if (jRadioZero.isSelected()) {
            jTextTempoModelagem.setEnabled(true);
            jTextTaxaModelagem.setEnabled(true);

        } else {
            jTextTempoModelagem.setEnabled(false);
            jTextTaxaModelagem.setEnabled(false);

        }
    }//GEN-LAST:event_jRadioZeroActionPerformed

    private void jButtonSelFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSelFotoActionPerformed
        String nomeArquivo = "";
        jFileChooser1.setDialogTitle("Abrir foto");
        int result = jFileChooser1.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            nomeArquivo = jFileChooser1.getSelectedFile().getAbsolutePath();
            try {
                File file = new File(nomeArquivo);
                BufferedImage bImag = ImageIO.read(file);
                Image image = bImag.getScaledInstance(
                        jLabelFoto.getWidth(), jLabelFoto.getHeight(), Image.SCALE_DEFAULT);
                ImageIcon icon = new ImageIcon(image);
                jLabelFoto.setIcon(icon);
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Erro ao ler arquivo", "ERROR", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jButtonSelFotoActionPerformed

    private void jButtonAdcMoldeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdcMoldeActionPerformed
        
       String ID = jTextID.getText();
       int linha = tabelaModelado.getRowCount(), i = 0;
       boolean IDExiste = false;
       try{ if (jTextNomeMolde.getText().equals("")
                    || jTextID.getText().equals("")
                    || jTextAltura.getText().equals("")
                    || jTextComprimento.getText().equals("")
                    || jTextPeso.getText().equals("")
                    || jTextTempoImpressao.getText().equals("")
                    || jTextVolume.getText().equals("")) {
                throw new PreencherLista("erro!");
            }else {
           double valor =Double.parseDouble(jTextValor.getText()) ;
            try { for ( i = 0; i < linha; i++) {
                String IDTabela = (String) tabelaModelado.getValueAt(i, 1);
                if (IDTabela.equals(ID)) {
                    IDExiste = true;}}
            if (IDExiste) {
                JOptionPane.showMessageDialog(this, "O ID digitado já existe, insira outro código!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                jTextID.setText("");
            } else {
                String material="";
        if (jRadioMatNormal.isSelected()){
            material = (String) jComboMaterialNormal.getSelectedItem();
        }
        if (jRadioMatEspecial.isSelected()){
            material = (String) jComboMaterialEspecial.getSelectedItem();
            double taxaMat=(1+(Double.parseDouble(jTextTaxaMaterial.getText())/100));
            valor =  Double.parseDouble(jTextValor.getText()) *taxaMat;
        }
        if(jRadioExterno.isSelected()){
            valor =  Double.parseDouble(jTextValor.getText())+Double.parseDouble(jTextTaxaEnvio.getText());
        }
        if(jRadioZero.isSelected()){
             double taxaMol=(1+(Double.parseDouble(jTextTaxaModelagem.getText())/100));
            valor =  Double.parseDouble(jTextValor.getText()) *taxaMol ;
        }
        if( jRadioMatEspecial.isSelected() && jRadioExterno.isSelected() ){
              
        double taxaMat=(1+(Double.parseDouble(jTextTaxaMaterial.getText())/100));
            valor =  Double.parseDouble(jTextValor.getText()) *taxaMat +Double.parseDouble(jTextTaxaEnvio.getText());
        }
        if(jRadioZero.isSelected() && jRadioExterno.isSelected()){
             double taxaMol=(1+(Double.parseDouble(jTextTaxaModelagem.getText())/100));
            valor =  Double.parseDouble(jTextValor.getText()) *taxaMol +Double.parseDouble(jTextTaxaEnvio.getText()) ;
        }
         if(jRadioZero.isSelected() && jRadioMatEspecial.isSelected()){
              double taxaMol=(1+(Double.parseDouble(jTextTaxaModelagem.getText())/100));
        double taxaMat=(1+(Double.parseDouble(jTextTaxaMaterial.getText())/100));
            valor =  Double.parseDouble(jTextValor.getText()) *taxaMol *taxaMat;
        }
          if(jRadioZero.isSelected() && jRadioMatEspecial.isSelected() && jRadioExterno.isSelected()){
              double taxaMol=(1+(Double.parseDouble(jTextTaxaModelagem.getText())/100));
        double taxaMat=(1+(Double.parseDouble(jTextTaxaMaterial.getText())/100));
            valor =  Double.parseDouble(jTextValor.getText()) *taxaMol *taxaMat + Double.parseDouble(jTextTaxaEnvio.getText());
        }
            pedido = new Pedidos(jTextNomeMolde.getText(), Integer.parseInt(jTextID.getText()), 
                    Double.parseDouble(jTextAltura.getText()), Double.parseDouble(jTextComprimento.getText()),
                    Double.parseDouble(jTextPeso.getText()), Double.parseDouble(jTextVolume.getText()),
                    jTextTempoImpressao.getText(),jLabelFoto.getText(), jFormattedDataEntrega.getText(),jTextObs.getText(), material, valor);
            
            tabelaModelado.addRow(new String[]{pedido.getNomeModelagem(),String.valueOf(pedido.getId()) ,
                String.valueOf(pedido.getAltura()),String.valueOf(pedido.getComprimento()),String.valueOf(pedido.getPeso()),
                String.valueOf(pedido.getVolume()),pedido.getTempoImpressao(),pedido.getMaterial(), String.valueOf(pedido.getValor())});
            // Adicione o objeto à coleção listaModelado
        listaModelado.add(pedido);

        }
             } catch (Exception ex) {
                JOptionPane.showMessageDialog(this, "Erro ao adicionar na tabela!\nTente novamente!", "ERRO", JOptionPane.ERROR_MESSAGE);}
          }}catch(PreencherLista pl){
           JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Informação", JOptionPane.INFORMATION_MESSAGE); }
     

    }//GEN-LAST:event_jButtonAdcMoldeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
            jButtonRemoveMolde.setEnabled(true);
            jButtonAltMolde.setEnabled(true);
            int linha = jTable1.getSelectedRow();
            jTextNomeMolde.setText((String) jTable1.getValueAt(linha, 0));
             jTextID.setText((String) jTable1.getValueAt(linha, 1));
             jTextAltura.setText((String) jTable1.getValueAt(linha, 2));
             jTextComprimento.setText((String) jTable1.getValueAt(linha, 3));
             jTextPeso.setText((String) jTable1.getValueAt(linha, 4));
             jTextVolume.setText((String) jTable1.getValueAt(linha, 5));
             jTextTempoImpressao.setText((String) jTable1.getValueAt(linha, 6));
           
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButtonSalvarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarClienteActionPerformed
       int linha = tabelaClientes.getRowCount();
        int i = 0;
        try{
        if (linha == 0) {
              throw new SemCadastro("erro!");
        } else {
            try {
                FileWriter arquivo = new FileWriter("Clientes.txt", false);
                PrintWriter arq = new PrintWriter(arquivo);
                do {
                    arq.println(tabelaClientes.getValueAt(i, 0) + ";" + tabelaClientes.getValueAt(i, 1) + ";" + tabelaClientes.getValueAt(i, 2)
                            + ";" + tabelaClientes.getValueAt(i, 3) + ";" + tabelaClientes.getValueAt(i, 4) + ";" + tabelaClientes.getValueAt(i, 5)
                            + ";" + tabelaClientes.getValueAt(i, 6) + ";" + tabelaClientes.getValueAt(i, 7) + ";" + tabelaClientes.getValueAt(i, 8)
                            + ";" + tabelaClientes.getValueAt(i, 9));
                    i++;

                } while (i != linha);

                arq.close();
                arquivo.close();
            JOptionPane.showMessageDialog(this, "Informações salvas com sucesso no arquivo Clientes.txt.", "Informação",JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar!\nTente novamente!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }catch(SemCadastro SM){
                JOptionPane.showMessageDialog(this, "Não há clientes para salvar!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }

    }//GEN-LAST:event_jButtonSalvarClienteActionPerformed

    private void jRadioMatEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMatEspecialActionPerformed
         if (jRadioMatEspecial.isSelected()) {
          jTextTaxaMaterial.setEnabled(true);
          jComboMaterialEspecial.setEnabled(true);
        } else {
          jTextTaxaMaterial.setEnabled(false);
           jComboMaterialEspecial.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioMatEspecialActionPerformed

    private void jButtonAltMoldeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltMoldeActionPerformed
        jButtonRemoveMolde.setEnabled(true);
        jButtonAltMolde.setEnabled(true);  
        int linha = jTable1.getSelectedRow();    
        String material="";
        double valor = Double.parseDouble(jTextValor.getText()) ;
         int idPedido = Integer.parseInt(jTable1.getValueAt(linha, 1).toString());
  
         if (jRadioMatNormal.isSelected()){
            material = (String) jComboMaterialNormal.getSelectedItem();
            valor =  valor;  
        }
        if (jRadioMatEspecial.isSelected()){
            material = (String) jComboMaterialEspecial.getSelectedItem();
            double taxaMat=(1+(Double.parseDouble(jTextTaxaMaterial.getText())/100));
            valor =  valor *taxaMat;  
        }
        if(jRadioExterno.isSelected()){
            valor =  valor+Double.parseDouble(jTextTaxaEnvio.getText());
        }
        if(jRadioZero.isSelected()){
             double taxaMol=(1+(Double.parseDouble(jTextTaxaModelagem.getText())/100));
            valor =  valor *taxaMol ;
        }
        if( jRadioMatEspecial.isSelected() && jRadioExterno.isSelected() ){
              
        double taxaMat=(1+(Double.parseDouble(jTextTaxaMaterial.getText())/100));
            valor =  valor*taxaMat +Double.parseDouble(jTextTaxaEnvio.getText());
        }
        if(jRadioZero.isSelected() && jRadioExterno.isSelected()){
             double taxaMol=(1+(Double.parseDouble(jTextTaxaModelagem.getText())/100));
            valor =  valor *taxaMol +Double.parseDouble(jTextTaxaEnvio.getText()) ;
        }
         if(jRadioZero.isSelected() && jRadioMatEspecial.isSelected()){
              double taxaMol=(1+(Double.parseDouble(jTextTaxaModelagem.getText())/100));
        double taxaMat=(1+(Double.parseDouble(jTextTaxaMaterial.getText())/100));
            valor =  valor *taxaMol *taxaMat;
        }
          if(jRadioZero.isSelected() && jRadioMatEspecial.isSelected() && jRadioExterno.isSelected()){
              double taxaMol=(1+(Double.parseDouble(jTextTaxaModelagem.getText())/100));
        double taxaMat=(1+(Double.parseDouble(jTextTaxaMaterial.getText())/100));
            valor =  valor *taxaMol *taxaMat + Double.parseDouble(jTextTaxaEnvio.getText());
        }
        try{ if (jTextNomeMolde.getText().equals("")
                || jTextAltura.getText().equals("")
                || jTextID.getText().equals("")
                || jTextPeso.getText().equals("")
                || jTextVolume.getText().equals("")
                || jTextTempoImpressao.getText().equals("")
                || jTextComprimento.getText().equals("")
                || jTextValor.getText().equals("")) {
                throw new PreencherLista("erro!");
            }
         else {
             
           jTable1.setValueAt(jTextNomeMolde.getText(), linha, 0);
            jTable1.setValueAt(jTextID.getText(), linha, 1);
            jTable1.setValueAt(jTextAltura.getText(), linha, 2);
            jTable1.setValueAt(jTextComprimento.getText(), linha, 3);
            jTable1.setValueAt(jTextPeso.getText(), linha, 4);
            jTable1.setValueAt(jTextVolume.getText(), linha, 5);
            jTable1.setValueAt(jTextTempoImpressao.getText(), linha, 6);
            jTable1.setValueAt(material, linha, 7);
            jTable1.setValueAt(String.valueOf(valor), linha, 8);
            
            for (Pedidos pedido : listaModelado) {
            if (pedido.getId() == idPedido) {
                
                // Atualize os atributos do objeto
                pedido.setNomeModelagem(jTextNomeMolde.getText());
                pedido.setAltura(Double.parseDouble(jTextAltura.getText()));
                pedido.setComprimento(Double.parseDouble(jTextComprimento.getText()));
                pedido.setPeso(Double.parseDouble(jTextPeso.getText()));
                pedido.setVolume(Double.parseDouble(jTextVolume.getText()));
                pedido.setTempoImpressao(jTextTempoImpressao.getText());
                pedido.setMaterial(material);
                pedido.setValor(valor);
                continue;
            }
        }
        try{
        BufferedReader br = new BufferedReader(new FileReader("ListaPedidos.txt"));
        String line;
        StringBuilder fileContent = new StringBuilder();

        while ((line = br.readLine()) != null) {
            String[] parts = line.split(";");
            int id = Integer.parseInt(parts[0]);
            if (id == idPedido) {
                // Atualize os dados da linha correspondente
                parts[1] = jTextNomeMolde.getText();
                parts[2] = jTextAltura.getText();
                parts[3] = jTextComprimento.getText();
                parts[4] = jTextPeso.getText();
                parts[5] = jTextVolume.getText();
                parts[9] = material;
                parts[11] = jTextTempoImpressao.getText();
                parts[13] = String.valueOf(valor);
               
                line = String.join(";", parts);
            }
            fileContent.append(line).append(System.lineSeparator());
        }
        br.close();
        
        BufferedWriter bw = new BufferedWriter(new FileWriter("ListaPedidos.txt"));
        bw.write(fileContent.toString());
        bw.close();
        
            jTextNomeMolde.setText("");
            jTextAltura.setText("");
            jTextID.setText("");
            jTextPeso.setText("");
            jTextVolume.setText("");
            jTextTempoImpressao.setText("");
            jTextComprimento.setText("");
            jTextValor.setText("");
            jFormattedDataEntrega.setText("");
            jTextObs.setText("");
            jTextTaxaMaterial.setText("");
            jTextTaxaModelagem.setText("");
            jTextTempoModelagem.setText("");
            jButtonRemoveMolde.setEnabled(false);
            jButtonAltMolde.setEnabled(false);
        }catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erro ao atualizar os dados.", "Erro", JOptionPane.ERROR_MESSAGE);
    }  }}
        catch(PreencherLista pl){
           JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Informação", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_jButtonAltMoldeActionPerformed

    private void jButtonRemoveMoldeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveMoldeActionPerformed
        int linha = jTable1.getSelectedRow();
        int idPedido = Integer.parseInt(jTable1.getValueAt(linha, 1).toString());
        if (linha  >= 0) {
            for (Pedidos pedido : listaModelado) {
            if (pedido.getId() == idPedido) {
              listaModelado.remove(pedido);
                continue;
            }
        }
            tabelaModelado.removeRow(linha);
            jButtonRemoveMolde.setEnabled(false);
            jButtonAltMolde.setEnabled(false);
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para excluir!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
         int i = 0;
       try{
        if (linha == 0) {
            throw new SemCadastro("erro!");
        } else {
            try {
                FileWriter arquivo = new FileWriter("Moldes.txt", false);
                PrintWriter arq = new PrintWriter(arquivo);
                do {
                    arq.println(tabelaModelado.getValueAt(i, 0) + ";" + tabelaModelado.getValueAt(i, 1) + ";" + tabelaModelado.getValueAt(i, 2)
                            + ";" + tabelaModelado.getValueAt(i, 3) + ";" + tabelaModelado.getValueAt(i, 4) +";"+tabelaModelado.getValueAt(i, 5) + ";" +
                            tabelaModelado.getValueAt(i, 6) + ";" + tabelaModelado.getValueAt(i, 7)
                            + ";" + tabelaModelado.getValueAt(i, 8)) ;
                    i++;

                } while (i != linha);

                arq.close();
                arquivo.close();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar!\nTente novamente!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
       }catch(SemCadastro SM){
                JOptionPane.showMessageDialog(this, "Não há moldes para salvar!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jButtonRemoveMoldeActionPerformed

    private void jButtonAlterarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAlterarClienteActionPerformed
        int linha= jTable2.getSelectedRow();
        String CPFCliente = jTable2.getValueAt(linha, 1).toString();
        try{
        if (jTextNomeCliente1.getText().equals("")
                || jTextBairro.getText().equals("")
                || jTextCidade.getText().equals("")
                || jTextRua.getText().equals("")
                || jTextCidade.getText().equals("")
                || jTextContato.getText().equals("")
                || jTextEmail.getText().equals("")
                || jTextEstado.getText().equals("")
                || jTextNumero.getText().equals("")
                || jFormattedCPF.getText().trim().length() == 9
                || jFormattedCEP.getText().trim().length() ==1) {
                throw new PreencherLista("erro!");
            }
         else {
            jTable2.setValueAt(jTextNomeCliente1.getText(), linha, 0);
            jTable2.setValueAt(jFormattedCPF.getText(), linha, 1);
            jTable2.setValueAt(jTextContato.getText(), linha, 2);
            jTable2.setValueAt(jTextEmail.getText(), linha, 3);
            jTable2.setValueAt(jTextRua.getText(), linha, 4);
            jTable2.setValueAt(jTextNumero.getText(), linha, 5);
            jTable2.setValueAt(jFormattedCEP.getText(), linha, 6);
            jTable2.setValueAt(jTextBairro.getText(), linha, 7);
            jTable2.setValueAt(jTextCidade.getText(), linha, 8);
            jTable2.setValueAt(jTextEstado.getText(), linha, 9);
         try{
        BufferedReader br = new BufferedReader(new FileReader("ListaPedidos.txt"));
        String line;
        StringBuilder fileContent = new StringBuilder();
        while ((line = br.readLine()) != null) {
            String[] parts = line.split(";");
            String id = parts[15];

            if (id.equals(CPFCliente) ) {
                parts[14] = jTextNomeCliente1.getText();
                parts[15] = jFormattedCPF.getText();
                parts[16] = jTextContato.getText();
                line = String.join(";", parts);
            }
            fileContent.append(line).append(System.lineSeparator());
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("ListaPedidos.txt"));
        bw.write(fileContent.toString());
        bw.close();
            jTextNomeCliente1.setText("");
            jTextBairro.setText("");
            jTextCidade.setText("");
            jTextContato.setText("");
            jTextEmail.setText("");
            jTextEstado.setText("");
            jTextNumero.setText("");
            jFormattedCPF.setText("");
            jTextRua.setText("");
            jFormattedCEP.setText("");
            jButtonRemoveCliente.setEnabled(false);
            jButtonAlterarCliente.setEnabled(false);
         } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Erro ao atualizar os dados.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
        } }catch(PreencherLista pl){
           JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Informação", JOptionPane.INFORMATION_MESSAGE);
       }
    }//GEN-LAST:event_jButtonAlterarClienteActionPerformed

    private void jButtonRemoveClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveClienteActionPerformed
         int linha = jTable2.getSelectedRow();
        
        if (jTable2.getSelectedRow() >= 0) {
            tabelaClientes.removeRow(linha);
            jButtonRemoveCliente.setEnabled(false);
            jButtonAlterarCliente.setEnabled(false);
            
        } else {
            JOptionPane.showMessageDialog(this, "Selecione uma linha para excluir!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        
         int i = 0;
        try{
        if (linha == 0) {
            throw new SemCadastro("erro!");
        } else {
            try {
                FileWriter arquivo = new FileWriter("Clientes.txt", false);
                PrintWriter arq = new PrintWriter(arquivo);
                do {
                    arq.println(tabelaClientes.getValueAt(i, 0) + ";" + tabelaClientes.getValueAt(i, 1) + ";" + tabelaClientes.getValueAt(i, 2)
                            + ";" + tabelaClientes.getValueAt(i, 3) + ";" + tabelaClientes.getValueAt(i, 4) +";"+tabelaClientes.getValueAt(i, 5) + ";" +
                            tabelaClientes.getValueAt(i, 6) + ";" + tabelaClientes.getValueAt(i, 7)
                            + ";" + tabelaClientes.getValueAt(i, 8)+ ";" + tabelaClientes.getValueAt(i, 9)) ;
                    i++;

                } while (i != linha);

                arq.close();
                arquivo.close();

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar!\nTente novamente!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
         }catch(SemCadastro SM){
                JOptionPane.showMessageDialog(this, "Não há clientes para salvar!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jButtonRemoveClienteActionPerformed

    private void jButtonSalvaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvaActionPerformed
         String material = "";
         String nomeArq ="";
         int flag=0;
         int linha = tabelaClientes.getRowCount();
        double valor =0 ;
        
        if (jRadioMatNormal.isSelected()){
            material = (String) jComboMaterialNormal.getSelectedItem();
        }
        if (jRadioMatEspecial.isSelected()){
            material = (String) jComboMaterialEspecial.getSelectedItem();
            double taxaMat=(1+(Double.parseDouble(jTextTaxaMaterial.getText())/100));
            valor =  Double.parseDouble(jTextValor.getText()) *taxaMat;
            
        }
        if(jRadioExterno.isSelected()){
            valor =  Double.parseDouble(jTextValor.getText())+Double.parseDouble(jTextTaxaEnvio.getText());
        }
        if(jRadioZero.isSelected()){
             double taxaMol=(1+(Double.parseDouble(jTextTaxaModelagem.getText())/100));
            valor =  Double.parseDouble(jTextValor.getText()) *taxaMol ;
        }
       
        if( jRadioMatEspecial.isSelected() && jRadioExterno.isSelected() ){
              
        double taxaMat=(1+(Double.parseDouble(jTextTaxaMaterial.getText())/100));
            valor =  Double.parseDouble(jTextValor.getText()) *taxaMat +Double.parseDouble(jTextTaxaEnvio.getText());
        }
        if(jRadioZero.isSelected() && jRadioExterno.isSelected()){
             double taxaMol=(1+(Double.parseDouble(jTextTaxaModelagem.getText())/100));
            valor =  Double.parseDouble(jTextValor.getText()) *taxaMol +Double.parseDouble(jTextTaxaEnvio.getText()) ;
        }
         if(jRadioZero.isSelected() && jRadioMatEspecial.isSelected()){
              double taxaMol=(1+(Double.parseDouble(jTextTaxaModelagem.getText())/100));
        double taxaMat=(1+(Double.parseDouble(jTextTaxaMaterial.getText())/100));
            valor =  Double.parseDouble(jTextValor.getText()) *taxaMol *taxaMat;
        }
          if(jRadioZero.isSelected() && jRadioMatEspecial.isSelected() && jRadioExterno.isSelected()){
              double taxaMol=(1+(Double.parseDouble(jTextTaxaModelagem.getText())/100));
        double taxaMat=(1+(Double.parseDouble(jTextTaxaMaterial.getText())/100));
            valor =  Double.parseDouble(jTextValor.getText()) *taxaMol *taxaMat + Double.parseDouble(jTextTaxaEnvio.getText());
        }
        
        try {
           if (jTextNomeCliente1.getText().equals("") || jTextBairro.getText().equals("")
                || jTextCidade.getText().equals("") || jTextRua.getText().equals("")
                || jTextCidade.getText().equals("") || jTextContato.getText().equals("")
                || jTextEmail.getText().equals("")|| jTextEstado.getText().equals("")
                || jTextNumero.getText().equals("") || jTextNomeMolde.getText().equals("")
                || jTextID.getText().equals("")|| jTextAltura.getText().equals("")
                || jTextComprimento.getText().equals("")|| jTextPeso.getText().equals("")
                || jTextTempoImpressao.getText().equals("")|| jTextVolume.getText().equals("")
                || jFormattedCPF.getText().trim().length() == 9 ||jFormattedCEP.getText().trim().length()==1
                || jTextObs.getText().equals("") ||jFormattedDataEntrega.getText().trim().length()==2) {
                throw new PreencherLista("erro!");
        } else {
              consultarPedidos = new jFrameConsultarPedidos();
            cliente= new Cliente(jTextNomeCliente1.getText(), jTextEmail.getText(), jFormattedCPF.getText(), jTextContato.getText(),
                    jTextRua.getText(), jTextNumero.getText(), jFormattedCEP.getText(), jTextBairro.getText(),
                    jTextCidade.getText(),jTextEstado.getText());
            
            pedido = new Pedidos(jTextNomeMolde.getText(),Integer.parseInt(jTextID.getText()), cliente,
                    Double.parseDouble(jTextAltura.getText()), Double.parseDouble(jTextComprimento.getText()), 
                    Double.parseDouble(jTextPeso.getText()), Double.parseDouble(jTextVolume.getText()),
                    jTextTempoImpressao.getText(),jLabelFoto.getText(), jFormattedDataEntrega.getText(),jTextObs.getText(), material, valor);
             
            FileWriter arquivo = new FileWriter("Pedido - " + cliente.getNome()+"-"+cliente.getCPF()+ ".txt", false);
            PrintWriter arq = new PrintWriter(arquivo);
            arq.append("------------- Informações da Modelagem -------------\n");
            arq.append("ID: " + pedido.getId()+"\n");
            arq.append("Altura: " + pedido.getAltura()+"\n");
            arq.append("Comprimento: " + pedido.getComprimento()+"\n");
            arq.append("Peso: " + pedido.getPeso()+"\n");
            arq.append("Volume: " + pedido.getVolume()+"\n");
             if (jRadioExterno.isSelected()) {
                if (linha != -1) {
                    externo = new PedidoExterno(pedido.getNomeModelagem(), pedido.getId(), cliente,
                        pedido.getAltura(), pedido.getComprimento(), pedido.getPeso(),pedido.getVolume(),
                        pedido.getTempoImpressao(), pedido.getFoto(), pedido.getDataEntrega(), pedido.getObs(),
                        pedido.getMaterial(), pedido.getValor(), Double.parseDouble(jTextTaxaEnvio.getText()));
                    arq.append("Taxa de Envio: : " + externo.getTaxaEnvio()+"\n");
                 
            }
           }
           if (jRadioMatEspecial.isSelected()) {
            pedidoEspecial = new PedidoMaterialEspecial(pedido.getNomeModelagem(), pedido.getId(),
                     cliente, pedido.getAltura(), pedido.getComprimento(), pedido.getPeso(), pedido.getVolume(),
                     jTextTempoImpressao.getText(), pedido.getFoto(), pedido.getDataEntrega(), pedido.getObs(),pedido.getMaterial(),
                     pedido.getValor(), Double.parseDouble(jTextTaxaMaterial.getText()));
             
            
              arq.append("Material:" + pedidoEspecial.getMaterial()+"\n"); 
              arq.append("Taxa do Material: " + pedidoEspecial.getTaxaMaterial()+"\n"); 
           }else if (jRadioMatNormal.isSelected()) {
             arq.append("Material: " + pedido.getMaterial()+"\n"); 
            }
            if (jRadioZero.isSelected()) {
              modelZero = new  PedidoModelagemZero(pedido.getNomeModelagem(), pedido.getId(), cliente,
                     pedido.getAltura(), pedido.getComprimento(), pedido.getPeso(),pedido.getVolume(),
                     pedido.getTempoImpressao(), pedido.getFoto(), pedido.getDataEntrega(), pedido.getObs(),
                     pedido.getMaterial(), pedido.getValor(), jTextTempoModelagem.getText(),  Double.parseDouble(jTextTaxaModelagem.getText()));
             
             
              arq.append("Tempo para o processo de modelagem: " + modelZero.getTempoModeladar()+"\n"); 
              arq.append("Taxa de modelagem: " + modelZero.getTaxaDoTempo()+"\n"); 
           } 
            arq.append("Valor total: " + pedido.getValor()+"\n");
            arq.append("------------- Informações do Cliente -------------\n");
            arq.append("Cliente: " + cliente.getNome()+"\n");
            arq.append("CPF: " + cliente.getCPF()+"\n");
            arq.append("E-mail: " + cliente.getEmail()+"\n");
            arq.append("Contato: " + cliente.getContato()+"\n");
            arq.append("------------- Endereço de Entrega -------------\n");
             arq.append("CEP: " + cliente.getCEP()+"\n");
            arq.append("Rua: " + cliente.getRua()+"\n");
            arq.append("Número: " + cliente.getNumeroCasa()+"\n");
            arq.append("Bairro: " + cliente.getBairro()+"\n");
            arq.append("Cidade: " + cliente.getCidade()+"\n");
            arq.append("Estado: " + cliente.getEstado()+"\n");
          
           
            arq.close();
            arquivo.close();
            JOptionPane.showMessageDialog(this, "Pedido salvo com sucesso!", "Informação", JOptionPane.INFORMATION_MESSAGE);
         String modelar="";
              double    taxatempo= 0.0,taxamat= 0.0,taxaenv= 0.0;
         if (!jTextTempoModelagem.getText().isEmpty()){
              modelar = modelZero.getTempoModeladar();
         }else{
             modelar =" ";
         }
         if (!jTextTaxaModelagem.getText().isEmpty()){
             taxatempo = modelZero.getTaxaDoTempo();
         }else{
             taxatempo =0.0;
         }
          if (!jTextTaxaMaterial.getText().isEmpty()){
              taxamat= pedidoEspecial.getTaxaMaterial();
         }else{
             taxamat =0.0;
         }
         if ( !jTextTaxaEnvio.getText().isEmpty()){
             taxaenv =  externo.getTaxaEnvio();
         }else{
             taxaenv =0.0;
         }
        
           PedidosTotais total  =  new PedidosTotais(pedido.getNomeModelagem(), pedido.getId(), cliente,
                     pedido.getAltura(), pedido.getComprimento(), pedido.getPeso(),pedido.getVolume(),
                     pedido.getTempoImpressao(), pedido.getFoto(), pedido.getDataEntrega(), pedido.getObs(),pedido.getMaterial(),
                   valor, modelar, taxatempo, taxamat,taxaenv);
           listaPedidos.listarTotal(total);
            consultarPedidos.setPedidos(listaPedidos.ListaTotal);
            consultarPedidos.setVisible(true);
             jTextNomeCliente1.setText("");
            jTextBairro.setText("");
            jTextCidade.setText("");
            jTextContato.setText("");
            jTextEmail.setText("");
            jTextEstado.setText("");
            jTextNumero.setText("");
            jFormattedCPF.setText("");
            jTextRua.setText("");
            jFormattedCEP.setText("");
             jTextNomeMolde.setText("");
            jTextAltura.setText("");
            jTextID.setText("");
            jTextPeso.setText("");
            jTextVolume.setText("");
            jTextTempoImpressao.setText("");
            jTextComprimento.setText("");
            jTextValor.setText("");
            jFormattedDataEntrega.setText("");
            jTextObs.setText("");
            jTextTaxaMaterial.setText("");
            jTextTaxaModelagem.setText("");
            jTextTempoModelagem.setText("");
            }
        }catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar!\nTente novamente!", "ERRO", JOptionPane.ERROR_MESSAGE);
        } catch(PreencherLista pl){
           JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Informação", JOptionPane.INFORMATION_MESSAGE);
       }
       
    }//GEN-LAST:event_jButtonSalvaActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
       jButtonRemoveCliente.setEnabled(true);
        jButtonAlterarCliente.setEnabled(true);
        int linha = jTable2.getSelectedRow();
            jTextNomeCliente1.setText((String) jTable2.getValueAt(linha, 0));
             jFormattedCPF.setText((String) jTable2.getValueAt(linha, 1));
             jTextContato.setText((String) jTable2.getValueAt(linha, 2));
             jTextEmail.setText((String) jTable2.getValueAt(linha, 3));
             jTextRua.setText((String) jTable2.getValueAt(linha, 4));
             jTextNumero.setText((String) jTable2.getValueAt(linha, 5));
             jFormattedCEP.setText((String) jTable2.getValueAt(linha, 6));
             jTextBairro.setText((String) jTable2.getValueAt(linha, 7));
             jTextCidade.setText((String) jTable2.getValueAt(linha, 8));
             jTextEstado.setText((String) jTable2.getValueAt(linha, 9));
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButtonSalvarTxtMoldeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarTxtMoldeActionPerformed
        int i = 0;
       int linha = tabelaModelado.getRowCount();
       try{
        if (linha == 0) {
                throw new SemCadastro("erro!");
        } else {
            try {
                FileWriter arquivo = new FileWriter("Moldes.txt", false);
                PrintWriter arq = new PrintWriter(arquivo);
                do {
                    arq.println(tabelaModelado.getValueAt(i, 0) + ";" + tabelaModelado.getValueAt(i, 1) + ";" + tabelaModelado.getValueAt(i, 2)
                            + ";" + tabelaModelado.getValueAt(i, 3) + ";" + tabelaModelado.getValueAt(i, 4) +";"+tabelaModelado.getValueAt(i, 5) + ";" +
                            tabelaModelado.getValueAt(i, 6) + ";" + tabelaModelado.getValueAt(i, 7)
                            + ";" + tabelaModelado.getValueAt(i, 8)) ;
                    i++;

                } while (i != linha);
                
                arq.close();
                arquivo.close();
                JOptionPane.showMessageDialog(this, "Informações salvadas com sucesso no Moldes.txt!", "Informação", JOptionPane.INFORMATION_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao salvar!\nTente novamente!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
       }catch(SemCadastro SM){
                JOptionPane.showMessageDialog(this, "Não há moldes para salvar!", "ERRO", JOptionPane.ERROR_MESSAGE);
            }
    }//GEN-LAST:event_jButtonSalvarTxtMoldeActionPerformed

    private void jButtonAdcClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdcClienteActionPerformed
         String cpf = jFormattedCPF.getText();
        int linha = tabelaClientes.getRowCount();
        boolean cpfExiste = false;
        try{
        if (jTextNomeCliente1.getText().equals("")
                || jTextBairro.getText().equals("")
                || jTextCidade.getText().equals("")
                || jTextRua.getText().equals("")
                || jTextCidade.getText().equals("")
                || jTextContato.getText().equals("")
                || jTextEmail.getText().equals("")
                || jTextEstado.getText().equals("")
                || jTextNumero.getText().equals("")
                || jFormattedCEP.getText().trim().isEmpty()
                || jFormattedCPF.getText().trim().length() == 9
                ||jFormattedCEP.getText().trim().length()==1) {
             
                throw new PreencherLista("erro!");

        } else {
            for (int i = 0; i < linha; i++) {
                String cpfTabela = (String) tabelaClientes.getValueAt(i, 1);
                if (cpfTabela.equals(cpf)) {
                    cpfExiste = true;
                }
            }
            try{
            if (cpfExiste) {
                jFormattedCPF.setText("");
                throw new CPFExiste("erro!");
            } else {
                cliente= new Cliente(jTextNomeCliente1.getText(), jTextEmail.getText(), jFormattedCPF.getText(),
                        jTextContato.getText(), jTextRua.getText(), jTextNumero.getText(), jFormattedCEP.getText(),
                        jTextBairro.getText(), jTextCidade.getText(), jTextEstado.getText());
                
                tabelaClientes.addRow(new String[]{cliente.getNome(), cliente.getCPF(), cliente.getContato(), cliente.getEmail(), 
                    cliente.getRua(), cliente.getNumeroCasa(), cliente.getCEP(), cliente.getBairro(), cliente.getCidade(), cliente.getEstado()});
            }
       
         } catch(CPFExiste CE){
            JOptionPane.showMessageDialog(this, "O CPF digitado já existe, insira outro código!", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        }}catch(PreencherLista pl){
           JOptionPane.showMessageDialog(this, "Preencha todos os campos!", "Informação", JOptionPane.INFORMATION_MESSAGE);
       }
       
        
    }//GEN-LAST:event_jButtonAdcClienteActionPerformed

    private void jRadioMatNormalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioMatNormalActionPerformed
          if (jRadioMatNormal.isSelected()) {
          jComboMaterialNormal.setEnabled(true);
          jTextTaxaMaterial.setEnabled(false);
        } else {
           jComboMaterialNormal.setEnabled(false);
            jTextTaxaMaterial.setEnabled(false);
        }
    }//GEN-LAST:event_jRadioMatNormalActionPerformed

    private void jComboMaterialEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboMaterialEspecialActionPerformed
       if(jRadioMatEspecial.isSelected()){
        if(jComboMaterialEspecial.getSelectedItem()=="Nylon"){
            jTextTaxaMaterial.setText("12");
        }else  if(jComboMaterialEspecial.getSelectedItem()=="PC-ABS"){
            jTextTaxaMaterial.setText("15");
        }else  if(jComboMaterialEspecial.getSelectedItem()=="PC-ISSO"){
            jTextTaxaMaterial.setText("20");
        }else{
             jTextTaxaMaterial.setText("10");
        }
       }
          
    }//GEN-LAST:event_jComboMaterialEspecialActionPerformed

    private void jRadioExternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioExternoActionPerformed
         if (jRadioExterno.isSelected()) {
           jTextTaxaEnvio.setEnabled(true);
        } else{
             jTextTaxaEnvio.setEnabled(false);
         }
    }//GEN-LAST:event_jRadioExternoActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jFrameCadastrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFrameCadastrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFrameCadastrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFrameCadastrarPedido.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jFrameCadastrarPedido().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButtonAdcCliente;
    private javax.swing.JButton jButtonAdcMolde;
    private javax.swing.JButton jButtonAltMolde;
    private javax.swing.JButton jButtonAlterarCliente;
    private javax.swing.JButton jButtonRemoveCliente;
    private javax.swing.JButton jButtonRemoveMolde;
    private javax.swing.JButton jButtonSalva;
    private javax.swing.JButton jButtonSalvarCliente;
    private javax.swing.JButton jButtonSalvarTxtMolde;
    private javax.swing.JButton jButtonSelFoto;
    private javax.swing.JComboBox<String> jComboMaterialEspecial;
    private javax.swing.JComboBox<String> jComboMaterialNormal;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JFormattedTextField jFormattedCEP;
    private javax.swing.JFormattedTextField jFormattedCPF;
    private javax.swing.JFormattedTextField jFormattedDataEntrega;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelFoto;
    private javax.swing.JPanel jPanelEndereço;
    private javax.swing.JPanel jPanelModelado;
    private javax.swing.JPanel jPanelPedido;
    private javax.swing.JRadioButton jRadioExterno;
    private javax.swing.JRadioButton jRadioMatEspecial;
    private javax.swing.JRadioButton jRadioMatNormal;
    private javax.swing.JRadioButton jRadioZero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextAltura;
    private javax.swing.JTextField jTextBairro;
    private javax.swing.JTextField jTextCidade;
    private javax.swing.JTextField jTextComprimento;
    private javax.swing.JTextField jTextContato;
    private javax.swing.JTextField jTextEmail;
    private javax.swing.JTextField jTextEstado;
    private javax.swing.JTextField jTextID;
    private javax.swing.JTextField jTextNomeCliente1;
    private javax.swing.JTextField jTextNomeMolde;
    private javax.swing.JTextField jTextNumero;
    private javax.swing.JTextPane jTextObs;
    private javax.swing.JTextField jTextPeso;
    private javax.swing.JTextField jTextRua;
    private javax.swing.JTextField jTextTaxaEnvio;
    private javax.swing.JTextField jTextTaxaMaterial;
    private javax.swing.JTextField jTextTaxaModelagem;
    private javax.swing.JTextField jTextTempoImpressao;
    private javax.swing.JTextField jTextTempoModelagem;
    private javax.swing.JTextField jTextValor;
    private javax.swing.JTextField jTextVolume;
    // End of variables declaration//GEN-END:variables
}
