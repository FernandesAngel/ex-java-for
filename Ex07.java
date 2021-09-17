package lista_ex_5;

//Faça um algoritmo para somar e mostrar na tela o resultado da seguinte expressão
//(1+2)+(2+3)+(3+4)+(4+5)+(5+6)+(6+7)+(7+8)+...+(100+101).

import javax.swing.JOptionPane;

public class Ex07 {
	
	// 1+2+ 2+3 +3+4 +4+5

	public static void main(String[] args){
		int soma = 0;
		int x = 1;
		int total = 0;
		
		for(int i=2; i <= 101;) {			
			soma = (x+i);
			total += soma;
			x = i;
			i++;		
			// total = total + i + (i+1)
		}
		
		
		JOptionPane.showMessageDialog(null, total);
	}

}
