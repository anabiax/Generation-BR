package Família57;

import java.util.Scanner;

public class ExLacodeDecisaoIII {

	public static void main(String[] args) {
	

		/*
		 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
		 */
		
		int idade;
		
		Scanner etaria = new Scanner(System.in);
		
		System.out.println("\n Informe sua idade: ");
		idade = etaria.nextInt();
		
		System.out.println("Faixas etárias:");
		System.out.println("\n1 10-14 infantil ");
		System.out.println("\n2 15-17 juvenil ");
		System.out.println("\n3 18-25 adulto ");
		
		if(idade >= 10 && idade <= 14) {
			System.out.println("\n Você se enquadra na categoria 'infantil'");
		} else if(idade >= 15 && idade <= 17) {
			System.out.println("\n Você se enquadra na categoria 'juvenil'");
		} else {
			System.out.println("Você se enquadra na categoria 'adulto'");
		}
	}

}