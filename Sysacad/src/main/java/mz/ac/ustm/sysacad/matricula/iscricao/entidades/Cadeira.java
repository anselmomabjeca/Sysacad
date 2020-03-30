package mz.ac.ustm.sysacad.matricula.iscricao.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;

import mz.ac.ustm.sysacad.generico.entidade.GenericEntity;

@SuppressWarnings("serial")
@Entity
public class Cadeira extends GenericEntity {
	@Column(length = 5, nullable = true)
	private boolean cadeira_opcional;

	@Column(nullable = false)
	private String nome;

	@Column(length = 5, nullable = true)
	private boolean tem_precedencias;

	@Column(length = 20, nullable = true)
	private String cadeira_precedida;

	@Column(length = 3, nullable = false)
	private Short creditos;
	
	@Column(length = 20, nullable = true)
	private String sigla;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Short getCreditos() {
		return creditos;
	}

	public void setCreditos(Short creditos) {
		this.creditos = creditos;
	}

	public boolean isTem_precedencias() {
		return tem_precedencias;
	}

	public void setTem_precedencias(boolean tem_precedencias) {
		this.tem_precedencias = tem_precedencias;
	}

	public String getCadeira_precedida() {
		return cadeira_precedida;
	}

	public void setCadeira_precedida(String cadeira_precedida) {
		this.cadeira_precedida = cadeira_precedida;
	}

	public boolean isCadeira_opcional() {
		return cadeira_opcional;
	}

	public void setCadeira_opcional(boolean cadeira_opcional) {
		this.cadeira_opcional = cadeira_opcional;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
