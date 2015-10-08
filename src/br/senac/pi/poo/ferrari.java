package br.senac.pi.poo;

public class ferrari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Carro c1 = new Carro();
c1.marca = "ferrari";//atribuicao de valores a atributos
c1.modelo = "f448";
c1.chassi = "f45679frty";
c1.ano = 2015;
System.out.println("marca:" + c1.marca);//para colocar a marca pra aparecer
System.out.println("modelo:" + c1.modelo);
System.out.println("chassi:" + c1.chassi);
System.out.println("ano:" + c1.ano);



c1.partida();//chamada ao método
c1.acelerar();
c1.frear();
c1.marca();

}

}
