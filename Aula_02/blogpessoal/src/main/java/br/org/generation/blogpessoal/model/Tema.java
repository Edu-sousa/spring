package br.org.generation.blogpessoal.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_tema") 
public class Tema {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotNull
	private String descricao;

	@OneToMany (mappedBy = "tema", cascade = CascadeType.ALL)
	@JsonIgnoreProperties ("tema")
	private List<postagem> postagem;
	
	
	public Tema(Long id,String descricao) {
		super();
		this.id = id;
		this.descricao = descricao;
	}
	
	public Tema() {	        }


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescrição() {
		return descricao;
	}


	public void setDescrição(String descricao) {
		this.descricao = descricao;
	}
	
	public List<postagem> getPostagem() {
		return postagem;
	}


	public void setPostagem(List<postagem> postagem) {
		this.postagem = postagem;
	}




}
