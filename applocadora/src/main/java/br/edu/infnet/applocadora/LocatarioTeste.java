package br.edu.infnet.applocadora;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
//import org.springframework.core.annotation.Order;

import br.edu.infnet.applocadora.model.domain.Locatario;

@Component
public class LocatarioTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Locatarios ##");
		
		Locatario l1 = new Locatario();
		l1.setNome("Renato Teixeira");
		l1.setCpf("860.481.740-98");
		l1.setTelefone("(68) 2082-1203");
		System.out.println("Locatario - " + l1);
		
		Locatario l2 = new Locatario();
		l2.setNome("Raquel Paixão");
		l2.setCpf("539.381.880-73");
		l2.setTelefone("(55) 3123-8248");
		System.out.println("Locatario - " + l2);
		
		Locatario l3 = new Locatario();
		l3.setNome("Bruna Fialho");
		l3.setCpf("324.281.200-00");
		l3.setTelefone("(97) 2502-1039");
		System.out.println("Locatario - " + l3);
	}
}