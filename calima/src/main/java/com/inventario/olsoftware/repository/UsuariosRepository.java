package com.inventario.olsoftware.repository;

import com.inventario.olsoftware.model.UsuariosModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuariosRepository extends JpaRepository<UsuariosModel,Integer> {

    @Override
    List<UsuariosModel> findAll();
}
