package com.example.demo.html.service;

import java.util.List;

import com.example.demo.html.repository.modelo.Persona;

public interface IPersonaService {
	
	public void incertarP(Persona persona);
	public Persona buscarPorId(Integer id);
	public void actualizarP(Persona persona);
	public void eliminarPorId(Integer id);
	public List<Persona> buscarTodos();
}
