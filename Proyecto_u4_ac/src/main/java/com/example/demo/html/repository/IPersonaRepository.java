package com.example.demo.html.repository;

import com.example.demo.html.repository.modelo.Persona;

import java.util.List;

public interface IPersonaRepository {
	
	public void incertarP(Persona persona);
	public Persona buscarPorId(Integer id);
	public void actualizarP(Persona persona);
	public void eliminarPorId(Integer id);
	public List<Persona> buscarTodos();

}
