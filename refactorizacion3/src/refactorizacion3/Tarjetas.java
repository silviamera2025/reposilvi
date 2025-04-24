/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion3;
import java.util.*;

/**
 *
 * @author BEGO //refactor de silvia
 */
public class Tarjetas { //no hay constructor

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        double saldo;
        String nombre;//lo cambio a nombre
        Tarjeta c1 = generaTarjeta(sc);
        sc.nextLine(); //limpio buffer
        Tarjeta c2=generaTarjeta(sc);
        System.out.println("Anota el importe a ingresar:");
        double importe=sc.nextDouble();
        c1.setSaldo(c1.getSaldo()+importe);
        System.out.println("Anota importe a sacar");
        importe=sc.nextDouble();
        c1.sacarDinero(importe);
        System.out.println("Información de la tarjeta 1:"+ c1.getNumero()+","+ c1.getNombre()+ ","+ c1.getSaldo()); //no se toca el número, siempre va a salir 0 
        System.out.println("Nuevo nombre de la tarjeta:");
        String s=sc.nextLine();
        c2.setNombre(s);
        System.out.println("Información de la tarjeta 2:"+ c2.getNumero()+","+ c2.getNombre()+ ","+ c2.getSaldo());
    }

	public static Tarjeta generaTarjeta(Scanner sc) { //como se repetía código genero una función
		double saldo;
		String nombre;
		System.out.println("Anota nombre");
        nombre=sc.nextLine();
        do{
            System.out.println("Anota saldo:");
            saldo=sc.nextDouble();
            if (saldo<1000)
                System.out.println("Saldo menor del permitido");
        }while(saldo<1000);
        Tarjeta c1=new Tarjeta(nombre,saldo);
		return c1;
	}
}
