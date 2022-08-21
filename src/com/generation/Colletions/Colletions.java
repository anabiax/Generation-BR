package com.generation.Colletions;

import java.util.ArrayList;

public class Colletions {

	public static void main(String[] args) {
		
		ArrayList <String> itens = new ArrayList<String>();
		
		itens.add("Descolorantes");
		itens.add("Cremes para hidrata��o");
		itens.add("Tintas");
		itens.add("Pastas modeladoras");
		
		System.out.println(itens.toString());
		
		itens.remove(3); // o array come�a no �ndice 0
		System.out.println(itens.toString());
		
		itens.set(2, "Tonalizantes");
		System.out.println(itens.toString());
	}
}
