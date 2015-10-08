package br.senac.pi;

public class EscopoDeVariaveis {

	public static void main(String[] args) {

		int i = 5;
		{//bloco 2
			int j = 0;
			System.out.println(i);
			j = 5 * i;
			System.out.println(j);
		}
		
		{//bloco 3
			
			System.out.println(i);
		}
		
		System.out.println(i);

	}
		
}
