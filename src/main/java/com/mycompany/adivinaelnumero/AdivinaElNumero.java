

package com.mycompany.adivinaelnumero;
import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
public static void main(String[] args) {
       Scanner yui = new Scanner(System.in);
       Random you = new Random();
       int pe, ya,intentos,sesion; 
        ya =  you.nextInt(100)+1;
       
   System.out.println(" Bienvenido a adivina el numero ");
   System.out.println(" si logras adivinar un numero entre el 1-100 te llevaras a casa una "
   + " playstation de menterias osea que no te dare pero te divertiras que  bueno eso ya es algo :)");
       
       
       
       intentos = 0;
       sesion=0;
        
       
        
        while ( intentos<3 && sesion == 0) {            
            System.out.println("Ingrese un numero");
        pe = yui.nextInt();
            
             if ( pe>ya) {
            System.out.println(" El numero ingresado es muy grande ");   
        }else if ( pe < ya ){
            System.out.println(" El numero ingresado es muy pequeño");
        }else if ( pe == ya){
            System.out.println(" Felicidades le atinaste al numero");
        
        }
            intentos++;
        }
        if(intentos == 3){
                 System.out.println(" Fallaste buena suerte la proxima");
        }
        
}
}





