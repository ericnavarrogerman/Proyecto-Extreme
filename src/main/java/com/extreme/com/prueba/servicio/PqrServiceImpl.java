package com.extreme.com.prueba.servicio;

import com.extreme.com.prueba.dao.PqrDao;
import com.extreme.com.prueba.domain.Pqr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PqrServiceImpl implements PqrService{

    @Autowired
    private PqrDao pqrDao;

    @Override
    public List<Pqr> getAllPQR() {
        return pqrDao.findAll();
    }

    @Override
    public void save(Pqr pqr) {
        pqrDao.save(pqr);
    }

    @Override
    public void delete(Pqr pqr) {
        pqrDao.delete(pqr);
    }

    @Override
    public Pqr findUser(Pqr pqr) {
        return pqrDao.findById(pqr.getIdPqr()).orElse(null);
    }
}
