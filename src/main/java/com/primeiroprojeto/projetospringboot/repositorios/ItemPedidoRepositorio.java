package com.primeiroprojeto.projetospringboot.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.projetospringboot.entities.ItemPedido;

public interface ItemPedidoRepositorio extends JpaRepository<ItemPedido, Long>{

}
