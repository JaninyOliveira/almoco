package com.dbserver.almoco.model;

public class Restaurante {

	private String nome;
	private int votos;

	public Restaurante() {

	}

	public Restaurante(String nome) {
		super();
		this.nome = nome;
		this.votos = 0;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVotos() {
		return votos;
	}

	public void setVotos(int votos) {
		this.votos = votos;
	}

}
