package com.extreme.com.prueba.servicio;


import com.extreme.com.prueba.domain.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> getAllUsers();
    public void save(Usuario usuario);
    public void delete(Usuario usuario);
    public Usuario findUser(Usuario usuario);

}
