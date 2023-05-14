package com.projeto.biblioteca.services;

import java.util.List;

import com.projeto.biblioteca.dto.LivroDTO;
import com.projeto.biblioteca.dto.LivroMinDTO;
import com.projeto.biblioteca.entities.Livro;
import com.projeto.biblioteca.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;


@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;


    // Método para buscar por Id.
    @Transactional(readOnly = true)
    public LivroDTO findById(Long id){
       Livro result = livroRepository.findById(id).get();
       return new LivroDTO(result);
    }

    // Convertendo a tabela de Livros para uma Lista de Livros.
    @Transactional(readOnly = true)
    public List<LivroMinDTO> findAll() {
        List<Livro> result = livroRepository.findAll();
        return result.stream().map(x -> new LivroMinDTO(x)).toList();
    }
}
