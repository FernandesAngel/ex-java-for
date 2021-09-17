package lista_ex_5;

//Ao prestar um serviço em uma oficina mecânica, um funcionário coloca várias peças em um carro e
//ao final informa o valor da mão de obra. Sendo que na oficina há N funcionários trabalhando e cada
//um presta X serviços por dia, em cada serviço prestado poderão ser colocadas várias peças, e para
//cada peça deve-se informar a quantidade e o valor, mostre:
//a) Total arrecadado pela empresa ao final do dia;
//b) Total de cada funcionário;
//c) Total de cada serviço;
//d) Nome do funcionário que arrecadou mais com mão de obra;
//e) Nome do funcionário que arrecadou menos com mão de obra;

import javax.swing.JOptionPane;

public class Ex30 {

	public static void main(String[] args) {
		double valorTotalPecas = 0;
		double valorTotalFunc = 0;
		double maior = 0;
		double menor = 0;
		String nomeMaior = "";
		String nomeMenor = "";
		double valorTotalEmpresa=0;

		int n = 1;
		for (int i = 1; i <= n; i++) {
			String nomeFunc = JOptionPane.showInputDialog("Qual o nome do " + i + "° funcionário? ");
			
			//funcionario
			int x = 1;			
			for (int j = 1; j <= x; j++) {

				//serviço
				int y = 1;
				for (int k = 1; k <= y; k++) {
					double valor = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor da " + k + "° peça? "));
					valorTotalPecas += valor; // total do serviço

					int confirm = JOptionPane.showConfirmDialog(null, "Deseja adicionar uma nova peça?");

					if (confirm == 0) {
						y++;
					} else {
						k = y + 2;
					}

				}
				JOptionPane.showMessageDialog(null,"Valor total do serviço: "+valorTotalPecas);
				
				valorTotalFunc += valorTotalPecas;
				valorTotalEmpresa +=valorTotalPecas;
				
				int confirm = JOptionPane.showConfirmDialog(null, "Continuar a venda com o funcionário "+nomeFunc+"?");

				if (confirm == 0) {
					x++;
				} else {
					j = x + 2;
					valorTotalPecas=0;
				}

			}
			JOptionPane.showMessageDialog(null,"Valor total do funcionário("+nomeFunc+"): "+valorTotalFunc);

			
			if (i == 1) {
				maior = valorTotalFunc;
				menor = valorTotalFunc;
				nomeMaior = nomeFunc;
				nomeMenor = nomeFunc;
			}
			if (valorTotalFunc > maior) {
				nomeMaior = nomeFunc;
			}
			if (valorTotalFunc < menor) {
				nomeMenor = nomeFunc;
			}
			valorTotalFunc=0;
			
			
			int confirm = JOptionPane.showConfirmDialog(null, "Outro funcionário?");

			if (confirm == 0) {
				n++;
			} else {
				i = n + 2;
			}
		}
		
		JOptionPane.showMessageDialog(null,"Funcionário que menos arrecadou:"+nomeMenor);
		JOptionPane.showMessageDialog(null,"Funcionário que mais arrecadou:"+nomeMaior);
		JOptionPane.showMessageDialog(null,"Total arrecadado pela empresa:"+valorTotalEmpresa);
		
	}

}
