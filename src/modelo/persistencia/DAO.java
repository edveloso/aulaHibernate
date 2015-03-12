package modelo.persistencia;

import java.util.List;

public interface DAO<T> {

	public abstract void salvar(T obj);

	public abstract void atualizar(T obj);

	public abstract void deletar(Integer codigo);

	public abstract List<T> listar();

	public abstract T getByCodigo(Integer codigo);

}