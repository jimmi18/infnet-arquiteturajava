package br.edu.infnet.applocadora.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.applocadora.model.domain.Contrato;
import br.edu.infnet.applocadora.model.repository.ContratoRepository;

@Service
public class ContratoService {
	
	@Autowired
	private ContratoRepository contratoRepository;
	
	public void incluir(Contrato contrato) {
		contratoRepository.save(contrato);
	}
	
	public void excluir(Integer id) {
		contratoRepository.deleteById(id);
	}
	
	public Collection<Contrato> obterLista(){
		return (Collection<Contrato>) contratoRepository.findAll();
	}
}