package br.com.senaisp.bauru.joao.licao07;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class TesteDesenhos {

	public static void main(String[] args) {
		JOptionPane janela = new JOptionPane();
		JDialog dlg = janela.createDialog("Desenhos");
		dlg.setSize(800, 600);
		DesnhoSwing desenho = new DesnhoSwing();
		dlg.setContentPane(desenho);
		dlg.setVisible(true);
	}

}
