package mz.ac.ustm.sysacad.matricula.iscricao.entidades;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import mz.ac.ustm.sysacad.generico.entidade.GenericEntity;

@SuppressWarnings("serial")
@Entity
public class CadeiraInscricao extends GenericEntity {

	@ManyToOne
	@JoinColumn(nullable = false)
	private Cadeira cadeira;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Inscricao inscricao;

	public Cadeira getCadeira() {
		return cadeira;
	}

	public Inscricao getInscricao() {
		return inscricao;
	}

	public void setInscricao(Inscricao inscricao) {
		this.inscricao = inscricao;
	}

	public void setCadeira(Cadeira cadeira) {
		this.cadeira = cadeira;
	}

}
