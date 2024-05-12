import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int n, i, r, resp=1;
        while (resp == 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println();
            System.out.println("Programa: TABUADA");
            System.out.println();
            System.out.println("Entre um valor inteiro para calculo: ");
            n = sc.nextInt();
            System.out.println();
            for ( i = 1; i <= 10; i++){
                //calculo da tabuada propriamente dito
                r = n * i;
                //apresentação da tabuada no formato: N . I = R
                System.out.println(n+"X"+i+r);
            }
            System.out.println();
            System.out.println("Deseja continuar?");
            System.out.println("Tecle (1) para SIM ou Tecle (2) para NÃO");
            resp = sc.nextInt(); //até aqui
        }
    }
}