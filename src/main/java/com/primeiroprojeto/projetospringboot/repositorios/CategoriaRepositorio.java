package com.primeiroprojeto.projetospringboot.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.projetospringboot.entities.Categoria;

public interface CategoriaRepositorio extends JpaRepository<Categoria, Long>{

}
