package lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import lojagames.model.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository <Categoria, Long> {
	public List <Categoria> findAllByGeneroContainingIgnoreCase (String genero);

}
