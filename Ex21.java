package lista_ex_5;

//Faça um algoritmo para ler o nome e a média de N alunos. Após a leitura, mostre na tela o nome e
//média do aluno com a menor média. Considere que as médias sejam todas diferentes entre si.

import javax.swing.JOptionPane;

public class Ex21 {

	public static void main(String[] args) {
		int n = 1;
		double menorMedia = 1;
		String menorNome = "";

		for (int i = 1; i <= n; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
			double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média do aluno " + nome + ":"));
			
			if (i == 1) {
				menorMedia = media;
				menorNome = nome;
			} else {
				if(media <= menorMedia) {
					menorMedia = media;
					menorNome = nome;
				}
			}
			
			int confirm = JOptionPane.showConfirmDialog(null, "Deseja verificar outro aluno(a)?");

			if (confirm == 0) {
				n++;
			} else {
				i = n + 2;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "O aluno com a menor média ("+menorMedia+"), é: "+menorNome);

	}

}
