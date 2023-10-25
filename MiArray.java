public class MiArray {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.println("el valor del array es: " + arr.length);
        System.out.println("el valor de la posición 4 es: " + arr[2]);

        System.err.println("\n");

        int [][] arrBidimensional = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
        // el 3 indica las filas y el 2 la cantidad de columnas empezando del cero
        System.err.println(arrBidimensional[3][2]);// da como resultado 12 porque indica que hay 12 columnas
        System.out.println("\n");
        // hacemos un bucle anidado para recorrer los elementos

        for(int i = 0; i < arrBidimensional.length; i++){
            for(int j = 0; j < arrBidimensional.length; j++){
                System.out.println("elemento " + "i" + "," + "j" + ": " +arrBidimensional[i][j]);
            }
        }
    }
}
