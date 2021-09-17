package lista_ex_5;

//Faça um algoritmo para mostrar na tela a seguinte sequência de números:
//1, 3, 2, 1, 0
//2, 3, 2, 1, 0
//3, 3, 2, 1, 0

import javax.swing.JOptionPane;

public class Ex24 {

	public static void main(String[] args) {
		for (int i = 1; i<=3; i++) {
			JOptionPane.showMessageDialog(null, i+", 3, 2, 1, 0");
		}

	}

}
