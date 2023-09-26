//9. Potencia de 2 y 3: Se le solicita que guarde en un espacio de memoria un número y
//luego haga la potencia de ese número al cuadrado y al cubo.

import java.util.Scanner;

public class PotenciadeDosyTres {
    public static void main(String main[]){

        Scanner ingreso = new Scanner(System.in);
        System.out.println("Ingresa un valor para calcular la potencia al cuadrado y al cubo: ");
        var primerValor = ingreso.nextInt();
        var valorAlCuadrado = primerValor ^ 2; // ALT + 94 para símbolo del gorro
        var valorAlCubo = valorAlCuadrado ^ 3;// ALT+96 para el signo de multiplicación
        System.out.println("al cuadrado es: " + valorAlCuadrado);
        System.out.println("al cubo es: " + valorAlCubo);
        ingreso.close();
        
    }
}
