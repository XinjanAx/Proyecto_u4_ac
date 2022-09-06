package com.example.demo.html.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.html.repository.modelo.Persona;
import com.example.demo.html.service.IPersonaService;

@Controller
@RequestMapping("/personas")
public class PersonaController {
	
	@Autowired
	private IPersonaService personaService; 
	
	//Get
	@GetMapping("/buscar")
	public String buscarTodos(Model model){
		List<Persona> lista = this.personaService.buscarTodos();
		model.addAttribute("personas", lista);
		return "vistaListaPersonas";
		
	}
}
