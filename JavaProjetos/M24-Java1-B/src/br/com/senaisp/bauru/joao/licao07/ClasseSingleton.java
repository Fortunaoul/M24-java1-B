package br.com.senaisp.bauru.joao.licao07;

public class ClasseSingleton {
	private static ClasseSingleton instancia = null;
	private static int nSeqInstancia = 0;
	private int id;
	private String nome;
	//Constructor
	private ClasseSingleton() {
		id = ++nSeqInstancia;
		nome = null;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	//Método
	public static ClasseSingleton getInstancia() {
		if(instancia==null){
			instancia = new ClasseSingleton();
		}
		return instancia;
	}
}
