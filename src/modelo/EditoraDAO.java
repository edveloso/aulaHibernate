package modelo;

public class EditoraDAO  extends HibernateDAO<Editora>{
	
	public EditoraDAO() {
		super(HibernatUtil.getSession());
	}
	
}
