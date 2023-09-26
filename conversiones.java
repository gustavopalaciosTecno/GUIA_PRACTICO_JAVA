public class conversiones {
    public static void main(String args[]){
        int value1 = 5;
        int value2 = (int)5.99f; // esto es un casteo

        System.out.println(value1);
        System.out.println(value2);

        // conversión de tipo implítica
        double value3 = 10 + 20.5d; // predomina el que tiene mayor precisión , devuelve valor con coma.
        System.out.println(10 + 20.5d);
        System.out.print(value3);
        
    }
}
