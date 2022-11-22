package br.edu.infnet.applocadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.applocadora.model.service.ContratoService;
//import br.edu.infnet.applocadora.model.service.LocatarioService;
//import br.edu.infnet.applocadora.model.service.VeiculoService;

@Controller
public class ContratoController {
	
	@Autowired
	private ContratoService contratoService;
	//@Autowired
	//private LocatarioService locatarioService;
	//@Autowired
	//private VeiculoService veiculoService;
	
	@GetMapping(value = "/contrato/listar")
	public String telaLista(Model model) {
		model.addAttribute("locatarios", contratoService.obterLista());
		return "contrato/listar";
	}
	
	@GetMapping(value="/contrato/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		contratoService.excluir(id);
		return "redirect:/contrato/listar";
	}
}