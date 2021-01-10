package com.extreme.com.prueba.servicio;

import com.extreme.com.prueba.dao.UsuarioDao;
import com.extreme.com.prueba.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
public class UsuarioServiceImpl implements UsuarioService{


    @Autowired
    private UsuarioDao usuarioDao;


    @Override
    @Transactional(readOnly = true)
    public List<Usuario> getAllUsers() {
        return usuarioDao.findAll();
    }

    @Override
    @Transactional()
    public void save(Usuario usuario) {
        usuarioDao.save(usuario);
    }

    @Override
    @Transactional()
    public void delete(Usuario usuario) {
        usuarioDao.delete(usuario);
    }

    @Override
    @Transactional(readOnly = true)
    public Usuario findUser(Usuario usuario) {
        return usuarioDao.findById(usuario.getIdUsuario()).orElse(null);
    }
}
