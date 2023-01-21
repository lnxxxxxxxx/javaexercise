package co.bucles;

public class E10 {
    public static void main(String[] args) {
        double celsius;

        for (int f = 0; f <= 300; f += 20) {
            celsius = (5.0 / 9.0) * (f - 32);
            System.out.println(f + "º Fahrenheit = " + celsius + "º celsius");
        }
    }
}
