package Programas;

import java.util.Scanner;

public class Venta {
    
    public static void main (String[] args){
        //declarar variable
        String vendedor;
        double venta1,venta2,venta3,comision,sm,sn;
        Scanner lectura = new Scanner(System.in);
        
        //entrada
        System.out.print("INGRESAR VENDEDOR:");
        vendedor=lectura.next();
  
        System.out.print("INGRESAR SUELDO MENSUAL:");
        sm=lectura.nextDouble();
        
        System.out.print("INGRESAR VENTA 1:");
        venta1=lectura.nextDouble();
        
        System.out.print("INGRESAR VENTA 2:");
        venta2=lectura.nextDouble();
        
        System.out.print("INGRESAR VENTA 3:");
        venta3=lectura.nextDouble();
        
        //PROCESO
        comision=(venta1+venta2+venta3)*0.10;
        sn = sm+comision;
        
        //salida
        
        System.out.println("COMISION DE LA VENTA ES: "+comision);
        System.out.println("EL SUELDO NETO: "+sn);
        
    }
    
}
