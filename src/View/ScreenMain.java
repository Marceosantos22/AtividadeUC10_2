package View;

import java.awt.Color;
import javax.swing.BorderFactory;
import Data.CadastroFilmesDAO;
import Data.CadastroFilmes;
import java.text.ParseException;
import javax.swing.JOptionPane;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableRowSorter;

public class ScreenMain extends javax.swing.JFrame {

	/**Representa o modelo da tabela de filmes utilizada na interface gráfica.
	 */
	private DefaultTableModel tabelaFilmes;

	public ScreenMain() {

		initComponents();
		this.addTabela("");
		setLocationRelativeTo(null);
		jtSubTitle_CadastroDeFilmes.setBorder(BorderFactory.createMatteBorder(0, 0, 2, 0,
				  Color.BLACK));
		ocultarColuna();

		bntAlterar.setEnabled(false);
		bntExcluir.setEnabled(false);

		/**Adiciona um ListSelectionListener à tabela jTableFilmes para capturar a seleção
		 * do usuário e chama o método selecaotabela() quando uma linha é selecionada.
		 */
		jTableFilmes.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			public void valueChanged(ListSelectionEvent event) {
				if (!event.getValueIsAdjusting()) {
					selecaotabela();
				}
			}
		});

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
      txtFiltro.addCaretListener(new javax.swing.event.CaretListener() {
         public void caretUpdate(javax.swing.event.CaretEvent evt) {
            txtFiltroCaretUpdate(evt);
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
            .addContainerGap(29, Short.MAX_VALUE))
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
	
	/**Adiciona as informações dos filmes cadastrados no banco de dados em uma tabela,
	 * filtrando por categoria se informado, utilizando o método listTable() da classe CadastroFilmesDAO.
	 * Se ocorrer erro de conexão com o banco, uma mensagem de erro é exibida.
	 * @param categoria 
	 */
	private void addTabela(String categoria) {

		CadastroFilmesDAO dao = new CadastroFilmesDAO();

		boolean status = dao.conectar();

		if (status == false) {

			JOptionPane.showMessageDialog(null, "Não foi possível Adicionar, Erro de conexão");

		} else {

			List<CadastroFilmes> listfilmes = dao.listTable(categoria);

			tabelaFilmes = (DefaultTableModel) jTableFilmes.getModel();

			jTableFilmes.setRowSorter(new TableRowSorter(tabelaFilmes));
			tabelaFilmes.setNumRows(0);

			SimpleDateFormat formatSaida = new SimpleDateFormat("dd/MM/yyyy");

			for (CadastroFilmes filmes : listfilmes) {

				Object[] obj = new Object[]{filmes.getId(), filmes.getNomeDoFilme(),
					formatSaida.format(filmes.getDataLacamento()), filmes.getCategoria()};

				tabelaFilmes.addRow(obj);

			}

			dao.desconectar();
		}
	}

	/**Realiza o cadastro de um novo filme ao clicar no botão "Cadastrar".
	 * Verifica se os campos estão preenchidos corretamente e se já não existe 
	 * um filme com o mesmo nome cadastrado. Caso todas as condições sejam satisfeitas, 
	 * realiza a inserção do filme no banco de dados, exibindo uma mensagem de sucesso. 
	 * Caso contrário, exibe uma mensagem de erro. 
	 */	
   private void bntCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntCadastrarActionPerformed

		if (!empty()) {

			if (!validacompos()) {

				cadastrar();

			}

			limparDados();
		}
   }//GEN-LAST:event_bntCadastrarActionPerformed

   private void bntLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntLimparActionPerformed

		limparDados();

   }//GEN-LAST:event_bntLimparActionPerformed

	/**Realiza a pesquisa na tabela de filmes, filtrando pelo nome ou categoria do filme.
	 * Chama o método addTabela() passando como parâmetro o texto digitado no campo txtFiltro.
	 * @param evt 
	 */
   private void bntPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPesquisarActionPerformed

		this.addTabela(txtFiltro.getText());

   }//GEN-LAST:event_bntPesquisarActionPerformed

	/**Realiza a atualização de um filme no banco de dados, utilizando as informações
	 * preenchidas nos campos de texto.
	 * Apos chama a classe CadastroFilmesDAO enviado para método atualizar() e executar no BD.
	 * Caso ocorra sucesso, exibe uma mensagem de confirmação e limpa os dados do formulário.
	 * Caso contrário, exibe uma mensagem de erro.
	 * O botão cadastrar é habilitado após a atualização.
	 * @param evt 
	 */
   private void bntAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntAlterarActionPerformed

		if (!empty()) {

			if (!validacompos()) {

				atualizaFilme();

			}

			limparDados();
		}
		bntCadastrar.setEnabled(true);
   }//GEN-LAST:event_bntAlterarActionPerformed
	
	/**Remove a linha selecionada na tabela de filmes e limpa os campos de texto e a seleção de linha.
	 * Se nenhuma linha for selecionada, não faz nada.
	 * @param evt 
	 */
   private void bntExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntExcluirActionPerformed

		int selectedRow = jTableFilmes.getSelectedRow();

		if (selectedRow != -1) { // Verifica se alguma linha da tabela foi selecionada

			int id = Integer.parseInt(jTableFilmes.getValueAt(selectedRow, 0).toString());
			excluirLinha(id);

			System.out.println(id);
			System.out.println(selectedRow);
		}

		System.out.println(selectedRow);

		tabelaFilmes.setNumRows(0);
		limparDados();
		txtNomeFilme.requestFocus();
		bntCadastrar.setEnabled(true);


   }//GEN-LAST:event_bntExcluirActionPerformed
	
	/**Atualiza a tabela de filmes exibida de acordo com o texto de filtro inserido no campo de filtro.
	 * O método chama o método addTabela() passando o texto do campo de filtro como parâmetro.
	 * @param evt um evento CaretEvent que ocorre quando o cursor é movido dentro do JTextComponent.
	 */	 
   private void txtFiltroCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFiltroCaretUpdate

		this.addTabela(txtFiltro.getText());

   }//GEN-LAST:event_txtFiltroCaretUpdate

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

	/**Limpa os dados preenchidos nos campos de texto e desabilita os botões de alteração e exclusão. 
	 * Também chama o método addTabela() para atualizar a tabela de filmes com os dados do banco de dados.
	 */
	public void limparDados() {

		txtNomeFilme.setText("");
		fTxtDataLancamento.setText("");
		txtCategoria.setText("");
		txtFiltro.setText("");
		txtNomeFilme.requestFocus();

		bntAlterar.setEnabled(false);
		bntExcluir.setEnabled(false);

		this.addTabela("");

	}

	/**Realiza o cadastro de um filme no banco de dados, utilizando as informações
	 * preenchidas nos campos de texto.
	 * Apos chamada a classe CadastroFilmesDAO com o  método salvar() para  executar no BD a inclusão.
	 */
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

			JOptionPane.showMessageDialog(null, "Erro de Conexão com o BD");

		} else {

			resposta = dao.salvar(cadastro);

			if (resposta == 1) {

				JOptionPane.showMessageDialog(null, "Filme salvo com sucesso!");
				limparDados();
				txtNomeFilme.requestFocus();

			} else {

				JOptionPane.showMessageDialog(null, "Erro ao Salvar, verifique os dados digitados!");
			}

			dao.desconectar();
		}

	}
	
	/**Verifica se os campos do formulário de cadastro de filmes estão preenchidos corretamente.
	 * @return true se os campos estiverem preenchidos corretamente, caso contrário retorna false.
	 */
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
	
	/**Verifica se os campos de Nome do Filme e Categoria do Filme estão vazios.
	 * @return true se os campos estiverem vazios, false caso contrário
	 */
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
	
	/**Método para ocultar a primeira coluna da tabela de filmes
	 * deixando apenas visivel para usuário o que é de interesse do mesmo.
	 */
	public void ocultarColuna() {

		TableColumnModel modeloColuna = jTableFilmes.getColumnModel();
		TableColumn colunaInvisivel = modeloColuna.getColumn(0);

		colunaInvisivel.setMinWidth(0);
		colunaInvisivel.setMaxWidth(1);
	}
	
	/**Exclui um registro de filme com base no ID informado.
	 * @param id 
	 */
	public void excluirLinha(int id) {

		CadastroFilmesDAO dao = new CadastroFilmesDAO();

		boolean status = dao.conectar();

		if (status == false) {

			JOptionPane.showMessageDialog(null, "Erro de Conexão com o BD");

		} else {

			status = dao.excluir(id);

			if (status == true) {

				JOptionPane.showMessageDialog(null, "Funcionário excluído com sucesso!");

			} else {

				JOptionPane.showMessageDialog(null, "Erro na exclusão do funcionário!");

			}
			dao.desconectar();
		}
	}

	/**
	 * Seleciona um registro da tabela de filmes e preenche os campos de texto correspondentes
	 * com os dados do registro selecionado.
	 */
	public void selecaotabela() {

		int selectedRow = jTableFilmes.getSelectedRow();

		if (selectedRow != -1) {

			int id = Integer.parseInt(jTableFilmes.getValueAt(selectedRow, 0).toString());
			String nome = jTableFilmes.getValueAt(selectedRow, 1).toString();
			String dataStr = jTableFilmes.getValueAt(selectedRow, 2).toString();
			String categoria = jTableFilmes.getValueAt(selectedRow, 3).toString();

			SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
			Date data = null;

			try {

				data = dateFormat.parse(dataStr);

			} catch (ParseException ex) {

				System.out.println("Erro dados seleção" + ex.getMessage());

			}

			txtNomeFilme.setText(nome);
			txtCategoria.setText(categoria);
			fTxtDataLancamento.setText(dateFormat.format(data));
			//txtId.setText(String.valueOf(id));

			bntAlterar.setEnabled(true);
			bntExcluir.setEnabled(true);
			bntCadastrar.setEnabled(false);
		}
	}

	/**
	 * Método para Atualizar um filme no Banco de Dados com base nos dados inseridos pelo usuário
	 * e após validação dos dados é chamando o Método atualizar() da classe DAO e enviado o objeto
	 * cadastroFilmes.
	 */
	public void atualizaFilme() {

		CadastroFilmes cadastroFilmes = new CadastroFilmes();
		CadastroFilmesDAO dao;

		int selectedRow = jTableFilmes.getSelectedRow();

		boolean status;
		int resposta;

		if (selectedRow != -1) {

			int id = Integer.parseInt(jTableFilmes.getValueAt(selectedRow, 0).toString());
			cadastroFilmes.setId(id);

			if (!empty() && !validacompos()) {
				cadastroFilmes.setNomeDoFilme(txtNomeFilme.getText());

				String dataString = fTxtDataLancamento.getText();
				SimpleDateFormat formatEntrada = new SimpleDateFormat("dd/MM/yyyy");
				Date dataFormatada = null;

				try {
					dataFormatada = formatEntrada.parse(dataString);
				} catch (ParseException ex) {
					System.out.println("Erro na conversão da Data" + ex.getMessage());
				}
				cadastroFilmes.setDataLacamento(dataFormatada);

				cadastroFilmes.setCategoria(txtCategoria.getText());

				dao = new CadastroFilmesDAO();

				status = dao.conectar();

				if (status == false) {
					JOptionPane.showMessageDialog(null, "Erro de Conexão com o BD");
				} else {
					resposta = dao.atualizar(cadastroFilmes);

					if (resposta == 1) {
						JOptionPane.showMessageDialog(null, "Filme atualizado com sucesso!");
						limparDados();
						txtNomeFilme.requestFocus();
					} else {
						JOptionPane.showMessageDialog(null, "Erro ao atualizar, verifique os dados digitados!");
					}
				}
				dao.desconectar();
			}
		}
	}
}
