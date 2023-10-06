package Recursividad;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MetodosRecursivos {

	/**
	 * 
	 * @param numero
	 * @return
	 * @throws Exception
	 */
	private MetodosRecursivos()
	{
	}

	/**
	 * metodo jefe 
	 * aplicacion para determinar el factorial de un número
	 * @param numero entero positivo
	 * @return Usa el factorialRecursivo para determinar el factorial de un número
	 */
	 public static int factorial (int numero) throws Exception {
	 	if(numero >=0) {
	 		return factorialRecursivo(numero);
	 	}else {
	 		throw new Exception("Error: numero negativo");
	 	}
	 }
	/**
	 * metodo trabajador
	 * Metodo recursivo para determinar el factorial de un número
	 * @param numero entero positivo
	 * @return Factorial de un número
	 */
	private static int factorialRecursivo(int numero) {
		//caso base, caso mas simple
		//para e que tengo una solucion directa
		if(numero == 0) {
			return 1;
		}else {
			//caso recursivo
			//se debe invocar al mismo metodo 
			//con valor de parametro diferente
			//que lo lleve al caso base
			///si quieres diminuir generalmente son restas o divisiones
			//si quieres aumentar genralmente son sumas y multiplicaciones
			return numero * factorialRecursivo(numero - 1);
		}
	}
	
	
	/**
	 * Metodo para la suma de 1 a número n de manera Recursiva
	 * Realizada en clase 
	 * @param Número entero positivo
	 * @return Súma de 1 a n
	 */
	private static int  Suma1nRecursivo (int n)  {
		if(n == 1) {
			return 1; 
		}
		return n + Suma1nRecursivo (n -1 );
	}
	
	/**
	 * Metodo para determinar la cuenta REGRESIVA de un número n
	 * @param Número entero positivo n
	 * @return Cuenta REGRESIVA de un número hasta n
	 */
	private static void cuentaRegresivaRecursiva (int n) {
		if (n == 1) { //true
			//caso base
			System.out.println("En: "+ 1);
		}else if (n>1) {
			//caso recursivo
			System.out.println("En: "+ n);
			cuentaRegresivaRecursiva ( n-1 );
		}
	}
	
	/**
	 * Metodo para determinar la cuenta PROGRESIVA de un número n
	 * @param Número estero positivo en n
	 * @return Cuenta PROGRESIVA de un número hasta n 
	 */
		public static void cuentaProgresivaRecursiva(int n) {
			if(n==1) {
				//caso base
				System.out.println(1);
			}else {
				//caso recursivo
				cuentaProgresivaRecursiva (n-1);
				System.out.println(n);
				}
		}
		
		
		/**
		 * Calcula el máximo común divisor (MCD) de M y N de manera recursiva.
		 * @return 
		 * 
		 */
		 private static int MaximoComunDivisor (int M, int N) {
		 	if(N>M) {
		 		int a;
		 		a=N;
		 		N=M;
		 		M=a;
		 	}
		 	if (N == 0) {
		 		return M; // Caso base: el MCD es M
		 	} else {
		 		return MaximoComunDivisor(N, M % N); // Llamada recursiva
		 	}
		}

		/**
		 * 
		 */
		 public static void main (String[] args){
		  Scanner teclado = new Scanner(System.in);

		 	if(M > 0 && N>=0){
		 		MaximoComunDivisor(M, N);
		 	}else{
		 		Exception e;
		 	}
		}
		

		public class MaximoComunDivisorCalculator {
		
			/**
			 * Calcula el máximo común divisor (MCD) de M y N de manera recursiva.
			 */
			private static int MaximoComunDivisor(int M, int N) {
				if (N > M) {
					int temp = N;
					N = M;
					M = temp;
				}
		
				if (N == 0) {
					return M; // Caso base: el MCD es M
				} else {
					return MaximoComunDivisor(N, M % N); // Llamada recursiva
				}
			}
		
			public static void main(String[] args) {
				Scanner teclado = new Scanner(System.in);
		
				System.out.print("Ingrese el valor de M: ");
				int M = teclado.nextInt();
				System.out.print("Ingrese el valor de N: ");
				int N = teclado.nextInt();
		
				if (M > 0 && N >= 0) {
					int mcd = MaximoComunDivisor(M, N);
					System.out.println("El MCD de " + M + " y " + N + " es " + mcd);
				} else {
					System.out.println("M y N deben ser valores positivos.");
				}
			}
		}
		





		/**
		 * Método recursivo para calcular x^y
		 * donde x es la base y y es el exponente
		 */
		public static int potenciaRecursivo(int x, int y) {
			if (y == 0) {
				return 1; // Cualquier número elevado a la potencia 0 es 1
			} else if (y == 1) {
				return x; // Cualquier número elevado a la potencia 1 es el mismo número
			} else {
				return x * potenciaRecursivo(x, y - 1); // Llamada recursiva
			}
		}



		/**
		 * An example if a method - replace this comment with your own 
		 * 
		 * @param y a sample parameter for a metod
		 * @return the sum of x and y
		 */
		private static int residuoRecursivo(int dividendo, int divisor) {
			//caso base, ya tengo resultado 
			if(dividendo < divisor) {
				return dividendo;
			}else {
				return residuoRecursivo(dividendo - divisor, divisor); 
			}
		}
		/**
		 * An example if a method - replace this comment with your own 
		 * 
		 * @param y a sample parameter for a method
		 * @return the sum of x and y
		 */
		public static int residuo(int dividendo, int divisor) throws Exception{
			if (dividendo > 0 && divisor > 0) {
				return residuoRecursivo(dividendo, divisor);
			}else {
				throw new Exception("Los valores deben ser positivos");
			}
		}
		//sacar el valor de el contador 
		private static int cocienteRecursivo(int dividendo, int divisor){
			//caso base
			if(dividendo<divisor){
				return 0;
			}else{
				return cocienteRecursivo(dividendo - divisor, divisor) +1;
			}

		}

		/**
		 * 
		 */
		public static String decimalABinario(int decimal){
			if(decimal <= 1){
				//regresar cadena con el valor decimal
				return Integer.toString(decimal);
						
			}else{
				
				String cocienteBinario = decimalABinario(decimal/2);
				//el resultado (residuo se agrega a la cadena que recibo)
				String resultadoBinario = cocienteBinario + Integer.toString(decimal % 2);
				
				return resultadoBinario;
			}

			
		}
		
		/**
		 * El metodo toma un valor decimal y lo convierte a la base que nesesite 
		 * @author luis_
		 * @param Un número entero positivo como decimal y una base a la que lo queremos cambiar
		 * @return El número en la base en que lo pedimos 
		 */
		public  String decimalABase(int decimal, int base) {
			//caso base
			if (decimal < base) {
				return Integer.toString(decimal);
			}else { //caso recursivo
				// Llamamos recursivamente a la función con el cociente
		        String cocienteBase = decimalABase(decimal / base, base);
		        
		        // Calculamos el dígito actual en la base deseada
		        int residuo = decimal % base;
		        String digitoBase = (residuo < 10) ? Integer.toString(residuo) : Character.toString((char) ('A' + residuo - 10));
		        
		        // Concatenamos el dígito actual al cociente
		        return cocienteBase + digitoBase;
		    }
			}
		
		/**
		 * Metodo 
		 * 
		 * Metodo del profe
		 */
		public void mostrarDecimalaCualquierBaseRecursivo(int decimal, int base) {
			
			if(decimal < base) {
				//regresar cadena con el valor de decimal
				if(decimal < 10) {
				System.out.print(decimal);
				}else {
					System.out.println(digitoACaracter(decimal));
				}
			}else {
				mostrarDecimalaCualquierBaseRecursivo(decimal/ base, base);
				
				//el resutado (residuo se agrega a la cadena que recibo)
				if(decimal % base < 10) {
					System.out.print(decimal % base);
				}else {
					System.out.print(digitoACaracter(decimal % base));
				}
			}
		}
		
		public char digitoACaracter(int digitoDecimal) {
			String digitoACaracter ="0123456789ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
			return digitoACaracter.charAt(digitoDecimal);
		
			//SOLUCION 3
			// char[] digitoACaracter ={'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D','E', 'F', 'G'};
			// return digitoACaracter(digitoDecimal);
			
		// 		if(digitoDecimal <10) {
		// 			//primer solucion un switch para cada dato
		// 			switch(digitoDecimal) {
		// 		case 0:
		// 			return '0';
		// 		case 1:
		// 			return '1';
		// 		case 2:
		// 			return '2';
		// 		case 3:
		// 			return '3';
		// 		case 4:
		// 			return '4';
		// 		case 5:
		// 			return '5';
		// 		case 6:
		// 		return '6';
		// 		case 7:
		// 			return '7';
		// 		case 8:
		// 			return '8';
		// 		case 9:
		// 			return '9';
		// //		case 10:
		// //			return 'A';
		// //		case 11:
		// //			return 'B';
		// //		case 12:
		// //			return 'C';
		// //		case 13:
		// //			return 'D';
		// //		case 14:
		// //			return 'E';
		// //		case 15:
		// //			return 'F';
		// 	}
		// }else {
		// 	//El codigo ASCII es antiguo y tiene una mitad estructurado y la otra mitad modificado
		// 	//JAVA trabaja con UNICODE 2 BYTES  
		//  //SOLUCION 2 
		// 	//           casting 
		// 	return (char) ('A' + (digitoDecimal - 10 ) );
		// }
		// return ' ';
		}
}


