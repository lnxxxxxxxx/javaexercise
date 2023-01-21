package co.bucles;

import java.util.Scanner;

public class E14FactorialconWhile {
    public static void main(String[] args) {
        /** Construir un programa en el que se pida al usuario un número entero
        ** positivo n (validar que lo sea), y usando un bucle while, escriba por
        ** pantalla el valor del factorial de n.
        */
        Scanner enter = new Scanner(System.in);
        System.out.println("Ingrese un numero positivo: ");
        int n = enter.nextInt();

        if (n < 0){
            System.out.println("el numero ingresado no es correcto.");
        }
        else {
            int factorial = 1;
            int contador = 1;
            while(contador < n+1){
                factorial = factorial*contador;
                System.out.println("El resultado es: " + factorial);
                contador++;
            }
        }
    }
}
