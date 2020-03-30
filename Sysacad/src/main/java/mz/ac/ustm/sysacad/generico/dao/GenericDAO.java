package mz.ac.ustm.sysacad.generico.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import mz.ac.ustm.sysacad.util.BDHibernateUtil;

public abstract class GenericDAO<Entidade> {
	
	private Class<Entidade> classe;
	
	@SuppressWarnings("unchecked")
	public GenericDAO() {
		this.classe = (Class<Entidade>)((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	public void gravar(Entidade entidade) {
		Session sessao = BDHibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transaction = null;
		try {
			transaction = sessao.beginTransaction();
			sessao.save(entidade);
			transaction.commit();
		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
				System.err.println(e);
			}
			throw e;
		} finally {
			sessao.close();
		}
	}
	
	@SuppressWarnings("unchecked")
	public List<Entidade> buscarTodos(){
		Session sessao = BDHibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(classe);
			List<Entidade> resultado = consulta.list();
			return resultado;
		} catch (RuntimeException e) {
			throw e;
		}finally {
			sessao.close();
		}	
	}
	
	@SuppressWarnings("unchecked")
	public Entidade buscarPorCodigo(Long codigo){
		Session sessao = BDHibernateUtil.getFabricaDeSessoes().openSession();
		try {
			Criteria consulta = sessao.createCriteria(classe);
			consulta.add(Restrictions.idEq(codigo));
			Entidade resultado = (Entidade)consulta.uniqueResult();
			return resultado;
		} catch (RuntimeException e) {
			throw e;
		}finally {
			sessao.close();
		}	
	}
	
	public void apagar(Entidade entidade) {
		Session sessao = BDHibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transaction = null;
		try {
			transaction = sessao.beginTransaction();
			sessao.delete(entidade);
			transaction.commit();
		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
				System.err.println(e);
			}
			throw e;
		} finally {
			sessao.close();
		}
	}
	public void editar(Entidade entidade) {
		Session sessao = BDHibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transaction = null;
		try {
			transaction = sessao.beginTransaction();
			sessao.update(entidade);
			transaction.commit();
		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
				System.err.println(e);
			}
			throw e;
		} finally {
			sessao.close();
		}
	}
	
	public Entidade merge(Entidade entidade) {
		Session sessao = BDHibernateUtil.getFabricaDeSessoes().openSession();
		Transaction transaction = null;
		try {
			transaction = sessao.beginTransaction();
			sessao.merge(entidade);
			transaction.commit();
		} catch (RuntimeException e) {
			if (transaction != null) {
				transaction.rollback();
				System.err.println(e);
			}
			throw e;
		} finally {
			sessao.close();
		}
		return entidade;
	}
}
