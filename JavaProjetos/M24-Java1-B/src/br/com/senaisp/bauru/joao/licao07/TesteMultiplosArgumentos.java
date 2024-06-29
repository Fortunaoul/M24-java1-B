package br.com.senaisp.bauru.joao.licao07;

public class TesteMultiplosArgumentos {

	public static void main(String[] args) {
		System.out.println("Soma de dois valores: "+ calcularSoma(10,20));
		System.out.println("Soma de quatro valores: "+ calcularSoma(10,20,30,40));
	}
	//método que soma os valores
	public static int calcularSoma(int...itens) {
		int ret = 0;
		for (int vl : itens) {
			ret += vl;
		}
		return ret;
	}

}
