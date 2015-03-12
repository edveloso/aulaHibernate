package modelo;

import java.util.List;

import org.hibernate.Session;

public class LivroDAO {

	private Session session;
	
	public LivroDAO() {
		session = HibernatUtil.getSession();
	}
	
	public void salvar(Livro livro){
		session.beginTransaction();
		session.save(livro);
		session.getTransaction().commit();
	}
	
	public void atualizar(Livro livro ){
		session.beginTransaction();
		session.update(livro);
		session.getTransaction().commit();
	}

	public void deletar(Integer codigo){
		session.beginTransaction();
		Livro livro = getByCodigo(codigo);
		session.delete(livro);
		session.getTransaction().commit();
	}
	
	public List<Livro> listar(){
		return session.createCriteria(Livro.class).list();
	}
	
	public Livro getByCodigo(Integer codigo){
		return (Livro) session.load(Livro.class, codigo);
	}
}
