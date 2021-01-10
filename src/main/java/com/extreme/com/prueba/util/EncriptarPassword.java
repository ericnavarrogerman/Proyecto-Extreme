package com.extreme.com.prueba.util;

import com.extreme.com.prueba.domain.Usuario;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class EncriptarPassword {

    public static String encriptarPassword(String password){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        return encoder.encode(password);
    }

    public static Usuario encriptarPassword(Usuario usuario){
        var encoder = new BCryptPasswordEncoder();
        usuario.setPassword(encoder.encode(usuario.getPassword()));
        return usuario;
    }
}
