package co.com.ps.c5;

import java.util.Scanner;

public class EjercicioEnClase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese su edad");

        int edad = scanner.nextInt();

     if (edad >= 18  ){
         System.out.println("Usted es mayor de edad.");
     } else {
         System.out.println("Usted es menor de edad");
     }
        int adn = 2023 - edad;

        System.out.println ("Tu año de nacimiento es "+ adn);
    }
}
