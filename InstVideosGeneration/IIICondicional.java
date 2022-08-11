package Família57;

import java.util.Scanner;

public class Condicional1 {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		int idade;
		String nome;
		
		System.out.printf("\n Entre com a sua idade: ");
		idade = ler.nextInt();
		
		ler.nextLine(); // limpando a minha memória
		
		System.out.printf("\n Entre com o seu nome: ");
		nome = ler.nextLine(); // scanner usa o nextLine pra fazer a entrada de dados
		
		System.out.printf("\n Seu nome: %s", nome); // pega um valor do tipo string
		System.out.printf("\n Sua idade: %d", idade); // representa uma variável do tipo inteiro
		
		if(idade >= 18) {   // laço simples
			System.out.printf("\n Você é maior de idade ");
		} else if (idade >= 1 && idade <18) {                   // laço aninhado
			System.out.printf("\n Você é menor de idade ");
		} else { // dado inválido
			System.out.printf("\n Você entrou com uma idade inválida ");  // laço composto
		}
		
	}

}