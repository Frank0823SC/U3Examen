package Exa;
public class ColaVIP{
        Nodo2 cima,fiin;
	int tam;
	
	public boolean EstaVacia() {
		return cima == null;
	}
	
	public void Empujar(String elemento, int indice) {
		Nodo2 nodo = new Nodo2(elemento,indice);
		if(EstaVacia()) {
			cima = nodo;
		}else {
			fiin.sig =  nodo;
		}
		fiin = nodo;
		tam++;
	}
        
	public String SacarCola() {
		if(!EstaVacia()) {
			cima = cima.sig;
			tam--;
		}else {
			System.out.println("No hay elemento en el a cola VIP");
		}
		return null;
	}
        
	public void MostrarCola() {
		Nodo2 recorrer = cima;
		if(!EstaVacia()) {
			while(recorrer!=null) {
				System.out.print("[Cliente: "+recorrer.elemento +" Turno: "+ recorrer.indice+" ] ");
				recorrer = recorrer.sig;
			}
		}else {
			System.out.println("La cola VIP esta vacía");
		}
	}
        
	public String SacarUnElemento() {
		String v = null;
		Nodo2 recorrer = cima;
		if(!EstaVacia()) {
			
				v= ("[Cliente: "+recorrer.elemento +" Turno: "+ recorrer.indice+" ] ");
				return v;
		}else {
			System.out.println("La cola comun esta vacía");
			
		}
		return v;
	}
}
