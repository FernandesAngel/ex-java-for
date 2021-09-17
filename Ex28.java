package lista_ex_5;

//Em um banco existem (N) filas de caixas. Cada caixa atende uma quantidade variável (Q) de clientes.
//Cada cliente faz apenas uma única operação: depósitos(D), ou retiradas(R). Faça um algoritmo para
//ler: Nome do cliente, tipo da operação (D/R) e valor da operação, onde esta leitura deve ser feita para
//cada um dos (Q) clientes de cada uma das (N) filas. Mostrar ao final, o número da fila que obteve o
//maior volume de depósitos, e o número da fila que obteve o menor volume de retiradas.

import javax.swing.JCheckBox;
import javax.swing.JOptionPane;

public class Ex28 {

	public static void main(String[] args) {
		int n = 1;	
		//int retirada = 0;
		//int deposito = 0;
		double maiorDep= 0;
		int maiorFila= 0;
		double menorRet= 0;
		int menorFila= 0;
		double ret=0;
		double dep=0;

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
					//retirada++;
					ret += Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para retirada:"));
				}
				if (d.isSelected() ) {
					//deposito++;
					dep += Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para deposito:"));
				}				
				
				
				int confirm = JOptionPane.showConfirmDialog(null, "Novo cliente?");

				if (confirm == 0) {
					x++;
				} else {
					j = x + 2;
				}	
			}			
			
			if(i == 1) {
				menorFila=i;
				menorRet=ret;
				maiorDep=dep;
				maiorFila=i;
			} else {
				if(dep>maiorDep) {
					maiorDep=dep;
					maiorFila=i;
				}
				if(ret<menorRet) {
					menorRet=ret;
					menorFila=i;
				}
			}
			
			int confirm = JOptionPane.showConfirmDialog(null, "Deseja realizar outra operação?");

			if (confirm == 0) {
				n++;
			} else {
				i = n + 2;
			}
		}
		
		JOptionPane.showMessageDialog(null, "A fila com o maior número de depósitos("+maiorFila+"): "+maiorDep);
		JOptionPane.showMessageDialog(null, "A fila com o menor número de retiradas("+menorFila+"): "+menorRet);

	}

}
