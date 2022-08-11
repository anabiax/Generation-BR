package Família57;

import java.util.Scanner;

public class ExVetorI {

	public static void main(String[] args) {
/* 1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
 * 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.
 */
				
		int[] a = {1, 0, 5, -2, -5, 7};
        int x;
        
        int soma = a[0] + a[1] + a[5];
        System.out.println("Soma dos vetores: " + soma);
        
        a[4] = 100; // à 4ª posição é atribuído um novo valor
 
        for (x=0; x < a.length; x++) { // passando pelo conjunto
            System.out.println(a[x]);
        }

	}

}
