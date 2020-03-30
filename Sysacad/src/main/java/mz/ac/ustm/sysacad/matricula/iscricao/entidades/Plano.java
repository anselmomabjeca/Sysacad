package mz.ac.ustm.sysacad.matricula.iscricao.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import mz.ac.ustm.sysacad.generico.entidade.GenericEntity;

@SuppressWarnings("serial")
@Entity
public class Plano extends GenericEntity{
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Curso curso;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Cadeira cadeira;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Cadeira getCadeira() {
		return cadeira;
	}

	public void setCadeira(Cadeira cadeira) {
		this.cadeira = cadeira;
	}
	

}
