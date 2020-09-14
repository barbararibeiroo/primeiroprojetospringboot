package com.primeiroprojeto.projetospringboot.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primeiroprojeto.projetospringboot.entities.Categoria;
import com.primeiroprojeto.projetospringboot.repositorios.CategoriaRepositorio;

@Service
public class CategoriaServico {
	
	@Autowired
	private CategoriaRepositorio CategoriaRepositorio;

	public List<Categoria> findAll(){
		return CategoriaRepositorio.findAll();
	}
	public Categoria findById(Long id) {
		Optional<Categoria> obj = CategoriaRepositorio.findById(id);
		return obj.get();
	}
}
