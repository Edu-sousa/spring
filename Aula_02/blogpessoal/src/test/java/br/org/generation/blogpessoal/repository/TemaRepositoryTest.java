package br.org.generation.blogpessoal.repository;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

import br.org.generation.blogpessoal.model.Tema;


@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TemaRepositoryTest {

	@Autowired
	private TemaRepository temaRepository;
	
	@BeforeAll
	void start(){
		
		temaRepository.save(new Tema(0L, "isso representa a descrição "));
		temaRepository.save(new Tema(0L, "isso representa a descrição 2 "));
		temaRepository.save(new Tema(0L, "isso representa a descrição 3 "));
	}
	
	@Test
	@DisplayName("Retorna 1 Tema")
	public void deveRetornarUmTema() {
		
	}
}
