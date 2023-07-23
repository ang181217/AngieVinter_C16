package co.com.ps.c7;

import java.util.Arrays;

public class EjercicioConSort {

    public static void main(String[] args) {


// Dado un arreglo {4,2,6,2,3,5} ordenarlos de menor a mayor

        int[] num = new int[6];

        num[0] = 4;
        num[1] = 2;
        num[2] = 6;
        num[3] = 2;
        num[4] = 3;
        num[5] = 5;

        System.out.println("Datos en desorden: ");
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println("Datos ordenados: ");
        System.out.println(Arrays.toString(num));


    }


    }





