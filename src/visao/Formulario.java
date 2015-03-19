package visao;

import java.util.Date;
import java.util.List;

import modelo.Editora;
import modelo.EditoraDAO;
import modelo.Livro;
import modelo.LivroDAO;

public class Formulario {

	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setAutor("Goslim");
		livro.setNome("Padrão de projetos");
		livro.setDataPublicacao(new Date());
		livro.setNumeroPagina(980);
		
		Editora editora = new Editora();
		editora.setNome("Abril cultural");
		
		EditoraDAO editoraDao = new EditoraDAO();
		editoraDao.salvar(editora);
		
		livro.setEditora(editora);
		
		LivroDAO dao = new LivroDAO();
		dao.salvar(livro);
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
