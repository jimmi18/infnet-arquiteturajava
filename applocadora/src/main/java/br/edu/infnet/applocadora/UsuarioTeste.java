package br.edu.infnet.applocadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocadora.model.domain.Usuario;
import br.edu.infnet.applocadora.model.service.UsuarioService;

@Order(1)
@Component
public class UsuarioTeste implements ApplicationRunner {
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Usuários ##");
		
		Usuario user1 = new Usuario();
		//user1.setId(null);
		user1.setEmail("jimmi18@gmail.com");
		user1.setNome("Super User Root");
		user1.setSenha("12345");
		usuarioService.incluir(user1);
	}
}