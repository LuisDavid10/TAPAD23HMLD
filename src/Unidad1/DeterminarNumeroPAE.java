package Unidad1;

import javax.swing.JOptionPane;

public class DeterminarNumeroPAE {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Determine un número"));
		//Determinar si es primo 
		
		//no es primo
		int contador = 1;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				contador = contador + i;
			}
		}
		if (num == contador) {
			JOptionPane.showConfirmDialog(null, "El numero  " + num + " es perfecto");
		} else if (num < contador) {
			JOptionPane.showConfirmDialog(null, "El numero " + num + " es abundante con " + contador);
		} else {
			JOptionPane.showConfirmDialog(null, "El numero " + num + " es escaso con " + contador);
		}
	}

}
