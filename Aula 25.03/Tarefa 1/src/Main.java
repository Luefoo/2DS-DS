import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int i=15;
        Scanner sc = new Scanner(System.in);

        while (i <= 200){
            int quadrado = i * i;
            System.out.println("O quadrado de "+i+" é "+quadrado);
            i++;
        }
    }
}