package br.edu.infnet.applocadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocadora.model.domain.Caminhao;
import br.edu.infnet.applocadora.model.service.CaminhaoService;

@Order(6)
@Component
public class CaminhaoTeste implements ApplicationRunner {
	
	@Autowired
	private CaminhaoService caminhaoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Caminhões ##");
		
		Caminhao cm1 = new Caminhao();
		cm1.setPeso(10000.80);
		cm1.setCor("branco");
		cm1.setMarca("mercedes");
		cm1.setTemSeguro(false);
		cm1.setTipoCaminhao("VUC");
		cm1.setCapacidadeCarga(3000);
		cm1.setQtdEixos(2);
		caminhaoService.incluir(cm1);
		
		Caminhao cm2 = new Caminhao();
		cm2.setPeso(20000.80);
		cm2.setCor("preto");
		cm2.setMarca("mercedes");
		cm2.setTemSeguro(true);
		cm2.setTipoCaminhao("Rodotrem");
		cm2.setCapacidadeCarga(74000);
		cm2.setQtdEixos(9);
		caminhaoService.incluir(cm2);
		
		Caminhao cm3 = new Caminhao();
		cm3.setPeso(15000.80);
		cm3.setCor("azul");
		cm3.setMarca("scania");
		cm3.setTemSeguro(true);
		cm3.setTipoCaminhao("Rodotrem");
		cm3.setCapacidadeCarga(64000);
		cm3.setQtdEixos(7);
		caminhaoService.incluir(cm3);
	}
}