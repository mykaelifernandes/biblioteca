package com.projeto.biblioteca.repositories;

import com.projeto.biblioteca.entities.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Long> {

}
