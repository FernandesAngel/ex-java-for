package lista_ex_5;

//Faça um algoritmo para fazer a leitura de 10 nomes e idades de pessoas.

import javax.swing.JOptionPane;

public class Ex11 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			String nome = JOptionPane.showInputDialog("Digite o nome:");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
			JOptionPane.showMessageDialog(null, "O nome da pessoa é: "+ nome + ", e tem: "+ idade + " anos.");
		}

	}

}
