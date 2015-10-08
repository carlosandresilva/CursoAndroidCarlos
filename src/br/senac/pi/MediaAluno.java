package br.senac.pi;

import java.util.Scanner;

public class MediaAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner (System.in);
		int n1 ;
		int n2  ;
		int n3  ;
		int cont = 0;
		
		while(cont != 2){
			
		System.out.println("digite a primeira nota :");
		n1 = s.nextInt();
		System.out.println("digite a segunda  nota :");
		n2 = s.nextInt();
		System.out.println("digite a terceira nota :");
		n3 = s.nextInt();
		
		
		
	 int media = (n1 + n2 + n3)/3;
	if (media >=7 ){
		System.out.println("aluno aprovado!");
		}	else if (media >=6){ 
			System.out.println("aluno reprovado!");
			
		}
		else{
			System.out.println("vai estudar ");
		}
	
		System.out.println("Deseja Continuar");
		System.out.println("1)Sim");
		System.out.println("2)Não");
		cont = s.nextInt();
		if(cont == 2){
			System.out.println("Fim");
		}
		
		}
		}
	}


