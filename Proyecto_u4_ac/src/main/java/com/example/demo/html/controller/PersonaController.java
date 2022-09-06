package com.example.demo.html.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.html.repository.modelo.Persona;
import com.example.demo.html.service.IPersonaService;

@Controller
@RequestMapping("/personas")
public class PersonaController {

    @Autowired
    private IPersonaService personaService;

    // GET
    @GetMapping("/buscar")
    public String buscarTodos(Model modelo) {

        List<Persona> lista = this.personaService.buscarTodos();
        modelo.addAttribute("personas", lista);
        return "vistaListaPersonas";
    }

    @GetMapping("/buscarUno/{idPersona}")
    public String buscarPersona(@PathVariable("idPersona") Integer id, Model modelo) {
        System.out.println("El ID: " + id);
        Persona per = this.personaService.buscarPorId(id);
        modelo.addAttribute("persona", per);
        return "vistaPersona";
    }

    @PutMapping("/actualizar/{idPersona}")
    public String actualizarPersona(@PathVariable("idPersona") Integer id, Persona persona) {
        persona.setId(id);
        this.personaService.actualizarP(persona);
        return "redirect:/personas/buscar";
    }

    @DeleteMapping("/borrar/{idPersona}")
    public String borrarPersona(@PathVariable("idPersona") Integer id) {
        this.personaService.eliminarPorId(id);
        return "redirect:/personas/buscar";

    }

    @GetMapping("/nuevaPersona")
    public String paginaNuevaPeronsa(Persona persona) {
        return "vistaNuevaPersona";
    }

    @PostMapping("/insertar")
    public String insertarPersona(Persona persona) {
        this.personaService.incertarP(persona);
        return "redirect:/personas/buscar";
    }
}