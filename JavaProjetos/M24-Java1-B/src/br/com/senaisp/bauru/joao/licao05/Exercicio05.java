package br.com.senaisp.bauru.joao.licao05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Força fo = new Força();
		fo.mostrarForça();
		String palavra="";
		while (!fo.isTerminado()){
			System.out.println("Digite uma letra: ");
			palavra = sc.nextLine();
			if (!fo.verificaLetra(palavra.charAt(0))) {
				System.out.println("Letra não encontrada!");
			}
			fo.mostrarForça();
		}
		sc.close();
		System.out.println("a palavra secreta era " +fo.mostrarPalavra());
	}

}
