package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Agente;

public class AgenteRepository {
	
	@Inject
	private EntityManager manager;
	
	public void incluir(Agente agente){
		this.manager.merge(agente);
	}
	
	public void excluir(Agente agente){
		this.manager.remove(agente);
	}
	
	public Agente busca(Integer id) {
		return this.manager.find(Agente.class, id);
	}

	public List<Agente> lista() {
		return this.manager.createQuery("select a from Agente a", Agente.class).getResultList();
	}
}
