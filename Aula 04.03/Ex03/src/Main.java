import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o número de aves que você quer criar: ");
        int nAves = leia.nextInt();
        double custo = (nAves * 0.30) / 15 + 10;
        System.out.println("Esse será o custo para criar essas aves: "+custo);
    }
}
