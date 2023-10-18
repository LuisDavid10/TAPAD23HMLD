package Estructuras;

public class ArbolBinarioOrdenado {
    
    private NodoArbolNoBinario raiz;

    public ArbolBinarioOrdenado() {
        raiz = null;
    }

    public ArbolBinarioOrdenado(NodoArbolNoBinario raiz){
        this.raiz = raiz;
    }
    

    public void insertarRecursivo(int informacion, NodoArbolNoBinario raizSubarbol){
        //caso base
        if(raizSubarbol == null){
            raizSubarbol = new NodoArbolNoBinario(informacion);
        //recursividad para el caso general
        }else{
            if(informacion < raizSubarbol.getInformacion()){
                insertarRecursivo(informacion, raizSubarbol.getIzquierdo());
            }else{
                insertarRecursivo(informacion, raizSubarbol.getDerecho());
            }
        }
    }
            
}
