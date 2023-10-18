package Estructuras;

public class NodoArbolNoBinario {
	//los parametros 
    private int informacion;
    private NodoArbolNoBinario izquierdo;
    private NodoArbolNoBinario derecho;
    
    
    public NodoArbolNoBinario( int informacion){
    	//initialise instance variables, dice en que valor empieza, no todos lo pueden tener constructor vacio 
    	//ocultamiento de nombre es ponerle el valor informacion = informacion;
    	this.informacion =informacion;
    	//ponlo en todos los atributos aunque sea 0 o equivalente para no confundir al programador
    	izquierdo = null;
    	derecho = null;
    }
    
    public NodoArbolNoBinario( int informacion, NodoArbolNoBinario izquierdo, NodoArbolNoBinario derecho){
    	this.informacion = informacion;
    	this.izquierdo = izquierdo;
    	this.derecho = derecho;
    }

	/**
	 * Metodo get de la informacion regresa la informacion del nodo
	 * 
	 * @param sin parametros
	 * @return regresa el entero de la informacion del nodo
	 * 
	 */
	public int getInformacion() {
		//son metodos recuperadores, no modificadores
		return informacion;
	}

	/**
	 * Metodo set de la informacion modifica la informacion del nodo
	 * @param informacion
	 * @return sin retorno
	 */
	public void setInformacion(int informacion) {
		//son metodos modificadores, no recuperadores
		this.informacion = informacion;
	}

	/**
	 * Metodo get del nodo izquierdo regresa el nodo izquierdo
	 * @param sin parametros
	 * @return regresa el nodo izquierdo
	 */
	public NodoArbolNoBinario getIzquierdo() {
		return izquierdo;
	}

	/**
	 * Metodo set del nodo izquierdo modifica el nodo izquierdo
	 * @param izquierdo
	 * @return sin retorno
	 */
	public void setIzquierdo(NodoArbolNoBinario izquierdo) {
		this.izquierdo = izquierdo;
	}

	/**
	 * Metodo get del nodo derecho regresa el nodo derecho
	 * @param sin parametros
	 * @return regresa el nodo derecho
	 */
	public NodoArbolNoBinario getDerecho() {
		return derecho;
	}

	/**
	 * Metodo set del nodo derecho modifica el nodo derecho
	 * @param derecho
	 * @return sin retorno
	 */
	public void setDerecho(NodoArbolNoBinario derecho) {
		this.derecho = derecho;
	}
	
}
