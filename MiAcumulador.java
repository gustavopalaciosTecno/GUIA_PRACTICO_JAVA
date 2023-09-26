//10. Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación
//de quince multiplicaciones entre dos números enteros divididos por el número de la
//multiplicación. Por ejemplo:
//Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15
//El resultado mostrarlo por pantalla.

public class MiAcumulador {
    public static void main(String main[]){

        // PRIMER FORMA DE REALIZAR LA ACTIVIDAD
        int numero1 = 5, numero2 = 3;
        double resultado = ((numero1 * numero2 / 1) + (numero1 * numero2 / 2) + (numero1 * numero2/3) + (numero1 * numero2 /4) + (numero1 * numero2 / 5) + (numero1 * numero2 / 6) + (numero1 * numero2 / 7) + (numero1 * numero2 / 8) + (numero1 * numero2 / 9) + (numero1 * numero2 / 10) + (numero1 * numero2 / 11) + (numero1 * numero2 / 12) + (numero1 * numero2 / 13) + (numero1 * numero2 / 14) + (numero1 * numero2 / 15));
        System.out.println("La suma total es " + resultado); 


        // SEGUNDA FORMA DE REALIZAR LA ACTIVIDAD
        int numero3 = 5;  
        int numero4 = 3;

        double acumulacion = 0.0;
 
        for (int j = 1; j <= 15; j++) {
            double resultadoMultiplicacion = numero3 * numero4;
            double resultadoDivision = resultadoMultiplicacion / j;
            //acumulacion += resultadoDivision;
            double resultado2 = resultadoDivision;
            System.out.println("el resultado es: " + resultado2);
            acumulacion += resultado2;
            
        }

        
        //System.out.println("El resultado de la acumulación es: " + resultado2);
         System.out.println("el total es: " + acumulacion);
    }
}

// NO SE SI SERÁ REALMENTE ASÍ
