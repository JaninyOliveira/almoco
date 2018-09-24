package com.dbserver.almoco.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.dbserver.almoco.model.Restaurante;
import com.dbserver.almoco.model.Usuario;

@ManagedBean(name = "painelAdminBean")
@RequestScoped
public class PainelAdminBean {

	@ManagedProperty(value = "#{globalBean}")
	private GlobalBean globalBean;
	private List<Restaurante> restaurantes;

	public void encerrarVotacao() {
		globalBean.setVotacaoEncerrada(true);
	}

	public void iniciarVotacaoDia() {

		globalBean.getRestaurantes().remove(descobrirVencedor());
		zerarVotos();
		globalBean.setVotacaoEncerrada(false);
		zerarVotantes();

	}

	public void iniciarVotacoesSemana() {
		globalBean.init();
	}

	public Restaurante descobrirVencedor() {
		Restaurante rAux = null;
		int votos = 0;
		for (Restaurante r : globalBean.getRestaurantes()) {
			if (r.getVotos() > votos) {
				rAux = r;
				votos = r.getVotos();
			}
		}
		return rAux;
	}

	public void zerarVotos() {
		for (Restaurante r : globalBean.getRestaurantes()) {
			r.setVotos(0);
		}
	}
	
	public void zerarVotantes(){
		for (Usuario u : globalBean.getUsuarios()) {
			u.setJaVotou(false);
		}
	}

	public GlobalBean getGlobalBean() {
		return globalBean;
	}

	public void setGlobalBean(GlobalBean globalBean) {
		this.globalBean = globalBean;
	}

	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}
}
