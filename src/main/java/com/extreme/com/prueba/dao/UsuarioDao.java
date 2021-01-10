package com.extreme.com.prueba.dao;

import com.extreme.com.prueba.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioDao extends JpaRepository<Usuario,Long> {

}
