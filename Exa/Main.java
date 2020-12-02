package Exa;
import java.util.Scanner;
import Exa.ColaDin;
import Exa.ColaVIP;
public class Main {
    public static void main(String[]args){
        
        Scanner leer = new Scanner(System.in);
        boolean continuar = true;
        int opcion;     
        int turno = 1;
        int numero = 0;
        String [] cliente = {"V.I.P.","Cliente común"};
        
        ColaVIP vp = new ColaVIP();
        ColaDin dn = new ColaDin();
        
        while(continuar){            
            System.out.println("*********************************************");
            System.out.println("***************Colas Dinámicas***************");
            System.out.println("****1.- Nuevo Cliente                    ****");
            System.out.println("****2.- Pasar a ventanilla               ****");
            System.out.println("****3.- Mostrar colas                    ****");            
            System.out.println("****4.- Salir                            ****");
            System.out.println("*********************************************");
            System.out.println("*********************************************");            
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1 -> {                        
				numero = (int)(Math.random() * 2);
				if(numero == 0) {
					vp.Empujar(cliente[0], turno++);
				}else {
					dn.Empujar(cliente[1],turno++);					
			}
				vp.MostrarCola();
				dn.MostrarCola();
                }      
                case 2 ->{                                       
                    //String []Ventanilla = new String [3];
			
			for(int i = 0; i < 3; i++ ) {
				if(!vp.EstaVacia()) {
				//Ventanilla[i] = cv.SacarUnElemento();
				vp.SacarCola();
				}else {
					//Ventanilla[i] = cd.SacarUnElemento();
					dn.SacarCola();
				}
			}	
                }
                case 3 -> {                  
                    dn.MostrarCola();
                    System.out.println();
                    vp.MostrarCola();
                }
                case 4 -> continuar = false;
                default -> System.out.println("Opción incorrecta.....Vuelve a intentarlo");                                                  
            }
        }    
    }
}
