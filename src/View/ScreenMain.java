package View;

import java.awt.Color;
import javax.swing.BorderFactory;
import Data.CadastroFilmesDAO;
import Data.CadastroFilmes;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Date;
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;

public class ScreenMain extends javax.swing.JFrame {

	private final String[] tableColumns = {"Id","Nome do Filme", "Data de Lançamento", "Categoria"};
//
	private final DefaultTableModel tableModel = new DefaultTableModel(tableColumns, 0);

	
//
	private List<CadastroFilmes> filmesList = new ArrayList<>();

	public ScreenMain() {

		initComponents();
		setLocationRelativeTo(null);
		jtSubTitle_CadastroDeFilmes.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,
				  Color.BLACK));
		ocultarColuna();

		bntAlterar.setEnabled(false);
		bntExcluir.setEnabled(false);

	}

	@SuppressWarnings("unchecked")
   // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
   private void initComponents() {

      jPanel1 = new javax.swing.JPanel();
      jlTitle_CenaFlix = new javax.swing.JLabel();
      jtSubTitle_CadastroDeFilmes = new javax.swing.JLabel();
      jbNomeDoFilme = new javax.swing.JLabel();
      jbDataDeLancamento = new javax.swing.JLabel();
      jbCategoria = new javax.swing.JLabel();
      bntCadastrar = new javax.swing.JButton();
      bntLimpar = new javax.swing.JButton();
      txtNomeFilme = new javax.swing.JTextField();
      fTxtDataLancamento = new javax.swing.JFormattedTextField();
      txtCategoria = new javax.swing.JTextField();
      jbFiltroCategoria = new javax.swing.JLabel();
      txtFiltro = new javax.swing.JTextField();
      bntPesquisar = new javax.swing.JButton();
      bntAlterar = new javax.swing.JButton();
      bntExcluir = new javax.swing.JButton();
      jScrollPane1 = new javax.swing.JScrollPane();
      jTableFilmes = new javax.swing.JTable();

      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
      setTitle("CENAFLIX");
      setBackground(new java.awt.Color(255, 255, 255));

      jPanel1.setBackground(new java.awt.Color(204, 204, 204));

      jlTitle_CenaFlix.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
      jlTitle_CenaFlix.setText("CENAFLIX");

      jtSubTitle_CadastroDeFilmes.setFont(new java.awt.Font("Arial", 3, 18)); // NOI18N
      jtSubTitle_CadastroDeFilmes.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
      jtSubTitle_CadastroDeFilmes.setText("CADASTRO DE FILMES");

      jbNomeDoFilme.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
      jbNomeDoFilme.setText("Nome do Filme:");

      jbDataDeLancamento.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
      jbDataDeLancamento.setText("Data de Lançamento:");

      jbCategoria.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
      jbCategoria.setText("Categoria:");

      bntCadastrar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
      bntCadastrar.setText("Cadastrar");
      bntCadastrar.setToolTipText("Clique para Cadastra o Filme");
      bntCadastrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      bntCadastrar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            bntCadastrarActionPerformed(evt);
         }
      });

      bntLimpar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
      bntLimpar.setText("Limpar Campos");
      bntLimpar.setToolTipText("Clique para limpar os campos");
      bntLimpar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      bntLimpar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            bntLimparActionPerformed(evt);
         }
      });

      txtNomeFilme.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      txtNomeFilme.setToolTipText("Informe o Nome do Filme");
      txtNomeFilme.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtNomeFilmeActionPerformed(evt);
         }
      });

      try {
         fTxtDataLancamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
      } catch (java.text.ParseException ex) {
         ex.printStackTrace();
      }
      fTxtDataLancamento.setHorizontalAlignment(javax.swing.JTextField.CENTER);
      fTxtDataLancamento.setToolTipText("Digite a Data de Lançamento");
      fTxtDataLancamento.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

      txtCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      txtCategoria.setToolTipText("Digite a Categoria ex: Ação, Ficção, Romance");

      jbFiltroCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
      jbFiltroCategoria.setText("Filtro por Categoria");

      txtFiltro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
      txtFiltro.setToolTipText("Digite a Categoria que deseja pesquisa");
      txtFiltro.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            txtFiltroActionPerformed(evt);
         }
      });

      bntPesquisar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
      bntPesquisar.setText("Pesquisar");
      bntPesquisar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      bntPesquisar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            bntPesquisarActionPerformed(evt);
         }
      });

      bntAlterar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
      bntAlterar.setText("Alterar");
      bntAlterar.setToolTipText("Clique para alterar o Filme selecionado");
      bntAlterar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      bntAlterar.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            bntAlterarActionPerformed(evt);
         }
      });

      bntExcluir.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
      bntExcluir.setText("Excluir");
      bntExcluir.setToolTipText("Clique para Exclusão permanente !");
      bntExcluir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
      bntExcluir.addActionListener(new java.awt.event.ActionListener() {
         public void actionPerformed(java.awt.event.ActionEvent evt) {
            bntExcluirActionPerformed(evt);
         }
      });

      javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
      jPanel1.setLayout(jPanel1Layout);
      jPanel1Layout.setHorizontalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(216, 216, 216)
                  .addComponent(jtSubTitle_CadastroDeFilmes))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(267, 267, 267)
                  .addComponent(jlTitle_CenaFlix))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jbNomeDoFilme)
                        .addGap(58, 58, 58))
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                           .addComponent(jbCategoria)
                           .addComponent(jbDataDeLancamento))
                        .addGap(18, 18, 18)))
                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                     .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(fTxtDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bntCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addComponent(txtNomeFilme, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bntLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(78, 78, 78)
                        .addComponent(bntExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addContainerGap()
                  .addComponent(jbFiltroCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                  .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                  .addComponent(bntPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(96, Short.MAX_VALUE))
      );
      jPanel1Layout.setVerticalGroup(
         jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jlTitle_CenaFlix)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jtSubTitle_CadastroDeFilmes)
            .addGap(26, 26, 26)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtNomeFilme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(jbNomeDoFilme))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(fTxtDataLancamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(bntCadastrar)
               .addComponent(jbDataDeLancamento))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(txtCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
               .addComponent(bntAlterar)
               .addComponent(jbCategoria))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
               .addComponent(bntLimpar)
               .addComponent(bntExcluir))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                  .addComponent(jbFiltroCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                  .addComponent(bntPesquisar))
               .addGroup(jPanel1Layout.createSequentialGroup()
                  .addGap(1, 1, 1)
                  .addComponent(txtFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap())
      );

      jScrollPane1.setBackground(new java.awt.Color(204, 204, 204));

      jTableFilmes.setModel(new javax.swing.table.DefaultTableModel(
         new Object [][] {

         },
         new String [] {
            "Id", "Nome do Filme", "Data de Lançamento", "Categoria"
         }
      ) {
         Class[] types = new Class [] {
            java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
         };

         public Class getColumnClass(int columnIndex) {
            return types [columnIndex];
         }
      });
      jScrollPane1.setViewportView(jTableFilmes);

      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
      getContentPane().setLayout(layout);
      layout.setHorizontalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
               .addComponent(jScrollPane1)
               .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addContainerGap(55, Short.MAX_VALUE))
      );
      layout.setVerticalGroup(
         layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
         .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
      );

      pack();
   }// </editor-fold>//GEN-END:initComponents

   private void bntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastrarActionPerformed

		if (!empty()) {

			if (!validacompos()) {

				cadastrar();

			}
		}

   }//GEN-LAST:event_bntCadastrarActionPerformed

   private void bntLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimparActionPerformed

		limparDados();

   }//GEN-LAST:event_bntLimparActionPerformed

   private void txtNomeFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNomeFilmeActionPerformed

   }//GEN-LAST:event_txtNomeFilmeActionPerformed

   private void txtFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFiltroActionPerformed
		// TODO add your handling code here:
   }//GEN-LAST:event_txtFiltroActionPerformed

   private void bntPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPesquisarActionPerformed

		tableModel.setRowCount(0);
		dadospesquisa();

   }//GEN-LAST:event_bntPesquisarActionPerformed

   private void bntAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAlterarActionPerformed
		// TODO add your handling code here:
   }//GEN-LAST:event_bntAlterarActionPerformed

   private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed
		// TODO add your handling code here:
   }//GEN-LAST:event_bntExcluirActionPerformed

	public static void main(String args[]) {

		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;

				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(ScreenMain.class
					  .getName()).log(java.util.logging.Level.SEVERE, null, ex);

		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(ScreenMain.class
					  .getName()).log(java.util.logging.Level.SEVERE, null, ex);

		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(ScreenMain.class
					  .getName()).log(java.util.logging.Level.SEVERE, null, ex);

		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(ScreenMain.class
					  .getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}

		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ScreenMain().setVisible(true);
			}
		});
	}

   // Variables declaration - do not modify//GEN-BEGIN:variables
   private javax.swing.JButton bntAlterar;
   private javax.swing.JButton bntCadastrar;
   private javax.swing.JButton bntExcluir;
   private javax.swing.JButton bntLimpar;
   private javax.swing.JButton bntPesquisar;
   private javax.swing.JFormattedTextField fTxtDataLancamento;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JScrollPane jScrollPane1;
   private javax.swing.JTable jTableFilmes;
   private javax.swing.JLabel jbCategoria;
   private javax.swing.JLabel jbDataDeLancamento;
   private javax.swing.JLabel jbFiltroCategoria;
   private javax.swing.JLabel jbNomeDoFilme;
   private javax.swing.JLabel jlTitle_CenaFlix;
   private javax.swing.JLabel jtSubTitle_CadastroDeFilmes;
   private javax.swing.JTextField txtCategoria;
   private javax.swing.JTextField txtFiltro;
   private javax.swing.JTextField txtNomeFilme;
   // End of variables declaration//GEN-END:variables

	public void limparDados() {

		txtNomeFilme.setText("");
		fTxtDataLancamento.setText("");
		txtCategoria.setText("");
		txtNomeFilme.requestFocus();

	}

	public void cadastrar() {

		CadastroFilmes cadastro = new CadastroFilmes();
		CadastroFilmesDAO dao = new CadastroFilmesDAO();

		boolean status;
		int resposta;

		cadastro.setNomeDoFilme(txtNomeFilme.getText());

		String dataString = fTxtDataLancamento.getText();
		SimpleDateFormat formatEntrada = new SimpleDateFormat("dd/MM/yyyy");
		Date dataFormatada = null;

		try {

			dataFormatada = formatEntrada.parse(dataString);

		} catch (ParseException ex) {

			System.out.println("Erro na conversão da Data" + ex.getMessage());

		}
		cadastro.setDataLacamento(dataFormatada);

		cadastro.setCategoria(txtCategoria.getText());

		dao = new CadastroFilmesDAO();

		status = dao.conectar();

		if (status == false) {

			JOptionPane.showMessageDialog(null, "Erro de Conexão");

		} else {

			resposta = dao.salvar(cadastro);

			if (resposta == 1) {

				JOptionPane.showMessageDialog(null, "Filme salvo com sucesso!");
				limparDados();
				txtNomeFilme.requestFocus();

			} else {

				JOptionPane.showMessageDialog(null, "Erro ao Salvar");
			}

			dao.desconectar();
		}

	}

	public void dadospesquisa() {

		String categoria = txtFiltro.getText();
		CadastroFilmesDAO dao = new CadastroFilmesDAO();
		boolean status = dao.conectar();

		if (status == true) {

			List<CadastroFilmes> filmesList = dao.consultar(categoria);

			if (filmesList.isEmpty()) {

				JOptionPane.showMessageDialog(null, "Nenhum Filme localizado");

			} else {

				this.filmesList = filmesList;
				addTabela();
			}

			dao.desconectar();

		} else {

			JOptionPane.showMessageDialog(null, "Erro de conexão");

		}
	}

	public boolean validacompos() {

		boolean validacao = true;

		String valid = txtNomeFilme.getText();
		boolean nomeValido = valid.matches(".*");

		String valid2 = txtCategoria.getText();
		boolean categoriaValida = valid2.matches(".*");

		String valid3 = fTxtDataLancamento.getText();
		boolean datavalida = valid3.matches("[0-9]{2}[/][0-9]{2}[/][0-9]{4}");

		if (nomeValido == false) {

			JOptionPane.showMessageDialog(null, "Favor Preencher o Nome do Filme!");

		} else if (datavalida == false) {

			JOptionPane.showMessageDialog(null, "Favor informar a Data de Lançamento!");

		} else if (categoriaValida == false) {

			JOptionPane.showMessageDialog(null, "Digite a Categoria do filme!");

		} else {

			return false;

		}

		return validacao;

	}

	private void addTabela() {

		SimpleDateFormat formatSaida = new SimpleDateFormat("dd/MM/yyyy");
		//tableModel.setRowCount(0);

		for (CadastroFilmes filme : filmesList) {

			Object[] data = {filme.getId(),filme.getNomeDoFilme(), formatSaida.format(filme.getDataLacamento()), filme.getCategoria()};
			tableModel.addRow(data);

		}

		jTableFilmes.setModel(tableModel);
	}

	public boolean empty() {

		boolean empty = true;

		if (txtNomeFilme.getText().isEmpty()) {

			JOptionPane.showMessageDialog(null, "Informe o Nome do filme!");

		} else if (txtCategoria.getText().isEmpty()) {

			JOptionPane.showMessageDialog(null, "Informe a Categoria do filme");

		} else {

			empty = false;

		}

		return empty;

	}

	public void ocultarColuna() {
		TableColumnModel modeloColuna = jTableFilmes.getColumnModel();
		TableColumn colunaInvisivel = modeloColuna.getColumn(0); 

		
		colunaInvisivel.setMinWidth(0); 
		colunaInvisivel.setMaxWidth(1);
	}
}
