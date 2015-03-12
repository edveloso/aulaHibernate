package visao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import modelo.Autor;
import modelo.Editora;
import modelo.Livro;
import modelo.persistencia.HibernateDAO;
import modelo.persistencia.imp.EditoraDAO;
import modelo.persistencia.imp.HibernatUtil;
import modelo.persistencia.imp.LivroDAO;

public class Formulario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro livro = new Livro();
		livro.setAutor("novo");
		livro.setNome("meu livro favorito");
		livro.setDataPublicacao(new Date());
		livro.setNumeroPagina(200);
		
		Autor autor = new Autor();
		autor.setNome("ednilson veloso");
		
		Autor autor2 = new Autor();
		autor2.setNome("Joao Paulo jp");
		
		Collection<Autor> autores = new ArrayList<Autor>();
		autores.add(autor2);
		autores.add(autor);
		livro.setAutores(autores);
		
		
		EditoraDAO editDao = new EditoraDAO();
		Editora edi = new Editora();
		edi.setNome("Abril Cultural");
//		editDao.salvar(edi);
		
		livro.setEditora(edi);
		
		
		HibernateDAO dao = new LivroDAO();
		dao.salvar(livro);
//		Livro livroDB = dao.getByCodigo(4);
//		System.out.println(livroDB.getNome());
//		System.out.println(livroDB.getAutor());
//		dao.deletar(4);
		
		List<Livro> livros = dao.listar();
		for (Livro l : livros) {
			System.out.println(l.getCodigo() +" "+l.getNome());
		}
		
		
		
		editDao.salvar(new Editora("Pearson"));
		
		for (Editora ed : editDao.listar()) {
			System.out.println(ed.getNome());
		}
		
		
		
		
		
	}

}
