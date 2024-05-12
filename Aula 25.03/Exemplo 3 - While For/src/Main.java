import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int i,resp=1,qtd=0;
        Scanner sc = new Scanner(System.in);
        while (resp == 1) {
            qtd++;
            for (i = 1; i <= 5; i++)
                System.out.println("Valor = " + i);
            System.out.println();
            System.out.println("Quantidade de Execuções: "+qtd);
            System.out.println("Deseja Continuar?");
            System.out.println("Tecle (1) para SIM ou Tecle (2) para NÃO");
            resp = sc.nextInt();
        } // termina aqui
    }
}