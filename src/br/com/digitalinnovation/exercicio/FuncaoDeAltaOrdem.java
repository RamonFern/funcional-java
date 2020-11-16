package br.com.digitalinnovation.exercicio;

public class FuncaoDeAltaOrdem {
	
	public static void main(String[] args) {
		Calculo SOMA = (a, b) -> a + b;
		Calculo SUB = (a, b) -> a - b;
		Calculo DIV = (a, b) -> a / b;
		Calculo MULT = (a, b) -> a * b;
		
		System.out.println(executarOperacao(SOMA, 1, 2));// 3
		System.out.println(executarOperacao(SUB, 4, 2));// 2
		System.out.println(executarOperacao(DIV, 6, 2));// 3
		System.out.println(executarOperacao(MULT, 1, 2));// 2
	}

	private static int executarOperacao(Calculo calculo, int a, int b) {
		return calculo.calcular(a, b);
	}
//FUN��O DE ALTA ORDEM � UMA FUN��O QUE RECEBE UMA OUTRA FUN��O OU QUE RETORNA UMA FUN��O
}

@FunctionalInterface
interface Calculo{
	public int calcular(int a, int b);
}
