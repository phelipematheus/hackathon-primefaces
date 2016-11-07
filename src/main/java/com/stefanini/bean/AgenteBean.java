package com.stefanini.bean;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Agente;
import com.stefanini.service.AgenteService;

@Named("agenteMB")
@RequestScoped
public class AgenteBean {
	private Agente agente = new Agente();
	
	@Inject
	private AgenteService agenteService;
	
	public String chamar() {
        return "/pages/teste";
    }

	public Agente getAgente() {
		return agente;
	}

	public void setAgente(Agente agente) {
		this.agente = agente;
	}
	
	
}
