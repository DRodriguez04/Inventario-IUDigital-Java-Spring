package com.iudigital.inventarioiudigital.controller.converter;

import org.springframework.stereotype.Component;

import com.iudigital.inventarioiudigital.controller.dto.MarcaDTO;
import com.iudigital.inventarioiudigital.domain.Marca;

@Component
public class MarcaConverter {

    public MarcaDTO marcaToMarcaDTO(Marca marca){

        MarcaDTO marcaDTO = new MarcaDTO();
        marcaDTO.setId(marca.getId());
        marcaDTO.setNombre(marca.getNombre());
        marcaDTO.setEstado(marca.getEstado());
        marcaDTO.setFechaCreacion(marca.getFechaCreacion());
        marcaDTO.setFechaActualizacion(marca.getFechaActualizacion());

        return marcaDTO;
    }

    public Marca marcaDTOToMarca(MarcaDTO marcaDTO){

        Marca marca = new Marca();
        marca.setId(marcaDTO.getId());
        marca.setNombre(marcaDTO.getNombre());
        marca.setEstado(marcaDTO.getEstado());
        marca.setFechaCreacion(marcaDTO.getFechaCreacion());
        marca.setFechaActualizacion(marcaDTO.getFechaActualizacion());

        return marca;
    }
}
