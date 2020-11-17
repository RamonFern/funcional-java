package br.com.digitalinnovation.exercicio;

import java.util.function.Supplier;

public class Suppliers {
	
	public static void main(String[] args) {
		Supplier<Pessoa> suppliers = () -> new Pessoa();
		
		System.out.println(suppliers.get());
	}

	
}

class Pessoa{
	private String nome;
	private Integer idade;
	public Pessoa() {
		nome = "Sophia";
		idade = 10;
	}
	
	@Override
	public String toString() {
		return String.format("nome : %s, idade : %d", nome, idade);
	}
	
	
	
}
