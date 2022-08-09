package Família57;

import java.util.Scanner;

public class ProgSequencialII {

	public static void main(String[] args) {
		
		/*  5. Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5, respectivamente. 
 */
		double n1, n2, n3, media, mediaF;
		int x = 2;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Informe a primeira nota: ");
		n1 = leia.nextInt();
		
		System.out.println("\n Informe a segunda nota: ");
		n2 = leia.nextInt();
		
		System.out.println("\n Informe a terceira nota: ");
		n3 = leia.nextInt();
		
		media = (n1*2) + (n2*3) + (n3*5);
		mediaF = media / (2+3+5);
		System.out.println("\n Média final: " + mediaF);

	}

}

package Família57;

import java.util.Scanner;

public class ProgSequencial {

	public static void main(String[] args) {
		
		/* 1. Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. */
		
		int idadeDias, dias, meses, anos;
	
		Scanner idade = new Scanner(System.in);

		System.out.println("\n Informe sua idade: ");
		anos = idade.nextInt();
		
		System.out.println("\n Informe sua idade em meses: ");
		meses = idade.nextInt();
		
		System.out.println("\n Informe sua idade em dias: ");
		dias = idade.nextInt();
		
		
		idadeDias = anos * 365 + meses * 30 + dias;
		System.out.println("\n Idade em dias: " + idadeDias);
	}

}
