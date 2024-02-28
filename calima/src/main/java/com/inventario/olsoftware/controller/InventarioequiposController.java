package com.inventario.olsoftware.controller;

import java.util.*;

import com.inventario.olsoftware.model.InventarioequiposModel;
import com.inventario.olsoftware.model.UsuariosModel;
import com.inventario.olsoftware.service.InventarioequiposService;
import com.inventario.olsoftware.service.UsuariosService;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;

import org.springframework.web.bind.annotation.*;

@RestController
public class InventarioequiposController {

    @Autowired
    private InventarioequiposService service;

    @Autowired
    private UsuariosService usuariosService;

    @GetMapping("/getInventario")
    public List<InventarioequiposModel> list() {
        return service.listAll();
    }

    @GetMapping("/getUsuarios")
    public List<UsuariosModel> usuariosModels() {
        return usuariosService.listAll();
    }

    @PostMapping("/createInventario")
    public void  add(@RequestBody InventarioequiposModel inventarioequiposModel) {
        service.save(inventarioequiposModel);
    }

    @PostMapping("/createUsuarios")
    public void add(@RequestBody UsuariosModel usuariosModel){
        usuariosService.save(usuariosModel);
    }

    @GetMapping("/maquina/{id}")
    public ResponseEntity<InventarioequiposModel> get(@PathVariable Integer id) {
        try {
            InventarioequiposModel casinoCalimaModel = service.get(id);
            return new ResponseEntity<InventarioequiposModel>(casinoCalimaModel, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<InventarioequiposModel>(HttpStatus.NOT_FOUND);
        }
    }
}
