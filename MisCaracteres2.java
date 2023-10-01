//Ejercicios nivel : Padawan JAVA JEDI
//Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
//en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
//¿Qué es unicode?

public class MisCaracteres2 {
    public static void main(String args[]){
        char primeraLetra = '\u0047'; // 'G' en Unicode
        char segundaLetra = '\u0075'; // 'u' en Unicode
        char terceraLetra = '\u0073'; // 's' en Unicode
        char cuartaLetra = '\u0074';  // 't' en Unicode
        char quintaLetra = '\u0061';  // 'a' en Unicode
        char sextaLetra = '\u0076';   // 'v' en Unicode
        char septimaLetra = '\u006F';
        System.out.println("" + primeraLetra + segundaLetra + terceraLetra + cuartaLetra + quintaLetra + sextaLetra + septimaLetra);

    }
     
}
