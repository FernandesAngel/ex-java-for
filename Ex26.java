package lista_ex_5;

//Em um banco existem (N) filas de caixas. Cada caixa atende uma quantidade variável (Q) de clientes.
//Cada cliente faz apenas uma única operação: depósitos(D), ou retiradas(R). Faça um algoritmo para
//ler: Nome do cliente, tipo da operação (D/R) e valor da operação, onde esta leitura deve ser feita para
//cada um dos (Q) clientes de cada uma das (N) filas. Ao final, mostrar na tela o total geral de depósitos
//e retiradas ocorridos.

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class Ex26 {

	public static void main(String[] args) {
		int n = 1;
		int ret = 0;
		int dep = 0;
		double retirada =0;
		double deposito=0;

		for (int i = 1; i <= n; i++) {
			int x = 1;
			
			for (int j = 1; j <= x; j++) {
				//String nome = JOptionPane.showInputDialog("Digite o nome do cliente:");
				
				JCheckBox r = new JCheckBox("Retirada");
				JCheckBox d = new JCheckBox("Deposito");
				
				
				
				Object[] options = {r, d, "OK"};
				
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
				
				if (r.isSelected() ) {
					ret++;
					double re = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para retirada: "));
					retirada+=re;
				}
				if (d.isSelected() ) {
					dep++;
					double de = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para depósito: "));
					deposito+=de;
				}
				
				int confirm = JOptionPane.showConfirmDialog(null, "Novo cliente? Fila: "+i);

				if (confirm == 0) {
					x++;
				} else {
					j = x + 2;
				}	
			}
			
			int confirm = JOptionPane.showConfirmDialog(null, "Continuar em outra fila?");

			if (confirm == 0) {
				n++;
			} else {
				i = n + 2;
			}
		}
		
		JOptionPane.showMessageDialog(null, ret+" retiradas(R$"+retirada+") e "+dep+" depósitos(R$"+deposito+")");
	}

}
