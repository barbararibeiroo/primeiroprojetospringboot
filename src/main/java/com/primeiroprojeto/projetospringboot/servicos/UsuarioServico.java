package com.primeiroprojeto.projetospringboot.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primeiroprojeto.projetospringboot.entities.Usuario;
import com.primeiroprojeto.projetospringboot.repositorios.UsuarioRepositorio;

@Service
public class UsuarioServico {
	
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;

	public List<Usuario> findAll(){
		return usuarioRepositorio.findAll();
	}
	public Usuario findById(Long id) {
		Optional<Usuario> obj = usuarioRepositorio.findById(id);
		return obj.get();
	}
	public Usuario insert (Usuario obj) {
		return usuarioRepositorio.save(obj);
}
	public void delete(Long id) {
		usuarioRepositorio.deleteById(id);
	}
	public Usuario update (Long id, Usuario obj) {
		Usuario entity = usuarioRepositorio.getOne(id);
		updateData(entity, obj);
		return usuarioRepositorio.save(entity);
	}
	private void updateData(Usuario entity, Usuario obj) {
		entity.setNome(obj.getNome());
		entity.setEmail(obj.getEmail());
		entity.setTelefone(obj.getTelefone());
	}
}
