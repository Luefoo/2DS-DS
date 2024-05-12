import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,qtd=0, resp=1;

        do{
            i = 1;
            qtd++;
            do{
                System.out.println("Valor = " + i);
                i++; //i=i+1
            }
            while (i <= 5);
            System.out.println();
            System.out.println("\nQuantidade de Execuções: "+qtd);
            System.out.println("Deseja continuar? ");
            System.out.println("Tecle (1) para SIM ou Tecle (2) para NÃO");
            resp = sc.nextInt();
        }
        while (resp == 1); //termina aqui
    }
}