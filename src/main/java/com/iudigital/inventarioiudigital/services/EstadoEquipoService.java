package com.iudigital.inventarioiudigital.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iudigital.inventarioiudigital.data.EstadoEquipoRepository;
import com.iudigital.inventarioiudigital.domain.EstadoEquipo;

@Service
public class EstadoEquipoService {
    
    @Autowired
    private EstadoEquipoRepository estadoEquipoRepository;

    public void createEstadoEquipo(EstadoEquipo estadoEquipo){
        LocalDateTime saveDateCreated = LocalDateTime.now();
        estadoEquipo.setFechaCreacion(saveDateCreated);
        estadoEquipo.setFechaActualizacion(saveDateCreated);
        estadoEquipoRepository.save(estadoEquipo);
    }

    public List<EstadoEquipo> getEstadoEquipo(){
        List<EstadoEquipo> estadoEquipos = (List<EstadoEquipo>) estadoEquipoRepository.findAll();
        return estadoEquipos;
    }

    
    public Optional<EstadoEquipo> getEstadoEquipoById(int id){
        Optional<EstadoEquipo> estadoEquipoById = estadoEquipoRepository.findById(id);
        return estadoEquipoById;
    }

    public void updatingEstadoEquipo(EstadoEquipo estadoEquipo){
        LocalDateTime saveDateUpdated = LocalDateTime.now();
        estadoEquipo.setFechaActualizacion(saveDateUpdated);
        estadoEquipoRepository.save(estadoEquipo);
    }

    public void deleteEstadoEquipoById(int id){
        estadoEquipoRepository.deleteById(id);
    }
}
