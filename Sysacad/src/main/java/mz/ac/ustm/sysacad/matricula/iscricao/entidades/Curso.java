package mz.ac.ustm.sysacad.matricula.iscricao.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import mz.ac.ustm.sysacad.generico.entidade.GenericEntity;

@SuppressWarnings("serial")
@Entity
public class Curso extends GenericEntity {
	@Column(length = 50, nullable = false)
	private String nome;

	@Column(length = 5, nullable = false)
	private String codigo_curso;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Faculdade faculdade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Faculdade getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(Faculdade faculdade) {
		this.faculdade = faculdade;
	}

	public String getCodigo_curso() {
		return codigo_curso;
	}

	public void setCodigo_curso(String codigo_curso) {
		this.codigo_curso = codigo_curso;
	}
}
