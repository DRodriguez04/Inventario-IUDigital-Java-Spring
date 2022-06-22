package com.iudigital.inventarioiudigital.controller.converter;

import org.springframework.stereotype.Component;

import com.iudigital.inventarioiudigital.controller.dto.UsuarioDTO;
import com.iudigital.inventarioiudigital.domain.Usuario;

@Component
public class UsuarioConverter {
    
    public UsuarioDTO usuarioToUsuarioDTO(Usuario usuario){

        UsuarioDTO usuarioDTO = new UsuarioDTO();
        usuarioDTO.setNombre(usuario.getNombre());
        usuarioDTO.setNombre(usuario.getNombre());
        usuarioDTO.setEmail(usuario.getEmail());
        usuarioDTO.setEstado(usuario.getEstado());
        usuarioDTO.setFechaCreacion(usuario.getFechaCreacion());
        usuarioDTO.setFechaActualizacion(usuario.getFechaActualizacion());

        return usuarioDTO;
    }

    public Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO){
        
        Usuario usuario = new Usuario();
        usuario.setId(usuarioDTO.getId());
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setEmail(usuarioDTO.getEmail());
        usuario.setEstado(usuarioDTO.getEstado());
        usuario.setFechaCreacion(usuarioDTO.getFechaCreacion());
        usuario.setFechaActualizacion(usuarioDTO.getFechaActualizacion());

        return usuario;
    }
}
