package br.org.generation.blogpessoal.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

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
		
		temaRepository.save(new Tema(0L, "descrição"));
		temaRepository.save(new Tema(0L, "descrição 2"));
		temaRepository.save(new Tema(0L, "descrição 3"));
	}
	
	@Test
	@DisplayName("Retorna 1 Tema")
	public void deveRetornarUmTema() {
		
		List<Tema>tema =(temaRepository.findAllByDescricaoContainingIgnoreCase("descrição"));
		
		assertTrue(tema.get(0).getDescrição().equals("descrição"));
	}
	
	
	
	@Test
	@DisplayName("Retorna 2 Temas")
	public void deveRetornarDoisTemas() {
		
		List<Tema> temalista = (temaRepository.findAllByDescricaoContainingIgnoreCase("ão"));
			
		assertEquals(3, temalista.size());
		
		assertTrue(temalista.get(1).getDescrição().equals("descrição 2"));
		assertTrue(temalista.get(2).getDescrição().equals("descrição 3"));
	}
	
	@Test
	@DisplayName("Retorna 1 Tema parte 2")
	public void retornarUmTema(){
		
		List<Tema> temas = (temaRepository.findAllByDescricaoContainingIgnoreCase("3"));
		
		
		//Perguntar sobre isso (pra que o numero 0)
		assertTrue(temas.get(0).getDescrição().equals("descrição 3"));
	}
	
	
}



