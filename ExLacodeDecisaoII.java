package Família57;

import java.util.Scanner;

public class ExLacodeDecisaoII {

	public static void main(String[] args) {
Scanner ler = new Scanner(System.in);
		
		// 2- Faça um programa que entre com três números e coloque em ordem crescente.
		int a, b, c;
		
		System.out.println("\n Informe o primeiro número inteiro: ");
		a = ler.nextInt(); // método
		System.out.println("\n Informe o segundo número inteiro: ");
		b = ler.nextInt();
		System.out.println("\n Informe o terceiro número inteiro: ");
		c = ler.nextInt();
		
		if(a < b) { // então
			if(b < c) {  // eu tb quero saber se b é menor que C
				System.out.println(a+" , "+b+" , "+c);
			} else if(a < c) {
				System.out.println(a+" , "+c+" , "+b);
			} else {
				System.out.println(c+" , "+a+" , "+b);
			}
		}
		else if(b < c) {
			if(a < c) {
				System.out.println(b+" , "+a+" , "+c);
			} else {
				System.out.println(b+" , "+c+" , "+a);
			} 
			} else {
				System.out.println(c+" , "+b+" , "+a);
			}

	}

}
