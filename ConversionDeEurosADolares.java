/*
3. Conversión de euros a dólares: Escribir un programa en Java que solicite al
usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y
el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares.
*/

import java.util.Scanner;

public class ConversionDeEurosADolares {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Coloca un valor en euros: ");
        double euro = teclado.nextDouble();
        double dolar = 1.20;
        double tasa = (euro * dolar); 
        System.out.println("el valor en dólares es: " + tasa);
        teclado.close();
    }
}
