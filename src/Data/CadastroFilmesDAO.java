//Concluído enviado Git
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

public class CadastroFilmesDAO {

	Connection conn;
	PreparedStatement st;
	ResultSet rs;

	public boolean conectar() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cenaflix", "root", "F17101818@");

			return true;

		} catch (ClassNotFoundException | SQLException ex) {

			System.out.println("Erro ao conectar: " + ex.getMessage());
			return false;

		}

	}

	public void desconectar() {
		try {

			conn.close();

		} catch (SQLException e) {

		}

	}

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

	public List<CadastroFilmes> consultar(String categoria) {
		
		List<CadastroFilmes> filmesList = new ArrayList<>();

		try {
			
			st = conn.prepareStatement("SELECT * from filmes WHERE categoria LIKE ?");
			st.setString(1, "%" + categoria + "%");
			rs = st.executeQuery();

			while (rs.next()) {
				
				CadastroFilmes cadastroFilmes = new CadastroFilmes();
				
				cadastroFilmes.setNomeDoFilme(rs.getString("nome"));
				cadastroFilmes.setCategoria(rs.getString("categoria"));
				
				SimpleDateFormat formatEntrada = new SimpleDateFormat("yyyy-MM-dd");
				Date dataLancamento = formatEntrada.parse(rs.getString("datalancamento"));
				cadastroFilmes.setDataLacamento(dataLancamento);
				
				filmesList.add(cadastroFilmes);
				
			}
			
		} catch (SQLException | ParseException ex) {
			
			System.out.println("Erro ao pesquisar: " + ex.getMessage());
			
		}

		return filmesList;
	}

}
