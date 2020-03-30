package mz.ac.ustm.sysacad.generico.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;

@SuppressWarnings("serial")
@Entity
public class Endereco extends GenericEntity {
	@JoinColumn(nullable = false)
	private Provincia provincia;
	
	@JoinColumn(nullable = false)
	private Distrito distrito;
	
	@JoinColumn(nullable = false)
	private Localidade localidade;
	
	@Column(length = 12, nullable = false)
	private String cidade;
	
	@Column(length = 30, nullable = false)
	private String rua;
	
	@Column(length = 30, nullable = false)
	private String avenida;
	
	@Column(length = 3, nullable = true)
	private Short numero_flat;
	
	@Column(length = 3, nullable = true)
	private Short numero_casa;
	
	@Column(length = 3, nullable = true)
	private Short quarteirao;

	public Short getNumero_flat() {
		return numero_flat;
	}

	public void setNumero_flat(Short numero_flat) {
		this.numero_flat = numero_flat;
	}

	public Short getNumero_casa() {
		return numero_casa;
	}

	public void setNumero_casa(Short numero_casa) {
		this.numero_casa = numero_casa;
	}

	public Short getQuarteirao() {
		return quarteirao;
	}

	public void setQuarteirao(Short quarteirao) {
		this.quarteirao = quarteirao;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Distrito getDistrito() {
		return distrito;
	}

	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}

	public Localidade getLocalidade() {
		return localidade;
	}

	public void setLocalidade(Localidade localidade) {
		this.localidade = localidade;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getAvenida() {
		return avenida;
	}

	public void setAvenida(String avenida) {
		this.avenida = avenida;
	}
}
