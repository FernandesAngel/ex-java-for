package lista_ex_5;

//Faça um algoritmo que calcule: Y = 1 + 2 + 3 + 4 + 5 + ... + 10. 

import javax.swing.JOptionPane;

public class Ex05 {

	public static void main(String[] args) {
		int y = 0;
		
		for(int i = 1; i<=10; i++) {
			y+= i;
		}  
		
		JOptionPane.showMessageDialog(null, y);
	}

}
