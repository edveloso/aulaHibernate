package modelo;

import java.util.Collection;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

@Entity
@Table(name="tbl_editora")
public class Editora {

	@Id @GeneratedValue
	private Integer codigo;
	
	@Column(name="edt_nome")
	private String nome;
	
	@OneToMany(mappedBy="editora", fetch=FetchType.LAZY)
	@Cascade(value=CascadeType.ALL)
	private Collection<Livro> livros;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Collection<Livro> getLivros() {
		return livros;
	}

	public void setLivros(Collection<Livro> livros) {
		this.livros = livros;
	}
	
	
	
	
}
