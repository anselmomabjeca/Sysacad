package mz.ac.ustm.sysacad.matricula.iscricao.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import mz.ac.ustm.sysacad.generico.entidade.GenericEntity;

@SuppressWarnings("serial")
@Entity
public class Matricula extends GenericEntity {
	@Column(length = 10, nullable = false)
	private String codigo_matricula;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Curso curso;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Estudante estudante;

	public String getCodigo_matricula() {
		return codigo_matricula;
	}

	public void setCodigo_matricula(String codigo_matricula) {
		this.codigo_matricula = codigo_matricula;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Estudante getEstudante() {
		return estudante;
	}

	public void setEstudante(Estudante estudante) {
		this.estudante = estudante;
	}

}
