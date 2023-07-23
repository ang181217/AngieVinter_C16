package co.com.ps.c7;
public class Ejercicio {

    //Dado un arreglo {4,2,6,2,3,5} ordenarlos de menor a mayor
    public static void main(String[] args) {

        int[] datos = {4, 2, 6, 2, 3, 5};

        System.out.println("Datos en desorden: ");
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " ");
        }

        System.out.println(" ");

        for (int i = 0; i < datos.length - 1; i++) {
            for (int j = 0; j < (datos.length - 1 - i); j++) {
                if (datos[j] > datos[j + 1]) {
                    int aux = datos[j];
                    datos[j] = datos[j + 1];
                    datos[j + 1] = aux;
                }
            }
        }

        System.out.println(" ");

        System.out.println("Datos ordenados: ");
        for (int i = 0; i < datos.length; i++) {
            System.out.print(datos[i] + " ");


        }
    }
}