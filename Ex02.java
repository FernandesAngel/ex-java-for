package lista_ex_5;

//Faça um algoritmo para mostrar na tela a seguinte seqüência de números: 10 20 30 40 50 60 70 80...
//1000.

import javax.swing.JOptionPane;

public class Ex02 {

	public static void main(String[] args) {
		for(int i = 10; i<=1000; i+=10) {
			JOptionPane.showMessageDialog(null, i);
		}   
	}

}
