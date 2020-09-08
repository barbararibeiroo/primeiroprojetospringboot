package com.primeiroprojeto.projetospringboot.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeiroprojeto.projetospringboot.entities.Usuario;
import com.primeiroprojeto.projetospringboot.servicos.UsuarioServico;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@Autowired
	private UsuarioServico servico;
	
	@GetMapping
	public ResponseEntity<List> findAll(){
		List<Usuario> list = servico.findAll();
		return ResponseEntity.ok().body(list);
	}
		
	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Long id){
		Usuario obj = servico.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
