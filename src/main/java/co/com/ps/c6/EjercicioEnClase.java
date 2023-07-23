package co.com.ps.c6;

import java.util.Scanner;

public class EjercicioEnClase {

    public static void main(String[] args) {

        int[] num = {18, 76, 35, 98, 46, 24, 7, 953, 567, 27};

        int menor = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] < menor) {
                menor = num[i];
            }
        }
        System.out.println("El número menor es: " + menor);

        int mayor = num[0];

        for (int i = 1; i < num.length; i++) {
            if (num[i] > mayor) {
                mayor = num[i];
            }
        }

        System.out.println("El número mayor es: "+ mayor);

    }
}



