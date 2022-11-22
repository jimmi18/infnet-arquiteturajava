package br.edu.infnet.applocadora.model.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.applocadora.model.domain.Locatario;
import br.edu.infnet.applocadora.model.repository.LocatarioRepository;

@Service
public class LocatarioService {
	
	@Autowired
	private LocatarioRepository locatarioRepository;
	
	public void incluir(Locatario locatario) {
		locatarioRepository.save(locatario);
	}
	
	public void excluir(Integer id) {
		locatarioRepository.deleteById(id);
	}
	
	public Collection<Locatario> obterLista(){
		return (Collection<Locatario>) locatarioRepository.findAll();
	}
}