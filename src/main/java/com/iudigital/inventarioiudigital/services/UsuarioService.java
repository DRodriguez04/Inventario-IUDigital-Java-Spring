package com.iudigital.inventarioiudigital.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iudigital.inventarioiudigital.data.UsuarioRepository;
import com.iudigital.inventarioiudigital.domain.Usuario;

@Service
public class UsuarioService {
    
    @Autowired
    private UsuarioRepository usuarioRepository;

    public void createUsuario(Usuario usuario){
        LocalDateTime saveDateCreated = LocalDateTime.now();
        usuario.setFechaCreacion(saveDateCreated);
        usuario.setFechaActualizacion(saveDateCreated);
        usuarioRepository.save(usuario);
    }

    public List<Usuario> getUsuarios(){
        List<Usuario> usuarios = (List<Usuario>) usuarioRepository.findAll();
        return usuarios;
    }
    
    public Optional<Usuario> getUserById(int id){
        Optional<Usuario> usuarioById = usuarioRepository.findById(id);
        return usuarioById;
    }

    public Optional<Usuario> getUserByName(String nombre){
        Optional<Usuario> usuarioByName = usuarioRepository.findByName(nombre);
        return usuarioByName;
    }

    public void updatingUser(Usuario usuario){
        LocalDateTime saveDateUpdated = LocalDateTime.now();
        usuario.setFechaActualizacion(saveDateUpdated);
        usuarioRepository.save(usuario);
    }
    
    public void deleteUserById(int id){
        usuarioRepository.deleteById(id);
    }
}
