/*Construir un programa que, dado un número total de horas, devuelve el número
de semanas, días y horas  equivalentes. Por ejemplo, dado un total de 1000 horas
debe mostrar 5 semanas, 6 días y 16 horas. */
                                                                                                

package calculador.de.tiempo;

import java.util.Scanner;


public class CalculadorDeTiempo {

    public static void main(String[] args) {
        //creamos las variables que contienen las semanas, días, horas y horas totales
        int horastotal, horas, dias, semanas;
                
        //pedimos las horas totales y se guarda en la variable horastotal
        Scanner tiempo =new Scanner(System.in);
        System.out.println("Digite el total de horas: ");
        
        horastotal=tiempo.nextInt();
        //sacamos el total de semanas mediante la dividion del horas de una semana por el total de horas
        semanas=horastotal/168;
        dias=horastotal%168/24;
        horas=horastotal%24;
        
        System.out.println("\nEl equivalente es: ");
        System.out.println("Son "+semanas+" semanas");
        System.out.println("Son "+dias+" días");
        System.out.println("Son "+horas+" horas");
        
        
        
    }
    
}
