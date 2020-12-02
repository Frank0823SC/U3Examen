package Exa;
public class Nodo {
        Object elemento;
	int indice;
        Nodo sig;
	
	public Nodo(Object elemento, int indice) {
		
		this.elemento=elemento;
		this.indice = indice;
	    
		this.sig=null;
    }
}
