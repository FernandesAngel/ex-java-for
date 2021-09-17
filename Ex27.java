package lista_ex_5;

//Em um banco existem (N) filas de caixas. Cada caixa atende uma quantidade variável (Q) de clientes.
//Cada cliente faz apenas uma única operação: depósitos(D), ou retiradas(R). Faça um algoritmo para
//ler: Nome do cliente, tipo da operação (D/R) e valor da operação, onde esta leitura deve ser feita para
//cada um dos (Q) clientes de cada uma das (N) filas. Mostrar na tela, para cada fila, o total de depósitos
//e retiradas que cada fila obteve.

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class Ex27 {

	public static void main(String[] args) {
		int n = 1;		

		for (int i = 1; i <= n; i++) {
			int x = 1;
			int ret = 0;
			int dep = 0;
			
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
				}
				if (d.isSelected() ) {
					dep++;
				}
				
				int confirm = JOptionPane.showConfirmDialog(null, "Novo cliente?");

				if (confirm == 0) {
					x++;
				} else {
					j = x + 2;
				}	
			}
			JOptionPane.showMessageDialog(null, ret+" retiradas e "+dep+" depósitos, da fila "+i);
			
			int confirm = JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?");

			if (confirm == 0) {
				n++;
			} else {
				i = n + 2;
			}
		}
		
	}

}
