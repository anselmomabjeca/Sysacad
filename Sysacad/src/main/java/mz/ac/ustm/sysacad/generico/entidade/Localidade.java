package mz.ac.ustm.sysacad.generico.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Localidade extends GenericEntity {
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Distrito distrito;

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
