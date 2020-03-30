package mz.ac.ustm.sysacad.matricula.iscricao.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import mz.ac.ustm.sysacad.matricula.iscricao.dao.CadeiraDAO;
import mz.ac.ustm.sysacad.matricula.iscricao.entidades.Cadeira;

/***
 * 
 * @author ansel
 *
 */

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class CadeiraBean implements Serializable {
	private Cadeira cadeira;
	private List<Cadeira> cadeiras;

	public Cadeira getCadeira() {
		return cadeira;
	}
	public void setCadeira(Cadeira cadeira) {
		this.cadeira = cadeira;
	}
	public List<Cadeira> getCadeiras() {
		return cadeiras;
	}
	public void setCadeiras(List<Cadeira> cadeiras) {
		this.cadeiras = cadeiras;
	}
	@PostConstruct
	public void listar() {
		try {
			CadeiraDAO cadeiraDAO = new CadeiraDAO();
			cadeiras = cadeiraDAO.buscarTodos();
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro :(");
			erro.printStackTrace();
		}
	}
	public void novo() {
		cadeira = new Cadeira();
	}
	
	public void salvar() {
		try {
			CadeiraDAO cadeiraDAO = new CadeiraDAO();
			cadeiraDAO.merge(cadeira);
			
			novo();
			cadeiras = cadeiraDAO.buscarTodos();
			Messages.addGlobalInfo("Operação bem sucedida :)");
			
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro :(");
			erro.printStackTrace();
		}

	}
	public void excluir(ActionEvent evento) {
		try {
			cadeira = (Cadeira)evento.getComponent().getAttributes().get("cadeiraSeleccionada");
			
			CadeiraDAO cadeiraDAO = new CadeiraDAO();
			cadeiraDAO.apagar(cadeira);
			
			cadeiras = cadeiraDAO.buscarTodos();
			
			Messages.addGlobalInfo(cadeira.getNome()+" removida com sucesso :) ");
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao apagar :(");
			erro.printStackTrace();
		}
		
		
	}
	public void editar(ActionEvent evento) {
		cadeira = (Cadeira) evento.getComponent().getAttributes().get("cadeiraSeleccionada");
	}

}
