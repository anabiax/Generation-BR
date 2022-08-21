package com.generation.animal;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Preguica a1 = new Preguica("Preguicinha", 4);
		a1.som();                       
		
		Cavalo a2 = new Cavalo("Cavalinho", 5); 
		a2.som();
		
		Cachorro a3 = new Cachorro("Cachorrinho", 6); 
		a3.som();
		
	}

}
