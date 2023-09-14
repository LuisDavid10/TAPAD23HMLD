package Recursividad;

public class MetodosRecursivos {

	/**
	 * metodo jefe 
	 */
	public int factorial (int numero) {
		if(numero >=0) {
			return factorialRecursivo(numero);
		}
	}
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
	private int  Suma1n (int n) trows Exception {
		if(n>= 1) {
			return 
		}
		return n + Suma1n (n -1 );
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

}
