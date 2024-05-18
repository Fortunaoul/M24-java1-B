package br.com.senaisp.bauru.joao.licao02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String nome;
		//MOstrando a mensagem para o usuário
		System.out.println("Digite seu nome completo: ");
		nome = scn.nextLine();
		//Vamos separa nome de sobrenome
		String primNome = nome.substring(0,(nome+" ").indexOf(" "));
		//Pegar o último sobrenome
		String lastName = nome.substring(nome.lastIndexOf(" ")+1);
		//Mostrando o nome
		System.out.println(primNome);
		System.out.println(lastName);
		//Fechado scanner
		scn.close();
	}

}
