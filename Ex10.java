package lista_ex_5;

//Faça um algoritmo para somar e mostrar na tela o resultado da seguinte expressão 1-2+3-4+5-6+7-
//8+9-10+...100.

import javax.swing.JOptionPane;

public class Ex10 {

	public static void main(String[] args) {
		int soma = 0;
		
		for(int i = 1; i<=100; i++) {
			if(i%2 == 0) {
				soma -= i;
			} else {
				soma += i;
			}
		}
		
		JOptionPane.showMessageDialog(null, soma);
	}

}
