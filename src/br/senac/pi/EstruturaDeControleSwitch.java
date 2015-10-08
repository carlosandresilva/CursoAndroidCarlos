package br.senac.pi;

public class EstruturaDeControleSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//quando o valor do numero muda  é apresentado o numero correspondente
		int n = 1;
				
				switch (n) {
				case 1:
					System.out.println("o valor da variavel é 1");
					break;
				case 2:
					System.out.println("o valor da variavel é 2");
					break;
				case 3:
						System.out.println("o valor da variavel é 3");
						break;
				case 4:			
						System.out.println("o valor da variavel é 4");
							break;
				default:							
						System.out.println("nenhum valor na  variavel.");
								break;
				}
				System.out.println("número correspondente:" + n);
	}

}
