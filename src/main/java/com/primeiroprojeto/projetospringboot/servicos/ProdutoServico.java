package com.primeiroprojeto.projetospringboot.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primeiroprojeto.projetospringboot.entities.Produto;
import com.primeiroprojeto.projetospringboot.repositorios.ProdutoRepositorio;

@Service
public class ProdutoServico {
	
	@Autowired
	private ProdutoRepositorio ProdutoRepositorio;

	public List<Produto> findAll(){
		return ProdutoRepositorio.findAll();
	}
	public Produto findById(Long id) {
		Optional<Produto> obj = ProdutoRepositorio.findById(id);
		return obj.get();
	}
}
