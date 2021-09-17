package lista_ex_5;

//Faça um algoritmo para ler o nome e a média de N alunos. Após a leitura, mostre na tela o nome e
//média do aluno com a maior média. Considere que as médias sejam todas diferentes entre si.

import javax.swing.JOptionPane;

public class Ex20 {

	public static void main(String[] args) {
		int n = 1;
		double maiorMedia = 1;
		String maiorNome = "";

		for (int i = 1; i <= n; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
			double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média do aluno " + nome + ":"));
			
			if (i == 1) {
				maiorMedia = media;
				maiorNome = nome;
			} else {
				if(media >= maiorMedia) {
					maiorMedia = media;
					maiorNome = nome;
				}
			}
			
			int confirm = JOptionPane.showConfirmDialog(null, "Deseja verificar outro aluno(a)?");

			if (confirm == 0) {
				n++;
			} else {
				i = n + 2;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "O aluno com a maior média ("+maiorMedia+"), é: "+maiorNome);

	}
}
