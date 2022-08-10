package Família57;

import java.util.Scanner;

public class ExRepeticaoWhile {

/* 4- Uma empresa desenvolveu uma pesquisa para saber as características
psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
pessoas, calcule e mostre: (WHILE)
 o número de pessoas calmas;
 o número de mulheres nervosas;
 o número de homens agressivos;
 o número de outros calmos;
 o número de pessoas nervosas com mais de 40 anos;
 o número de pessoas calmas com menos de 18 anos. */
	
	public static void main(String[] args) {
		
		int idade, genero, fatorpsicologico, contpc=0, contMNervosas=0, contadorHAgressivos=0, contBCalmos=0, contPessoasN40=0, p=1, contPessoasCalmas18=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(p <= 5) {
			System.out.println("\n Informe sua idade: ");
			idade = leia.nextInt();
			
			System.out.println("\n Informe seu gênero: \n1-Feminino\n2-Masculino\n3-Binário");
			genero = leia.nextInt();
			
			System.out.println("\n Informe o fator psicológico: \n1-Calmo\n2-Nervoso\n3-Agressivo");
			fatorpsicologico = leia.nextInt();
			
			if(fatorpsicologico == 1) {
				contpc++;
				
			} if(genero == 1 && fatorpsicologico == 2) {
				contMNervosas++;
				
			} if (genero == 2 && fatorpsicologico ==3) {
				contadorHAgressivos++;
				
			} if (genero == 3 && fatorpsicologico == 1) {
				contBCalmos++;
				
			} if(fatorpsicologico == 2 && idade > 40) {
				contPessoasN40++;
				
			} if (fatorpsicologico == 1 && idade < 18) {
				contPessoasCalmas18++;
			} p++;
		}
		
		System.out.println("\n Número de pessoas calmas: " + contpc);
		System.out.println("\n Número de mulheres nervosas: " + contMNervosas);
		System.out.println("\n Número de homens agressivos: " + contadorHAgressivos);
		System.out.println("\n Número de pessoas binárias calmas: " + contBCalmos);
		System.out.println("\n Número de pessoas nervosas com mais de 40 anos: " + contPessoasN40);
		System.out.println("\n Número de mpessoas calmas com menos de 18 anos: " + contPessoasCalmas18);

	}

}
