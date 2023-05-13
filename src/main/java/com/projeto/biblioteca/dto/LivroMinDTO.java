package com.projeto.biblioteca.dto;

import com.projeto.biblioteca.entities.Livro;
import jakarta.persistence.Column;

public class LivroMinDTO {

    private Long id;
    private String titulo;
    private Integer ano;
    private String imgUrl;
    private String descricao;

    public LivroMinDTO(){}

    public LivroMinDTO(Livro entity) {
        id = entity.getId();
        titulo = entity.getTítulo();
        ano = entity.getAno();
        imgUrl = entity.getImgUrl();
        descricao = entity.getDescricao();
    }

    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public Integer getAno() {
        return ano;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getDescricao() {
        return descricao;
    }
}
