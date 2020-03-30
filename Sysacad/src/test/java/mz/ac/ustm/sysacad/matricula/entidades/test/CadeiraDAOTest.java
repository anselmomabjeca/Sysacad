package mz.ac.ustm.sysacad.matricula.entidades.test;

import java.util.List;

import org.junit.Ignore;
import org.junit.Test;

import mz.ac.ustm.sysacad.matricula.iscricao.dao.CadeiraDAO;
import mz.ac.ustm.sysacad.matricula.iscricao.entidades.Cadeira;


public class CadeiraDAOTest {
	@Test
	@Ignore
	public void salvar() {
		CadeiraDAO cadeiraDAO = new CadeiraDAO();
		Cadeira cadeira = new Cadeira();
		cadeira.setNome("Programacao I");
		cadeiraDAO.gravar(cadeira);
	}

	@Test
	@Ignore
	public void buscar() {
		CadeiraDAO cadeiraDAO = new CadeiraDAO();
		Cadeira cadeira = cadeiraDAO.buscarPorCodigo(3L);
		System.out.println("CODIGO: " + cadeira.getCodigo());
		System.out.println("NOME:  " + cadeira.getNome());
	}

	@Test
	@Ignore
	public void buscarTodos() {
		CadeiraDAO cadeiraDAO = new CadeiraDAO();
		List<Cadeira> cadeiras = cadeiraDAO.buscarTodos();
		for (Cadeira cadeira : cadeiras) {
			System.out.println("CODIGO: "+cadeira.getCodigo());
			System.out.println("NOME: "+cadeira.getNome());
			System.out.println("------------------------");
		}
	}

	@Test
	@Ignore
	public void editar() {
		CadeiraDAO cadeiraDAO = new CadeiraDAO();
		Cadeira cadeira = cadeiraDAO.buscarPorCodigo(3L);
		cadeira.setNome("Programacao II");
		cadeiraDAO.editar(cadeira);
	}
	
	@Test
	@Ignore
	public void remover() {
		CadeiraDAO cadeiraDAO = new CadeiraDAO();
		Cadeira cadeira = cadeiraDAO.buscarPorCodigo(6L);
		cadeiraDAO.apagar(cadeira);
	}

}
