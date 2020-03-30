package mz.ac.ustm.sysacad.matricula.entidades.test;

import org.junit.Ignore;
import org.junit.Test;

import mz.ac.ustm.sysacad.generico.dao.ProvinciaDAO;
import mz.ac.ustm.sysacad.generico.entidade.Provincia;

public class ProvinciaDAOTest {
	@Test
	public void gravar() {
		ProvinciaDAO provinciaDAO = new ProvinciaDAO();
		Provincia provincia = new Provincia();

		provincia.setNome("Manica");
		provincia.setSigla("MAN");

		provinciaDAO.gravar(provincia);
		System.out.println("Gravado com secesso :)");
	}

	@Test
	@Ignore
	public void editar() {
		ProvinciaDAO provinciaDAO = new ProvinciaDAO();
		Provincia provincia = provinciaDAO.buscarPorCodigo(7L);

		provincia.setNome("Tete");
		provinciaDAO.editar(provincia);
		System.out.println("Editado com secesso :)");
	}

	@Test
	@Ignore
	public void apagar() {
		ProvinciaDAO provinciaDAO = new ProvinciaDAO();
		Provincia provincia = provinciaDAO.buscarPorCodigo(6L);
		provinciaDAO.apagar(provincia);
		System.out.println("Apagado com secesso :)");
	}

}
