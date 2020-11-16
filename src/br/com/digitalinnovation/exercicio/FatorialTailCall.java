package br.com.digitalinnovation.exercicio;

public class FatorialTailCall {

	public static void main(String[] args) {
		System.out.println(fatorialA(5.0));
	}

	private static Double fatorialA(Double valor) {
		return retorneFatorialComTailCall(valor, 1.0);
		
	}

	private static Double retorneFatorialComTailCall(Double valor, Double numero) {

		if(valor == 0) {
			return numero;
		}
		return retorneFatorialComTailCall(valor -1, numero * valor);
	}
}
