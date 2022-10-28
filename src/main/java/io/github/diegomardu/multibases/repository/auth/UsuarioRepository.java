package io.github.diegomardu.multibases.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.diegomardu.multibases.model.auth.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
