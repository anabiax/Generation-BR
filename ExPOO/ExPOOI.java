/* 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console. */

package com.generation.conta.model;

public class Cliente {

	private String primeiroNome;
	private String ultimoNome;
	private String email; 
	private int idade;
	private String cidade;
	private String cpf; 
	private int telefone;
	

	public Cliente(String primeiroNome, String ultimoNome, String email, int idade, String cidade, String cpf, int telefone) {
		this.primeiroNome = primeiroNome;
		this.ultimoNome = ultimoNome;
		this.email = email;
		this.idade = idade;
		this.cidade = cidade;
		this.cpf = cpf;
		this.telefone = telefone;
	}


	public String getPrimeiroNome() {
		return primeiroNome;
	}


	public void setPrimeiroNome(String primeiroNome) {
		this.primeiroNome = primeiroNome;
	}


	public String getUltimoNome() {
		return ultimoNome;
	}
	

	public void setUltimoNome(String ultimoNome) {
		this.ultimoNome = ultimoNome;
	}

	
	public String getEmail() {
		return email;
	}
	

	public void setEmail(String email) {
		this.email = email;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	
	public int getTelefone() {
		return telefone;
	}

	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	

	public void visualizar () {
		System.out.println("Nome do cliente: " + primeiroNome + " " + ultimoNome);
		System.out.println("Idade: " + idade);
		System.out.println("Cidade: " + idade);
		System.out.println("CPF: " + cpf);
		System.out.println("Email: " + email);
		System.out.println("Telefone: " + telefone);
	
	}
}

--

package com.generation.conta;

import com.generation.conta.model.Cliente;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Ana", "Santos", "meunome@unifesp.br", 21, "São Paulo", "000.000.000-00", 900000000);
		c1.visualizar();
		

	}

}
