package Família57;

import java.util.Scanner;

public class ExVetor {

	public static void main(String[] args) {
		
/* 2- Faça um programa que receba 6 números inteiros e mostre: 
 * 
• Os números pares digitados;  
• A soma dos números pares digitados; 
• Os números ímpares digitados; 
• A quantidade de números ímpares digitados.
 */

		Scanner entrada = new Scanner(System.in);
		
		int x,i, num=0, par=0, impar=0, somaPar=0, quantImpar=0;
		
		int[] numeros = new int[6];
		
		for(x=0; x<6; x++){
			
				System.out.println("Informe um número: ");
				numeros[x] = entrada.nextInt();
				
				
				if(numeros[x] % 2 == 0) {
					somaPar += numeros[x];
					par++;
					
				} else {
					impar ++; 
			}
		}
			
		System.out.println("\n Números pares recebidos: " );
			for(x=0; x<6; x++) {
				if(numeros[x] % 2 == 0) {
					System.out.print(numeros[x] + " ");
				}
			}
			
			System.out.println("\n Soma dos números pares digitados: " + somaPar);

			System.out.println("\n Números ímpares recebidos: ");
				for(x=0; x < 6; x++) {
					if(numeros[x] % 2 == 1) {
						System.out.print(numeros[x] + " ");
					}
				}
		
		System.out.println("\n Quantidade de números ímpares digitados: " + impar);
	}
}