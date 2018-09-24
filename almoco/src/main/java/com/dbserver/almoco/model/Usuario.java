package com.dbserver.almoco.model;

public class Usuario {
	private String login = "";
	private String senha = "";
	private Boolean admin;
	private Boolean jaVotou;

	public Usuario() {
		super();
	}

	public Usuario(String login, String senha, Boolean admin, Boolean jaVotou) {
		super();
		this.login = login;
		this.senha = senha;
		this.admin = admin;
		this.jaVotou = jaVotou;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Boolean getAdmin() {
		return admin;
	}

	public void setAdmin(Boolean admin) {
		this.admin = admin;
	}

	public Boolean getJaVotou() {
		return jaVotou;
	}

	public void setJaVotou(Boolean jaVotou) {
		this.jaVotou = jaVotou;
	}



	
}