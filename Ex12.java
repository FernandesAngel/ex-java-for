package lista_ex_5;

//Faça um algoritmo para fazer a leitura de N nomes e idades de pessoas, e após, mostrar:
//a) O somatório de todas as idades.
//b) A média das idades.

import javax.swing.JOptionPane;

public class Ex12 {
	
	public static void main(String[] args) {
		int n = 1;
		int soma = 0;
		double media = 0;
		
		
		for(int i=1; i<=n; i++) {
//			String nome = JOptionPane.showInputDialog("Digite o nome:");
			int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
			soma += idade;
			media = (soma)/i;
			
			int confirm = JOptionPane.showConfirmDialog(null, "continuar?");
			
			if(confirm == 0) {
				n++;
			} else {
				i = n+2;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Média: "+ media + ". Soma: "+ soma);
	}
}
