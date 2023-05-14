package com.projeto.biblioteca.controllers;

import com.projeto.biblioteca.entities.Usuario;
import com.projeto.biblioteca.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository repository;

    @GetMapping
    public List<Usuario> findAll() {
        return repository.findAll();

    }

    @GetMapping(value = "/{id}")
    public Usuario findById(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping
    public Usuario insert(@RequestBody Usuario usuario) {

        return repository.save(usuario);
    }
}
