package com.iudigital.inventarioiudigital.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iudigital.inventarioiudigital.data.InventarioRepository;
import com.iudigital.inventarioiudigital.domain.Inventario;

@Service
public class InventarioService {
    
    @Autowired
    InventarioRepository inventarioRepository;

    public void createInventario(Inventario inventario){
        LocalDateTime saveDateCreated = LocalDateTime.now();
        inventario.setFechaCreacion(saveDateCreated);
        inventario.setFechaActualizacion(saveDateCreated);
        inventarioRepository.save(inventario);
    }

    public List<Inventario> getInventarios(){
        List<Inventario> inventarios = (List<Inventario>) inventarioRepository.findAll();
        return inventarios;
    }

    public Optional<Inventario> getInventarioByPrice(Double precio){
        Optional<Inventario> inventarioByPrice = InventarioRepository.findByPrice(precio);
        return inventarioByPrice;
    }

    public Optional<Inventario> getInventarioById(int id){
        Optional<Inventario> inventarioById = inventarioRepository.findById(id);
        return inventarioById;
    }

    public void updatingInventario(Inventario inventario){
        LocalDateTime saveDateUpdated = LocalDateTime.now();
        inventario.setFechaActualizacion(saveDateUpdated);
        inventarioRepository.save(inventario);
    }
    
    public void deleteInventarioById(int id){
        inventarioRepository.deleteById(id);
    }
}
