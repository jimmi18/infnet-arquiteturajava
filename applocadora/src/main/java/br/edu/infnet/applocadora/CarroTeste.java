package br.edu.infnet.applocadora;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
//import org.springframework.core.annotation.Order;

import br.edu.infnet.applocadora.model.domain.Carro;

@Component
public class CarroTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Carros ##");
		
		Carro c1 = new Carro();
		c1.setPlaca("RLV-1228");
		c1.setModelo("Gol");
		c1.setCambio('A');
		System.out.println("Carro - " + c1);
		
		Carro c2 = new Carro();
		c2.setPlaca("RLV-3040");
		c2.setModelo("Argo");
		c2.setCambio('M');
		System.out.println("Carro - " + c2);
		
		Carro c3 = new Carro();
		c3.setPlaca("PJZ-3030");
		c3.setModelo("Sandero");
		c3.setCambio('M');
		System.out.println("Carro - " + c3);
	}
}