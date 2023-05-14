package com.projeto.biblioteca.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_livro_list")
public class LivroList {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;


    public LivroList(){}

    public LivroList(Long id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LivroList livroList)) return false;

        return id.equals(livroList.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
