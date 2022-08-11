package Família57;

import java.util.Scanner;

public class ProgSequencial {

	public static void main(String[] args) {
		
/* 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. */
		
		int idadeDias, dias, meses, anos;
	
		Scanner idade = new Scanner(System.in);

		System.out.println("\n Informe sua idade: ");
		anos = idade.nextInt();
		
		System.out.println("\n Informe sua idade em meses: ");
		meses = idade.nextInt();
		
		System.out.println("\n Informe sua idade em dias: ");
		dias = idade.nextInt();
		
		
		idadeDias = anos * 365 + meses * 30 + dias;
		System.out.println("\n Idade em dias: " + idadeDias);
	}

}
