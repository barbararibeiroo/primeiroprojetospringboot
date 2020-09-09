package com.primeiroprojeto.projetospringboot.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.projetospringboot.entities.Pedido;

public interface PedidoRepositorio extends JpaRepository<Pedido, Long>{

}
