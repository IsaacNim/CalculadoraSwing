package calc.visao;

import java.awt.Color;
import java.awt.Font;


import javax.swing.JButton;

@SuppressWarnings("serial")
public class Botao extends JButton{

	public Botao(String texto, Color cor) {
		setText(texto);
		setOpaque(true);
		setBackground(cor);
		setFont(new Font("San Francisco Pro", Font.PLAIN ,25));
		setForeground(Color.WHITE); // FONTE DOS NUMEROS E CARACTERES

		
	}
}
