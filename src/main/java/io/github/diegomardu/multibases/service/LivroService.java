package io.github.diegomardu.multibases.service;

import java.util.List;

import io.github.diegomardu.multibases.model.Livro;

public interface LivroService {
	
	public List<Livro> obterLivros();
	
	public Livro criar(Livro livro);

}
