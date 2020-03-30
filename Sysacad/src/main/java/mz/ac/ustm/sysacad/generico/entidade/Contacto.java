package mz.ac.ustm.sysacad.generico.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Contacto extends GenericEntity {
	@Column(length = 8, nullable = false)
	private String tipo; // Telefone, Celular, Fax

	@Column(length = 12, nullable = false)
	private String numero;

	@Column(length = 50, nullable = false)
	private String proprietario;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getLocal() {
		return proprietario;
	}

	public void setLocal(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
