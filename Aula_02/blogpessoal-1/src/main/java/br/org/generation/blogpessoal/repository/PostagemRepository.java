package br.org.generation.blogpessoal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.org.generation.blogpessoal.model.postagem;

@Repository
public interface PostagemRepository extends JpaRepository <postagem, Long>{

}
