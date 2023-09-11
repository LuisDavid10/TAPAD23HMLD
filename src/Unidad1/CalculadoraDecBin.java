package Unidad1;

import javax.swing.JOptionPane;

public class CalculadoraDecBin {

	public static void main(String[] args) {
		int numDecimal = Integer.parseInt(JOptionPane.showInputDialog("Determine un número"));
		int numBinario = 1;
		int unidades = 1;
		
		while (numDecimal / 2 != 0) {
			numBinario = (numDecimal % 2) * (unidades);
			unidades = unidades * 10;
			numDecimal = numDecimal / 2;
		}
		JOptionPane.showMessageDialog(null,  " es el numero: " + numBinario +" en binario");
	}

}



//
//int numero;
//double residuo;
//Scanner sc = new Scanner (System.in);
//
//System.out.println("Introduce un numero ");
//numero = sc.nextInt();
//
//do {
//if((numero > 0)) {
//	residuo = numero % 2;
//	
//}
//}while(numero >=0);
//}
//}
//
