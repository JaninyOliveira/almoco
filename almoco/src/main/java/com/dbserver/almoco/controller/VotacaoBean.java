package com.dbserver.almoco.controller;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;


import com.dbserver.almoco.model.Restaurante;

@ManagedBean(name = "votacaoBean")
@RequestScoped
public class VotacaoBean {
	@ManagedProperty(value = "#{globalBean}")
	private GlobalBean globalBean;
	private String restauranteEscolhido;
	private Boolean admin;

	@PostConstruct
	public void init() {
		admin = globalBean.getUsuario().getAdmin();

	}

	public String votar() {
		adicionaVoto();
		return "obrigado";
	}

	public String mostrarPainel() {
		return "painel-admin";
	}

	public void adicionaVoto() {
		Restaurante rAux = null;
		for (Restaurante r : globalBean.getRestaurantes()) {
			if (r.getNome().equals(restauranteEscolhido)) {
				rAux = r;
				break;
			}
		}
		rAux.setVotos(rAux.getVotos() + 1);
		globalBean.getUsuario().setJaVotou(true);
	}

	public String getRestauranteEscolhido() {
		return restauranteEscolhido;
	}

	public void setRestauranteEscolhido(String restauranteEscolhido) {
		this.restauranteEscolhido = restauranteEscolhido;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public GlobalBean getGlobalBean() {
		return globalBean;
	}

	public void setGlobalBean(GlobalBean globalBean) {
		this.globalBean = globalBean;
	}

}
