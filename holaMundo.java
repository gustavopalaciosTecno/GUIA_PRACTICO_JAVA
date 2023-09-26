import java.util.Scanner;

public class holaMundo{
  public static void main(String main[]){
    String condicion;
    Double calificacion;
    
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce un valor: ");
    calificacion = teclado.nextDouble();
    condicion = calificacion >= 6? "APROBADO":"DESAPROBADO";
    System.out.println("resultado = " + condicion);
    teclado.close();
   
  }
}