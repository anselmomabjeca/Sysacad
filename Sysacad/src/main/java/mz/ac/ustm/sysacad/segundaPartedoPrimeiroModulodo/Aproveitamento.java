package mz.ac.ustm.sysacad.segundaPartedoPrimeiroModulodo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import mz.ac.ustm.sysacad.generico.entidade.GenericEntity;
import mz.ac.ustm.sysacad.matricula.iscricao.entidades.CadeiraInscricao;
import mz.ac.ustm.sysacad.matricula.iscricao.entidades.TurmaInscricao;


public class Aproveitamento extends GenericEntity{
	@ManyToOne
	@JoinColumn(nullable = false)
	public TurmaInscricao turmaInscricao;

	@ManyToOne
	@JoinColumn(nullable = false)
	public CadeiraInscricao cadeiraInscricao;

	public TurmaInscricao getTurmaInscricao() {
		return turmaInscricao;
	}

	public void setTurmaInscricao(TurmaInscricao turmaInscricao) {
		this.turmaInscricao = turmaInscricao;
	}

	public CadeiraInscricao getCadeiraInscricao() {
		return cadeiraInscricao;
	}

	public void setCadeiraInscricao(CadeiraInscricao cadeiraInscricao) {
		this.cadeiraInscricao = cadeiraInscricao;
	}

}
