package com.projeto.biblioteca.services;


import com.projeto.biblioteca.dto.LivroListDTO;
import com.projeto.biblioteca.entities.LivroList;
import com.projeto.biblioteca.repositories.LivroListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class LivroListService {

    @Autowired
    private LivroListRepository livroListRepository;

    // Convertendo a tabela de Livros para uma Lista de Livros.
    @Transactional(readOnly = true)
    public List<LivroListDTO> findAll() {
        List<LivroList> result = livroListRepository.findAll();
        return result.stream().map(x -> new LivroListDTO(x)).toList();
    }
}
