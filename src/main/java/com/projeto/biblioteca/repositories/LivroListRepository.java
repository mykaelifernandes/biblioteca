package com.projeto.biblioteca.repositories;

import com.projeto.biblioteca.entities.LivroList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroListRepository extends JpaRepository<LivroList, Long> {

}
