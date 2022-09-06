package com.example.demo.html.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.html.repository.modelo.Persona;

@Repository
@Transactional
public class PersonaRepositoryImpl implements IPersonaRepository{
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void incertarP(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.persist(persona);
	}

	@Override
	public Persona buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Persona.class, id);
	}

	@Override
	public void actualizarP(Persona persona) {
		// TODO Auto-generated method stub
		this.entityManager.merge(persona);
	}

	@Override
	public void eliminarPorId(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscarPorId(id));
	}

	@Override
	public List<Persona> buscarTodos() {
		// TODO Auto-generated method stub
		TypedQuery <Persona> myQuery = this.entityManager.createQuery("SELECT p FROM Persona p", Persona.class);
	    return myQuery.getResultList();

	}
}
