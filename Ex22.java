package lista_ex_5;

//Faça um algoritmo para simular um elevador. O algoritmo deverá ler inicialmente o número do andar
//inicial (qualquer número não negativo). Depois disto, o algoritmo deve continuamente ler o próximo
//andar e escrever “sobe” ou “desce” caso este andar seja superior (número maior) ou inferior (número
//menor). O algoritmo deve parar quando o próximo andar for igual ao andar em que o elevador já se
//encontrar. O elevador deverá realizar N movimentações entre os andares.

import javax.swing.JOptionPane;

public class Ex22 {

	public static void main(String[] args) {
		int andarInicial = Integer.parseInt(JOptionPane.showInputDialog("Informe o andar inical:"));
		int n = 1;

		for (int i = 1; i <= n; i++) {

			
			int andarProx = Integer.parseInt(JOptionPane.showInputDialog("Informe o proximo andar:"));

			if (andarInicial < andarProx) {
				JOptionPane.showMessageDialog(null, "Sobe");
				andarInicial = andarProx;
			} else {
				if (andarInicial > andarProx) {
					JOptionPane.showMessageDialog(null, "Desce");
					andarInicial = andarProx;
				} else {
					JOptionPane.showMessageDialog(null, "Você chegou ao seu destino!");
				}
			}

			int confirm = JOptionPane.showConfirmDialog(null, "Ir para o próximo andar?");
			if (confirm == 0) {
				n++;
			} else {
				i = n + 2;
			}
		}

	}

}
