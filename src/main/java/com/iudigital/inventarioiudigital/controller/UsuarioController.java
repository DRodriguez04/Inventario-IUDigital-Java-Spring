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

import com.iudigital.inventarioiudigital.controller.converter.UsuarioConverter;
import com.iudigital.inventarioiudigital.controller.dto.UsuarioDTO;
import com.iudigital.inventarioiudigital.domain.Usuario;
import com.iudigital.inventarioiudigital.services.UsuarioService;

@RestController
@RequestMapping("/usuario")
@CrossOrigin("*")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;

    @Autowired
    private UsuarioConverter usuarioConverter;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void crearUsuario(@RequestBody UsuarioDTO usuarioDTO){
        usuarioService.createUsuario(usuarioConverter.usuarioDTOToUsuario(usuarioDTO));
    }

    @GetMapping
    public List<UsuarioDTO> obtenerUsuarios(){
        List<UsuarioDTO> usuariosDeDTO = new ArrayList<>();
        for(Usuario usuario : usuarioService.getUsuarios()){
            UsuarioDTO usuarioDTO = usuarioConverter.usuarioToUsuarioDTO(usuario);
            usuariosDeDTO.add(usuarioDTO);
        }
        return usuariosDeDTO;
    }

    @GetMapping("/{id}")
    public Optional<Usuario> obtenerUsuarioPorId(@PathVariable int id){
        return usuarioService.getUserById(id);
    }

    @GetMapping("/{nombre}")
    public Optional<Usuario> obtenerUsuarioPorNombre(@PathVariable String nombre){
        return usuarioService.getUserByName(nombre);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void actualizarUsuario(@RequestBody UsuarioDTO usuarioDTO){
        usuarioService.updatingUser(usuarioConverter.usuarioDTOToUsuario(usuarioDTO));
    }

    @DeleteMapping("/{id}")
    public void eliminarUsuario(@PathVariable int id){
        usuarioService.deleteUserById(id);
    }
}
