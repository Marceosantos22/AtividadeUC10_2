
package Data;

import java.util.Date;

/**Construtor padrão da classe CadastroFilmes.
 * @author Marcelo Oliveira
 */
public class CadastroFilmes {
	
	private int id;
	private String nomeDoFilme;
	private Date dataLacamento;
	private String categoria;
	
	
	public CadastroFilmes() {

	}
	/**Construtor com parâmetros da classe CadastroFilmes.
	 * @param id
	 * @param nomeDoFilme
	 * @param dataLacamento
	 * @param categoria 
	 */
	public CadastroFilmes(int id, String nomeDoFilme, Date dataLacamento, String categoria) {
		this.id = id;
		this.nomeDoFilme = nomeDoFilme;
		this.dataLacamento = dataLacamento;
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomeDoFilme() {
		return nomeDoFilme;
	}

	public void setNomeDoFilme(String nomeDoFilme) {
		this.nomeDoFilme = nomeDoFilme;
	}

	public Date getDataLacamento() {
		return dataLacamento;
	}

	public void setDataLacamento(Date dataLacamento) {
		this.dataLacamento = dataLacamento;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
}

