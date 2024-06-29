package br.com.senaisp.bauru.joao.licao06;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		//Calculando
		try {
			System.out.println("Digite um valor:");
			int vl01 = sc.nextInt();
			System.out.println("Digite outro valor:");
			int vl02 = sc.nextInt();
			int vl03= vl01/vl02;
			System.out.println("Resultado: " + vl03);
		}catch (ArithmeticException e) {
			System.out.println("Ocorreu um erro, divisão por zero!");
		}catch(InputMismatchException e) {
			System.out.println("Digite somente números inteiros!");
		}
		sc.close();
		}

}
