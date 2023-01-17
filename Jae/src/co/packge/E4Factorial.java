package co.packge;

import java.util.Scanner;

public class E4Factorial {

        public static void main(String[] args) {
            int numeroFactorial = 0;
            int factorial = 1;
            Scanner in = new Scanner(System.in);
            System.out.print("Introduce Un Numero:");
            numeroFactorial = in.nextInt();
            for (int i = 1; i <= numeroFactorial; i++)
                factorial = factorial*i;

            System.out.println("El resutado es:"+factorial);
        }

}
