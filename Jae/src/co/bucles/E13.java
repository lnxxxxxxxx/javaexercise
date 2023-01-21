package co.bucles;

import java.util.Scanner;

public class E13 {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = numero.nextInt();
        System.out.println("Elevado a : ");
        int m = numero.nextInt();
        int au = n;
        for(int i = 0; i < m; i++){
            au = n * au;
            System.out.println("el valor es: " + au);
        }
    }
}
