package com.primeiroprojeto.projetospringboot.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.projetospringboot.entities.ItemPedido;
import com.primeiroprojeto.projetospringboot.pk.ItemPedidoPk;

public interface ItemPedidoRepositorio extends JpaRepository<ItemPedido, ItemPedidoPk>{

}
