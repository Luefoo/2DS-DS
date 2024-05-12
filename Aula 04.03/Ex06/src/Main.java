import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double n1 = leia.nextDouble();
        double ant = (n1 - 1);
        double suc = (n1 + 1);
        System.out.println("Seu antecessor é "+ant);
        System.out.println("Seu sucessor é: "+suc);

    }
}