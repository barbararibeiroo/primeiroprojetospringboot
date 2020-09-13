package com.primeiroprojeto.projetospringboot.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.primeiroprojeto.projetospringboot.entities.Pedido;
import com.primeiroprojeto.projetospringboot.entities.Usuario;
import com.primeiroprojeto.projetospringboot.enums.PedidoStatus;
import com.primeiroprojeto.projetospringboot.repositorios.PedidoRepositorio;
import com.primeiroprojeto.projetospringboot.repositorios.UsuarioRepositorio;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;


	@Autowired
	private PedidoRepositorio pedidoRepositorio;
	
	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "marioroberto@gmail.com", "26744172", "123456");
		Usuario u2 = new Usuario(null, "creusaoliveira@hotmail.com", "26720444", "654321");

		
		Pedido p1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), PedidoStatus.PAGO, u1);
		Pedido p2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), PedidoStatus.AGUARDANDO_PAGAMENTO, u2);
		Pedido p3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), PedidoStatus.AGUARDANDO_PAGAMENTO, u1);

		usuarioRepositorio.saveAll(Arrays.asList(u1, u2));
		pedidoRepositorio.saveAll(Arrays.asList(p1,p2,p3));

	}

}
