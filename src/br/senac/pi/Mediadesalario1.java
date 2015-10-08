package br.senac.pi;

import java.util.Scanner;

public class Mediadesalario1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		
int funcionario;
int media;
float m;
System.out.println("digite a quantidade de funciionario:");
funcionario = s.nextInt();
System.out.println("digite a media :");
media = s.nextInt();
m = media/funcionario;
System.out.println("resultado sera:" + m);


	}

}
