package lista_ex_5;

//Faça um algoritmo para calcular e mostrar na tela o resultado da seguinte fórmula:
//Considere que o valor “N” será digitado pelo usuário.

import javax.swing.JOptionPane;

public class Ex13 {

	public static void main(String[] args) {
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor:"));
		double divisao = 0;
		for(double i=1; i<=n; i++) {			
			divisao += 1/i;			
		}
		JOptionPane.showMessageDialog(null, divisao);

	}

}
