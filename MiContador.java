//Contador: Se le solicita que guarde un número en un espacio de memoria e
//incremente dicho número 20 veces sin usar asignación. ¿Que operador podría usar
//para hacerlo?
public class MiContador{
public static void main(String args[]){

    int numero = 0;

    for (int i = 0;i<20;i++){
        numero+=i;

    } 
    System.out.println("el número despues de incrementarlo 20 veces es: " + numero);
}


}