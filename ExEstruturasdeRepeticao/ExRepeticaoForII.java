package Família57;

import java.util.Scanner;

public class ExRepeticaoFor {

	public static void main(String[] args) {
		/* 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR) */

		int x;
		
		Scanner leia = new Scanner(System.in);
		
		for(x=1; x <= 10; x++) {
			
			System.out.println("\n Digite um número inteiro: ");
			x = leia.nextInt();
			
			
			if(x % 2 == 0) {
				System.out.println("\n Par: " + x);
				
			} else {
				System.out.println("\n Ímpar: " + x);
			}
		}
		
	}

}
