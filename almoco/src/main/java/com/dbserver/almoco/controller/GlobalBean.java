package com.dbserver.almoco.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.dbserver.almoco.model.Restaurante;
import com.dbserver.almoco.model.Usuario;

@ManagedBean(name = "globalBean")
@ApplicationScoped
public class GlobalBean {

	private List<Usuario> usuarios;
	private List<Restaurante> restaurantes;
	private Usuario usuario;
	private Boolean votacaoEncerrada;
	
	@PostConstruct
	public void init() {
		usuarios = new ArrayList();
		restaurantes = new ArrayList();
		votacaoEncerrada = false;
		adicionarUsuarios();
		adicionarRestaurante();
	}

	public void adicionarUsuarios() {
		usuarios.add(new Usuario("Usuario1", "Usuario1", false, false));
		usuarios.add(new Usuario("Usuario2", "Usuario2", false, false));
		usuarios.add(new Usuario("Usuario3", "Usuario3", false, false));
		usuarios.add(new Usuario("Usuario4", "Usuario4", false, false));
		usuarios.add(new Usuario("Usuario5", "Usuario5", false, false));
		usuarios.add(new Usuario("Usuario6", "Usuario6", false, false));
		usuarios.add(new Usuario("Usuario7", "Usuario7", false, false));
		usuarios.add(new Usuario("Usuario8", "Usuario8", false, false));
		usuarios.add(new Usuario("Facilitador1", "Facilitador1", true, false));
		usuarios.add(new Usuario("Facilitador2", "Facilitador2", true, false));
	}

	public void adicionarRestaurante() {
		restaurantes.add(new Restaurante("Restaurante 1"));
		restaurantes.add(new Restaurante("Restaurante 2"));
		restaurantes.add(new Restaurante("Restaurante 3"));
		restaurantes.add(new Restaurante("Restaurante 4"));
		restaurantes.add(new Restaurante("Restaurante 5"));
		restaurantes.add(new Restaurante("Restaurante 6"));
		restaurantes.add(new Restaurante("Restaurante 7"));
		restaurantes.add(new Restaurante("Restaurante 8"));
		restaurantes.add(new Restaurante("Restaurante 9"));
		restaurantes.add(new Restaurante("Restaurante 10"));

	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Restaurante> getRestaurantes() {
		return restaurantes;
	}

	public void setRestaurantes(List<Restaurante> restaurantes) {
		this.restaurantes = restaurantes;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Boolean getVotacaoEncerrada() {
		return votacaoEncerrada;
	}

	public void setVotacaoEncerrada(Boolean votacaoEncerrada) {
		this.votacaoEncerrada = votacaoEncerrada;
	}

}
