package com.generation.animal;

public abstract class Animal {
	
	public String nome;
	public int idade;
	
	
	public Animal(String nome, int idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	
	}

	//método
	public abstract void som();
	
	public abstract void movimento();

	// métodos especiais
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	

	public void visualizar() {
		System.out.println("Animal:" + this.getNome());
		System.out.println("Idade:" + this.getIdade());

	}
	
	
	
}
