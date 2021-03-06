/*
 * VisAutomovel.java
 *
 * Created on 02/05/2011, 22:21:05
 */
package visao;
import negocio.NegAutomovel;
import negocio.NegMulta;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.PerAutomovel;
import persistencia.PerMulta;

/**
 * Classe VisAutomovel da camada de visao
 * 
 * @version 2.3 beta
 * @author Matheus Souza da Silva
 * @since 02/05/2011
 */
public class VisAutomovel extends javax.swing.JInternalFrame 
{
    /**
    *
    * Método construtor da camada de visao
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    */
    public VisAutomovel() 
    {
        initComponents();
         /* Chamamos o método preencheCombo() aqui
         no método Construtor da Classe.
         Ele será executado automaticamente toda
         vez que a janela VisAutomovel for aberto */
        this.preencheCombo();
    }//public VisAutomovel()

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlMarca = new javax.swing.JLabel();
        jlModelo = new javax.swing.JLabel();
        jlAno = new javax.swing.JLabel();
        jlPlaca = new javax.swing.JLabel();
        jtMarca = new javax.swing.JTextField();
        jtModelo = new javax.swing.JTextField();
        jtAno = new javax.swing.JTextField();
        jtPlaca = new javax.swing.JTextField();
        jcbMulta = new javax.swing.JComboBox<PerMulta>();
        jbCadastrar = new javax.swing.JButton();
        jbVisualizar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableAutomovel = new javax.swing.JTable();
        jlMulta = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Cadastro Automovel");
        setPreferredSize(new java.awt.Dimension(1000, 670));

        jlMarca.setText("Marca");

        jlModelo.setText("Modelo");

        jlAno.setText("Ano");

        jlPlaca.setText("Placa");

