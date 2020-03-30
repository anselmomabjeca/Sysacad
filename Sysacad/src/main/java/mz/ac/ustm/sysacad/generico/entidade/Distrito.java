package mz.ac.ustm.sysacad.generico.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Distrito extends GenericEntity {
	@Column(length = 30, nullable = false)
	private String nome;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Provincia provincia;

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
