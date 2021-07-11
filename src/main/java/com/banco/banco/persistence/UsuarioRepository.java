package com.banco.banco.persistence;

import com.banco.banco.persistence.crud.UsuarioCrudRepository;
import com.banco.banco.persistence.entity.Usuario;

import java.util.List;

public class UsuarioRepository {
    private UsuarioCrudRepository usuarioCrudRepository;

    public List<Usuario> getAll(){
        return (List<Usuario>) usuarioCrudRepository.findAll();
    }
}
