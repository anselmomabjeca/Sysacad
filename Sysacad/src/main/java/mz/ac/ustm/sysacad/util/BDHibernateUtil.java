package mz.ac.ustm.sysacad.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class BDHibernateUtil {
	private static SessionFactory fabricaDeSessoes = criarFabricaDeSessoes();

	public static SessionFactory getFabricaDeSessoes() {
		return fabricaDeSessoes;
	}

	private static SessionFactory criarFabricaDeSessoes() {
		try {
			//Procurando e lendo as configuracoes de do ficheiro hibernate.cfg.xml
			Configuration configuracao = new Configuration().configure();
			//Construindo o registo
			ServiceRegistry registro = new StandardServiceRegistryBuilder().applySettings(configuracao.getProperties()).build();
			//Criando a fabrica de sessoes
			SessionFactory fabrica = configuracao.buildSessionFactory(registro);
			
			return fabrica;
			 
		} catch (Throwable ex) {
			System.err.println("A fábrica de sessões não pode ser criada!. " + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
}

