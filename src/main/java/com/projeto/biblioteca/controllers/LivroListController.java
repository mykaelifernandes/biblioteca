package com.projeto.biblioteca.controllers;

import com.projeto.biblioteca.dto.LivroListDTO;
import com.projeto.biblioteca.dto.LivroMinDTO;
import com.projeto.biblioteca.services.LivroListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value ="/lists")

public class LivroListController {
    @Autowired
    private LivroListService livroListService;
    @GetMapping
    public List<LivroListDTO> findAll() {
        return livroListService.findAll();
    }
}
