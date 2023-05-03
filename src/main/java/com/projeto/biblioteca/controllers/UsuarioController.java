package com.projeto.biblioteca.controllers;

import com.projeto.biblioteca.entities.Usuario;
import com.projeto.biblioteca.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> findAll() {
        List<Usuario> resultado = repository.findAll();
        return resultado;
    }

    @GetMapping(value = "/{id}")
    public Usuario findById(@PathVariable Long id) {
        Usuario resultado = repository.findById(id).get();
        return resultado;
    }

    @PostMapping
    public Usuario insert(@RequestBody Usuario usuario) {

        return repository.save(usuario);
    }
}
