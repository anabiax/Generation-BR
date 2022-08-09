package Família57;

import java.util.Scanner;

public class EntradaeSaida {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		int a, b, soma; // variáveis
		
		System.out.println("\n Entre com o valor de A: ");
		a = ler.nextInt(); // jogar dentro da minha variável o que o usuário informou
		System.out.println("Entre com o valor de B: ");
		b = ler.nextInt();
		soma = a+b;
		System.out.println(soma);
		
	}

}
