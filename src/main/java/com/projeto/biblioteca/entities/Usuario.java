package com.projeto.biblioteca.entities;
import jakarta.persistence.*;

@Entity
@Table(name = "tb_usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuario;
    private String nome;
    private String numero;
    private Long livroId;
    private String livro;


    @ManyToOne
    @JoinColumn(name = "biblioteca_id")
    private Biblioteca biblioteca;

    public Usuario() {
    }

    public Long getId() {
        return usuario;
    }

    public void setId(Long id) {
        this.usuario = usuario;
    }

    public String getNome() {
        return nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getIdLivro() { return livroId; }

    public void setIdLivro(Long idLivro) { this.livroId = livroId; }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String Livro) {
        this.livro = livro;
    }

    public void setBiblioteca(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }
}
