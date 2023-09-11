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
			int mitad=(num/2);
			boolean respuesta=false;
		for(int i=1;i<=mitad;i++) {
			int contador=2;
			if(contador%i==0) {
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


//otra solucion creo 

//        if (num <= 1) {
//            JOptionPane.showMessageDialog(null, "El número no es primo");
//        } else {
//            boolean esPrimo = true;
//            for (int i = 2; i <= Math.sqrt(num); i++) {
//                if (num % i == 0) {
//                    esPrimo = false;
//                    break;
//                }
//            }
//
//            if (esPrimo) {
//                JOptionPane.showMessageDialog(null, "El número es primo");
//            } else {
//                JOptionPane.showMessageDialog(null, "El número no es primo");
//            }
//        }
//    }
//}

//		//opcion del profe
//		system.out.println("dame un valor entero positivo");
//numero=entrada.nextInt();
////usando contador 
//int cantidadDivisores;
////se inicializa el controlador en cero
////en este caso siempre hay 2 divisores
////la unidad y el mismo valor
//cantidadDivisores=2;
////usando variable de estado(switch,bandera)
//for(int j=2;1<= numero / 2;j++){
//	//dependiendo de una condicion
//	if(numero%1==0){
//		//se incrementa el contador
//		cantidadDivisores++;
//		//se modifica el estado de la variable switch o bandera 
//	}
//}
////se verifica el valor o estado de la variable 
//if(cantidadDivisores>0){
//	//se determina si es primo
//	System.out.println("Es primo");
//}else{
//	System.out.println("No es primo");
//}
//
//
////usando variable de estado(switch, bandera)
////cuando son 2 posibilidades se declara de tipo boolean
////si mas de 2 lo mas comun es que sean enteros o char (no float)
//boolean isPrimo;
////se inicializa en lo opuesto dependiendo de lo que se puede verificar
////que cambie el estado ( todo numero es verdadero a menos de que demuestres lo contrario)
//isPrimo=true;
//
//for(int j=2;1<= numero / 2;j++){
//	//dependiendo de una condicion
//	if(numero%1==0){
//		//se incrementa el contador
//		cantidadDivisores++;
//		//se modifica el estado de la variable switch o bandera 
//		isPrimo=false;
//	}
//
////se verifica el valor o estado de la variable 
////ya sea un conteo
////if(cantidadDivisores>0){
//	//o de estado
//if(isPrimo){
//	//se determina si es primo
//	System.out.println("Es primo");
//}else{
//	System.out.println("No es primo");
//}
//	}
//}
//}
//
