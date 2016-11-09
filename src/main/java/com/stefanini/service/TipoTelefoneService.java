package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Agente;
import com.stefanini.model.Tipotelefone;
import com.stefanini.repository.TipoTelefoneRepository;

@Stateless
public class TipoTelefoneService {
	
	@Inject
	private TipoTelefoneRepository tipoTelefoneRepository;
	
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
	public void incluir (Tipotelefone tipoTelefone){
		this.tipoTelefoneRepository.incluir(tipoTelefone);
	}
	@TransactionAttribute(TransactionAttributeType.REQUIRED)
    public List<Tipotelefone> lista(){
    	return this.tipoTelefoneRepository.lista();
    }
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void excluir(Tipotelefone tipoTelefone){
    	this.tipoTelefoneRepository.excluir(tipoTelefone);
    }
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void editar(Tipotelefone tipotelefone ){
    	this.tipoTelefoneRepository.incluir(tipotelefone);
    }
	

}
