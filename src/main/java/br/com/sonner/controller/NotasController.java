package br.com.sonner.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.sonner.modelo.Cliente;

@Controller	
public class NotasController{
	@RequestMapping("/emissao")
	@ResponseBody
	public void  nota() {
		Cliente cliente1 = new Cliente("22222","Carlos");
		System.out.println (cliente1);
	}
	
}