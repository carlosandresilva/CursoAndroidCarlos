package br.senac.pi;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		
		System.out.println("Ol�");
		System.out.print("Digite um n�mero: ");//interagindo com o usu�rio
		Scanner s = new Scanner(System.in);//prepara a entrada de dados
		int valor = s.nextInt();//Faz a leitura do dado
		System.out.println("N�mero digitado: " + valor);//imprime o valor lido
		s.close();

	}

}
