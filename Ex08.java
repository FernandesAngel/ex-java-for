package lista_ex_5;

//Faça um algoritmo que peça para o usuário digitar dois valores inteiros positivos, digamos A e B. Após
//calcule “A elevado ao expoente B”. 

import javax.swing.JOptionPane;

public class Ex08 {

	public static void main(String[] args) {
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite A:"));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite B:"));
		int elevado = 1;
		
		
		for (int i = 1; i<=b; i++) {
			elevado = elevado * a;			
		}
		
		JOptionPane.showMessageDialog(null, elevado);

	}

}
