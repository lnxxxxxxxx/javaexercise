package co.condicionales;

import java.util.Scanner;

public class E6 {
    public static void main(String[] args) {
        float altura = 0;
        float peso = 0;
        float imc = 0;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa tu peso: ");
        peso = entrada.nextFloat();
        System.out.println("Ingresa tu altura: ");
        altura = entrada.nextFloat();
        imc = peso/(altura * altura);
        if(imc <= 18.4){
            System.out.println("Tu peso es bajo y tu imc es: " + imc);
        }
        else if(imc > 18.4 && imc < 25){
            System.out.println("Tu peso es normal y tu imc es: " + imc);
        }
        else if(imc > 25  && imc < 29){
            System.out.println("Tienes sobrepeso y tu imc es: " + imc);
        }
        else if (imc > 29 && imc < 34.9){
            System.out.println("Tienes obesidad y tu imc es: " + imc);
        }

    }
}
