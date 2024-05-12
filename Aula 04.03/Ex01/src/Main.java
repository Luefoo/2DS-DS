import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    double c, k, re, ra, f;

       Scanner leia = new Scanner(System.in);

        System.out.println("Digite em graus Celsius a temperatura: ");
        c = leia.nextDouble();

        f = c * 1.8 + 32;
        k = c + 273.15;
        re = c * 0.8;
        ra = c * 1.8 +32 + 459.67;

        System.out.println("Essa temperatura em Kelvin seria: "+k);
        System.out.println("Essa temperatura em Réaumur seria: "+re);
        System.out.println("Essa temperatura em Rankine seria: "+ra);
        System.out.println("Essa temperatura em Fahrenheit seria: "+f);
    }
}