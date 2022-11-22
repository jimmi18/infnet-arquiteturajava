package br.edu.infnet.applocadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.applocadora.model.domain.Locatario;
import br.edu.infnet.applocadora.model.domain.Usuario;
import br.edu.infnet.applocadora.model.service.LocatarioService;

@Controller
public class LocatarioController {
	
	@Autowired
	private LocatarioService locatarioService;
	
	@GetMapping(value = "/locatario/listar")
	public String telaLista(Model model) {
		model.addAttribute("listagem", locatarioService.obterLista());
		return "locatario/listar";
	}
	
	@GetMapping(value = "/locatario")
	public String telaCadastro() {
		return "locatario/cadastro";
	}
	
	@PostMapping(value = "/locatario/incluir")
	public String incluir(Locatario locatario, @SessionAttribute("user") Usuario usuario) {
		locatario.setUsuario(usuario);
		locatarioService.incluir(locatario);
		return "locatario/listar";
	}
	
	@GetMapping(value="/locatario/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		locatarioService.excluir(id);
		return "redirect:/locatario/listar";
	}
}