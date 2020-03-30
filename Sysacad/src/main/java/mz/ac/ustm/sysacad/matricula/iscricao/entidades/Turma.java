package mz.ac.ustm.sysacad.matricula.iscricao.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;

import mz.ac.ustm.sysacad.generico.entidade.GenericEntity;

@SuppressWarnings("serial")
@Entity
public class Turma extends GenericEntity{
	
	@Column(length = 11, nullable = false)
	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	

}
