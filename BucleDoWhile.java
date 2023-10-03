public class BucleDoWhile {
    public static void main(String args[]){

        
         char respuesta = 'S';
         do{

            switch(respuesta){
                case 'S':System.out.println("opción s");
                    break;
                case 'F': System.out.println("opcion f");
                    break;
                case 'N': System.out.println("opcion n");
                    break;
                default:System.out.println("opción inválida");
                    break;
            }

         }while(respuesta != 'N');

    }


}