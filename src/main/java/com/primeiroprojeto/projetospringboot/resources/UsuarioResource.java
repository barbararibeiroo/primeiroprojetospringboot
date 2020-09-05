package com.primeiroprojeto.projetospringboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeiroprojeto.projetospringboot.entities.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {
	
	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario u = new Usuario(1L,"Bárbara", "barbararibeiro18@gmail.com", "992423844");
		return ResponseEntity.ok().body(u);
	}

}
