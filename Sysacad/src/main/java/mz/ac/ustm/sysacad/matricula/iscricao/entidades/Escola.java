package mz.ac.ustm.sysacad.matricula.iscricao.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

import mz.ac.ustm.sysacad.generico.entidade.Distrito;
import mz.ac.ustm.sysacad.generico.entidade.GenericEntity;

@SuppressWarnings("serial")
@Entity
public class Escola extends GenericEntity {
	@Column(length = 50, nullable = false)
	private String nome;

	@ManyToOne
	private Distrito distrito;

	public String getNome() {
		return nome;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
