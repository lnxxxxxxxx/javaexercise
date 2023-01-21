package co.arrays;

import java.util.Scanner;

public class E17Capicua {
    public static void main(String[] args) {
        int[] numeros;
        int ini, fin;
        boolean capicua = true;

        Scanner join = new Scanner(System.in);

        numeros = new int[10];
        // Inicializar el array de números

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese los numeros");
            numeros[i] = join.nextInt();
            //numeros[i] = (int) (10*Math.random()+1);
        }

        // System.out.println(Arrays.toString(numeros));

        ini = 0;
        fin = numeros.length - 1;
        while(ini <= fin && capicua) {
            capicua = (numeros[ini++] == numeros[fin--]);
        }

        if(capicua)
            System.out.println("El array es capicua");
        else
            System.out.println("El array NO es capicua");
    }

}

