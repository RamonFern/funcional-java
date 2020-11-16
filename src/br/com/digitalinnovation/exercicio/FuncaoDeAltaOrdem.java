package br.com.digitalinnovation.exercicio;

public class FuncaoDeAltaOrdem {
	
	public static void main(String[] args) {
		Calculo soma = (a, b) -> a + b;
		System.out.println(executarOperacao(soma, 1, 2));
	}

	private static int executarOperacao(Calculo calculo, int a, int b) {
		return calculo.calcular(a, b);
	}
//FUN��O DE ALTA ORDEM � UMA FUN��O QUE RECEBE UMA OUTRA FUN��O OU QUE RETORNA UMA FUN��O
}

interface Calculo{
	public int calcular(int a, int b);
}
