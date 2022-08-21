package com.generation.animal;

public class Cavalo extends Animal {
	

	public Cavalo(String nome, int idade) {
		super(nome, idade);
		
	}

	@Override
	public void som() {
		System.out.println("pocot�");

	}

	@Override
	public void movimento() {
		System.out.println("correndo");
		
	}

}
