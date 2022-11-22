package br.edu.infnet.applocadora;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.ArrayList;

import br.edu.infnet.applocadora.model.domain.Aviao;
import br.edu.infnet.applocadora.model.domain.Caminhao;
import br.edu.infnet.applocadora.model.domain.Carro;
import br.edu.infnet.applocadora.model.domain.Contrato;
import br.edu.infnet.applocadora.model.domain.Locatario;
import br.edu.infnet.applocadora.model.domain.Veiculo;
import br.edu.infnet.applocadora.model.service.ContratoService;

@Order(7)
@Component
public class ContratoTeste implements ApplicationRunner {
	
	@Autowired
	private ContratoService contratoService;

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("## Cadastramento de Contratos ##");
		
		Aviao aviao = new Aviao();
		aviao.setId(1);
		aviao.setPeso(5000.80f);
		aviao.setCor("azul");
		aviao.setMarca("embraer");
		aviao.setTemSeguro(true);
		aviao.setTipoMotor("motor a pistão");
		aviao.setCombustivel("gasolina de aviação");
		aviao.setQtdPessoas(4);
		
		Carro carro = new Carro();
		carro.setId(2);
		carro.setPeso(1900.90);
		carro.setCor("preto");
		carro.setMarca("toyota");
		carro.setTemSeguro(true);
		carro.setPlaca("RLV-1228");
		carro.setModelo("Gol");
		carro.setCambio('A');
		
		Caminhao caminhao = new Caminhao();
		caminhao.setId(3);
		caminhao.setPeso(10000.80);
		caminhao.setCor("amarelo");
		caminhao.setMarca("mercedes");
		caminhao.setTemSeguro(false);
		caminhao.setTipoCaminhao("Rodotrem");
		caminhao.setCapacidadeCarga(74000);
		caminhao.setQtdEixos(9);
		
		Locatario l1 = new Locatario();
		l1.setId(1);
		l1.setNome("Renato Teixeira");
		l1.setCpf("860.481.740-98");
		l1.setTelefone("(68) 2082-1203");
		
		List<Veiculo> veiculosPrimeiroContrato = new ArrayList<Veiculo>();
		veiculosPrimeiroContrato.add(carro);
		veiculosPrimeiroContrato.add(caminhao);
		
		List<Veiculo> veiculosOutrosContratos = new ArrayList<Veiculo>();
		veiculosOutrosContratos.add(caminhao);
		veiculosOutrosContratos.add(aviao);
		veiculosOutrosContratos.add(carro);
		
		Contrato contrato1 = new Contrato(l1);
		contrato1.setId(1);
		contrato1.setValor(3000.5f);
		contrato1.setQtdDiarias(3);
		contrato1.setVeiculos(veiculosPrimeiroContrato);
		contrato1.setLocatario(l1);
		contratoService.incluir(contrato1);
	}
}