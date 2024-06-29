package br.com.senaisp.bauru.joao.licao05;

import java.util.Random;
import java.util.Scanner;

public class Força {
	private String palavraSecreta;
	private int erros;
	private String visualização;
	//Constructor
	public Força() {
		palavraSecreta=sortearPalavra();
		erros =0;
		visualização="";
		//Carregar os traços de vizualização
		int i = 0;
		while (i<palavraSecreta.length()) {
			visualização += "-";
			i++;
		} 
	}
	
	private String sortearPalavra() {
		Scanner scA = new Scanner(Força.class.getResourceAsStream("palavras.txt"));
		Random rnd = new Random();
		int linSort = rnd.nextInt(180)+1;
		int lin = 0;
		String ret="";
		while (scA.hasNextLine()) {
			lin++;
			String linha = scA.nextLine();
			if (lin==linSort) {
				ret=linha;
				break;//força a saida do whilw
			}
		}
		scA.close();
		return ret;
	}
	public void mostrarForça() {
		String linSup = (erros == 0 ? "  ": erros == 1 ? " 0 " : erros == 2 ? "\\0 " : erros > 2 ? "\\0/" : "  " );
		String linBod = erros >= 4 ? " |" : " ";
		String linInf = erros == 5 ? "/ ": erros == 6 ? "/ \\" : " ";
		System.out.println(" +-----+");
		System.out.println(" |    " + linSup);
		System.out.println(" |    " + linBod);
		System.out.println(" |    " + linInf);
		System.out.println(" |");
		System.out.println(" +==========");
		System.out.println();
		System.out.println(visualização);
	}
	public boolean verificaLetra(char letra) {
		Boolean ret = false;
		if (palavraSecreta.indexOf(letra)>-1) {
			int i = 0;
			String apoio = "";
			while (i<palavraSecreta.length()) {
				if (palavraSecreta.charAt(i)==letra) {
				    apoio += ""+letra;
			} else {
				apoio += ""+visualização.charAt(i);
			}
			i++;
		}
		visualização = apoio;
		ret=true;
	}else {
		erros++;
	}
	return ret;
	}
	public boolean isTerminado() {
		return erros >=6 || visualização.indexOf('-')== -1 ;
	}
	public String mostrarPalavra () {
		return palavraSecreta;
	}
}