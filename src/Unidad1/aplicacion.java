package Unidad1;

import javax.swing.JOptionPane;

//Escribe un codigo que determine la suma de valores enteros de 1 a n 
//recuerda considerar si es numero par o impar para realizar la suma correctamente
public class aplicacion {


			public static void main(String[] args) {
				int resultado=0;
				int n =  Integer.parseInt(JOptionPane.showInputDialog("Dame un número entero para sumar"));
				
				if ((n%2)==0) {
					resultado=  (n / 2) * (n + 1);
				}else {
					resultado = ((n + 1) / 2) * n;
				}
				 JOptionPane.showMessageDialog(null, "La suma de los números del 1 al " + n + " es: " + resultado);
			}

		
	}

