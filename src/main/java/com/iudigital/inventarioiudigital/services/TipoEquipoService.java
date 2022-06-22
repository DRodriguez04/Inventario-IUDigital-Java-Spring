package com.iudigital.inventarioiudigital.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iudigital.inventarioiudigital.data.TipoEquipoRepository;
import com.iudigital.inventarioiudigital.domain.TipoEquipo;

@Service
public class TipoEquipoService {
    
    @Autowired
    private TipoEquipoRepository tipoEquipoRepository;

    public void createTipoEquipo(TipoEquipo tipoEquipo){
        LocalDateTime saveDateCreated = LocalDateTime.now();
        tipoEquipo.setFechaCreacion(saveDateCreated);
        tipoEquipo.setFechaActualizacion(saveDateCreated);
        tipoEquipoRepository.save(tipoEquipo);
    }

    public List<TipoEquipo> getTipoEquipos(){
        List<TipoEquipo> tipoEquipos = (List<TipoEquipo>) tipoEquipoRepository.findAll();
        return tipoEquipos;
    }

    public Optional<TipoEquipo> getTipoEquipoById(int id){
        Optional<TipoEquipo> tipoEquipoById = tipoEquipoRepository.findById(id);
        return tipoEquipoById;
    }

    public void updatingTipoEquipo(TipoEquipo tipoEquipo){
        LocalDateTime saveDateUpdated = LocalDateTime.now();
        tipoEquipo.setFechaActualizacion(saveDateUpdated);
        tipoEquipoRepository.save(tipoEquipo);
    }

    public void deleteTipoEquipoById(int id){
        tipoEquipoRepository.deleteById(id);
    }
}
