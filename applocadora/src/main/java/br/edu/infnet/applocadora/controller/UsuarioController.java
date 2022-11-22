package br.edu.infnet.applocadora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.applocadora.model.domain.Usuario;
import br.edu.infnet.applocadora.model.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping(value = "/usuario/listar")
	public String telaLista(Model model) {
		model.addAttribute("listagem", usuarioService.obterLista());
		return "usuario/listar";
	}
	
	@GetMapping(value = "/usuario")
	public String telaCadastro() {
		return "usuario/cadastro";
	}
	
	@PostMapping(value = "/usuario/incluir")
	public String incluir(Usuario usuario) {
		usuarioService.incluir(usuario);
		return "redirect:/usuario/listar";
	}
	
	@GetMapping(value="/usuario/{id}/excluir")
	public String exclusao(@PathVariable Integer id) {
		usuarioService.excluir(id);
		return "redirect:/usuario/listar";
	}
	
	@PostMapping(value = "/cep")
	public String obterCep(Model model, @RequestParam String cep){
		model.addAttribute("endereco", usuarioService.obterCep(cep));
		return "usuario/cadastro";
	}
}