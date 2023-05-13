package com.projeto.biblioteca.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
    @EmbeddedId
    private BelongingPK id = new BelongingPK();

    private Integer position;

    public Belonging(){}

    public Belonging(Livro livro, LivroList list, Integer position) {
        id.setLivro(livro);
        id.setList(list);
        this.position = position;
    }

    public BelongingPK getId() {
        return id;
    }

    public void setId(BelongingPK id) {
        this.id = id;
    }

    public Integer getPosition() {
        return position;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Belonging belonging)) return false;

        return id.equals(belonging.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
