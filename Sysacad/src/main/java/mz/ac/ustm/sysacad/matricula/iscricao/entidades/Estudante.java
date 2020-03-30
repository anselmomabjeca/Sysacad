package mz.ac.ustm.sysacad.matricula.iscricao.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import mz.ac.ustm.sysacad.generico.entidade.GenericEntity;
import mz.ac.ustm.sysacad.generico.entidade.Pessoa;

@SuppressWarnings("serial")
@Entity
public class Estudante extends GenericEntity {
	@Column( nullable = false)
	private String codigo_estudante;
	
	@Column(length = 5, nullable = false)
	private boolean estudante_bolseiro;
	
	@Column(length = 50, nullable = true)
	private String doador_bolsa;
	
	@Column(length = 5, nullable = false)
	private boolean estudante_possui_profissao_remuneravel;
	
	@Column(length = 50, nullable = true)
	private String estudante_local_trabalho;
	
	@Column(length = 50, nullable = true)
	private String estudante_endereco_trabalho;
	
	@Column(length = 2, nullable = true)
	private int estudante_tamanho_agregado;
	
	@Column(length = 50, nullable = false)
	private String nome_encarregado_de_educacao;
	
	@Column(length = 7, nullable = true)
	private String encarregado_de_educacao_grau_parentesco;
	
	@Column(length = 2, nullable = true)
	private String encarregado_de_educacao_profissao;
	

	@ManyToOne
	@JoinColumn(nullable = false)
	private HistoricoEstudante historico_estudante;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public String getCodigo_estudante() {
		return codigo_estudante;
	}

	public void setCodigo_estudante(String codigo_estudante) {
		this.codigo_estudante = codigo_estudante;
	}

	public boolean isEstudante_bolseiro() {
		return estudante_bolseiro;
	}

	public void setEstudante_bolseiro(boolean estudante_bolseiro) {
		this.estudante_bolseiro = estudante_bolseiro;
	}

	public String getDoador_bolsa() {
		return doador_bolsa;
	}

	public void setDoador_bolsa(String doador_bolsa) {
		this.doador_bolsa = doador_bolsa;
	}

	public boolean isEstudante_possui_profissao_remuneravel() {
		return estudante_possui_profissao_remuneravel;
	}

	public void setEstudante_possui_profissao_remuneravel(boolean estudante_possui_profissao_remuneravel) {
		this.estudante_possui_profissao_remuneravel = estudante_possui_profissao_remuneravel;
	}

	public String getEstudante_local_trabalho() {
		return estudante_local_trabalho;
	}

	public void setEstudante_local_trabalho(String estudante_local_trabalho) {
		this.estudante_local_trabalho = estudante_local_trabalho;
	}

	public String getEstudante_endereco_trabalho() {
		return estudante_endereco_trabalho;
	}

	public void setEstudante_endereco_trabalho(String estudante_endereco_trabalho) {
		this.estudante_endereco_trabalho = estudante_endereco_trabalho;
	}

	public int getEstudante_tamanho_agregado() {
		return estudante_tamanho_agregado;
	}

	public void setEstudante_tamanho_agregado(int estudante_tamanho_agregado) {
		this.estudante_tamanho_agregado = estudante_tamanho_agregado;
	}

	public String getNome_encarregado_de_educacao() {
		return nome_encarregado_de_educacao;
	}

	public void setNome_encarregado_de_educacao(String nome_encarregado_de_educacao) {
		this.nome_encarregado_de_educacao = nome_encarregado_de_educacao;
	}

	public String getEncarregado_de_educacao_grau_parentesco() {
		return encarregado_de_educacao_grau_parentesco;
	}

	public void setEncarregado_de_educacao_grau_parentesco(String encarregado_de_educacao_grau_parentesco) {
		this.encarregado_de_educacao_grau_parentesco = encarregado_de_educacao_grau_parentesco;
	}

	public String getEncarregado_de_educacao_profissao() {
		return encarregado_de_educacao_profissao;
	}

	public void setEncarregado_de_educacao_profissao(String encarregado_de_educacao_profissao) {
		this.encarregado_de_educacao_profissao = encarregado_de_educacao_profissao;
	}

	public HistoricoEstudante getHistorico_estudante() {
		return historico_estudante;
	}

	public void setHistorico_estudante(HistoricoEstudante historico_estudante) {
		this.historico_estudante = historico_estudante;
	}

}
