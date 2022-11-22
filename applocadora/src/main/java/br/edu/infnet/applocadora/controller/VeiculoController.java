package br.edu.infnet.applocadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.applocadora.model.service.VeiculoService;

@Controller
public class VeiculoController {
	
	@Autowired
	private VeiculoService veiculoService;
	
	@GetMapping(value = "/veiculo/listar")
	public String telaLista(Model model) {		
		model.addAttribute("listagem", veiculoService.obterLista());
		return "veiculo/listar";
	}
	
	@GetMapping(value="/veiculo/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		veiculoService.excluir(id);
		return "redirect:/veiculo/listar";
	}
}