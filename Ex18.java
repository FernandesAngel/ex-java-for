package lista_ex_5;

//Uma sala de aula possui N alunos, dos quais é conhecido: Nome, cidade onde mora e idade. Faça um
//algoritmo que imprima:
//a) A quantidade de alunos que residem em TUBARÃO
//b) A quantidade de alunos que residem em JAGUARUNA
//c) A quantidade de alunos que possuem idade inferior a 17 anos

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;


public class Ex18 {

	public static void main(String[] args) {
		int n = 1;
		int qtAlunos = 0;
		int t = 0;
		int j = 0;

		for (int i = 1; i <= n; i++) {
			//String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno:"));
			
			JCheckBox tubarao = new JCheckBox("TUBARÃO");
			JCheckBox jaguaruna = new JCheckBox("JAGUARUNA");
			JCheckBox outra = new JCheckBox("Outra");
			
			Object[] options = {tubarao, jaguaruna, outra, "OK"};
			
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
			
			if (tubarao.isSelected() ) {
				t++;
			}
			if (jaguaruna.isSelected() ) {
				j++;
			}
			if(idade <= 17) {
				qtAlunos++;
			}
			
			int confirm = JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?");
			
			if(confirm == 0) {
				n++;
			} else {
				i = n+2;
			}
			
		}
		
		JOptionPane.showMessageDialog(
				null, t+" alunos de tubarão "+j+" alunos de jaguaruna e "+qtAlunos+ " com idade inferior a 17 anos."
			);
		

	}
	
	

}
