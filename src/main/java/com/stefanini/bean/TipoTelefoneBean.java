package com.stefanini.bean;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import com.stefanini.model.Tipotelefone;
import com.stefanini.service.TipoTelefoneService;

@Named("tipoTelefoneMB")
@RequestScoped
public class TipoTelefoneBean {
	
	@Inject
	private Tipotelefone tipoTelefone;
	
	private List<Tipotelefone> lista;
	
	@Inject
	private TipoTelefoneService tipoTelefoneService;
	
	public void incluir(){
		tipoTelefoneService.incluir(this.tipoTelefone);
	}
	public void editar(){
		tipoTelefoneService.editar(this.tipoTelefone);
	}
	public String excluir() {
		this.tipoTelefoneService.excluir(this.tipoTelefone);
		this.lista = null;
		return null;
	}
	public Tipotelefone getTipoTelefone() {
		return tipoTelefone;
	}
	public void setTipoTelefone(Tipotelefone tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	public List<Tipotelefone> getLista() {
		if(this.lista == null)
			this.lista = tipoTelefoneService.lista();
		return lista;
	}
	public void setLista(List<Tipotelefone> lista) {
		this.lista = lista;
	}
	public TipoTelefoneService getTipoTelefoneService() {
		return tipoTelefoneService;
	}
	public void setTipoTelefoneService(TipoTelefoneService tipoTelefoneService) {
		this.tipoTelefoneService = tipoTelefoneService;
	}
	
	
	
	
	

}
