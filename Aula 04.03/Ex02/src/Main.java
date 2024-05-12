import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
    String nome1, nome2, nome3;
    int valor1, valor2, valor3, qtd1, qtd2, qtd3, tp1, tp2, tp3, total;

        System.out.println("Digite o nome do primeiro produto: ");
        nome1 = leia.nextLine();
        System.out.println("Digite o nome do segundo produto: ");
        nome2 = leia.nextLine();
        System.out.println("Digite o nome do terceiro produto: ");
        nome3 = leia.nextLine();
        System.out.println("Digite o Valor do primeiro produto");
        valor1 = leia.nextInt();
        System.out.println("Digite o Valor do segundo produto");
        valor2 = leia.nextInt();
        System.out.println("Digite o Valor do terceiro produto");
        valor3 = leia.nextInt();
        System.out.println("Digite a quantidade do primeiro produto");
        qtd1 = leia.nextInt();
        System.out.println("Digite a quantidade do segundo produto");
        qtd2 = leia.nextInt();
        System.out.println("Digite o quantidade do terceiro produto");
        qtd3 = leia.nextInt();

        tp1 = qtd1 * valor1;
        tp2 = qtd2 * valor2;
        tp3 = qtd3 * valor3;
        total = tp1 + tp2 + tp3;

        System.out.println("O valor final da compra ficou: "+total);







    }
}