package br.com.senaisp.bauru.joao.licao07;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DesnhoSwing extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Override
	public void paint(Graphics g) {
		//Setando a cor de preencimento do desenho
		g.setColor(Color.BLUE);
		//Desenhando um quadrado na posição 50,50
		g.fillRect(50, 50, 150, 150);
		//Desenhando um circulo
		g.setColor(Color.GREEN);
		g.fillOval (300, 50, 150, 150);
		//Desenhando um poligono
		g.setColor(Color.RED);
		int[] xPontos = {600,525,675};
		int[] yPontos = {50,200,200};
		g.fillPolygon(xPontos, yPontos, 3);
		
	}
}
