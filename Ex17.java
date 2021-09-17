package lista_ex_5;

//Faça um algoritmo para ler uma série de N números do tipo REAL. Após a leitura, mostre na tela o
//menor dentre todos os números. Considere que o usuário poderá digitar qualquer número, positivos,
//negativos e zero. 

import javax.swing.JOptionPane;

public class Ex17 {

	public static void main(String[] args) {
		int n = 1;
		double menor = 0;

		for (int i = 1; i <= n; i++) {
			double numero = Double.parseDouble((JOptionPane.showInputDialog("Digite o número")));

            if (i == 1) {
                menor = numero;
            } else {
                if (numero < menor) {
                    menor = numero;
                }
            }
            
            int confirm = JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?");
			
			if(confirm == 0) {
				n++;
			} else {
				i = n+2;
			}
		}
		
		JOptionPane.showMessageDialog(null, "O menor numero digitado foi:"+menor);
		
		

	}

}
