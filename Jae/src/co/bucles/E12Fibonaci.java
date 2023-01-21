package co.bucles;

import java.util.Scanner;

public class E12Fibonaci {
    public static void main(String[] args) {

        /** Implementar un programa en el que, utilizando un bucle while
        *se escriban por pantalla los 51 primeros números de la succession de Fibonacci,
        */
        long f0 = 0;
        long f1 = 1;
        int fn = 51;
        int contador = 0;
        long f3 = 1;
        System.out.println(f0 + " " + f1 + " " + fn + " " + f3);
        while(contador <= fn){
            f3 = f0 + f1;
            System.out.println(f3);
            f0 = f1;
            f1 = f3;
            contador++;
        }

        // Lo hacemos con FOR

        long n1 = 0;
        long n2 = 1;
        long n3 = 0;
        int n;
        Scanner num = new Scanner(System.in);
        System.out.println("Ingresa hasta cuantos elementos quieres: ");
        n = num.nextInt();
        for(int i = 1; i < n; i++){
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }


    }
}
