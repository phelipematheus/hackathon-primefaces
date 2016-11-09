package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.LocalInfracao;
import com.stefanini.repository.LocalIfracaoRepository;

@Stateless
public class LocalInfracaoService {
	
	@Inject
    private LocalIfracaoRepository localInfracaoRepository;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void incluir(LocalInfracao localInfracao){
    	this.localInfracaoRepository.incluir(localInfracao);
    }
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public List<LocalInfracao> lista(){
    	return this.localInfracaoRepository.lista();
    }
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void excluir(LocalInfracao localInfracao){
    	this.localInfracaoRepository.excluir(localInfracao);
    }
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void editar(LocalInfracao localInfracao){
    	this.localInfracaoRepository.incluir(localInfracao);
    }
	
}
