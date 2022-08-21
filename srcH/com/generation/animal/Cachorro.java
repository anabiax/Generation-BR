package com.generation.animal;

public class Cachorro extends Animal {

	public Cachorro(String nome, int idade) {
		super(nome, idade);
	
	}
	
	public void correr() {
		
	}

	@Override
	public void som() {
		System.out.println("auau");

		
	}

	@Override
	public void movimento() {
		System.out.println("correndo");

		
	}
	
	
}
