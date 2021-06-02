package br.com.erickfreire.argumentosDeLinhaDeComando;


/**
 * Programa em Java que utiliza argumentos de Linha de Comando
 * @author Erick Freire
 * @version 1 - Criado em 02-06-2021 as 15:38
 */

public class ArgumentosDeLinhaDeComando {
	public static void main(String[] args) {
		
		if(args.length != 3) {
			System.out.printf("Erro: Por Favor insinha novamente um valor, inserindo%n" +
					          "um tamanho do vetor, valor inicial e incremento.%n");
		} else {
			int tamanhoVetor = Integer.parseInt(args[0]);
			int[] vetor = new int[tamanhoVetor];
			
			int valorInicial = Integer.parseInt(args[1]);
			int incremento = Integer.parseInt(args[2]);
			
			for (int contador = 0; contador < vetor.length; contador++)
				vetor[contador] = valorInicial + incremento * contador; 
			
			System.out.printf("%s%8s%n", "Index", "Valor");
			
			for (int contador = 0; contador < vetor.length; contador++)
				System.out.printf("%5d%8d%n", contador, vetor[contador]);
		}
		
	}

}
