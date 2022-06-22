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

import com.iudigital.inventarioiudigital.controller.converter.MarcaConverter;
import com.iudigital.inventarioiudigital.controller.dto.MarcaDTO;
import com.iudigital.inventarioiudigital.domain.Marca;
import com.iudigital.inventarioiudigital.services.MarcaService;

@RestController
@RequestMapping("/marca")
@CrossOrigin("*")
public class MarcaController {
    
    @Autowired
    private MarcaService marcaService;

    @Autowired
    private MarcaConverter marcaConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearMarca(@RequestBody MarcaDTO marcaDTO){
      marcaService.createMarca(marcaConverter.marcaDTOToMarca(marcaDTO));  
    }

    @GetMapping
    public List<MarcaDTO> obtenerMarcas(){
        List<MarcaDTO> marcasDeDTO = new ArrayList<>();
        for(Marca marca : marcaService.getMarcas()){
            MarcaDTO marcaDTO = marcaConverter.marcaToMarcaDTO(marca);
            marcasDeDTO.add(marcaDTO);
        } 

        return marcasDeDTO;
    }

    @GetMapping("/{id}")
    public Optional<Marca> obtenerMarcaPorId(@PathVariable int id){
        return marcaService.getMarcaById(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void updateMarca(@RequestBody MarcaDTO marcaDTO){
        marcaService.updatingMarca(marcaConverter.marcaDTOToMarca(marcaDTO));
    }

    @DeleteMapping("/{id}")
    public void deleteMarca(@PathVariable int id){
        marcaService.deleteMarcaById(id);
    }
}
