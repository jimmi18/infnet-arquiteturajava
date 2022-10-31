package br.edu.infnet.applocadora;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
//import org.springframework.core.annotation.Order;

import br.edu.infnet.applocadora.model.domain.Caminhao;

@Component
public class CaminhaoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		
		System.out.println("## Cadastramento de Caminhões ##");
		
		Caminhao cm1 = new Caminhao();
		cm1.setTipoCaminhao("VUC");
		cm1.setCapacidadeCarga(3000);
		cm1.setQtdEixos(2);
		System.out.println("Caminhão - " + cm1);
		
		Caminhao cm2 = new Caminhao();
		cm2.setTipoCaminhao("Rodotrem");
		cm2.setCapacidadeCarga(74000);
		cm2.setQtdEixos(9);
		System.out.println("Caminhão - " + cm2);
		
		Caminhao cm3 = new Caminhao();
		cm3.setTipoCaminhao("Rodotrem");
		cm3.setCapacidadeCarga(64000);
		cm3.setQtdEixos(7);
		System.out.println("Caminhão - " + cm3);
	}
}