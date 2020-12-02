package Exa;
public class ColaDin {
        Nodo cima,fiin;
	int tam;
	
    public boolean EstaVacia() {
        return cima == null;
    }
	
    public void Empujar(String elemento, int indice) {
        Nodo nodo = new Nodo(elemento,indice);
        if(EstaVacia()) {
        cima = nodo;
    }
            else{
            fiin.sig = nodo;
        }
            fiin = nodo;
            tam++;
	}
	public String SacarCola() {
            if(!EstaVacia()) {
            cima = cima.sig;
            tam--;
            }
            else{
                System.out.println("No hay clientes comunes en la cola");
            }
            return null;
	}
	public void MostrarCola() {
            Nodo recorrer = cima;
            if(!EstaVacia()) {
            while(recorrer!=null) {
            System.out.print(" [ Cliente : "+recorrer.elemento +", turno: "+ recorrer.indice+ " ] ");
            recorrer = recorrer.sig;
            }
        }
            else{
                System.out.println("La cola comun esta vacía");
            }
	}
	public String SacarUnElemento() {
		String v = null;
		Nodo recorrer = cima;
		if(!EstaVacia()) {
		v= ("[Cliente: "+recorrer.elemento +" Turno: "+ recorrer.indice+" ] ");
		return v;
	}
            else{
                System.out.println("La cola comun esta vacía");		
            }
            return v;
	}
}
