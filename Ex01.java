package lista_ex_5;

//Faça um algoritmo para mostrar na tela a seguinte seqüência de números: 1 2 3 4 5 6 7 8...100.

import javax.swing.JOptionPane;

public class Ex01 {

	public static void main(String[] args) {		
		
		for(int i = 1; i<=100; i++) {
			JOptionPane.showMessageDialog(null, i);
		}   
	}
}
