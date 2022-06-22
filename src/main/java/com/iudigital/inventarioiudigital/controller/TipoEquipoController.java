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

import com.iudigital.inventarioiudigital.controller.converter.TipoEquipoConverter;
import com.iudigital.inventarioiudigital.controller.dto.TipoEquipoDTO;
import com.iudigital.inventarioiudigital.domain.TipoEquipo;
import com.iudigital.inventarioiudigital.services.TipoEquipoService;

@RestController
@RequestMapping("/tipo-equipo")
@CrossOrigin("*")
public class TipoEquipoController {
    
    @Autowired
    private TipoEquipoService tipoEquipoService;

    @Autowired
    private TipoEquipoConverter tipoEquipoConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearTipoEquipo(@RequestBody TipoEquipoDTO tipoEquipoDTO){
        //System.out.println("This item is in a status: " + tipoEquipoDTO.getEstado());
        tipoEquipoService.createTipoEquipo(tipoEquipoConverter.tipoEquipoDTOToTipoEquipo(tipoEquipoDTO));
    }

    @GetMapping
    public List<TipoEquipoDTO> getTipoEquipos(){
        List<TipoEquipoDTO> tipoEquipoDeDTO = new ArrayList<>();
        for(TipoEquipo tipoEquipo : tipoEquipoService.getTipoEquipos()){
            TipoEquipoDTO tipoEquipoDTO = tipoEquipoConverter.tipoEquipoToTipoEquipoDTO(tipoEquipo);
            tipoEquipoDeDTO.add(tipoEquipoDTO);
        }
        return tipoEquipoDeDTO;
    }

    @GetMapping("/{id}")
    public Optional<TipoEquipo> getTipoEquipo(@PathVariable int id){
        return tipoEquipoService.getTipoEquipoById(id);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void actualizarTipoEquipo(@RequestBody TipoEquipoDTO tipoEquipoDTO){
        tipoEquipoService.updatingTipoEquipo(tipoEquipoConverter.tipoEquipoDTOToTipoEquipo(tipoEquipoDTO));
    }

    @DeleteMapping("/{id}")
    public void eliminarTipoEquipo(@PathVariable int id){
        tipoEquipoService.deleteTipoEquipoById(id);
    }
}
