package br.edu.infnet.applocadora;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocadora.model.domain.Aviao;
import br.edu.infnet.applocadora.model.domain.Caminhao;
import br.edu.infnet.applocadora.model.domain.Carro;
//import br.edu.infnet.applocadora.model.domain.Veiculo;
//import org.springframework.core.annotation.Order;

//import br.edu.infnet.applocadora.model.domain.Aviao;
//import br.edu.infnet.applocadora.model.domain.Carro;
//import br.edu.infnet.applocadora.model.domain.Caminhao;

//import br.edu.infnet.applocadora.model.domain.Veiculo;

@Component
public class VeiculoTeste implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Veiculos ##");
		
		Aviao aviao = new Aviao();
		aviao.setPeso(5000.80f);
		aviao.setCor("azul");
		aviao.setMarca("embraer");
		aviao.setTemSeguro(true);
		aviao.setTipoMotor("motor a pistão");
		aviao.setCombustivel("gasolina de aviação");
		aviao.setQtdPessoas(4);
		System.out.println("Aviao - " + aviao);
		
		Carro carro = new Carro();
		carro.setPeso(1900.90);
		carro.setCor("preto");
		carro.setMarca("toyota");
		carro.setTemSeguro(true);
		carro.setPlaca("RLV-1228");
		carro.setModelo("Gol");
		carro.setCambio('A');
		System.out.println("Carro - " + carro);
		
		Caminhao caminhao = new Caminhao();
		caminhao.setPeso(10000.80);
		caminhao.setCor("amarelo");
		caminhao.setMarca("mercedes");
		caminhao.setTemSeguro(false);
		caminhao.setTipoCaminhao("Rodotrem");
		caminhao.setCapacidadeCarga(74000);
		caminhao.setQtdEixos(9);
		System.out.println("Caminhão - " + caminhao);
	}
}