package com.iudigital.inventarioiudigital.controller.converter;

import org.springframework.stereotype.Component;

import com.iudigital.inventarioiudigital.controller.dto.EstadoEquipoDTO;
import com.iudigital.inventarioiudigital.domain.EstadoEquipo;

@Component
public class EstadoEquipoConverter {
    
    public EstadoEquipoDTO estadoEquipoToEstadoEquipoDTO(EstadoEquipo estadoEquipo){
        EstadoEquipoDTO estadoEquipoDTO = new EstadoEquipoDTO();
        estadoEquipoDTO.setId(estadoEquipo.getId());
        estadoEquipoDTO.setNombre(estadoEquipo.getNombre());
        estadoEquipoDTO.setEstado(estadoEquipo.getEstado());
        estadoEquipoDTO.setFechaCreacion(estadoEquipo.getFechaCreacion());
        estadoEquipoDTO.setFechaActualizacion(estadoEquipo.getFechaActualizacion());
        return estadoEquipoDTO;
    }

    public EstadoEquipo estadoEquipoDTOToEstadoEquipo(EstadoEquipoDTO estadoEquipoDTO){
        EstadoEquipo estadoEquipo = new EstadoEquipo();
        estadoEquipo.setId(estadoEquipoDTO.getId());
        estadoEquipo.setNombre(estadoEquipoDTO.getNombre());
        estadoEquipo.setEstado(estadoEquipoDTO.getEstado());
        estadoEquipo.setFechaCreacion(estadoEquipoDTO.getFechaCreacion());
        estadoEquipo.setFechaActualizacion(estadoEquipoDTO.getFechaActualizacion());
        return estadoEquipo;
    }

}
