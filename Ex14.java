package lista_ex_5;

//Uma cliente possui um determinado valor X, como saldo de conta corrente em um banco. Durante o
//mês, são realizadas operações de depósitos e retiradas. Faça um algoritmo para ler as N operações
//bancárias realizadas durante o mês, e ao final mostrar na tela o saldo que ficou na conta bancárias da
//loja. Considere que uma operação bancária corresponde a leitura do valor movimentado e do tipo da
//operação: (D)epósito ou (R)etirada

import javax.swing.JOptionPane;

public class Ex14 {

	public static void main(String[] args) {
		int n = 1;
		double saldo = Integer.parseInt(JOptionPane.showInputDialog("Digite o saldo atual:"));
		
		for(int i=1; i<=n; i++) {		
		
			String[] options = {"Depósito", "Retirada"};
			
			int opcao = JOptionPane.showOptionDialog(
				null, 
				"Selecione a operação desejada:", 
				null, 
				JOptionPane.DEFAULT_OPTION, 
				JOptionPane.INFORMATION_MESSAGE, 
				null, 
				options, 
				options[0]
			);
			
			if (opcao == 0) {
				double deposito = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para depósito:"));
				saldo += deposito;
			}
			if(opcao == 1) {
				double retirada = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor para retirada:"));
				saldo -= retirada;
			}
			
			int confirm = JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?");
			
			if(confirm == 0) {
				n++;
			} else {
				i = n+2;
			}
			
		}
		
		JOptionPane.showMessageDialog(null, "Seu saldo atual é de: " + saldo);

	}

}
