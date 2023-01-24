package co.arrays;


import java.util.Arrays;
import java.util.Scanner;

public class E18Vectores {
    public static void main(String[] args) {
        int[] v1 = new int[4];
        int[] v2 = new int[3];
        int[] v3 = new int[v1.length + v2.length];
        Scanner join = new Scanner(System.in);
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Ingrese los numeros para el vector1");
            v1[i] = join.nextInt();

        }

        for (int i = 0; i < v2.length; i++) {
            System.out.println("Ingrese los numeros para el vector2");
            v2[i] = join.nextInt();

        }


        //para mezclar los 2 vectores vamos a iterar el i para v1
        // y v2, y el iterador j para el v3

        int j = 0;
        for(int i=0; i < 4; i++){
            v3[j] = v1[i];
            j++;

        }
        for(int i = 0; i < 3; i++){
            v3[j] = v2[i];
            j++;
        }
        System.out.println(Arrays.toString(v3));

    // otra forma de hacerlo
        int [] a = {1,2,3,4,5,6,7,8,9,10,11,12};
        int [] b = {13,14,15,16,17,18,19,20,21,22,23,24};
        int [] c = new int [24];

        int n=0;
        //contador j nos va a ayudar a acceder a cada dato del arreglo "c".
        for(int i=0; i<12; i+=3){
            //agregando datos desde a
            c[n] = a[i];
            n++;
            c[n] = a[i+1];
            n++;
            c[n] = a[i+2];
            n++;
            //agregando datos desde b
            c[n] = b[i];
            n++;
            c[n] = b[i+1];
            n++;
            c[n] = b[i+2];
            n++;
        }


        System.out.print(Arrays.toString(c));






    }
}
