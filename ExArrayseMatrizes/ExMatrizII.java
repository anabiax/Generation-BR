package Família57;

import java.util.Scanner;

public class ExMatrizII {

	public static void main(String[] args) {
/* 4- Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um menu de opções:
(1) somar as duas matrizes 
(2) subtrair a primeira matriz da segunda 
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes 
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor da constante deve ser lido e o resultado da adição da constante deve ser armazenado na própria matriz.
*/ 

		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2]; // armazenará a soma e a diferença das duas

		int i,j, numero, op;
// linhas, colunas
		
		Scanner leia = new Scanner(System.in);
		
		for(i=0; i < 2; i++) {
			for(j=0;j < 2;j++) {
				System.out.println("\n Informe um valor para a matriz 1:");
				matriz1[i][j] = leia.nextFloat();
				
				System.out.println("\n Informe um valor para a matriz 2:");
				matriz2[i][j] = leia.nextFloat();
				
			}
		}
		
		do {
			System.out.println("\n\t\t Menu de matrizes: ");
			System.out.println("\n1 - Somar as duas matrizes");
			System.out.println("\n2 - Subtrair a primeira matriz da segunda");
			System.out.println("\n3 - Adicionar uma constante às duas matrizes");
			System.out.println("\n4 - Imprimir as matrizes");
			System.out.println("\n0 - Sair do programa");
			System.out.println("\n - Informe a sua opção");
			op = leia.nextInt();

			switch(op) {
			case 1:
				for(i=0; i < 2; i++) {
					for(j=0;j < 2;j++) {
						matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
						System.out.println("\n Soma: "+ matriz3[i][j]);
					}
				}
				break;
		
			case 2:
				for(i=0; i < 2; i++) {
					for(j=0;j < 2;j++) {
						matriz3[i][j] = matriz2[i][j] - matriz1[i][j];
						System.out.println("\n Diferença: " + matriz3[i][j]);
					}
				}
				break;
				
			case 3:
				System.out.println("\n Leia um número");
				numero = leia.nextInt();
					for(i=0; i < 2; i++) {
						for(j=0;j < 2;j++) {
							matriz1[i][j] += numero;
							matriz2[i][j] += numero;
							
							System.out.println("\n Matriz1 mais o número: "+ matriz1[i][j]);
							System.out.println("\n Matriz2 mais o número: "+ matriz2[i][j]);

					}
				}
				break;
				
			case 4: 
					for(i=0;i < 2; i++) {
						for(j=0; j < 2; j++) {
							System.out.println("\n Matriz 1: " + matriz1[i][j]);
							System.out.println("\n Matriz 2: " + matriz2[i][j]);
						}
					}
					break;
					
			case 0:
					System.out.println("\n Obrigada por utilizar o programa!");
					break;
					
					default:
						System.out.println("\n Opção inválida");
			}	
	
		} while(op!=0); // vai executar enquanto for dif de 0. Gerar uma saída p/ voltar ao menu. Apenas qnd digitar 0 é que sairá do programa
		
	}
}