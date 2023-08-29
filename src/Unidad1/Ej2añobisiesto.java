package Unidad1;

import javax.swing.JOptionPane;

//Determine si un año es bisiesto, años bisiestos numeros divisibeles entre 4
//1999==2000 matematicamente eso no era correcto
//los judios que año estan 
//rango de error de el año 4-6 años
//
//Escriba un código que determine si un año dado es bisiesto (considere la condición de bisiestos considerando las centurias o siglos).
//En caso de que el año proporcionado no sea bisiesto se debe indicar el siguiente bisiesto al año proporcionadoimport javax.swing.JOptionPane;

public class Ej2añobisiesto {

	public static void main(String[] args) {
		int anio = Integer.parseInt(JOptionPane.showInputDialog("Dime que año quieres determinar si es bisiesto"));

		if ((anio % 4 == 0 && anio % 100 != 0) || anio % 400 == 0) {
			JOptionPane.showMessageDialog(null, "El año si es bisiesto");
		} else {
			int siguienteBisiesto = anio + 1;
			while (!((siguienteBisiesto % 4 == 0 && siguienteBisiesto % 100 != 0) || siguienteBisiesto % 400 == 0)) {
				siguienteBisiesto++;
			}

			JOptionPane.showMessageDialog(null,
					"El año no es bisiesto, el siguiente año bisiesto es: " + siguienteBisiesto);
		}
	}

}
//
//if(num1>num2) {
//	if(num1>num3) {
//		mayor=num1;
//	}else {
//		mayor=num3;
//	}
//}else {
//	if(num2>num3) {
//		mayor=num2;
//	}else {
//		mayor=num3;
//	}
//}
//
//
//if(num1 >num2 && num1 > num3) {
//	mayor=num1;
//}else if(num2 > num3) {
//	mayor=numero2;
//}else {
//	mayor=numero3;
//}
//
//
//mayor = num1;
//if(mayor<num2) {
//	mayor=num2;
//}
//if(mayor<num3) {
//	mayor=num3;
//}
//
//
//	}
//}