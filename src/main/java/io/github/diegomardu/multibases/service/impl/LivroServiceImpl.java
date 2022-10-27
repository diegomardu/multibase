package io.github.diegomardu.multibases.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.diegomardu.multibases.model.Livro;
import io.github.diegomardu.multibases.model.Usuario;
import io.github.diegomardu.multibases.repository.LivroRepository;
import io.github.diegomardu.multibases.repository.UsuarioRepository;
import io.github.diegomardu.multibases.service.LivroService;

@Service
public class LivroServiceImpl implements LivroService{
	
	@Autowired
	private LivroRepository livroRepository;
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public List<Livro> obterLivros(){
		return this.livroRepository.findAll();
	}
	
	@Override
	public Livro criar(Livro livro) {
		Usuario usuario = this.usuarioRepository
				.findById(livro.getCodigoUsuario())
				.orElseThrow(()-> new IllegalArgumentException("Usuário não encontrado"));
		
				livro.setNomeUsuario(usuario.getNome());
				
				return this.livroRepository.save(livro);
	}
	
	

}
