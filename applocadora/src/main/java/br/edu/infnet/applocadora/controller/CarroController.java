package br.edu.infnet.applocadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.applocadora.model.service.CarroService;

@Controller
public class CarroController {
	
	@Autowired
	private CarroService carroService;
	
	@GetMapping(value = "/carro/listar")
	public String telaLista(Model model) {		
		model.addAttribute("listagem", carroService.obterLista());
		return "carro/listar";
	}
	
	@GetMapping(value="/carro/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		carroService.excluir(id);
		return "redirect:/carro/listar";
	}
}