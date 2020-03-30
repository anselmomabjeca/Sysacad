package mz.ac.ustm.sysacad.segundaPartedoPrimeiroModulodo;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import mz.ac.ustm.sysacad.generico.entidade.GenericEntity;
import mz.ac.ustm.sysacad.generico.entidade.Pessoa;

public class Docente extends GenericEntity {
	@ManyToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;

	@Column(length = 10, nullable = false)
	private Date data_inicio_contracto;

	@Column(length = 10)
	private Date data_fim_contracto;

	@Column(length = 1, nullable = false)
	private char tipo_contracto;

	@Column(length = 8, precision = 2)
	private BigDecimal salario;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Date getData_contratacao() {
		return data_inicio_contracto;
	}

	public void setData_contratacao(Date data_inicio_contracto) {
		this.data_inicio_contracto = data_inicio_contracto;
	}

	public Date getData_fim_contrato() {
		return data_fim_contracto;
	}

	public void setData_fim_contrato(Date data_fim_contrato) {
		this.data_fim_contracto = data_fim_contrato;
	}

	public char getTipo_contrato() {
		return tipo_contracto;
	}

	public void setTipo_contrato(char tipo_contrato) {
		this.tipo_contracto = tipo_contrato;
	}

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

}
