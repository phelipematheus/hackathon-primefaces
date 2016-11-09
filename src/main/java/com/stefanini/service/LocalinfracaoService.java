package com.stefanini.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

import com.stefanini.model.Localinfracao;
import com.stefanini.repository.LocalifracaoRepository;

@Stateless
public class LocalinfracaoService {
	
	@Inject
    private LocalifracaoRepository localInfracaoRepository;

    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void incluir(Localinfracao localInfracao){
    	this.localInfracaoRepository.incluir(localInfracao);
    }
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public List<Localinfracao> lista(){
    	return this.localInfracaoRepository.lista();
    }
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void excluir(Localinfracao localInfracao){
    	this.localInfracaoRepository.excluir(localInfracao);
    }
    @TransactionAttribute(TransactionAttributeType.REQUIRED)
    public void editar(Localinfracao localInfracao){
    	this.localInfracaoRepository.incluir(localInfracao);
    }
	
}
