package lista_ex_5;

//Faça um algoritmo para mostrar na tela a seguinte seqüência de números: 1000 990 980 970 ... 40 30
//20 10.

import javax.swing.JOptionPane;

public class Ex04 {

	public static void main(String[] args) {
		
		for(int i = 1000; i>=1; i-=10) {
			JOptionPane.showMessageDialog(null, i);
		}   

	}

}
