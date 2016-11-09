package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Tipotelefone;

public class TipoTelefoneRepository {
	
	@Inject
	private EntityManager manager;
	
	public void incluir (Tipotelefone tipoTelefone){
		this.manager.merge(tipoTelefone);		
	}
	
	public Tipotelefone busca(Integer id){
		return this.manager.find(Tipotelefone.class, id);
	}
	
	public List<Tipotelefone> lista(){
		return this.manager.createQuery("select a from Tipotelefone a", Tipotelefone.class).getResultList();
	}
	public void excluir(Tipotelefone tipoTelefone){
		this.manager.remove(tipoTelefone);
	}
}
