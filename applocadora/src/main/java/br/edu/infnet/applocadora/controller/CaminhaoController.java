package br.edu.infnet.applocadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.applocadora.model.service.CaminhaoService;

@Controller
public class CaminhaoController {
	
	@Autowired
	private CaminhaoService caminhaoService;
	
	@GetMapping(value = "/caminhao/listar")
	public String telaLista(Model model) {		
		model.addAttribute("listagem", caminhaoService.obterLista());
		return "caminhao/listar";
	}
	
	@GetMapping(value="/caminhao/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		caminhaoService.excluir(id);
		return "redirect:/caminhao/listar";
	}
}