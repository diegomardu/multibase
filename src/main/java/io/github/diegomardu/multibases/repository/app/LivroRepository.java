package io.github.diegomardu.multibases.repository.app;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.diegomardu.multibases.model.app.Livro;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {

}
