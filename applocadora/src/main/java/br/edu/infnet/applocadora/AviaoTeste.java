package br.edu.infnet.applocadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocadora.model.domain.Aviao;
import br.edu.infnet.applocadora.model.service.AviaoService;

@Order(5)
@Component
public class AviaoTeste implements ApplicationRunner {
	
	@Autowired
	private AviaoService aviaoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Aviões ##");
		
		Aviao v1 = new Aviao();
		v1.setPeso(5000.80f);
		v1.setCor("azul");
		v1.setMarca("embraer");
		v1.setTemSeguro(true);
		v1.setTipoMotor("motor a pistão");
		v1.setCombustivel("gasolina de aviação");
		v1.setQtdPessoas(4);
		aviaoService.incluir(v1);
		
		Aviao v2 = new Aviao();
		v2.setPeso(9000.80f);
		v2.setCor("amarelo");
		v2.setMarca("boeing");
		v2.setTemSeguro(true);
		v2.setTipoMotor("turbofan");
		v2.setCombustivel("querosene de aviação");
		v2.setQtdPessoas(100);
		aviaoService.incluir(v2);
		
		Aviao v3 = new Aviao();
		v3.setPeso(9000.80f);
		v3.setCor("preto");
		v3.setMarca("airbus");
		v3.setTemSeguro(true);
		v3.setTipoMotor("turbo-helice");
		v3.setCombustivel("querosene de aviação");
		v3.setQtdPessoas(10);
		aviaoService.incluir(v3);
	}
}