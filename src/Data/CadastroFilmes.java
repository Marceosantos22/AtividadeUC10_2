//Concluído enviado Git
package Data;

import java.util.Date;


public class CadastroFilmes {

	private String nomeDoFilme;
	private Date dataLacamento;
	private String categoria;

	public CadastroFilmes() {

	}

	public CadastroFilmes(String nomeDoFilme, Date dataLacamento, String categoria) {
		this.nomeDoFilme = nomeDoFilme;
		this.dataLacamento = dataLacamento;
		this.categoria = categoria;
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
