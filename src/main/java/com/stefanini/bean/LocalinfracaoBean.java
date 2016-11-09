package com.stefanini.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.LocalInfracao;
import com.stefanini.service.LocalInfracaoService;;

@Named("localInfracaoMB")
@RequestScoped
public class LocalInfracaoBean {
	
	@Inject
	private LocalInfracao localInfracao;
	
	private List<LocalInfracao> lista;
	@Inject
	private LocalInfracaoService localInfracaoService;
	
	public void incluir() {
		localInfracaoService.incluir(this.localInfracao);
    }
	public void editar() {
		localInfracaoService.incluir(this.localInfracao);
    }
	
	public String excluir() {
		this.localInfracaoService.excluir(this.localInfracao);
		this.lista = null;
		return null;
	}

	public List<LocalInfracao> getLista() {
		if(this.lista == null)
			this.lista = localInfracaoService.lista();
		return this.lista;
	}

	
	public LocalInfracao getLocalInfracao() {
		return localInfracao;
	}
	public void setLocalInfracao(LocalInfracao localInfracao) {
		this.localInfracao = localInfracao;
	}
	public LocalInfracaoService getLocalInfracaoService() {
		return localInfracaoService;
	}
	public void setLocalInfracaoService(LocalInfracaoService localInfracaoService) {
		this.localInfracaoService = localInfracaoService;
	}
	
	
}
