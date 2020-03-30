package mz.ac.ustm.sysacad.segundaPartedoPrimeiroModulodo;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import mz.ac.ustm.sysacad.generico.entidade.GenericEntity;
import mz.ac.ustm.sysacad.matricula.iscricao.entidades.Cadeira;


public class Lecionamento extends GenericEntity{

	@ManyToOne
	@JoinColumn(nullable = false)
	private Docente docente;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Cadeira cadeira;

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public Cadeira getCadeira() {
		return cadeira;
	}

	public void setCadeira(Cadeira cadeira) {
		this.cadeira = cadeira;
	}

}
