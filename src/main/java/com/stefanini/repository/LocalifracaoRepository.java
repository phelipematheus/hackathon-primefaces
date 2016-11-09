package com.stefanini.repository;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.stefanini.model.Localinfracao;

public class LocalifracaoRepository {
	
	@Inject
	private EntityManager manager;
	
	public void incluir(Localinfracao infracao){
		this.manager.merge(infracao);
	}
	
	public void excluir(Localinfracao infracao){
		this.manager.remove(infracao);
	}
	
	public Localinfracao busca(Integer id) {
		return this.manager.find(Localinfracao.class, id);
	}

	public List<Localinfracao> lista() {
		return this.manager.createQuery("select a from Localinfracao a", Localinfracao.class).getResultList();
	}
	
}
