package lista_ex_5;

//Faça um algoritmo para mostrar na tela a seguinte sequência de números:
//1, 0, 1, 2, 3
//2, 0, 1, 2, 3
//3, 0, 1, 2, 3

import javax.swing.JOptionPane;

public class Ex23 {

	public static void main(String[] args) {
		for (int i = 1; i<=3; i++) {
			JOptionPane.showMessageDialog(null, i+", 0, 1, 2, 3");
		}

	}

}
