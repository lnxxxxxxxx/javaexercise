package co.packge;

import java.util.Scanner;


public class E3 {
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

        if(imc > 18.4 && imc < 25){
            System.out.println("Tu peso es normal y tu imc es: " + imc);
        }
        else{
            System.out.println("tu imc es de: " + imc);
        }





    }
}
