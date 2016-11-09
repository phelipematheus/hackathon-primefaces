package com.stefanini.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Localinfracao;
import com.stefanini.service.LocalinfracaoService;;

@Named("localInfracaoMB")
@RequestScoped
public class LocalinfracaoBean {
	
	@Inject
	private Localinfracao localInfracao;
	
	private List<Localinfracao> lista;
	@Inject
	private LocalinfracaoService localInfracaoService;
	
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

	public List<Localinfracao> getLista() {
		if(this.lista == null)
			this.lista = localInfracaoService.lista();
		return this.lista;
	}

	
	public Localinfracao getLocalInfracao() {
		return localInfracao;
	}
	public void setLocalInfracao(Localinfracao localInfracao) {
		this.localInfracao = localInfracao;
	}
	public LocalinfracaoService getLocalInfracaoService() {
		return localInfracaoService;
	}
	public void setLocalInfracaoService(LocalinfracaoService localInfracaoService) {
		this.localInfracaoService = localInfracaoService;
	}
	
	
}
