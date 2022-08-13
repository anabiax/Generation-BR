/* 3) Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console. */

package com.generation.conta.model;

public class ProdutoEletronico {

	private String marca;
	private int idade;
	private int fabricacao;
	public ProdutoEletronico(String marca, int idade, int fabricacao) {
		super();
		this.marca = marca;
		this.idade = idade;
		this.fabricacao = fabricacao;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getFabricacao() {
		return fabricacao;
	}
	public void setFabricacao(int fabricacao) {
		this.fabricacao = fabricacao;
	}

	public void contraindicacao() {
		if(this.idade <= 6) {
			System.out.println("Este aparelho eletrônico é contra-indicado para esta faixa etária.");
		} else {
			System.out.println("Este aparelho eletrônico é indicado para esta faixa etária.");
		}
		
	}
	
	public void visualizar() {
		System.out.println("Dados do aparelho");
		System.out.println("Marca: " + marca);
		System.out.println("Fabricação: " + fabricacao);

	}
}

------------------------------------

package com.generation.conta;

import com.generation.conta.model.ProdutoEletronico;

public class ProdutoEletronicoTeste {

	public static void main(String[] args) {
		
		ProdutoEletronico e = new ProdutoEletronico("XXX", 6, 2015);
		e.visualizar();
		e.contraindicacao();
	
	}

}
