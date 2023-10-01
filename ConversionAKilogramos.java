// Ejercicios nivel : Padawan JAVA JEDI
//5. Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
//otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
//una constante de los valores que no van a cambiar en esta conversión. Muestre el
//resultado por pantalla

import java.util.Scanner;

public class ConversionAKilogramos {
    public static void main(String args[]){
        Scanner consola = new Scanner(System.in);
        System.out.println("Coloca un valor en libras: ");
        double constanteLibra = 0.453592;
        double libra = consola.nextDouble();
        double kilo=libra * constanteLibra;
        System.out.println("El valor de "+libra+" Libras son " +kilo+ " Kg");
        consola.close();
    }
}
