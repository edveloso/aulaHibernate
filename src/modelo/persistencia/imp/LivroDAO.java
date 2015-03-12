package modelo.persistencia.imp;

import modelo.Livro;
import modelo.persistencia.HibernateDAO;

public class LivroDAO extends HibernateDAO<Livro> {
	
	public LivroDAO() {
		super(HibernatUtil.getSession());
	}
	
}
