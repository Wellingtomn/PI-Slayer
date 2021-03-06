package visao;

import controle.UsuarioC;
import modelo.dominio.No;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Jefferson
 */
public class JFramePrincipal extends javax.swing.JFrame {
    
    // Atributo para acessar a classe de controle Estruturas de Dados
    private UsuarioC listaDE;
    
    // Atributo para criar um modelo de acesso à tabela de dados da interface JFramePrincipal
    private DefaultTableModel dtm;
    
    // Atributo para guardar a escolha de arquivo.
    private JFileChooser jFCEscolherArquivo;
    
    /**
     * Creates new form JFramePrincipal
     */
    public JFramePrincipal() {
        initComponents();
        
         // Posiicionando a tela JFramePrincipal ao centro da tela do usuário
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelLista = new javax.swing.JPanel();
        jBCL = new javax.swing.JButton();
        jBLL = new javax.swing.JButton();
        jPanelDados = new javax.swing.JPanel();
        jLCodigo = new javax.swing.JLabel();
        jLNome = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jLCodigoNovo = new javax.swing.JLabel();
        jTFNovoCodigo = new javax.swing.JTextField();
        jLPosicao = new javax.swing.JLabel();
        jTFPosicao = new javax.swing.JTextField();
        jPanelOperacoes = new javax.swing.JPanel();
        jBInserir = new javax.swing.JButton();
        jBRemover = new javax.swing.JButton();
        jBAlterar = new javax.swing.JButton();
        jBPesquisar = new javax.swing.JButton();
        jBAcessar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableDados = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jBLerCSV = new javax.swing.JButton();
        jBEscreverCSV = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBGravarBD = new javax.swing.JButton();
        jBSelecionarBD = new javax.swing.JButton();
        jBAlterarBD = new javax.swing.JButton();
        jBDeletarBD = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estruturas de Dados");

        jPanelLista.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jBCL.setText("Criar lista");
        jBCL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCLActionPerformed(evt);
            }
        });

        jBLL.setText("Limpar lista");
        jBLL.setEnabled(false);
        jBLL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLLActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelListaLayout = new javax.swing.GroupLayout(jPanelLista);
        jPanelLista.setLayout(jPanelListaLayout);
        jPanelListaLayout.setHorizontalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBLL, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
            .addComponent(jBCL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelListaLayout.setVerticalGroup(
            jPanelListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListaLayout.createSequentialGroup()
                .addComponent(jBCL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBLL))
        );

        jPanelDados.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLCodigo.setText("Código:");

        jLNome.setText("Nome:");

        jTFCodigo.setEnabled(false);

        jTFNome.setEnabled(false);

        jLCodigoNovo.setText("Novo código:");

        jTFNovoCodigo.setEnabled(false);

        jLPosicao.setText("Posição:");

        jTFPosicao.setEnabled(false);

        javax.swing.GroupLayout jPanelDadosLayout = new javax.swing.GroupLayout(jPanelDados);
        jPanelDados.setLayout(jPanelDadosLayout);
        jPanelDadosLayout.setHorizontalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelDadosLayout.createSequentialGroup()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNome)
                    .addComponent(jLCodigo))
                .addGap(7, 7, 7)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelDadosLayout.createSequentialGroup()
                        .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLCodigoNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFNovoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTFNome)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                .addComponent(jLPosicao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTFPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        jPanelDadosLayout.setVerticalGroup(
            jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelDadosLayout.createSequentialGroup()
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLPosicao)
                    .addComponent(jTFPosicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCodigo)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCodigoNovo)
                    .addComponent(jTFNovoCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelDadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLNome)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelOperacoes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operações", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jBInserir.setText("Inserir");
        jBInserir.setEnabled(false);
        jBInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInserirActionPerformed(evt);
            }
        });

        jBRemover.setText("Remover");
        jBRemover.setEnabled(false);
        jBRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRemoverActionPerformed(evt);
            }
        });

        jBAlterar.setText("Alterar");
        jBAlterar.setEnabled(false);
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBPesquisar.setText("Pesquisar");
        jBPesquisar.setEnabled(false);
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jBAcessar.setText("Acessar");
        jBAcessar.setEnabled(false);
        jBAcessar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAcessarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelOperacoesLayout = new javax.swing.GroupLayout(jPanelOperacoes);
        jPanelOperacoes.setLayout(jPanelOperacoesLayout);
        jPanelOperacoesLayout.setHorizontalGroup(
            jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBInserir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBRemover, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBAcessar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelOperacoesLayout.setVerticalGroup(
            jPanelOperacoesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOperacoesLayout.createSequentialGroup()
                .addComponent(jBInserir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBRemover)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAcessar))
        );

        jTableDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Código", "Nome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableDados);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, ".CSV", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jBLerCSV.setText("Ler CSV");
        jBLerCSV.setEnabled(false);
        jBLerCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLerCSVActionPerformed(evt);
            }
        });

        jBEscreverCSV.setText("Escrever CSV");
        jBEscreverCSV.setEnabled(false);
        jBEscreverCSV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEscreverCSVActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBEscreverCSV, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBLerCSV, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jBLerCSV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEscreverCSV))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Banco de Dados", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jBGravarBD.setText("Gravar");
        jBGravarBD.setEnabled(false);
        jBGravarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGravarBDActionPerformed(evt);
            }
        });

        jBSelecionarBD.setText("Selecionar");
        jBSelecionarBD.setEnabled(false);
        jBSelecionarBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSelecionarBDActionPerformed(evt);
            }
        });

        jBAlterarBD.setText("Alterar");
        jBAlterarBD.setEnabled(false);

        jBDeletarBD.setText("Deletar");
        jBDeletarBD.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jBDeletarBD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBAlterarBD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jBSelecionarBD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
            .addComponent(jBGravarBD, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jBGravarBD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBSelecionarBD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAlterarBD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBDeletarBD))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelOperacoes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanelDados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelLista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanelOperacoes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelDados, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Método da interface JFramePrincipal para criar lista
    private void jBCLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCLActionPerformed

        // Cria uma instância da classe Estruturas de Dados
        this.listaDE = new UsuarioC();

        // Pega o componente JTable e o transforma em um modelo padrão de acesso
        this.dtm = (DefaultTableModel)jTableDados.getModel();

        jBCL.setEnabled(false);  // Desabilitando o botão Criar lista

        jBLL.setEnabled(true);        // habilitando o botão Limpar lista
        jBInserir.setEnabled(true);   // habilitando o botão Inserir
        jBRemover.setEnabled(true);   // habilitando o botão Remover
        jBAlterar.setEnabled(true);   // habilitando o botão Alterar
        jBPesquisar.setEnabled(true); // habilitando o botão Pesquisar
        jBAcessar.setEnabled(true);   // habilitando o botão Acessar
        jBLerCSV.setEnabled(true);    // habilitando o botão CSV
        
        jBSelecionarBD.setEnabled(true); // habilitando o botão Selecionar BD
                
        jTFPosicao.setEnabled(true);     // Habilitando o campo de texto Posição
        jTFCodigo.setEnabled(true);      // Habilitando o campo de texto Código
        jTFNome.setEnabled(true);        // Habilitando o campo de texto Nome
        jTFNovoCodigo.setEnabled(true);  // Habilitando o campo de texto Novo Código

    }//GEN-LAST:event_jBCLActionPerformed
    
    // Método da interface JFramePrincipal para limpar lista
    private void jBLLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLLActionPerformed
        
        this.listaDE.limparLista(this.listaDE);  // Tornando a lista vazia
        
        jBLL.setEnabled(false); // Habilitando o botão Limpar lista
        jBCL.setEnabled(true);  // Habilitando o botão Criar lista
        
        this.dtm.setNumRows(0); // Definindo a quantidade de linhas do JTableDados
        
        jBInserir.setEnabled(false);      // Desabilitando o botão Inserir
        jBRemover.setEnabled(false);      // Desabilitando o botão Remover
        jBAlterar.setEnabled(false);      // Desabilitando o botão Alterar
        jBPesquisar.setEnabled(false);    // Desabilitando o botão Pesquisar
        jBAcessar.setEnabled(false);      // Desabilitando o botão Acessar
        
        jBLerCSV.setEnabled(true);        // Habilitando o botão CSV
        jBEscreverCSV.setEnabled(false);  // Desabilitando o botão CSV
        
        jBGravarBD.setEnabled(false);     // Desabilitando o botão gravar
        jBSelecionarBD.setEnabled(false); // Desabilitando o botão selecionar
        jBAlterarBD.setEnabled(false);    // Desabilitando o botão alterar
        jBDeletarBD.setEnabled(false);    // Desabilitando o botão deletar
        
        jTFPosicao.setEnabled(false);     // Desabilitando o campo de texto Posição
        jTFCodigo.setEnabled(false);      // Desabilitando o campo de texto Código
        jTFNome.setEnabled(false);        // Desabilitando o campo de texto Nome
        jTFNovoCodigo.setEnabled(false);  // Desabilitando o campo de texto Novo Código

    }//GEN-LAST:event_jBLLActionPerformed
    
    private void mostrarLista(){
        
        // Pega o ponteiro para o primeiro usuário da lista.
        No proximoUsuario =  this.listaDE.getLista(this.listaDE);
        
        // Percorrendo a lista de usuários
        for(int i = 0; i < this.listaDE.getQuantidadeDeNos(); i++){

            // Inserindo os dados no JTable
            this.dtm.setValueAt(i, i, 0);
            this.dtm.setValueAt(proximoUsuario.getObjeto().getCodigoUsuario(), i, 1);
            this.dtm.setValueAt(proximoUsuario.getObjeto().getNomeUsuario(), i, 2);
            
            // Vai para o próximo usuário da lista.
            proximoUsuario = proximoUsuario.getProximoPonteiro();

        }
        
    }
    
    private void mostrarListaCSVeBD(){
        
        // Pega o ponteiro para o primeiro usuário da lista.
        No proximoUsuario =  this.listaDE.getLista(this.listaDE);
        
        // Percorrendo a lista de usuários
        for(int i = 0; i < this.listaDE.getQuantidadeDeNos(); i++){

            // Cria-se uma linha com campos vazios na tabela JTableDados
            this.dtm.addRow(new Object[]{null,null,null});
            
            // Inserindo os dados no JTable
            this.dtm.setValueAt(i, i, 0);
            this.dtm.setValueAt(proximoUsuario.getObjeto().getCodigoUsuario(), i, 1);
            this.dtm.setValueAt(proximoUsuario.getObjeto().getNomeUsuario(), i, 2);
            
            // Vai para o próximo usuário da lista.
            proximoUsuario = proximoUsuario.getProximoPonteiro();

        }
        
    }
    
    // Método da interface JFramePrincipal para inserir os dados na lista
    private void jBInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInserirActionPerformed

        String erro = "";
        
        // Verificando se os campos da interface estão sem valor,
        // caso estejam, será montada uma string com as informações de erro.
        if (jTFPosicao.getText().trim().isEmpty()) erro = erro + "Campo Posição não preenchido...\n";
        if(jTFCodigo.getText().trim().isEmpty())   erro = erro + "Campo código não preenchido...\n";
        if (jTFNome.getText().isEmpty())           erro = erro + "campo nome não preenchido...";
        
        // Verificando se o atributo erro está vazio
        if(erro.length() == 0){
            
            // Resgatando os valores dos campos do painel dados.
            int posicao = Integer.parseInt(jTFPosicao.getText().trim()); 
            int codigo  = Integer.parseInt(jTFCodigo.getText().trim());
            String nome = jTFNome.getText();
            
            // Verificando se foi possível inserir os dados em uma determinada posição válida da lista
            if(this.listaDE.inserirDados(this.listaDE, codigo, nome)){
                
                // Cria-se uma linha com campos vazios na tabela JTableDados
                this.dtm.addRow(new Object[]{null,null,null});
                
                // Chamando o método para mostrar a lista
                this.mostrarLista();
                
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível inserir os dados...");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, erro);
        }
        
    }//GEN-LAST:event_jBInserirActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed

        // Pesquisando um código na lista e recebendo a posição deste, caso exista
        // Se o código não for encontrado, exibe uma mensagem na tela do usuário.
        
        try{
            
            int resultado = this.listaDE.pesquisarElemento(this.listaDE,Integer.parseInt(jTFCodigo.getText().trim()));
        
            if(resultado == -1){
                JOptionPane.showMessageDialog(null, "Código não existe...");
            }else{
                JOptionPane.showMessageDialog(null, ".:Elemento está presente:.\nPosição = " + resultado);
            }
        
        }catch(NumberFormatException nfe){
            JOptionPane.showMessageDialog(null, "Powwww");
        }
        
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBAcessarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAcessarActionPerformed
        
        // Pegando o valor presente no campo de texto jTFPosicao
        String posicao = jTFPosicao.getText().trim();
        
        // Verificando se o campo de texto não está vazio
        if (!posicao.isEmpty()){
            
            // Acessando uma posição da lista, onde o objeto retornado será
            // colocado no atributo 'resultado'
            No resultado = this.listaDE.acessarDados(listaDE, Integer.parseInt(posicao));
            
            // Se existir o objeto, apresenta os dados.
            if (resultado != null){
                JOptionPane.showMessageDialog(null, "Posição: " + Integer.parseInt(posicao) + "\nCódigo: " + resultado.getObjeto().getCodigoUsuario() + "\nNome: " + resultado.getObjeto().getNomeUsuario());
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível acessar ou posição inválida...");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Campo posição vazio...");
        }
        
    }//GEN-LAST:event_jBAcessarActionPerformed

    private void jBRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRemoverActionPerformed
        
        // Pegando o valor presente no campo de texto jTFPosicao
        String posicao = jTFPosicao.getText().trim();
        
        // Verificando se o campo de texto não está vazio
        if (!posicao.isEmpty()){        
            
            // Verifica se é possível remover na lista.
            if (this.listaDE.removerDados(this.listaDE, Integer.parseInt(posicao))){
                
                // Se foi possível remover, basta apresentar o JTableDados atualizado.
                // removeRow = remove uma linha do JTableDados 
                dtm.removeRow(Integer.parseInt(posicao));
                
                // Chamando o método para mostrar a lista
                this.mostrarLista();
                
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível remover...");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Campo posição vazio...");
        }
        
    }//GEN-LAST:event_jBRemoverActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed

        String erro = "";
        
        // Verificando se os campos da interface estão sem valor,
        // caso estejam, será montada uma string com as informações de erro.
        if(jTFCodigo.getText().trim().isEmpty())     erro = erro + "Campo código não preenchido...\n";
        
        // Novos dados a serem inseridos
        if(jTFNovoCodigo.getText().trim().isEmpty()) erro = erro + "Campo novo código não preenchido...\n";
        if (jTFNome.getText().trim().isEmpty())      erro = erro + "campo nome não preenchido...";
        
        // Verificando se o atributo 'erro' está vazio.
        if(erro.length() == 0){
            
            // Resgatando os valores dos campos do painel dados.
            int codigoAntigo = Integer.parseInt(jTFCodigo.getText().trim()); 
            int novoCodigo   = Integer.parseInt(jTFNovoCodigo.getText().trim());
            String novoNome  = jTFNome.getText();
            
            // Verificando se foi possível alterar os dados de acordo com o código
            // informado pelo usuário.

            int posicao = this.listaDE.pesquisarElemento(listaDE, codigoAntigo);
            
            if (posicao != -1){
                
                this.listaDE.alterarDados(listaDE, codigoAntigo, novoCodigo, novoNome);
                
                // Preenchendo linha a linha com os dados do usuário de uma determinada posição 'i'
                // setValueAt(informação, linha da tabela, coluna da tabela)

                this.dtm.setValueAt(posicao, posicao, 0);
                this.dtm.setValueAt(novoCodigo, posicao, 1);
                this.dtm.setValueAt(novoNome, posicao, 2);
                
                JOptionPane.showMessageDialog(null, "Dados alterados com sucesso...");
                
            }else{
                JOptionPane.showMessageDialog(null, "Não foi possível alterar os dados...");
            }
            
        }else{
            JOptionPane.showMessageDialog(null, erro);
        }

    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBLerCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLerCSVActionPerformed

        // Cria uma instância do selecionador de arquivos.
        this.jFCEscolherArquivo = new JFileChooser();
        
        // Define o diretório atual.
        // Nesse caso, a caixa será aberta em c:
        this.jFCEscolherArquivo.setCurrentDirectory(new File("C:"));
        
        // Permite que seja seleciodo apenas arquivos, diretórios ou arquivos e diretórios.
        // FILES_ONLY = instrução para exibir apenas arquivos.
        this.jFCEscolherArquivo.setFileSelectionMode(JFileChooser.FILES_ONLY);
        
        // Adiciona na caixa de diálogo os tipos de arquivos que poderão ser selecionados.
        this.jFCEscolherArquivo.addChoosableFileFilter(new FileNameExtensionFilter("PDF Documents", "pdf"));
        this.jFCEscolherArquivo.addChoosableFileFilter(new FileNameExtensionFilter("MS Office Documents", "csv", "docx", "xlsx", "pptx"));
        this.jFCEscolherArquivo.addChoosableFileFilter(new FileNameExtensionFilter("Images", "jpg", "png", "gif", "bmp"));
        
        // Coloca a opção 'Todos os arquivos' disponível e quando selecionada, qualquer extensão de arquivo poderá ser utilizada,
        // desde que se tenha um método para trabalhar o arquivo.
        this.jFCEscolherArquivo.setAcceptAllFileFilterUsed(true);
        
        // Verifica se algum arquivo foi selecionado
        if (this.jFCEscolherArquivo.showOpenDialog(this) == JFileChooser.APPROVE_OPTION){
            
            JOptionPane.showMessageDialog(null, "Arquivo carregado com sucesso!");
            
            // Passa a lista e o caminho onde o arquivo .csv está.
            // Se foi possível ler o arquivo, apresenta os dados.
            if (this.listaDE.lerArquivoCSV(listaDE,this.jFCEscolherArquivo.getSelectedFile())){
                
                JOptionPane.showMessageDialog(null, "Dados importados com sucesso...");
                
                this.mostrarListaCSVeBD(); // Mostrando os dados no JTable

                jBLerCSV.setEnabled(false);      // Desabilitando o botão CSV
                jBEscreverCSV.setEnabled(true);  // Habilitando o botão CSV

                jBGravarBD.setEnabled(true);     // Haabilitando o botão gravar
                jBSelecionarBD.setEnabled(true); // Habilitando o botão selecionar
                jBAlterarBD.setEnabled(true);    // Habilitando o botão alterar
                jBDeletarBD.setEnabled(true);    // Habilitando o botão deletar

            }else{
                JOptionPane.showMessageDialog(null, "Erro ao importar os dados...");
            }
                        
        }else{
            JOptionPane.showMessageDialog(null, "Arquivo não selecionado!");
        }

    }//GEN-LAST:event_jBLerCSVActionPerformed

    private void jBGravarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGravarBDActionPerformed

        // Verificando se foi possível inserir os dados em uma determinada posição válida da lista
        if(this.listaDE.gravarUsuariosBD(this.listaDE))
            JOptionPane.showMessageDialog(null, "Dados gravados no BD Oracle com sucesso...");
        else
            JOptionPane.showMessageDialog(null, "Erro ao gravar os dados no BD Oracle...");

    }//GEN-LAST:event_jBGravarBDActionPerformed

    private void jBEscreverCSVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEscreverCSVActionPerformed

        this.listaDE.escreverArquivoCSV(listaDE);
        
    }//GEN-LAST:event_jBEscreverCSVActionPerformed

    private void jBSelecionarBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSelecionarBDActionPerformed

        // Verificando se foi possível inserir os dados em uma determinada posição válida da lista
        if(this.listaDE.selecionarUsuariosBD(this.listaDE)){
            JOptionPane.showMessageDialog(null, "Dados resgatados do BD Oracle com sucesso...");
            this.mostrarListaCSVeBD(); // Mostrando os dados no JTable
        }else
            JOptionPane.showMessageDialog(null, "Erro ao resgatar os dados no BD Oracle...");
        
        jBSelecionarBD.setEnabled(false); // habilitando o botão Selecionar BD
        jBGravarBD.setEnabled(true);      // habilitando o botão Gravar BD
        jBAlterarBD.setEnabled(true);     // habilitando o botão Alterar BD
        jBDeletarBD.setEnabled(true);     // habilitando o botão DeletarBD
        
    }//GEN-LAST:event_jBSelecionarBDActionPerformed
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFramePrincipal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAcessar;
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBAlterarBD;
    private javax.swing.JButton jBCL;
    private javax.swing.JButton jBDeletarBD;
    private javax.swing.JButton jBEscreverCSV;
    private javax.swing.JButton jBGravarBD;
    private javax.swing.JButton jBInserir;
    private javax.swing.JButton jBLL;
    private javax.swing.JButton jBLerCSV;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JButton jBRemover;
    private javax.swing.JButton jBSelecionarBD;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLCodigoNovo;
    private javax.swing.JLabel jLNome;
    private javax.swing.JLabel jLPosicao;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelDados;
    private javax.swing.JPanel jPanelLista;
    private javax.swing.JPanel jPanelOperacoes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFNovoCodigo;
    private javax.swing.JTextField jTFPosicao;
    private javax.swing.JTable jTableDados;
    // End of variables declaration//GEN-END:variables
}
