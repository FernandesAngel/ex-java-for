package lista_ex_5;

//Faça um algoritmo para mostrar na tela a seguinte seqüência de números: 99 97 95 93 91...7 5 3 1.

import javax.swing.JOptionPane;

public class Ex03 {

	public static void main(String[] args) {
		
		for(int i = 9; i>=1; i-=2) {
			JOptionPane.showMessageDialog(null, i);
		}   
	}
}
