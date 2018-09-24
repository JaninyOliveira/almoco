package com.dbserver.almoco.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import com.dbserver.almoco.model.Usuario;

@ManagedBean(name = "loginBean")
@RequestScoped
public class LoginBean implements Serializable {

	private static final long serialVersionUID = 8111970460852986611L;
	@ManagedProperty(value = "#{globalBean}")
	private GlobalBean globalBean;
	private Usuario usuario;

	@PostConstruct
	public void init() {

		usuario = new Usuario();

	}

	public String logar() {
		for (Usuario u : globalBean.getUsuarios()) {
			if (u.getLogin().equals(usuario.getLogin()) && u.getSenha().equals(usuario.getSenha())) {
				globalBean.setUsuario(u);
				if (u.getJaVotou()) {
					if (globalBean.getUsuario().getAdmin()) {
						return "painel-admin";
					}
					if (globalBean.getVotacaoEncerrada()) {
						return "resultado";
					}
					return "obrigado";
				}else{
					if (globalBean.getVotacaoEncerrada()) {
						if (globalBean.getUsuario().getAdmin()) {
							return "painel-admin";
						}
						return "resultado";
					}else{
						return "votacao";
					}
				}
			}

		}

		return "login";
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public GlobalBean getGlobalBean() {
		return globalBean;
	}

	public void setGlobalBean(GlobalBean globalBean) {
		this.globalBean = globalBean;
	}

}
