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
        		int sumaDivisores = 1;
        		for (int i = 2; i <= (int)Math.pow(num,1.0/2); i++) {
        			if (num % i == 0) {
        				sumaDivisores += i;
						int cociente = num / i;
						if(i < cociente)
						sumaDivisores += cociente;
        				sumaDivisores += i;
        			}
        		}
        		if (num == sumaDivisores) {
        			JOptionPane.showConfirmDialog(null, "El numero  " + num + " es perfecto");
        		} else if (num < sumaDivisores) {
        			JOptionPane.showConfirmDialog(null, "El numero " + num + " es abundante con " + sumaDivisores);
        		} else {
        			JOptionPane.showConfirmDialog(null, "El numero " + num + " es escaso con " + sumaDivisores);
        		}
            }
        }
	}
		
	}
	