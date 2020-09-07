package com.primeiroprojeto.projetospringboot.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeiroprojeto.projetospringboot.entities.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, Long>{

}
