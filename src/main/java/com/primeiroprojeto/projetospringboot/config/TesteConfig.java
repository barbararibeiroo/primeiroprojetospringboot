package com.primeiroprojeto.projetospringboot.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.primeiroprojeto.projetospringboot.entities.Categoria;
import com.primeiroprojeto.projetospringboot.entities.Pedido;
import com.primeiroprojeto.projetospringboot.entities.Produto;
import com.primeiroprojeto.projetospringboot.entities.Usuario;
import com.primeiroprojeto.projetospringboot.enums.PedidoStatus;
import com.primeiroprojeto.projetospringboot.repositorios.CategoriaRepositorio;
import com.primeiroprojeto.projetospringboot.repositorios.PedidoRepositorio;
import com.primeiroprojeto.projetospringboot.repositorios.ProdutoRepositorio;
import com.primeiroprojeto.projetospringboot.repositorios.UsuarioRepositorio;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

	@Autowired
	private UsuarioRepositorio usuarioRepositorio;


	@Autowired
	private PedidoRepositorio pedidoRepositorio;
	
	@Autowired
	private CategoriaRepositorio categoriaRepositorio;
	
	@Autowired
	private ProdutoRepositorio produtoRepositorio; 
	
	@Override
	public void run(String... args) throws Exception {

		Categoria cat1 = new Categoria(null, "Eletrônicos");
		Categoria cat2 = new Categoria(null, "Livros");
		Categoria cat3 = new Categoria(null, "Computadores");
		
		Produto prod1 = new Produto(null,"The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
		Produto prod2 = new Produto (null,"Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
		Produto prod3 = new Produto (null,"Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
		Produto prod4 = new Produto(null,"PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
		Produto prod5 = new Produto (null,"Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");
		
		

		categoriaRepositorio.saveAll(Arrays.asList(cat1,cat2,cat3));
		produtoRepositorio.saveAll(Arrays.asList(prod1,prod2,prod3,prod4,prod5));
		
		Usuario u1 = new Usuario(null, "marioroberto@gmail.com", "26744172", "123456");
		Usuario u2 = new Usuario(null, "creusaoliveira@hotmail.com", "26720444", "654321");

		
		Pedido p1 = new Pedido(null, Instant.parse("2019-06-20T19:53:07Z"), PedidoStatus.PAGO, u1);
		Pedido p2 = new Pedido(null, Instant.parse("2019-07-21T03:42:10Z"), PedidoStatus.AGUARDANDO_PAGAMENTO, u2);
		Pedido p3 = new Pedido(null, Instant.parse("2019-07-22T15:21:22Z"), PedidoStatus.AGUARDANDO_PAGAMENTO, u1);

		
		
		usuarioRepositorio.saveAll(Arrays.asList(u1, u2));
		pedidoRepositorio.saveAll(Arrays.asList(p1,p2,p3));

	}

}
