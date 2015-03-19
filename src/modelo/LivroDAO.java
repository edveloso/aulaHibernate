package modelo;


public class LivroDAO extends HibernateDAO<Livro>{

	public LivroDAO() {
		super(HibernatUtil.getSession());
	}

	
}
