package com.inventario.olsoftware.service;

import com.inventario.olsoftware.model.UsuariosModel;
import com.inventario.olsoftware.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class UsuariosService {

    @Autowired
    UsuariosRepository usuariosRepository;

    public List<UsuariosModel> listAll(){return usuariosRepository.findAll();}

    public void save(UsuariosModel usuariosModel){usuariosRepository.save(usuariosModel);}
}
