package com.extreme.com.prueba.servicio;

import com.extreme.com.prueba.domain.Pqr;
import com.extreme.com.prueba.domain.Usuario;

import java.util.List;

public interface PqrService {

    public List<Pqr> getAllUsers();
    public void save(Pqr pqr);
    public void delete(Pqr pqr);
    public Pqr findUser(Pqr pqr);
}
