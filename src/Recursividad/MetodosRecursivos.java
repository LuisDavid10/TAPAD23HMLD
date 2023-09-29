package Recursividad;

import javax.swing.JOptionPane;

public class MetodosRecursivos {

	/**
	 * metodo jefe 
	 */
	// public int factorial (int numero) {
	// 	if(numero >=0) {
	// 		return factorialRecursivo(numero);
	// 	}
	// }
	/**
	 * metodo trabajador
	 * @param numero
	 * @return
	 */
	private int factorialRecursivo(int numero) {
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
	private int  Suma1nRecursivo (int n)  {
		if(n == 1) {
			return 1; 
		}
		return n + Suma1nRecursivo (n -1 );
	}
	
	private int cuentaRegresivaRecursiva (int n) {
		if (n == 1) { //true
			//caso base
			System.out.println("En: "+ 1);
		}else if (n>1) {
			//caso recursivo
			System.out.println("En: "+ n);
			cuentaRegresivaRecursiva ( n-1 );
		}
	}
		public void cuentaProgresivaRecursiva(int n) {
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
		 * 
		 */
		// private void MaximoComunDivisor (int M, int N) {
		// 	if(N>M) {
		// 		int a;
		// 		a=N;
		// 		N=M;
		// 		M=a;
		// 	}else {
		// 		//caso base
		// 		if(N=0) {
		// 			MaximoComunDivisor = M;
		// 		}else{
		// 			MaximoComunDivisor = MaximoComunDivisor (N, M % N );
		// 		}
		// 	}
		// }

		/**
		 * 
		 */
		// public static void main (String[] args){
		// 	Scanner = new Scanner.in (System.in);

		// 	if(M > 0 && N>=0){
		// 		MaximoComunDivisor(M, N);
		// 	}else{
		// 		Exception e;
		// 	}
		// }

		/**
		 * Metodo recursivo para calcular X^y
		 * donde x es la base y y es el exponente 
		 */
		// public int potenciaRecursivo(int x, int y){
		// 	if(y == 0){
		// 		return x;
		// 	}else if(y==1){
		// 		return x;
		// 	}else{
		// 		return x(NumeroExponencial (x,y-1))*x;
		// 	}
		// }
		
		/**
		 * An example if a method - replace this comment with your own 
		 * 
		 * @param y a sample parameter for a metod
		 * @return the sum of x and y
		 */
		private  int residuoRecursivo(int dividendo, int divisor) {
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
		public  int residuo(int dividendo, int divisor) throws Exception{
			if (dividendo > 0 && divisor > 0) {
				return residuoRecursivo(dividendo, divisor);
			}else {
				throw new Exception("Los valores deben ser positivos");
			}
		}
		//sacar el valor de el contador 
		private int cocienteRecursivo(int dividendo, int divisor){
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
		public String decimalABinario(int decimal){
			if(decimal <= 1){
				//regresar cadena con el valor decimal
				(decimal);
						
			}else{
				decimalABinario( decimal / 2);
				//el resultado (residuo se agrega a la cadena que recibo)
				(decimal % 2);
			}

			//terminar el programa 
		}
}
