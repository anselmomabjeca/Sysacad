package mz.ac.ustm.sysacad.generico.entidade;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Pessoa extends GenericEntity {
	@Column(length = 30, nullable = false)
	private String username;
	@Column(length = 30, nullable = false)
	private String password;
	@Column(length = 1, nullable = false)
	private char tipo_usuario;

	@Column(length = 20, nullable = false)
	private String apelido;
	@Column(length = 50, nullable = false)
	private String nome_completo;
	@Column(length = 10, nullable = false)
	private Date data_nascimento;
	@Column(length = 50, nullable = false)
	private String nome_pai;
	@Column(length = 50, nullable = false)
	private String nome_mae;
	@Column(length = 15, nullable = false)
	private String estado_civil;
	@Column(length = 20, nullable = false)
	private String nacionalidade;
	@Column(length = 1, nullable = false)
	private char sexo;
	@Column(length = 9, nullable = false)
	private String nuit;

	@Column(length = 20, nullable = false)
	private String nome_documento_identificacao;
	@Column(length = 14, nullable = false)
	private String numero_documento_identificacao;
	@Column(length = 13, nullable = false)
	private String documento_local_emissao;
	@Column(length = 10, nullable = false)
	private Date documento_data_emissao;
	@Column(length = 10, nullable = false)
	private Date documento_data_validade;
	@Column(length = 50, nullable = false)
	private String email;
	@Column(length = 50, nullable = false)
	private String email_alternativo;
	@Column(length = 13, nullable = false)
	private String nivel_academico;
	@Column(length = 5, nullable = false)
	private boolean activo;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Endereco endereco;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Provincia provincia;

	@ManyToOne
	@JoinColumn(nullable = false)
	private Contacto contacto;

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public String getNivel_academico() {
		return nivel_academico;
	}

	public void setNivel_academico(String nivel_academico) {
		this.nivel_academico = nivel_academico;
	}

	public String getNumero_documento_identificacao() {
		return numero_documento_identificacao;
	}

	public void setNumero_documento_identificacao(String numero_documento_identificacao) {
		this.numero_documento_identificacao = numero_documento_identificacao;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public char getTipo_usuario() {
		return tipo_usuario;
	}

	public void setTipo_usuario(char tipo_usuario) {
		this.tipo_usuario = tipo_usuario;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getNome_pai() {
		return nome_pai;
	}

	public void setNome_pai(String nome_pai) {
		this.nome_pai = nome_pai;
	}

	public String getNome_mae() {
		return nome_mae;
	}

	public void setNome_mae(String nome_mae) {
		this.nome_mae = nome_mae;
	}

	public String getEstado_civil() {
		return estado_civil;
	}

	public void setEstado_civil(String estado_civil) {
		this.estado_civil = estado_civil;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public String getNuit() {
		return nuit;
	}

	public void setNuit(String nuit) {
		this.nuit = nuit;
	}

	public String getNome_documento_identificacao() {
		return nome_documento_identificacao;
	}

	public void setNome_documento_identificacao(String nome_documento_identificacao) {
		this.nome_documento_identificacao = nome_documento_identificacao;
	}

	public String getDocumento_local_emissao() {
		return documento_local_emissao;
	}

	public void setDocumento_local_emissao(String documento_local_emissao) {
		this.documento_local_emissao = documento_local_emissao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail_alternativo() {
		return email_alternativo;
	}

	public void setEmail_alternativo(String email_alternativo) {
		this.email_alternativo = email_alternativo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Contacto getTelefone() {
		return contacto;
	}

	public void setTelefone(Contacto contacto) {
		this.contacto = contacto;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public Date getDocumento_data_emissao() {
		return documento_data_emissao;
	}

	public void setDocumento_data_emissao(Date documento_data_emissao) {
		this.documento_data_emissao = documento_data_emissao;
	}

	public Date getDocumento_data_validade() {
		return documento_data_validade;
	}

	public void setDocumento_data_validade(Date documento_data_validade) {
		this.documento_data_validade = documento_data_validade;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public Contacto getContacto() {
		return contacto;
	}

	public void setContacto(Contacto contacto) {
		this.contacto = contacto;
	}

}
