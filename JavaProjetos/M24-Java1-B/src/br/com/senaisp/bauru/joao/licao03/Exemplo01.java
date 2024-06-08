package br.com.senaisp.bauru.joao.licao03;

public class Exemplo01 {
	public static int idade = 18;
	public static void main(String[] args) {
		byte vByte = 127;
		vByte++;//Aqui ocorre o estouro do limite do byte
		System.out.println(vByte);//mostra o limite inferior
		float vFloat = 6_000.00f;//Preciso colocar f para dizer que é float
		if (vByte == -128) {
			String nome = " João";
			System.out.println("Meu nome é" + nome);
		}
		idade = 20;
		System.out.println(idade);
		int idade = 50;
		System.out.println(idade);
		idade += 20; //somando a idade a 20
		System.out.println(idade);
	}

}
