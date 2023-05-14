package com.projeto.biblioteca.dto;

import com.projeto.biblioteca.entities.LivroList;

public class LivroListDTO {

    private Long id;
    private String nome;

    public LivroListDTO(){

    }
     public LivroListDTO(LivroList entity) {
        id = entity.getId();
        nome = entity.getNome();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
