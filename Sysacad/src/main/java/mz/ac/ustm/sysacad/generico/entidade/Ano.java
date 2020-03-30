package mz.ac.ustm.sysacad.generico.entidade;

import javax.persistence.Column;


public class Ano extends GenericEntity {
	@Column(length = 4, nullable = false)
	private Short ano;

	public Short getAno() {
		return ano;
	}

	public void setAno(Short ano) {
		this.ano = ano;
	}

}
