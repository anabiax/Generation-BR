/* 6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console. */

package com.generation.conta.model;

public class ContaBancaria {

	private int numero;
	private String agencia;
	private String tipo;
	private String titular;
	private float saldo;
	
	public ContaBancaria(int numero, String agencia, String tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agencia;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}

	public int getNumero() { // acessa o conteúdo
		return numero;
	}

	public void setNumero(int numero) {  // altera o conteúdo de um atributo
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(float valor) { // só pode ser verdadeiro ou falso
		if(valor <= saldo ) {
			saldo -= valor; // saldo é igual a saldo menos o valor
			return true;
		} else {
			System.out.println("\n Você tentou sacar " + valor + ", mas o seu saldo é: " + saldo);
		}
			return false;
	}
	
	// criação de um método
		public void visualizar() {
			System.out.println("\n Dados da conta");
			System.out.println("Número da conta: " + numero);
			System.out.println("Número da agência: " + agencia);
			System.out.println("Tipo de conta: " + tipo);
			System.out.println("Nome do titular: " + titular);
			System.out.println("Saldo da conta: " + saldo);
		}
	
}

---

package com.generation.conta;

import com.generation.conta.model.Conta;

public class ContaBTeste {

	public static void main(String[] args) {
	
		Conta c1 = new Conta(662266, "333", "CC", "Fulano de Tal", 4000.50f); // estou criando um novo objeto chamado Conta por meio do método construtor(é o mesmo nome da class)
		c1.visualizar();
		
		c1.setSaldo(3000f);
		System.out.println("\n Saldo atualizado da conta: " + c1.getSaldo());
		
		if (c1.sacar(5000.0f) == true) // método retornando se deu certo ou se deu errado
			c1.visualizar();
	}

}
