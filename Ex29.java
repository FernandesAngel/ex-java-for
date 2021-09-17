package lista_ex_5;

//Faça um algoritmo para ler uma série de (N) número inteiros maiores que zero(0). Após a leitura
//mostre na tela a quantidade de números primos digitados. Considere que um número é primo ser ele
//for divisível somente por (1) e por ele mesmo. Dica para determinar se um número é primo: se você
//dividir um determinado número(X) por todos os valores inteiros existentes entre (1) e (X), o total de
//divisores tem de ser menor/igual a dois (2).

import javax.swing.JOptionPane;

public class Ex29 {

	public static void main(String[] args) {
		int n = 1;		
		int primo = 0;

		for (int i = 1; i <= n; i++) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
			int ePrimo= 0;
			
			
			for (int j = 1; j <= numero; j++) {
				if(numero%j == 0) {
					ePrimo++;
				}
			}
			
			if(ePrimo==2) {
				primo++;
			}
			
			int confirm = JOptionPane.showConfirmDialog(null, "Deseja verificar outro número?");

			if (confirm == 0) {
				n++;
			} else {
				i = n + 2;
			}
		}
		
		JOptionPane.showMessageDialog(null, "A quantidade de numeros primos é: "+primo);
		

	}

}
