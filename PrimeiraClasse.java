package Família57;

import java.util.Scanner; // importou a biblioteca do Scanner p/ utilizar as suas funções

public class PrimeiraClasse {

	public static void main(String[] args) {
		
		String nome = "Ana Santos";
		int idade = 21, op;
		double altura = 1.57, nota1, nota2, nota3, media;
		// double aceita tanto inteiro qnt fracionário, e ocupa o dobro do float
		
		// here começamos a fazer a impressão das variáveis
		/* more than one line */
		
		Scanner leia = new Scanner(System.in);
		
		// meu objeto se chama "leia" e é instanciado por "scanner". Qnd chamo "leia", chamo o novo scanner"
		
		// reproduz o "escreva" do Portugol
		System.out.println("\n Vamos apresentar os dados da Ana");
		System.out.println("\n Nome da participante: " + nome);
		System.out.println("\n Idade da participante: " + idade + " anos de vida");
		System.out.println("\n Altura da participante: " + altura);
		
		System.out.println("\n Entre com a primeira nota: ");
		nota1 = leia.nextDouble();  // o método é um verificador de valores, no caso de tipo "double"
		System.out.println("\n Entre com a segunda nota: ");
		nota2 = leia.nextDouble(); 
		System.out.println("\n Entre com a terceira nota: ");
		nota3 = leia.nextDouble(); 
		
		media = (nota1+nota2 +nota3)/3; // não pode usar espaço
		System.out.println("\n Média aritmética: " + media); // n faz o arredondamento direto às vezes
	// System.out.printf("\n Média aritmética: %.2f", media) -- p/ fazer o arredondamento
											// % indica que é uma variável do tipo float
											// f significa 'float', cada variável tem um tipo
											// .2 significa que quero 2 casas após a vírgula
		
		if(media >= 7 && media <= 10) {
			System.out.println("\n Alune aprovade!");
		} else if(media >= 5 && media <7) {
			System.out.println("\n Alune de exame");
		} else {
			System.out.println("\n Alune reprovade");
		}
		
		// escolha caso
		System.out.println("\n Lista de filmes");
		System.out.println("\n1- A procura da felicidade");
		System.out.println("\n2- Os vingadores");
		System.out.println("\n3- Prenda-me se for capaz");
		System.out.println("\n4- A ilha do medo");
		System.out.println("\n Digite a sua opção: ");
		
		op = leia.nextInt();  // o tipo de dados é Int(eiro)
		switch(op) {
		case 1: 
			System.out.println("\n A procura da felicidade");
			break; // finalizar cada case
		}
		
		switch(op) {
		case 2: 
			System.out.println("\n Os vingadores");
			break; 
		}
		
		switch(op) {
		case 3: 
			System.out.println("\n Prenda-me se for capaz");
			break; 
		}
		
		switch(op) {
		case 4: 
			System.out.println("\n A ilha do medo");
			break; 
		
		// exceção: se meu usuário não retornar o que espero, retorno isso.
		default:
			System.out.println("\n Opção inválida");
			
		}
		
		nota1 = Math.sqrt(nota2); // raiz quadrada
		nota2 = Math.pow(nota3, 3);  // elevado a 3ª potência
				
	}
}
