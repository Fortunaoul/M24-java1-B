package br.com.senaisp.bauru.joao.licao06;

public class Carta {
	public static final String[] NAIPES = {"♠","♣","♥","♦",};
	public static final String[] NUMEROS = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"}; 
	private String naipe;
	private String numero;
	//Constructor
	public Carta (int np, int vl) {
		if(np<1||np>4) {
			System.out.println("Naipe Inválido!");
		}
		if (vl<1||vl>13) {
			System.out.println("Númro da carta inválido!");
		}
		naipe=NAIPES[np-1];
		numero=NUMEROS[vl-1];
	}
	public String toString() {
		String txt ="┌─────┐\n"+
			        "│##   │\n"+
				    "│  §  │\n"+
			        "│   ##│\n"+
				    "└─────┘\n";
		txt = txt.replaceFirst("##", numero);
		txt = txt.replaceFirst("§", naipe);
		txt = txt.replaceFirst("##", numero);
		return txt;
	}
}
