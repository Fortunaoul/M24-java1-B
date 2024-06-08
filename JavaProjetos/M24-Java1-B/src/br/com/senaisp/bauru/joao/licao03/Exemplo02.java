package br.com.senaisp.bauru.joao.licao03;

public class Exemplo02 {

	public static void main(String[] args) {
		int a = 10;
		int b = a++;//a => a=a+1
		int c = ++a;//a => 12
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		//nesse ponto a=13
		double total = ++a * 1.0 / 2;
		System.out.println(total);
		char letraA = 65; //'A';
		char letraB = 'B';
		System.out.println(++letraA);
		System.out.println("" + letraA + letraB);
	}

}
