package Unidad1;

import javax.swing.JOptionPane;

//Determinar si un número es primo 
public class DeterminarPrimo {

	public static void main(String[] args) {
		int num =  Integer.parseInt(JOptionPane.showInputDialog("Determinar un número"));
		
		if(num==0) {
			JOptionPane.showMessageDialog(null, "El número no es primo");
		}else if (num==1) {
			JOptionPane.showMessageDialog(null, "El número no es primo");
		}else if (num==4) {
			JOptionPane.showMessageDialog(null, "El número no es primo");
		}else {
			int mitad=(num/2)-1;
			boolean respuesta=false;
		for(int i=1;i<=mitad;i++) {
			int contador=2;
			if(contador/i==0) {
			respuesta=false;
			}else {
			respuesta = true;
			}
			contador++;
			
		}
		if(respuesta==true) {
			JOptionPane.showMessageDialog(null, "El número si es primo");
		}else {
			JOptionPane.showMessageDialog(null, "El número no es primo");
		}
		}
	}

}
