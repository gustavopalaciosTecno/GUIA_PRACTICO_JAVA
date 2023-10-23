import java.util.Scanner;

public class CalcularIMG{
    public static void main(String[] args) {
        // calcular el índice de masa corporal
        System.out.println("usa las comas para separar valores");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingresa tu peso: ");
        float peso = teclado.nextFloat();
        System.out.println("Ingresa tu altura:");
        float altura = teclado.nextFloat();
        float img = (peso / (altura * altura));
        
        long imgRedondeado = Math.round(img);
        
        System.out.println("Tu IMC es: " + imgRedondeado);
        teclado.close();
    }

}