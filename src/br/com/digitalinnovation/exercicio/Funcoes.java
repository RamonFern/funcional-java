package br.com.digitalinnovation.exercicio;

import java.util.function.Function;

public class Funcoes {
	
	public static void main(String[] args) {
		Function<String, String> retornaNomeAoContrario = texto -> new StringBuilder(texto).reverse().toString();
		Function<String, Integer> converterStringParaInteiroRetornarDobro = string -> Integer.valueOf(string) * 2;
		System.out.println(retornaNomeAoContrario.apply("sophia"));
		System.out.println(converterStringParaInteiroRetornarDobro.apply("20"));
	}

}
