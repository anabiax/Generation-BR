package Família57;

import java.util.Scanner;

public class ExRepeticaoDoWhile {

	public static void main(String[] args) {
		/* 6- Escrever um programa que receba vários números inteiros no teclado. E no
			  final imprimir a média dos números múltiplos de 3. Para sair digitar 0(zero).(DO...WHILE) */
		
		int num, somaNum=0, multiplos=0;
		double media=0;
		
		Scanner leia = new Scanner(System.in);
		
		// faça
		do {
			System.out.printf("\n Informe um número: ");
			num = leia.nextInt();
			somaNum += num; 
		
		} while (num != 0); 
			
			if(num % 3 == 0) {
				somaNum += num; 
				multiplos++;
				
			} 
			
			media = somaNum/multiplos;
		
		System.out.println("\n Média dos números múltiplos de 3: "+ media);
	}

}
