/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactorizacion2;
import java.util.*;

import otro.Pedido;

import java.io.*;
/**
 *
 * @author Bego //refactor de silvia
 */
public class Refactorizacion2 {

     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Pedido p1=new Pedido(2,4,5.3); // importo pedido
        Pedido p2=new Pedido(3,5,7.2);
        
        if (p1.getTotal()<p2.getTotal())
            System.out.println("El pedido mÃ¡s caro es el de cÃ³digo:"+p2.getCodigo());
        else
            if (p1.getTotal()>p2.getTotal())
                System.out.println("El pedido mÃ¡s caro es el de codigo:"+p1.getCodigo());
        
       System.out.println("\nAnota el nuevo precio del primer pedido:");
       p1.setPrecio(sc.nextDouble());
       p1.setTotal(p1.getPrecio()*p1.getCantidad());
       System.out.println("\nEl nuevo precio es:"+p1.getTotal());
       
       System.out.println("\nEl precio del primer pedido con una rebaja del 20% es de:"+p1.rebajar(20));
       
       System.out.println("\nInformaciÃ³n del primer pedido,cod:" + p1.getCodigo() + ",precio unidad:"+ p1.getPrecio() + ",cantidad:"+ p1.getCantidad());
       System.out.println("\nInformaciÃ³n del segundo pedido,cod:" + p2.getCodigo() + ",precio unidad:"+ p2.getPrecio() + ",cantidad:"+ p2.getCantidad());
    }
}

    

