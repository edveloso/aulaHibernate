package modelo.persistencia;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Session;

public abstract class HibernateDAO<T> implements DAO<T>{

	private Class clazz;
	protected Session session;
	
	public HibernateDAO(Session session) {
		this.session = session;
		 ParameterizedType pt = (ParameterizedType)  this.getClass().getGenericSuperclass();
		 clazz = (Class<T>) pt.getActualTypeArguments()[0];
	}
	
	@Override
	public void salvar(T obj) {
		session.beginTransaction();
		session.save(obj);
		session.getTransaction().commit();
	}

	@Override
	public void atualizar(T obj) {
		session.beginTransaction();
		session.update(obj);
		session.getTransaction().commit();
	}

	@Override
	public void deletar(Integer codigo) {
		session.beginTransaction();
		T obj = getByCodigo(codigo);
		session.delete(obj);
		session.getTransaction().commit();
	}

	@Override
	public List<T> listar() {
		return session.createCriteria(clazz).list();
	}

	@Override
	public T getByCodigo(Integer codigo) {
		return (T) session.load(clazz, codigo);
	}

}
