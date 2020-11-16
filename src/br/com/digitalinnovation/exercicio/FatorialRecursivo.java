package br.com.digitalinnovation.exercicio;

public class FatorialRecursivo {
	
	public static void main(String[] args) {
		System.out.println(fatorial(5));
	}


	private static int fatorial(int valor) {
		if(valor == 1) {
			return valor;
		}else {
			return valor * fatorial(valor - 1);
			
		}
	}

}
