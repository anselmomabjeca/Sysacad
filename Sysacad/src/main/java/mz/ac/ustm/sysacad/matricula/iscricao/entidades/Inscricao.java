package mz.ac.ustm.sysacad.matricula.iscricao.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import mz.ac.ustm.sysacad.generico.entidade.GenericEntity;

@SuppressWarnings("serial")
@Entity
public class Inscricao extends GenericEntity{
	@Column(length = 10, nullable = false)
	private String codigo_inscricao;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Matricula matricula;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Semestre semestre;


	public Matricula getMatricula() {
		return matricula;
	}

	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}

	public String getCodigo_inscricao() {
		return codigo_inscricao;
	}
	
	public void setCodigo_inscricao(String codigo_inscricao) {
		this.codigo_inscricao = codigo_inscricao;
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

}
