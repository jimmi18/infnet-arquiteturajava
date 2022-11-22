package br.edu.infnet.applocadora.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.applocadora.model.domain.Aviao;
import br.edu.infnet.applocadora.model.repository.AviaoRepository;

@Service
public class AviaoService {
	
	@Autowired
	private AviaoRepository aviaoRepository;
	
	public void incluir(Aviao aviao) {
		aviaoRepository.save(aviao);
	}
	
	public void excluir(Integer id) {
		aviaoRepository.deleteById(id);
	}
	
	public Collection<Aviao> obterLista(){
		return (Collection<Aviao>) aviaoRepository.findAll();
	}
}