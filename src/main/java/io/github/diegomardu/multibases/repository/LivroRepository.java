package io.github.diegomardu.multibases.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.diegomardu.multibases.model.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
