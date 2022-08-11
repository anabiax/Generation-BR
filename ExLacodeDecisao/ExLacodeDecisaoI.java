package Família57;

import java.util.Scanner;

public class ExLacodeDecisao {

	public static void main(String[] args) {
	
		//1- Faça um programa que receba três inteiros e diga qual deles é o maior.
		
			int  num1, num2, num3, maior = 0;
			Scanner numero = new Scanner(System.in);
			
			System.out.printf("\n Informe o primeiro número ");
			num1 = numero.nextInt();
					
			System.out.printf("\n Informe o segundo número ");
			num2 = numero.nextInt();
					
			System.out.printf("\n Informe o terceiro número");
			num3 = numero.nextInt();
			
			if(num1 >= num2 && num1 >= num3) {
				System.out.println(num1);
			} else if (num2 >= num1 && num2 >= num3) {
				System.out.println(num2);
			} else {
				System.out.println(num3);
			}
	}

}
