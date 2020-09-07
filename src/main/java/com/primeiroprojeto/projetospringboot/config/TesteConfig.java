package com.primeiroprojeto.projetospringboot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.primeiroprojeto.projetospringboot.entities.Usuario;
import com.primeiroprojeto.projetospringboot.repositorios.UsuarioRepositorio;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "marioroberto@gmail.com", "26744172", "123456");
		Usuario u2 = new Usuario(null, "creusaoliveira@hotmail.com", "26720444", "654321");
		
		usuarioRepositorio.saveAll(Arrays.asList(u1,u2));
	
	}

	
}
