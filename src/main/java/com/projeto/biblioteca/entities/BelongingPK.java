package com.projeto.biblioteca.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

// classe auxiliar para representar uma chave primária múltipla(com mais de um atributo).
@Embeddable
public class BelongingPK {
    @ManyToOne
    @JoinColumn(name = "game_id")
    private Livro livro;

    @ManyToOne
    @JoinColumn(name = "list_id")
    private LivroList list;

    public BelongingPK(){}

    public BelongingPK(Livro livro, LivroList list) {
        this.livro = livro;
        this.list = list;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LivroList getList() {
        return list;
    }

    public void setList(LivroList list) {
        this.list = list;
    }

    // Lógica de comparação baseada no Livro e na Lista.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BelongingPK that)) return false;

        if (!livro.equals(that.livro)) return false;
        return list.equals(that.list);
    }

    @Override
    public int hashCode() {
        int result = livro.hashCode();
        result = 31 * result + list.hashCode();
        return result;
    }
}
