package br.senac.pi;

public class Operacoes {

	public static void main(String[] args) {
		
		String nome = "carlos";
		String sobrenome = "andre";
		
		System.out.println("Nome Completo:"+ nome + sobrenome);
		
		System.out.println("=================================");
		
		int idade = 28;
		boolean brasileiro = true;
		
		System.out.println("Idade: "+ idade);
		
		if(brasileiro){
			
			System.out.println("Brasileiro: SIM");
		}
		
		System.out.println("OPERAÇÕES MATEMÁTICAS");
		int n1 = 10;
		int n2 = 5;
		
		//saida formatada com intercalacao de valores
		System.out.printf("A soma entre %d e %d é :" ,n1, n2);
		System.out.println(n1+n2);//mostrar o resultado
		
		System.out.printf("A multiplicação entre %d e %d é: ",n1,  n2);
		System.out.println(n1*n2);//mostrar resultado
		
		System.out.printf("A divisão entre %d e %d é:", n1,n2);
		System.out.println(n1-n2);//mostrar
		System.out.printf("A subtracao entre %d e %d é:", n1,n2);
		System.out.println(n1/n2);//mostrar
		
		System.out.printf("O resto da divisão entre %d e %d é:",n1,n1);
		System.out.println(n1%n2);
		//precedencia de avaliacao de operadores
		System.out.println();
		

	}

}
