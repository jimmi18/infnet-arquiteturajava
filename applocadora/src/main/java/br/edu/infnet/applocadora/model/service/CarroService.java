package br.edu.infnet.applocadora.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.applocadora.model.domain.Carro;
import br.edu.infnet.applocadora.model.repository.CarroRepository;

@Service
public class CarroService {
	
	@Autowired
	private CarroRepository carroRepository;
	
	public void incluir(Carro carro) {
		carroRepository.save(carro);
	}
	
	public void excluir(Integer id) {
		carroRepository.deleteById(id);
	}
	
	public Collection<Carro> obterLista(){
		return (Collection<Carro>) carroRepository.findAll();
	}
}