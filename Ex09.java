package lista_ex_5;

//Peça para o usuário digitar um número inteiro positivo qualquer, digamos N. Após calcule N!.

import javax.swing.JOptionPane;

public class Ex09 {

	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Digite A:"));
		int fatorial = 1;
		
		for(int i=1; i<=x; i++) {
			fatorial = fatorial * i;
		}
		
		JOptionPane.showMessageDialog(null, fatorial);
	}

}
