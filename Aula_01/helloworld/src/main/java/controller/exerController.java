package br.org.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/semana")
public class exerController {
	
	@GetMapping
	public String semana() {
		return "Atividade 2 <br /> Em relação as BSMs essa semana meus objetivos de aprendizagem são:"
				+ "<br />Orientação ao futuro e Proatividade";
		
	}
}
