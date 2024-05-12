import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Qual o valor do salário minimo atualmente? ");
        double sm = leia.nextDouble();
        System.out.println("Qual o seu salário? ");
        double s = leia.nextDouble();
        double nsm = (s/sm);
        System.out.println("O seu salário é equivalente "+nsm+" salários mínimos");

    }
}
