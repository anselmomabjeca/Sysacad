package mz.ac.ustm.sysacad.matricula.iscricao.entidades;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import mz.ac.ustm.sysacad.generico.entidade.GenericEntity;

@SuppressWarnings("serial")
@Entity
public class TurmaInscricao extends GenericEntity{
	@ManyToOne
	@JoinColumn(nullable = false)
	private Turma turma;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Inscricao inscricao;


	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Inscricao getInscricao() {
		return inscricao;
	}

	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}

}
