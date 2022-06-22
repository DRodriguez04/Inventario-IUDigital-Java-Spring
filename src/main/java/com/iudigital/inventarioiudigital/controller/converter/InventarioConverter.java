package com.iudigital.inventarioiudigital.controller.converter;

import org.springframework.stereotype.Component;

import com.iudigital.inventarioiudigital.controller.dto.InventarioDTO;
import com.iudigital.inventarioiudigital.domain.Inventario;

@Component
public class InventarioConverter {
    
    public InventarioDTO inventarioToInventarioDTO(Inventario inventario){

        InventarioDTO inventarioDTO = new InventarioDTO();
        inventarioDTO.setId(inventario.getId());
        inventarioDTO.setSerialArticulo(inventario.getSerialArticulo());
        inventarioDTO.setModelo(inventario.getModelo());
        inventarioDTO.setDescripcion(inventario.getDescripcion());
        inventarioDTO.setFoto(inventario.getFoto());
        inventarioDTO.setPrecio(inventario.getPrecio());
        inventarioDTO.setFechaCompra(inventario.getFechaCompra());
        inventarioDTO.setFechaCreacion(inventario.getFechaCreacion());
        inventarioDTO.setFechaActualizacion(inventario.getFechaActualizacion());
        inventarioDTO.setUsuarioId(inventario.getUsuarioId());
        inventarioDTO.setMarcaId(inventario.getMarcaId());
        inventarioDTO.setTipoEquipoId(inventario.getTipoEquipoId());
        inventarioDTO.setEstadoEquipoId(inventario.getEstadoEquipoId());

        return inventarioDTO;
    }

    public Inventario inventarioDTOToInventario(InventarioDTO inventarioDTO){
        
        Inventario inventario = new Inventario();
        inventario.setId(inventarioDTO.getId());
        inventario.setSerialArticulo(inventarioDTO.getSerialArticulo());
        inventario.setModelo(inventarioDTO.getModelo());
        inventario.setDescripcion(inventarioDTO.getDescripcion());
        inventario.setFoto(inventarioDTO.getFoto());
        inventario.setPrecio(inventarioDTO.getPrecio());
        inventario.setFechaCompra(inventarioDTO.getFechaCompra());
        inventario.setFechaCreacion(inventarioDTO.getFechaCreacion());
        inventario.setFechaActualizacion(inventarioDTO.getFechaActualizacion());
        inventario.setUsuarioId(inventarioDTO.getUsuarioId());
        inventario.setMarcaId(inventarioDTO.getMarcaId());
        inventario.setTipoEquipoId(inventarioDTO.getTipoEquipoId());
        inventario.setEstadoEquipoId(inventarioDTO.getEstadoEquipoId());

        return inventario;
    }
}
