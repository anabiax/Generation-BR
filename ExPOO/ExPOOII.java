/* 7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console. */

package com.generation.conta.model;

public class Paciente {

	private String nome;
	private String registro;
	private String cidade;
	private int idade;
	private String sintomas;
	private String cpf; 
	private int telefone;
	private String entrada;
	private String saida;
	
	public Paciente(String nome, String registro, String cidade, int idade, String sintomas, String cpf, int telefone, String entrada, String saida) {
		
		this.nome = nome;
		this.registro = registro;
		this.cidade = cidade;
		this.sintomas = sintomas;
		this.idade = idade;
		this.cpf = cpf;
		this.telefone = telefone;
		this.entrada = entrada;
		this.saida = saida;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRegistro() {
		return registro;
	}

	public void setRegistro(String registro) {
		this.registro = registro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getSintomas() {
		return sintomas;
	}

	public void setSintomas(String sintomas) {
		this.sintomas = sintomas;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
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

	public String getEntrada() {
		return entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public String getSaida() {
		return saida;
	}

	public void setSaida(String saida) {
		this.saida = saida;
	}
	
	public void conferir() {
		System.out.println(" Paciente: " + nome);
		System.out.println("Registro nº: "+ registro);
		System.out.println("CPF : "+ cpf);
		System.out.println("Telefone nº: "+ telefone);
		System.out.println("Cidade: "+ cidade);
		System.out.println("Idade: "+ idade);
		System.out.println("Sintomas: "+ sintomas);
		System.out.println("Data de entrada: "+ entrada);
		System.out.println("Data de saída: "+ saida);
	}
	
	
	                
}

---

package com.generation.conta;

import com.generation.conta.model.Paciente;

public class PacienteTeste {

	public static void main(String[] args) {
		
		Paciente p1 = new Paciente("Maiara Santos", "142.553", "São Paulo", 18, "gripais", "000.000.000/00", 990909090, "12/08/2022", "12/08/2022");
		p1.conferir();
	}

}
