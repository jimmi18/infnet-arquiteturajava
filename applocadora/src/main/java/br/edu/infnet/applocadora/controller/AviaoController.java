package br.edu.infnet.applocadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import br.edu.infnet.applocadora.model.service.AviaoService;

@Controller
public class AviaoController {
	
	@Autowired
	private AviaoService aviaoService;
	
	@GetMapping(value = "/aviao/listar")
	public String telaLista(Model model) {
		model.addAttribute("listagem", aviaoService.obterLista());
		return "aviao/listar";
	}
	
	@GetMapping(value="/aviao/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		aviaoService.excluir(id);
		return "redirect:/aviao/listar";
	}
}