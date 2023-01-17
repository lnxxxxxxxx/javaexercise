package co.condicionales;

import java.util.Scanner;

public class E7Calculadora {
    public static void main(String[] args) {
        float num1 = 0;
        float num2 = 0;
        String opcion;
        Scanner selector = new Scanner(System.in);
        System.out.println("Escribe un numero: ");
        num1 = selector.nextFloat();
        System.out.println("Escribe otro numero: ");
        num2 = selector.nextFloat();
        System.out.println("Elige S(sumar), R(restar), M(multiplicar), D(dividir)");
        opcion = selector.next();
        if(opcion.equals("s") || opcion.equals("S")){
            System.out.println("Elegiste sumar, el resultado es : " + (num1+num2));
        }if(opcion.equals("r") || opcion.equals("R")){
            System.out.println("Elegiste restar, el resultado es : " + (num1-num2));
        }if(opcion.equals("m") || opcion.equals("M")){
            System.out.println("Elegiste multriplicar, el resultado es : " + (num1*num2));
        }if(opcion.equals("d") || opcion.equals("D")){
            System.out.println("Elegiste dividir, el resultado es : " + (num1/num2));
        }


    }
}
