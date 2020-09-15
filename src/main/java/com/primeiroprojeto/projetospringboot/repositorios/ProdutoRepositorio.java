package com.primeiroprojeto.projetospringboot.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.projetospringboot.entities.Produto;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long>{

}
