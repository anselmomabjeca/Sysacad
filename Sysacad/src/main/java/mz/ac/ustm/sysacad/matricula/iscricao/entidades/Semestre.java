package mz.ac.ustm.sysacad.matricula.iscricao.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;

import mz.ac.ustm.sysacad.generico.entidade.GenericEntity;

@SuppressWarnings("serial")
@Entity
public class Semestre extends GenericEntity{
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String ano_academico;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAno_academico() {
		return ano_academico;
	}

	public void setAno_academico(String ano_academico) {
		this.ano_academico = ano_academico;
	}

}
