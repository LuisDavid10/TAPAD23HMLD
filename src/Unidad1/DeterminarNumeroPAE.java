package Unidad1;

import javax.swing.JOptionPane;

public class DeterminarNumeroPAE {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Determine un número"));
		//Determinar si es primo 
        if (num <= 1) {
            JOptionPane.showMessageDialog(null, "El número no es primo");
        } else {
            boolean esPrimo = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    esPrimo = false;
                    break;
                }
            }

            if (esPrimo) {
                JOptionPane.showMessageDialog(null, "El número es primo");
            } else {
                JOptionPane.showMessageDialog(null, "El número no es primo");
              //no es primo
        		int contador = 1;
        		for (int i = 2; i <= num / 2; i++) {
        			if (num % i == 0) {
        				contador += i;
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
   		
	}

	}
