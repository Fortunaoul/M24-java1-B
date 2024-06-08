package br.com.senaisp.bauru.joao.licao04;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Digite o valor da base do " + "triangulo");
		float base = sc.nextFloat();
		System.out.println("Digite a altura do triangulo;");
		float altura = sc.nextFloat();
		//Calculando a area do triangulo
		float area = base * altura / 2;
		//Mostrando a area
		System.out.println("A área do triangulo é " +area);
		//fechando o scanner
		sc.close();
	}

}
