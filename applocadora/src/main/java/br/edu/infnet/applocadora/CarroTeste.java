package br.edu.infnet.applocadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocadora.model.domain.Carro;
import br.edu.infnet.applocadora.model.service.CarroService;

@Order(4)
@Component
public class CarroTeste implements ApplicationRunner {
	
	@Autowired
	private CarroService carroService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Carros ##");
		
		Carro c1 = new Carro();
		c1.setPeso(1900.90);
		c1.setCor("Preto");
		c1.setMarca("Volkswagem");
		c1.setTemSeguro(true);
		c1.setPlaca("RLV-1228");
		c1.setModelo("Gol");
		c1.setCambio('A');
		carroService.incluir(c1);
		
		Carro c2 = new Carro();
		c2.setPeso(1600.70);
		c2.setCor("Azul");
		c2.setMarca("Fiat");
		c2.setTemSeguro(false);
		c2.setPlaca("RLV-3040");
		c2.setModelo("Argo");
		c2.setCambio('M');
		carroService.incluir(c2);
		
		Carro c3 = new Carro();
		c3.setPeso(1800.70);
		c3.setCor("Verde musgo");
		c3.setMarca("Renault");
		c3.setTemSeguro(true);
		c3.setPlaca("PJZ-3030");
		c3.setModelo("Sandero");
		c3.setCambio('M');
		carroService.incluir(c3);
	}
}