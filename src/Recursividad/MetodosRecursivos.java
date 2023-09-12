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
}
