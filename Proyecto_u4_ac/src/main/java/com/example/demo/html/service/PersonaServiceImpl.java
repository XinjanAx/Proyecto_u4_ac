package com.example.demo.html.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.html.repository.IPersonaRepository;
import com.example.demo.html.repository.modelo.Persona;

@Service
public class PersonaServiceImpl implements IPersonaService{
	
	@Autowired
	private IPersonaRepository personaRepository;
	@Override
	public void incertarP(Persona persona) {
		// TODO Auto-generated method stub
		this.personaRepository.incertarP(persona);
	}

	@Override
	public Persona buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.personaRepository.buscarPorId(id);
	}

	@Override
	public void actualizarP(Persona persona) {
		// TODO Auto-generated method stub
		this.personaRepository.actualizarP(persona);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.personaRepository.eliminarPorId(id);
	}

	@Override
	public List<Persona> buscarTodos() {
		// TODO Auto-generated method stub
		return this.personaRepository.buscarTodos();
	}

}
