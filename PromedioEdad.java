//Ejercicios nivel : Padawan JAVA JEDI
//4. Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
//edad y los nombres de esas personas, luego saque su promedio e imprima por
//pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
//edades.

//import java.util.Scanner;

public class PromedioEdad {
    public static void main(String args[]) {

        String nombre[]={"Paco", "Mirta", "Micaela"};
        int[] edades = {25,18,32};

        int sumaEdades = 0;
        for(int edad : edades){
            sumaEdades+=edad;
        }

        double promedioEdades = (double) sumaEdades / edades.length;

        for( int i = 0; i < edades.length; i++){
            System.out.println("Nombre: "+nombre[i]+" tiene una edad de "+edades[i] + " años");
        }
        
        System.out.println("Promedio de edades: " + promedioEdades + " total");
        
    }
}
