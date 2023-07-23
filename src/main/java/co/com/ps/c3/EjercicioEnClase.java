package co.com.ps.c3;

import java.util.Scanner;

public class EjercicioEnClase {


    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Esta es mi super calculadora");

        System.out.println("Suma:" );
        System.out.println("Ingresa el primer número ");
        int num1 = scanner.nextInt();
        System.out.println("Ingresa el segundo número ");
        int num2 = scanner.nextInt();
        int suma= num1+num2;
        System.out.println("El resultado de la suma es: "+suma);

        System.out.println("Resta: ");
        System.out.println("Ingresa el primer número ");
        int num3 = scanner.nextInt();
        System.out.println("Ingresa el segundo número ");
        int num4 = scanner.nextInt();
        int resta= num3-num4;
        System.out.println("El resultado de la resta es: "+resta);

        System.out.println("Multiplicación: ");
        System.out.println("Ingresa el primer número ");
        int num5 = scanner.nextInt();
        System.out.println("Ingresa el segundo número ");
        int num6 = scanner.nextInt();
        int multiplicacion= num5*num6;
        System.out.println("El resultado de la multiplicación es: "+multiplicacion);

        System.out.println("División:" );
        System.out.println("Ingresa el primer número ");
        int num7 = scanner.nextInt();
        System.out.println("Ingresa el segundo número ");
        int num8 = scanner.nextInt();
        int division= num7/num8;
        System.out.println("El resultado de la división es: "+division);

    }

}