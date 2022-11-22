package br.edu.infnet.applocadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocadora.model.domain.Locatario;
import br.edu.infnet.applocadora.model.domain.Usuario;
import br.edu.infnet.applocadora.model.service.LocatarioService;

@Order(2)
@Component
public class LocatarioTeste implements ApplicationRunner {
	
	@Autowired
	private LocatarioService locatarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Locatarios ##");
		
		Usuario user1 = new Usuario();
		user1.setId(1);
		
		Locatario l1 = new Locatario();
		l1.setId(1);
		l1.setNome("Renato Teixeira");
		l1.setCpf("860.481.740-98");
		l1.setTelefone("(68) 2082-1203");
		l1.setUsuario(user1);
		locatarioService.incluir(l1);
	}
}