package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello")
public class HelloController {
	
	@GetMapping
	public String helloShow () {
		return "Hello World <br /> Nessa atividade usei a Atenção ao Detalhe e a Mentalidade de crescimento"
				+ " como as principais BSMs";

	}

}
