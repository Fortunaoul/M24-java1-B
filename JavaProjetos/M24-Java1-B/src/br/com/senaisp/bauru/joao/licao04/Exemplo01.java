package br.com.senaisp.bauru.joao.licao04;

import java.util.Scanner;

public class Exemplo01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Strings
		String nome1 = "João";
		String nome2 = "João";
		//Solicitando os nomes
		System.out.println("Digite seu nome:");
		nome2= sc.next();
		//comparando
		if (nome1.equals(nome2)) {
			System.out.println("São iguais no conteúdo");
		} else {
			System.out.println("São diferentes no conteúdo");
		}
		//Nome1 é maior que nome 2
		if (nome1.compareTo(nome2)>0) {
			System.out.println("Nome1 é maior que nome 2");
		}
		if (nome1.compareTo(nome2)<0) {
			System.out.println("Nome 1 é menor que nome 2");
		}
		if (nome1.compareTo(nome2)==0) {
			System.out.println("Nome 1 é igual a nome 2");
			
		}
	}

}
