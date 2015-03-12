package visao;

import java.util.Date;
import java.util.List;

import modelo.HibernatUtil;
import modelo.Livro;
import modelo.LivroDAO;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public class Formulario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Livro livro = new Livro();
		livro.setAutor("novo");
		livro.setNome("meu livro favorito");
		livro.setDataPublicacao(new Date());
		livro.setNumeroPagina(200);
		
		LivroDAO dao = new LivroDAO();
		//dao.salvar(livro);
//		Livro livroDB = dao.getByCodigo(4);
//		System.out.println(livroDB.getNome());
//		System.out.println(livroDB.getAutor());
//		dao.deletar(4);
		
		List<Livro> livros = dao.listar();
		for (Livro l : livros) {
			System.out.println(l.getCodigo() +" "+l.getNome());
		}
		
		
		
		
	}

}
