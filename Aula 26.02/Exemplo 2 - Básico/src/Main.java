import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    double  larglado1, altura, larglado2, larglado3, larglado4, vertTeto, horiTeto, largTotal, tetoTotal, areaTotal, rendimento, qtdLitros;

        Scanner leia = new Scanner(System.in);


        System.out.println("Digite a largura da parede do Lado 1: ");
        larglado1 = leia.nextDouble();
        System.out.println("Digite a largura da parede do Lado 2: ");
        larglado2 = leia.nextDouble();
        System.out.println("Digite a largura da parede do Lado 3: ");
        larglado3 = leia.nextDouble();
        System.out.println("Digite a largura da parede do Lado 4: ");
        larglado4 = leia.nextDouble();
        System.out.println("Digite a altura das paredes: ");
        altura = leia.nextDouble();

        System.out.println("Digite a distância vertical do teto: ");
        vertTeto = leia.nextDouble();
        System.out.println("Digite a distância horizontal do teto: ");
        horiTeto = leia.nextDouble();

        System.out.println("Qual o rendimento da lata de tinta? ");
        rendimento = leia.nextDouble();

        largTotal = larglado1 + larglado2 + larglado3 + larglado4;
        tetoTotal = vertTeto * horiTeto;
        areaTotal = altura * largTotal + tetoTotal;
        qtdLitros = areaTotal/15;

        System.out.println("Área Total: "+areaTotal);
        System.out.println("Quantidade de Litros: "+qtdLitros);



    }
}