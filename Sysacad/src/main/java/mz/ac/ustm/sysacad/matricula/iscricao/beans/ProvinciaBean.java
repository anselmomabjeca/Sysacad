package mz.ac.ustm.sysacad.matricula.iscricao.beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.event.ActionEvent;

import org.omnifaces.util.Messages;

import mz.ac.ustm.sysacad.generico.dao.ProvinciaDAO;
import mz.ac.ustm.sysacad.generico.entidade.Provincia;

/***
 * 
 * @author ansel
 *
 */

@SuppressWarnings("serial")
@ManagedBean
@ViewScoped
public class ProvinciaBean implements Serializable{
	private Provincia provincia;
	private List<Provincia> provincias;
	
	public List<Provincia> getProvincias() {
		return provincias;
	}

	public void setProvincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	@PostConstruct
	public void listar() {
		try {
			ProvinciaDAO provinciaDAO = new ProvinciaDAO();
			provincias = provinciaDAO.buscarTodos();
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro :(");
			erro.printStackTrace();
		}
	}
	
	public void novo() {
		provincia = new Provincia();
	}

	public void salvar() {
		try {
			ProvinciaDAO provinciaDAO = new ProvinciaDAO();
			provinciaDAO.merge(provincia);
			
			novo();
			provincias = provinciaDAO.buscarTodos();
			Messages.addGlobalInfo("Operação bem sucedida :)");
			
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro :(");
			erro.printStackTrace();
		}

	}
	public void excluir(ActionEvent evento) {
		try {
			provincia = (Provincia)evento.getComponent().getAttributes().get("provinciaSeleccionada");
			
			ProvinciaDAO provinciaDAO = new ProvinciaDAO();
			provinciaDAO.apagar(provincia);
			
			provincias = provinciaDAO.buscarTodos();
			
			Messages.addGlobalInfo(provincia.getNome()+" removida com sucesso :) ");
		} catch (RuntimeException erro) {
			Messages.addGlobalError("Ocorreu um erro ao apagar :(");
			erro.printStackTrace();
		}
		
		
	}
	public void editar(ActionEvent evento) {
		provincia = (Provincia) evento.getComponent().getAttributes().get("provinciaSeleccionada");
	}
}
