package lista_ex_5;

//Uma empresa possui N funcionários dos quais são conhecidos seus nomes e idades. Faça um algoritmo
//que imprima o nome e a idade da pessoa mais idosa e a mais nova. Considere que não existem pessoas
//com idades iguais. 

import javax.swing.JOptionPane;

public class Ex19 {

	public static void main(String[] args) {
		int n = 1;
		int maior = 0;
		int menor = 0;
		String nomeMenor = "";
		String nomeMaior = "";

		for (int i = 1; i <= n; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome da " + i + "° pessoa");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Qual a idade da " + i + "° pessoa"));

			if (i == 1) {
				maior = idade;
				menor = idade;
				nomeMenor = nome;
				nomeMaior = nome;
			} else {

				if (idade < menor) {
					menor = idade;
					nomeMenor = nome;
				}

				if (idade > maior) {
					maior = idade;
					nomeMaior = nome;
				}
			}
			int confirm = JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?");

			if (confirm == 0) {
				n++;
			} else {
				i = n + 2;
			}
		}
		JOptionPane.showMessageDialog(null, nomeMenor + " é a pessoa mais nova, com " + menor + " anos. " + nomeMaior
				+ " é a pessoa mais velha, com " + maior + " anos.");

	}

}
