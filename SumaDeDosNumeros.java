import java.util.Scanner;
//Suma de dos números bis: Se les solicita que guarden dos números enteros y los
//sumen. El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
//indique si se trata de un número par o impar.
public class SumaDeDosNumeros {
    public static void main(String args[]) {
        Scanner teclado1 = new Scanner(System.in);
        Scanner teclado2 = new Scanner(System.in);
        System.out.println("Coloca primer valor: ");
        System.out.println("Coloca segundo valor: ");
        int a = teclado1.nextInt();
        int b = teclado2.nextInt();
        int c = a + b;
       
        System.out.println("El resultado de sumar " + a + " y " + b + " es " + (c % 2 == 0 ? "par" : "impar") + " con un valor de " + c);

        teclado1.close();
        teclado2.close();
        
    }
}
