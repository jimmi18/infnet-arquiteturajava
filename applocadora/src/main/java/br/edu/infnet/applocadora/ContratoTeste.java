package br.edu.infnet.applocadora;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
//import org.springframework.core.annotation.Order;

import br.edu.infnet.applocadora.model.domain.Contrato;

@Component
public class ContratoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Contratos ##");
		
		Contrato contrato1 = new Contrato();
		contrato1.setValor(3000.5f);
		contrato1.setQtdDiarias(3);
		contrato1.setData();
		System.out.println("Contrato - " + contrato1);
		
		Contrato contrato2 = new Contrato();
		contrato2.setValor(2300.8f);
		contrato2.setQtdDiarias(2);
		contrato2.setData();
		System.out.println("Contrato - " + contrato2);
		
		Contrato contrato3 = new Contrato();
		contrato3.setValor(1400.5f);
		contrato3.setQtdDiarias(6);
		contrato3.setData();
		System.out.println("Contrato - " + contrato3);
	}
}