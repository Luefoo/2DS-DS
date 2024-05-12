import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Qual a massa (em KG) que precisamos levantar? ");
        double m = leia.nextDouble();
        System.out.println("A qual altura (em CM) precisamos levantar? ");
        double alt = leia.nextDouble();
        System.out.println("Quanto tempo (em segundos) precisamos levar para podermos levanta-la? ");
        double t = leia.nextDouble();
        double c = (m * alt/t) / 745.6999;
        System.out.println("Precisamos de "+c+" cavalos para podermos fazer isso. ");
    }
}