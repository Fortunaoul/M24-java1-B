package br.com.senaisp.bauru.joao.licao07;

public class TesteClasseSingleton {

	public static void main(String[] args) {
		ClasseSingleton obj01 = ClasseSingleton.getInstancia();
		ClasseSingleton obj02 = ClasseSingleton.getInstancia();
		//Alterando os dados
		System.out.println(obj01);
		System.out.println(obj02);
	}

}
