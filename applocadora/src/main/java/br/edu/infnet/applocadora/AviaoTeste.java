package br.edu.infnet.applocadora;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
//import org.springframework.core.annotation.Order;

import br.edu.infnet.applocadora.model.domain.Aviao;

@Component
public class AviaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Aviões ##");
		
		Aviao v1 = new Aviao();
		v1.setTipoMotor("motor a pistão");
		v1.setCombustivel("gasolina de aviação");
		v1.setQtdPessoas(4);
		System.out.println("Aviao - " + v1);
		
		Aviao v2 = new Aviao();
		v2.setTipoMotor("turbofan");
		v2.setCombustivel("querosene de aviação");
		v2.setQtdPessoas(100);
		System.out.println("Aviao - " + v2);
		
		Aviao v3 = new Aviao();
		v3.setTipoMotor("turbo-helice");
		v3.setCombustivel("querosene de aviação");
		v3.setQtdPessoas(10);
		System.out.println("Aviao - " + v3);
	}
}