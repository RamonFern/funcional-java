package br.com.digitalinnovation.exercicio;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iteracoes {
	
	public static void main(String[] args) {
		String[] nomes = {"Ramon","Ramon", "Sophia", "Adriane", "Raul", "Irene", "Raimundo"};
		Integer[] numeros = {1,2,3,4,5,6};
		
		//imprimirNomesFiltrados(nomes);
		imprimirTodosNomes(nomes);
		imprimirDobroDeCadaNumeroLista(numeros);
	}


	private static void imprimirNomesFiltrados(String[] nomes) {

		String nomesParaImprimir = "";
		for (int i = 0; i < nomes.length; i++) {
			if (nomes[i].equals("Ramon")) {
				nomesParaImprimir += " " + nomes[i]; 
			}
		}
		System.out.println("Nomes para imprimir do for -" + nomesParaImprimir);
		
		String nomesParaImprimirDaStream = Stream.of(nomes)
			.filter(nome -> nome.equals("Ramon"))
			.collect(Collectors.joining());
		
		System.out.println("Nomes para imprimir da Stream - " + nomesParaImprimirDaStream);
	}
	
	private static void imprimirTodosNomes(String[] nomes) {
		for (String nome : nomes) {
			System.out.println("Impresso pelo foreach" + nome);
		}
		Stream.of(nomes)
			.forEach(nome -> System.out.println("Impresso pelo Stream" + nome));
			//.forEach(System.out::println);

	}
	
	private static void imprimirDobroDeCadaNumeroLista(Integer[] numeros) {
		for (Integer numero : numeros) {
			System.out.println(numero * 2);
		}
	}

}
