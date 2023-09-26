// EJERCICIO 3 CÁLCULO DE DIVISIBILIDAD
//Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
//sumen, determine si el primer número es divisible por el segundo número y muestre
//el resultado.

public class CalculoDeDivisibilidad {
    public static void main(String args[]){

        int numero1 = 10;
        int numero2 = 5;
        var resultado = numero1 + numero2;
        System.out.println("El valor del cálculo es " +resultado);
        String valores = (numero1 % numero2 == 0)? "es divisible":"no es divisible";
        System.out.print("la suma es "  + valores + " entre: " + numero1 + " y " + numero2);
     
    

    }
}

