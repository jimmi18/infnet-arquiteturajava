package br.edu.infnet.applocadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.applocadora.model.domain.Aviao;
import br.edu.infnet.applocadora.model.domain.Caminhao;
import br.edu.infnet.applocadora.model.domain.Carro;
import br.edu.infnet.applocadora.model.service.VeiculoService;

@Order(3)
@Component
public class VeiculoTeste implements ApplicationRunner {
	
	@Autowired
	private VeiculoService veiculoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Veiculos ##");
		
		Aviao aviao = new Aviao();
		aviao.setId(1);
		aviao.setPeso(5000.80f);
		aviao.setCor("azul");
		aviao.setMarca("embraer");
		aviao.setTemSeguro(true);
		aviao.setTipoMotor("motor a pistão");
		aviao.setCombustivel("gasolina de aviação");
		aviao.setQtdPessoas(4);
		veiculoService.incluir(aviao);
		
		Carro carro = new Carro();
		carro.setId(2);
		carro.setPeso(1900.90);
		carro.setCor("preto");
		carro.setMarca("toyota");
		carro.setTemSeguro(true);
		carro.setPlaca("RLV-1228");
		carro.setModelo("Gol");
		carro.setCambio('A');
		veiculoService.incluir(carro);
		
		Caminhao caminhao = new Caminhao();
		caminhao.setId(3);
		caminhao.setPeso(10000.80);
		caminhao.setCor("amarelo");
		caminhao.setMarca("mercedes");
		caminhao.setTemSeguro(false);
		caminhao.setTipoCaminhao("Rodotrem");
		caminhao.setCapacidadeCarga(74000);
		caminhao.setQtdEixos(9);
		veiculoService.incluir(caminhao);
	}
}