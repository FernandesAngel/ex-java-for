package lista_ex_5;

//Faça um algoritmo para ler nome e sexo dos N alunos de uma sala de aula. Após a leitura, mostre na
//tela quantos alunos são do sexo masculino, e quantos são do sexo feminino.

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class Ex16 {

	public static void main(String[] args) {
		int n = 1;
		int fem = 0;
		int mas = 0;

		for (int i = 1; i <= n; i++) {
			//String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
						
			JCheckBox f = new JCheckBox("Feminino");
			JCheckBox m = new JCheckBox("Masculino");
			
			Object[] options = {f, m, "OK"};
			
			JOptionPane.showOptionDialog(
				null, 
				"Selecione a operação desejada:", 
				null, 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				null, 
				options, 
				options[0]
			);
			
			if (f.isSelected() ) {
				fem++;
			}
			if (m.isSelected() ) {
				mas++;
			}
			
			int confirm = JOptionPane.showConfirmDialog(null, "Deseja contar outro aluno(a)?");
			
			if(confirm == 0) {
				n++;
			} else {
				i = n+2;
			}
		}
		
		JOptionPane.showMessageDialog(null, fem+" alunos são do sexo feminino e "+mas+" são do sexo masculino.");

	}

}
