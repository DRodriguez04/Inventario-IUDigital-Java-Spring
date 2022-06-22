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

import com.iudigital.inventarioiudigital.controller.converter.EstadoEquipoConverter;
import com.iudigital.inventarioiudigital.controller.dto.EstadoEquipoDTO;
import com.iudigital.inventarioiudigital.domain.EstadoEquipo;
import com.iudigital.inventarioiudigital.services.EstadoEquipoService;

@RestController
@RequestMapping("/estado-equipo")
@CrossOrigin("*")
public class EstadoEquipoController {
    
    @Autowired
    private EstadoEquipoService estadoEquipoService;

    @Autowired
    private EstadoEquipoConverter estadoEquipoConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearEstadoEquipo(@RequestBody EstadoEquipoDTO estadoEquipoDTO){
        estadoEquipoService.createEstadoEquipo(estadoEquipoConverter.estadoEquipoDTOToEstadoEquipo(estadoEquipoDTO));
    }

    @GetMapping
    public List<EstadoEquipoDTO> obtenerEstadoEquipo(){
        List<EstadoEquipoDTO> estadoEquipoDeDTO = new ArrayList<>();
        for(EstadoEquipo estadoEquipo : estadoEquipoService.getEstadoEquipo()){
            EstadoEquipoDTO estadoEquipoDTO = estadoEquipoConverter.estadoEquipoToEstadoEquipoDTO(estadoEquipo);
            estadoEquipoDeDTO.add(estadoEquipoDTO);
        }
        return estadoEquipoDeDTO;
    }
    
    @GetMapping("/{id}")
    public Optional<EstadoEquipo> obtenerEstadoEquipo(@PathVariable int id){
        return estadoEquipoService.getEstadoEquipoById(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void actualizarEstadoEquipo(@RequestBody EstadoEquipoDTO estadoEquipoDTO){
       estadoEquipoService.updatingEstadoEquipo(estadoEquipoConverter.estadoEquipoDTOToEstadoEquipo(estadoEquipoDTO));
    }

    @DeleteMapping("/{id}")
    public void eliminarEstadoEquipo(@PathVariable int id){
        estadoEquipoService.deleteEstadoEquipoById(id);
    }
}
