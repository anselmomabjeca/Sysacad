package mz.ac.ustm.sysacad.matricula.iscricao.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import mz.ac.ustm.sysacad.generico.entidade.GenericEntity;
import mz.ac.ustm.sysacad.generico.entidade.Provincia;

@SuppressWarnings("serial")
@Entity
public class HistoricoEstudante extends GenericEntity{

	private String ano_conclusao_nivel_medio;

	@Column(length = 16, nullable = false)
	private String tipo_ensino;

	@Column(length = 17, nullable = false)
	private String via_ingresso_ustm;
	
	@Column(length = 5, nullable = false)
	private boolean tem_matricula_anterior_outro_curso;
	
	@Column(length = 50, nullable = false)
	private Curso nome_curso_anterior_matriculado;
	
	@Column(length = 50, nullable = false)
	private String primeiro_ano_matricula;
	
	@Column(length = 50, nullable = false)
	private String ano_mudanca_curso;
	
	@Column(length = 17, nullable = true)
	private String via_mudanca_curso;

	@Column(length = 5, nullable = true)
	private boolean tem_matricula_anterior_outro_turno;
	
	@Column(length = 11, nullable = true)
	private String nome_turno;
	
	@Column(length = 4, nullable = true)
	private String ano_mudanca_turno;
	
	@Column(length = 17, nullable = true)
	private String via_mudanca_turno;

	@Column(length = 5, nullable = true)
	private boolean tem_algum_curso_superior;
	
	@Column(length = 50, nullable = true)
	private String nome_curso_superior_possui;
	
	@Column(length = 50, nullable = true)
	private String instituicao_onde_teve_curso_superior;
	
	@Column(length = 12, nullable = true)
	private String grau_obtido;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Provincia provincia;

	public String getTipo_ensino() {
		return tipo_ensino;
	}

	public void setTipo_ensino(String tipo_ensino) {
		this.tipo_ensino = tipo_ensino;
	}

	public String getVia_ingresso_ustm() {
		return via_ingresso_ustm;
	}

	public void setVia_ingresso_ustm(String via_ingresso_ustm) {
		this.via_ingresso_ustm = via_ingresso_ustm;
	}

	public boolean isTem_matricula_anterior_outro_curso() {
		return tem_matricula_anterior_outro_curso;
	}

	public void setTem_matricula_anterior_outro_curso(boolean tem_matricula_anterior_outro_curso) {
		this.tem_matricula_anterior_outro_curso = tem_matricula_anterior_outro_curso;
	}

	public Curso getNome_curso_anterior_matriculado() {
		return nome_curso_anterior_matriculado;
	}

	public void setNome_curso_anterior_matriculado(Curso nome_curso_anterior_matriculado) {
		this.nome_curso_anterior_matriculado = nome_curso_anterior_matriculado;
	}


	public String getVia_mudanca_curso() {
		return via_mudanca_curso;
	}

	public void setVia_mudanca_curso(String via_mudanca_curso) {
		this.via_mudanca_curso = via_mudanca_curso;
	}

	public boolean isTem_matricula_anterior_outro_turno() {
		return tem_matricula_anterior_outro_turno;
	}

	public void setTem_matricula_anterior_outro_turno(boolean tem_matricula_anterior_outro_turno) {
		this.tem_matricula_anterior_outro_turno = tem_matricula_anterior_outro_turno;
	}

	public String getNome_turno() {
		return nome_turno;
	}

	public void setNome_turno(String nome_turno) {
		this.nome_turno = nome_turno;
	}

	public String getVia_mudanca_turno() {
		return via_mudanca_turno;
	}

	public void setVia_mudanca_turno(String via_mudanca_turno) {
		this.via_mudanca_turno = via_mudanca_turno;
	}

	public boolean isTem_algum_curso_superior() {
		return tem_algum_curso_superior;
	}

	public void setTem_algum_curso_superior(boolean tem_algum_curso_superior) {
		this.tem_algum_curso_superior = tem_algum_curso_superior;
	}

	public String getNome_curso_superior_possui() {
		return nome_curso_superior_possui;
	}

	public void setNome_curso_superior_possui(String nome_curso_superior_possui) {
		this.nome_curso_superior_possui = nome_curso_superior_possui;
	}

	public String getInstituicao_onde_teve_curso_superior() {
		return instituicao_onde_teve_curso_superior;
	}

	public void setInstituicao_onde_teve_curso_superior(String instituicao_onde_teve_curso_superior) {
		this.instituicao_onde_teve_curso_superior = instituicao_onde_teve_curso_superior;
	}

	public String getGrau_obtido() {
		return grau_obtido;
	}

	public void setGrau_obtido(String grau_obtido) {
		this.grau_obtido = grau_obtido;
	}


	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}

	public String getAno_conclusao_nivel_medio() {
		return ano_conclusao_nivel_medio;
	}

	public void setAno_conclusao_nivel_medio(String ano_conclusao_nivel_medio) {
		this.ano_conclusao_nivel_medio = ano_conclusao_nivel_medio;
	}

	public String getPrimeiro_ano_matricula() {
		return primeiro_ano_matricula;
	}

	public void setPrimeiro_ano_matricula(String primeiro_ano_matricula) {
		this.primeiro_ano_matricula = primeiro_ano_matricula;
	}

	public String getAno_mudanca_curso() {
		return ano_mudanca_curso;
	}

	public void setAno_mudanca_curso(String ano_mudanca_curso) {
		this.ano_mudanca_curso = ano_mudanca_curso;
	}

	public String getAno_mudanca_turno() {
		return ano_mudanca_turno;
	}

	public void setAno_mudanca_turno(String ano_mudanca_turno) {
		this.ano_mudanca_turno = ano_mudanca_turno;
	}
	
}
