package com.generation.animal;

public class Preguica extends Animal{

	public Preguica(String nome, int idade) {
		super(nome, idade); // refere-se � SuperClasse
		
	}
	
	@Override
	public void movimento() {
		System.out.println("subindo, uma hora chega");
	}
	

	@Override
	public void som() {
		System.out.println("eu n�o sei o barulho que uma pregui�a faz");
		
	}
	

	
	
	
	

}
