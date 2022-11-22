package br.edu.infnet.applocadora.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.applocadora.model.domain.Caminhao;
import br.edu.infnet.applocadora.model.repository.CaminhaoRepository;

@Service
public class CaminhaoService {
	
	@Autowired
	private CaminhaoRepository caminhaoRepository;
	
	public void incluir(Caminhao caminhao) {
		caminhaoRepository.save(caminhao);
	}
	
	public void excluir(Integer id) {
		caminhaoRepository.deleteById(id);
	}
	
	public Collection<Caminhao> obterLista(){
		return (Collection<Caminhao>) caminhaoRepository.findAll();
	}
}