package com.iudigital.inventarioiudigital.controller.converter;

import org.springframework.stereotype.Component;

import com.iudigital.inventarioiudigital.controller.dto.TipoEquipoDTO;
import com.iudigital.inventarioiudigital.domain.TipoEquipo;

@Component
public class TipoEquipoConverter {
    
    public TipoEquipoDTO tipoEquipoToTipoEquipoDTO(TipoEquipo tipoEquipo){
        
        TipoEquipoDTO tipoEquipoDTO = new TipoEquipoDTO();
        tipoEquipoDTO.setId(tipoEquipo.getId());
        tipoEquipoDTO.setNombre(tipoEquipo.getNombre());
        tipoEquipoDTO.setEstado(tipoEquipo.getEstado());
        tipoEquipoDTO.setFechaCreacion(tipoEquipo.getFechaCreacion());
        tipoEquipoDTO.setFechaActualizacion(tipoEquipo.getFechaActualizacion());

        return tipoEquipoDTO;
    }

    public TipoEquipo tipoEquipoDTOToTipoEquipo(TipoEquipoDTO tipoEquipoDTO){

        TipoEquipo tipoEquipo = new TipoEquipo();
        tipoEquipo.setId(tipoEquipoDTO.getId());
        tipoEquipo.setNombre(tipoEquipoDTO.getNombre());
        tipoEquipo.setEstado(tipoEquipoDTO.getEstado());
        tipoEquipo.setFechaCreacion(tipoEquipoDTO.getFechaCreacion());
        tipoEquipo.setFechaActualizacion(tipoEquipoDTO.getFechaActualizacion());

        return tipoEquipo;
    }
}
