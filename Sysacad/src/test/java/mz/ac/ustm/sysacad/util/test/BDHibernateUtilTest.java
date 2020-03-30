package mz.ac.ustm.sysacad.util.test;

import org.hibernate.Session;
import org.junit.Test;

import mz.ac.ustm.sysacad.util.BDHibernateUtil;

public class BDHibernateUtilTest {
	@Test
	public void conectar() {
		Session session = BDHibernateUtil.getFabricaDeSessoes().openSession();
		session.close();
		BDHibernateUtil.getFabricaDeSessoes().close();
		System.out.println("Conectado a base de dados!");
		//Acesso a base de dados(Alterado do Git)
		
	}

}