        jbCadastrar.setText("Cadastrar");
        jbCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCadastrarActionPerformed(evt);
            }
        });

        jbVisualizar.setText("Visualizar");
        jbVisualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVisualizarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jTableAutomovel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Automovel", "Marca", "Modelo", "Ano", "Placa", "Multa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableAutomovel);

        jlMulta.setText("Multa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlModelo)
                            .addComponent(jlMarca)
                            .addComponent(jlAno)
                            .addComponent(jlPlaca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jtPlaca)
                            .addComponent(jtModelo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtAno, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtMarca, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jbCadastrar)
                    .addComponent(jbVisualizar)
                    .addComponent(jbLimpar)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jlMulta)
                        .addComponent(jcbMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 743, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlMarca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlModelo)
                            .addComponent(jtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlAno))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlPlaca)
                            .addComponent(jtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jlMulta)
                        .addGap(5, 5, 5)
                        .addComponent(jcbMulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbCadastrar)
                        .addGap(12, 12, 12)
                        .addComponent(jbVisualizar)
                        .addGap(18, 18, 18)
                        .addComponent(jbLimpar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
    *
    * Método que tem finalidade de atualizar as informações da tabela da interface
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception Exception Lança uma excessao se algum erro ocorrer
    */
    private void AtualizarTabela()
    {
        try 
        {
            DefaultTableModel dtm = (DefaultTableModel) jTableAutomovel.getModel();
            String[] linha = new String[6];

            NegAutomovel na = new  NegAutomovel();
            ArrayList<PerAutomovel> pa = new ArrayList<>(na.buscarTodosAutomoveis());

            //Zerar número de linhas da tabela
            dtm.setNumRows(0);

            //Preenchimento da JTable
            for (PerAutomovel paValor : pa) {
                linha[0] = Integer.toString(paValor.getIdautomovel());
                linha[1] = paValor.getMarca();
                linha[2] = paValor.getModelo();
                linha[3] = Integer.toString(paValor.getAno());
                linha[4] = paValor.getPlaca();
                linha[5] = paValor.getMulta().getInfracao();
                dtm.addRow(linha);
            } //for (int i=0; i<tb.size(); i++) {

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                this,
                "Erro! "+e.getMessage()
            );
        }//try
    }//private void AtualizarTabela()
  
    /**
    *
    * Método que tem finalidade de limpar as propriedades da interface
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    */
    public void Limpar()
    {
        jtMarca.setText("");
        jtModelo.setText("");
        jtAno.setText("");
        jtPlaca.setText("");
    }//public void Limpar()

    /**
    *
    * Método que tem finalidade preencher a JComboBox
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    */
    private void preencheCombo()
    {
        try 
        {
            NegMulta nm    = new NegMulta();
            ArrayList<PerMulta> aPm = new ArrayList<>(nm.buscarTodasMultas());
            
            for (PerMulta aPmValor : aPm) {
                jcbMulta.addItem(aPmValor);
            } //for (int i=0; i<aAux.size(); i++) {

        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null,
                "Erro! "+e.getMessage()
            );
        }//try 
    }//private void preencheCombo()
    
    /**
    *
    * Método que tem finalidade de cadastrar o automovel
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception Exception Lança uma excessao se algum erro ocorrer
    * @exception NumberFormatException Lança uma excessao se algum erro ocorrer
    */
    private void jbCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCadastrarActionPerformed
        try 
        {
            //se qualquer um dos campos  não estiver vazio ele executa isto
            if (!jtMarca.getText().isEmpty() 
            && !jtModelo.getText().isEmpty() 
            && !jtAno.getText().isEmpty() 
            && !jtPlaca.getText().isEmpty()) {
                PerAutomovel pa = new PerAutomovel();
                pa.setMarca(jtMarca.getText());
                pa.setModelo(jtModelo.getText());
                pa.setAno(Integer.parseInt(jtAno.getText()));
                pa.setPlaca(jtPlaca.getText());

                //COERÇÃO!
                //CAST - Troca de tipo de dados forçada !!
                pa.setMulta((PerMulta) jcbMulta.getSelectedItem());
                NegAutomovel na = new NegAutomovel();
                na.cadastrarAutomovel(pa);

                JOptionPane.showMessageDialog(null, "Automovel Cadastrado com Sucesso! ");
              
                Limpar(); //limpa todos os JtextField
                AtualizarTabela(); //atualiza o Jtable
            } else {
                JOptionPane.showMessageDialog(
                    this,
                    "Preencha Todos Os Campos!!!",
                    "Erro",
                    JOptionPane.ERROR_MESSAGE
                );
            }
        
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(
                this,
                "Dados Invalidos!\n"+nfe.getMessage(),
                "Erro ",
                JOptionPane.ERROR_MESSAGE
            );
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Erro! "+e.getMessage());
        }//try
    }//GEN-LAST:event_jbCadastrarActionPerformed

    /**
    *
    * Método que tem finalidade de carregar na inteface as informações da tabela da interface
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    * @exception Exception Lança uma excessao se algum erro ocorrer
    */
    private void jbVisualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVisualizarActionPerformed
        try 
        {
            NegAutomovel na = new NegAutomovel();
            ArrayList<PerAutomovel> pa = new ArrayList<>(na.buscarTodosAutomoveis());

            DefaultTableModel dtm = (DefaultTableModel)jTableAutomovel.getModel();

            //  zera o número de linhas da Tabela
            dtm.setNumRows(0);

            String[] linha = new String[6];

            for (PerAutomovel paValor : pa) {
                linha[0] = Integer.toString(paValor.getIdautomovel());
                linha[1] = paValor.getMarca();
                linha[2] = paValor.getModelo();
                linha[3] = Integer.toString(paValor.getAno());
                linha[4] = paValor.getPlaca();
                linha[5] = paValor.getMulta().getInfracao();
                dtm.addRow(linha);
            } //for (int i=0; i<mAux.size(); i++) {
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"Erro! "+e.getMessage());
        }//try
    }//GEN-LAST:event_jbVisualizarActionPerformed

    /**
    *
    * Método que tem finalidade de limpar as propriedades da inteface
    * 
    * @version 2.3 beta
    * @author Matheus Souza da Silva
    * @since 02/05/2011
    */
    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        DefaultTableModel dtm = (DefaultTableModel)jTableAutomovel.getModel();
        //Zerar número de linhas da tabela
        dtm.setNumRows(0);
        Limpar();
    }//GEN-LAST:event_jbLimparActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableAutomovel;
    private javax.swing.JButton jbCadastrar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbVisualizar;
    private javax.swing.JComboBox<PerMulta> jcbMulta;
    private javax.swing.JLabel jlAno;
    private javax.swing.JLabel jlMarca;
    private javax.swing.JLabel jlModelo;
    private javax.swing.JLabel jlMulta;
    private javax.swing.JLabel jlPlaca;
    private javax.swing.JTextField jtAno;
    private javax.swing.JTextField jtMarca;
    private javax.swing.JTextField jtModelo;
    private javax.swing.JTextField jtPlaca;
    // End of variables declaration//GEN-END:variables

}
