import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite seu peso em KG: ");
        double peso = leia.nextDouble();
        System.out.println("Digite sua altura em centímetros: ");
        double altura = leia.nextDouble();
        double imc = (peso/Math.pow(altura,2));
        System.out.println("Seu IMC é: "+imc);
    }
}