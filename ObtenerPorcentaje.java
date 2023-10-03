//Ejercicios nivel : Caballero JAVA JEDI
//Obtener porcentaje : Dados dos números, uno real y el otro entero. Obtenga el
//porcentaje que indique el segundo número del primer número.

import java.util.Scanner;

public class ObtenerPorcentaje {
    public static void main(String args[]){
        System.out.println("Ingresa un número real: ");
        Scanner consola = new Scanner(System.in);
        double numeroReal = consola.nextDouble();
        System.out.println("Ingresa un número entero: ");
        int poercentaje= consola.nextInt();
        double resultado = (poercentaje/ 100.0) * numeroReal;
        System.out.println("El " + poercentaje+ "% de " + numeroReal + " es igual a " + resultado);

        consola.close();

    }
}
