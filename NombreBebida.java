/*Nombre de bebida: Se le solicita que guarde en espacios de memoria distinta la
información de: El nombre de su última mascota y nombre de la última película
vista. Por último mostrarlo por pantalla con el siguiente formato:
“Nombre de la próxima bebida : ” {Nombre de mascota} {Nombre de pelicula}
*/

public class NombreBebida{
    public static void main(String main[]){
        var ultimamascosta = "Oso";
        var ultimapelicula="La casa del principe";
        var proximabebida=ultimamascosta+" "+ultimapelicula;
        System.out.println("El nombre de la próxima bebida:"+ " " + proximabebida);
    }
}
