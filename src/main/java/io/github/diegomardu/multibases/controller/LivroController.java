package io.github.diegomardu.multibases.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.diegomardu.multibases.model.Livro;
import io.github.diegomardu.multibases.service.LivroService;

@RestController
@RequestMapping("/livros")
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	@GetMapping
	public List<Livro> obterLivros(){
		return this.livroService.obterLivros();
	}

}
