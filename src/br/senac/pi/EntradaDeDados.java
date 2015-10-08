package br.senac.pi;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		System.out.println("Olá");
		System.out.print("Digite um número: ");//interagindo com o usuário
		Scanner s = new Scanner(System.in);//prepara a entrada de dados
		int valor = s.nextInt();//Faz a leitura do dado
		System.out.println("Número digitado: " + valor);//imprime o valor lido
		s.close();

	}

}
