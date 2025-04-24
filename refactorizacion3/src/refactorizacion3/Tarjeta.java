/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion3;

/**
 *
 * @author BEGO //refactor de silvia
 */
public class Tarjeta {
 private int numero;
 private String nombre;
 private double saldo;
 private static int totalTarjetas=5000; //cambio la variable para saber qué es
 
 public Tarjeta(String n, double s){
     this.nombre = n;
     this.saldo = s;
     totalTarjetas++; //hago inline a todo porque al poner los datos privados utiliza setters y getters
 }
 //cambio el nombre a la función para identificarla
 public double sacarDinero(double dinero){ //cambio el nombre de la variable para saber que me pasan
     if (dinero>saldo){
         return saldo=0; //qudaba raro al hacer inline y lo he modificado a mano
     }
     return saldo-=dinero;
 }
public static int getTotalTarjetas() {
	return totalTarjetas;
}
public static void setTotalTarjetas(int totalTarjetas) {
	Tarjeta.totalTarjetas = totalTarjetas;
}
public double getSaldo() {
	return saldo;
}
public void setSaldo(double saldo) {
	this.saldo = saldo;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getNumero() {
	return numero;
}

//borro get y set numero para que no se pueda acceder ni modificar
 

     
 
 
 
}