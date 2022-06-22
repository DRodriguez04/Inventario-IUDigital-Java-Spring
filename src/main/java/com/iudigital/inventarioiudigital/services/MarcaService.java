package com.iudigital.inventarioiudigital.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iudigital.inventarioiudigital.data.MarcaRepository;
import com.iudigital.inventarioiudigital.domain.Marca;

@Service
public class MarcaService {
    
    @Autowired
    private MarcaRepository marcaRepository;

    public void createMarca(Marca marca){
       LocalDateTime saveDateCreated = LocalDateTime.now();
       marca.setFechaCreacion(saveDateCreated);
       marca.setFechaActualizacion(saveDateCreated);
       marcaRepository.save(marca);
    }

    public List<Marca> getMarcas(){
        List<Marca> marcas = (List<Marca>) marcaRepository.findAll();

        return marcas;
    }

    public Optional<Marca> getMarcaById(int id){
        Optional<Marca> marcaById = marcaRepository.findById(id);

        return marcaById;
    }

    public void updatingMarca(Marca marca){
        LocalDateTime DateUpdated = LocalDateTime.now();
        marca.setFechaActualizacion(DateUpdated);
        marcaRepository.save(marca);
    }
    
    public void deleteMarcaById(int id){
        marcaRepository.deleteById(id);
    }

}
