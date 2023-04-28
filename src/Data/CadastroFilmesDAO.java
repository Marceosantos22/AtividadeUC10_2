package Data;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**Classe responsável por gerenciar a conexão com o banco de dados e executar operações no 
 * banco de dados relacionadas à tabela de filmes. * 
 * @author Marcelo Oliveira
 */
public class CadastroFilmesDAO {

	Connection conn;
	PreparedStatement st;
	ResultSet rs;

	
	/**Conecta-se ao banco de dados.
	 * @return true se a conexão for bem sucedida, false caso contrário.
	 */
	public boolean conectar() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cenaflix", "root", "");

			return true;

		} catch (ClassNotFoundException | SQLException ex) {

			System.out.println("Erro ao conectar: " + ex.getMessage());
			return false;

		}

	}

	/**
	 * Desconecta-se do banco de dados.
	 */
	public void desconectar() {
		try {

			conn.close();

		} catch (SQLException e) {

		}

	}

	/**Salva um objeto CadastroFilmes no banco de dados.
	* @param cadastroFilmes o objeto a ser salvo.
	* @return o status da operação de salvamento.	 
	*/
	public int salvar(CadastroFilmes cadastroFilmes) {

		int status;

		try {

			st = conn.prepareStatement("INSERT INTO filmes  (nome, datalancamento, categoria) VALUES(?,?,?)");
			st.setString(1, cadastroFilmes.getNomeDoFilme());
			st.setDate(2, new java.sql.Date(cadastroFilmes.getDataLacamento().getTime()));
			st.setString(3, cadastroFilmes.getCategoria());

			status = st.executeUpdate();
			return status;

		} catch (SQLException ex) {

			System.out.println("Erro ao conectar: " + ex.getMessage());
			return ex.getErrorCode();

		}
	}

	/**Lista os filmes do banco de dados.
	 * @param Categoria uma string que representa a categoria de filmes
	 * a serem listados. Se estiver vazio, todos os filmes serão listados.
	 * @return uma lista de objetos CadastroFilmes.
	 */
	public List<CadastroFilmes> listTable(String Categoria) {

		String sql = "SELECT * FROM filmes";

		if (!Categoria.isEmpty()) {

			sql = sql + " WHERE categoria LIKE ? ";

		}

		try {

			st = conn.prepareStatement(sql);

			if (!Categoria.isEmpty()) {

				st.setString(1, "%" + Categoria + "%");
			}

			rs = st.executeQuery();

			List<CadastroFilmes> lista = new ArrayList<>();

			while (rs.next()) {

				CadastroFilmes filmes = new CadastroFilmes();

				filmes.setId(rs.getInt("id"));
				filmes.setNomeDoFilme(rs.getString("nome"));
				filmes.setCategoria(rs.getString("categoria"));

				SimpleDateFormat formatEntrada = new SimpleDateFormat("yyyy-MM-dd");
				Date dataLancamento = formatEntrada.parse(rs.getString("datalancamento"));
				filmes.setDataLacamento(dataLancamento);

				lista.add(filmes);
			}

			return lista;

			} catch (SQLException | ParseException ex) {

				System.out.println("Erro ao pesquisar: " + ex.getMessage());

				return null;
			}

	}
	/**Método para excluir um registro do banco de dados
	 * @param id
	 * @return o status da operação de exclusão.
	 */
	public boolean excluir(int id) {

		try {

			st = conn.prepareStatement("DELETE FROM filmes WHERE id = ?");
			st.setInt(1, id);
			st.executeUpdate();

			return true;

		} catch (SQLException ex) {

			return false;

		}

	}
	/**Método responsável por atualizar os dados de um filme no banco de dados.
	 * Recebe como parâmetro um objeto CadastroFilmes contendo os novos dados do filme.
	 * @param cadastroFilmes
	 * @return Retorna o número de linhas afetadas pela operação ou o código de erro caso ocorra uma exceção SQL.
	 */
	public int atualizar(CadastroFilmes cadastroFilmes) {
		
		int status;
		
		try {
			
			st = conn.prepareStatement("UPDATE filmes SET nome = ?, datalancamento = ?, categoria = ? WHERE id = ?");
			st.setString(1, cadastroFilmes.getNomeDoFilme());
			st.setDate(2, new java.sql.Date(cadastroFilmes.getDataLacamento().getTime()));
			st.setString(3, cadastroFilmes.getCategoria());
			st.setInt(4, cadastroFilmes.getId());

			status = st.executeUpdate();

			return status;
			
		} catch (SQLException ex) {
			
			System.out.println(ex.getErrorCode());
			return ex.getErrorCode();
			
		}
	}
}
