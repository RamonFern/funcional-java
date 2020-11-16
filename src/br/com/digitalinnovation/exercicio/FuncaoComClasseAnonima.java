package br.com.digitalinnovation.exercicio;

public class FuncaoComClasseAnonima {
	
	public static void main(String[] args) {

		Funcao funcao = valor -> valor;
		System.out.println(funcao.gerar("Ramon Fernandes"));
	}

}
