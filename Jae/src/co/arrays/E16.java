package co.arrays;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class E16 {
    public static void main(String[] args) {

        int num = 7;

        Scanner join = new Scanner(System.in);
        int [] numbers = new int [num];


        for(int i = 1; i < numbers.length; i++){
            System.out.println("Ingrese los numeros para el array");
            int n = join.nextInt();
            numbers[i] = n;
        }

        Arrays.sort(numbers);
        Arrays.toString(numbers);
        System.out.println("El numero mas chico es : " + numbers[0] + " y el numero mas grande es: " + numbers[6]);

        // test 2 de como resolver el ejercicio
         List<Integer> numbs = new ArrayList<Integer>();
            for(int i = 1; i < num + 1; i++){
            System.out.println("Ingrese los numeros para el array");
            int n = join.nextInt();
            numbs.add(n);

        }
            for(int i = 0; i < num; i++){
         System.out.println(numbs.get(i) + " ");
         }
            int mayor, menor;
            mayor = menor = numbs.get(0);
            for(int i = 0; i < numbs.size(); i++){
                if(numbs.get(i) > mayor){
                    mayor = numbs.get(i);
                }
                if(numbs.get(i) < menor){
                    menor = numbs.get(i);
                }
            }
        System.out.println("El mayor valor es : " + mayor);
        System.out.println("El menor valor es : " + menor);





    }
}
