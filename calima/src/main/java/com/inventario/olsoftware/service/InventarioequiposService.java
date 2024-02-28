package com.inventario.olsoftware.service;

import java.util.List;

import javax.transaction.Transactional;

import com.inventario.olsoftware.model.InventarioequiposModel;
import com.inventario.olsoftware.repository.InventarioequiposRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class InventarioequiposService {

    @Autowired
    private InventarioequiposRepository repo;


    public List<InventarioequiposModel> listAll() {
        return repo.findAll();
    }

    public void save(InventarioequiposModel inventarioequiposModel) {
        repo.save(inventarioequiposModel);
    }

    public InventarioequiposModel get(Integer id) {
        return repo.findById(id).get();
    }

    public void delete(Integer id) {
        repo.deleteById(id);
    }

}
