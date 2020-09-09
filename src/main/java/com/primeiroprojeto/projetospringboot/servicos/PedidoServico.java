package com.primeiroprojeto.projetospringboot.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primeiroprojeto.projetospringboot.entities.Pedido;
import com.primeiroprojeto.projetospringboot.repositorios.PedidoRepositorio;

@Service
public class PedidoServico {
	
	@Autowired
	private PedidoRepositorio PedidoRepositorio;

	public List<Pedido> findAll(){
		return PedidoRepositorio.findAll();
	}
	public Pedido findById(Long id) {
		Optional<Pedido> obj = PedidoRepositorio.findById(id);
		return obj.get();
	}
}
