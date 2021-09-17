package lista_ex_5;

//Faça um algoritmo onde o usuário deverá digitar o nome e a média de N alunos. Durante a leitura,
//verifique se o aluno foi “aprovado”, “reprovado”, ou em “recuperação”. Mostre na tela, uma 
//mensagem apropriada, dependendo da situação do aluno. Considere que as situações possíveis para
//os alunos são: Aprovado (média >= 7.0); Recuperação (2.0 <= média < 7.0); Reprovado (média < 2.0).

import javax.swing.JOptionPane;

public class Ex15 {

	public static void main(String[] args) {
		int n = 1;

		for (int i = 1; i <= n; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
			double media = Double.parseDouble(JOptionPane.showInputDialog("Digite a média do aluno " + nome + ":"));

			if (media >= 7.0) {
				JOptionPane.showMessageDialog(null, nome + "está aprovado(a)");
			} else {
				if (media < 2.0) {
					JOptionPane.showMessageDialog(null, nome + "está reprovado(a)");
				} else {
					JOptionPane.showMessageDialog(null, nome + "está de recupração");
				}
			}

			int confirm = JOptionPane.showConfirmDialog(null, "Deseja verificar outro aluno(a)?");

			if (confirm == 0) {
				n++;
			} else {
				i = n + 2;
			}
		}

	}

}
