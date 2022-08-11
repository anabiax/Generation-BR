package Família57;

import java.util.Scanner;

public class exlacodedecisaoIV {

	public static void main(String[] args) {
		
/* 4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
ímpar exiba o número elevado ao quadrado. */
		
		int numero;
		double resultado;

		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Informe um número inteiro: ");
		numero = leia.nextInt();
		
		if(numero % 2 == 0) {
			resultado = Math.sqrt(numero);
		} else {
			resultado = Math.pow(numero,  2);
		}
		
		System.out.println("\n Resultado= " + resultado);

	}

}