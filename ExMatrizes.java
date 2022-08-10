package Família57;

import java.util.Scanner;

public class ExMatriz {

	public static void main(String[] args) {
		
		/* 3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui. */

		int [][] matriz = new int [3][3];
		int linha, coluna, soma=0;
		float somaM10=0;
		
		Scanner entrada = new Scanner(System.in);

		for(linha=0; linha <3 ; linha++) {
			for(coluna = 0; coluna < 3; coluna++) {
				System.out.printf("Informe um número: ", linha + 1, coluna + 1);
				matriz[linha][coluna] = entrada.nextInt();
				
				if(matriz[linha][coluna] > 10) {
					somaM10 ++;
					
			    } 
			}
		}
		
		System.out.println("\n Valores maiores que 10: "+ somaM10);

	}
}
