package modelo;

import java.util.List;


public interface DAO<T> {
	
  public void salvar(T obj);
  
  public void atualizar(T obj);
  
  public void deletar(Integer codigo);
  
  public T getByCodigo(Integer codigo);
  
  public List<T> listar();

}
