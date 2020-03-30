package mz.ac.ustm.sysacad.generico.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Provincia extends GenericEntity {

	@Column(length = 13, nullable = false)
	private String nome;

	@Column(length = 3, nullable = false)
	private String sigla;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
