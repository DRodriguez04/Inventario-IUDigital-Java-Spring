package com.iudigital.inventarioiudigital.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.iudigital.inventarioiudigital.controller.converter.InventarioConverter;
import com.iudigital.inventarioiudigital.controller.dto.InventarioDTO;
import com.iudigital.inventarioiudigital.domain.Inventario;
import com.iudigital.inventarioiudigital.services.InventarioService;

@RestController
@RequestMapping("/inventario")
@CrossOrigin("*")
public class InventarioController {
    
    @Autowired
    private InventarioService inventarioService;

    @Autowired
    private InventarioConverter inventarioConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearInventario(@RequestBody InventarioDTO inventarioDTO){
        inventarioService.createInventario(inventarioConverter.inventarioDTOToInventario(inventarioDTO));
    }

    @GetMapping
    public List<InventarioDTO> obtenerInventarios(){
        List<InventarioDTO> inventariosDeDTO = new ArrayList<>();
        for(Inventario inventario : inventarioService.getInventarios()){
            InventarioDTO inventarioDTO = inventarioConverter.inventarioToInventarioDTO(inventario);
            inventariosDeDTO.add(inventarioDTO);
        }
        return inventariosDeDTO;
    }

    @GetMapping("/{id}")
    public Optional<Inventario> obtenerInventarioPorId(@PathVariable int id){
        return inventarioService.getInventarioById(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void actualizarInventario(@RequestBody InventarioDTO inventarioDTO){
        inventarioService.updatingInventario(inventarioConverter.inventarioDTOToInventario(inventarioDTO));
    }

    @DeleteMapping("/{id}")
    public void eliminarInventario(@PathVariable int id){
        inventarioService.deleteInventarioById(id);
    }

}
