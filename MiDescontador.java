//Ejercicios nivel : Padawan JAVA JEDI
//Descontador: Se le solicita que guarde un número en un espacio de memoria y
//discretamente dicho número 20 veces sin usar asignación. ¿Que operador podría
//usar para hacerlo?
public class MiDescontador {
    public static void main(String args[]){
        int numero = 1;
        for (int i=0 ;i<21;++i){
            --numero;
            System.out.println(numero);
    }
}
}
