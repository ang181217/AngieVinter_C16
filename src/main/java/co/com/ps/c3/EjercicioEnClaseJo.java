package co.com.ps.c3;

import javax.swing.*;

public class EjercicioEnClaseJo {

    public static void main (String[] args) {


        JOptionPane.showMessageDialog (null, "Esta es mi super calculadora");

        JOptionPane.showMessageDialog (null, "Suma:");
        String n1 = JOptionPane.showInputDialog ("Ingresa el primer número ");
        int num1 = Integer.parseInt(n1) ;
        String n2 = JOptionPane.showInputDialog ("Ingresa el segundo número ");
        int num2 = Integer.parseInt(n2) ;
        int suma = num1+num2 ;
        JOptionPane.showMessageDialog (null, "El resultado de la suma es: "+ suma);

        JOptionPane.showMessageDialog (null, "Resta:");
        String n3 = JOptionPane.showInputDialog ("Ingresa el primer número ");
        int num3 = Integer.parseInt(n3);
        String n4 = JOptionPane.showInputDialog ("Ingresa el primer número ");
        int num4 = Integer.parseInt(n4);
        int resta= num3-num4;
        JOptionPane.showMessageDialog (null, "El resultado de la resta es: "+ resta);

        JOptionPane.showMessageDialog (null, "Multiplicación:");
        String n5 = JOptionPane.showInputDialog ("Ingresa el primer número ");
        int num5 = Integer.parseInt(n5);
        String n6 = JOptionPane.showInputDialog ("Ingresa el primer número ");
        int num6 = Integer.parseInt(n6);
        int multiplicacion= num5*num6;
        JOptionPane.showMessageDialog (null, "El resultado de la multiplicacion es: "+ multiplicacion);

        JOptionPane.showMessageDialog (null, "División:");
        String n7 = JOptionPane.showInputDialog ("Ingresa el primer número ");
        int num7 = Integer.parseInt(n7);
        String n8 = JOptionPane.showInputDialog ("Ingresa el primer número ");
        int num8 = Integer.parseInt(n8);
        int division= num7/num8;
        JOptionPane.showMessageDialog (null, "El resultado de la división es: "+division);

    }
}
