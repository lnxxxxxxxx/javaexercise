package co.bucles;

import java.util.Scanner;

public class E15JuegoAzar {
    public static void main(String[] args) {
        int x  = (int) (100*Math.random()+1);
        System.out.println(x);
        Scanner join = new Scanner(System.in);

        int contador = 5;

        while(contador > 0){
            System.out.println("Trata de adivinar el numero entre el 1-100 : ");
            int a = join.nextInt();
            if(a != x){
                contador--;
                System.out.println("No es el numero correcto te quedan " + contador + " oportunidades");
                if(a > x){
                    System.out.println("El numero ingresado es mayor al que tienes que encontrar");
                } else if (a < x) {
                    System.out.println("El numero ingresado es menor al que tienes que encontrar");
                }
            }else {
                System.out.println("Encontraste el numero");
                contador = 0;
            }


        }

    }
}
