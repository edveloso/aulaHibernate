package modelo.persistencia.imp;

import modelo.Editora;
import modelo.persistencia.HibernateDAO;


public class EditoraDAO extends HibernateDAO<Editora> {

	public EditoraDAO() {
		super(HibernatUtil.getSession());
	}

}
