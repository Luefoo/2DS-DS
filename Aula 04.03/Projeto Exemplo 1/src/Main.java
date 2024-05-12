import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //declarando as variásveis
        String nome, resultado;
        double nota1, nota2, media;
        byte idade;

        //criar um objetivo da classe Scanner
        Scanner leia = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite o nome do aluno: ");
        nome = leia.nextLine(); //Para receber dados tipo String
        System.out.println("Digite a idade: ");
        idade = leia.nextByte();
        System.out.println("Digite a nota 1: ");
        nota1 = leia.nextDouble();
        System.out.println("Digite a nota 2: ");
        nota2 = leia.nextDouble();

        //processamento de dados
        media = (nota1+nota2)/2;

        if (media >= 6.0){
            //verdade
            resultado = "Aprovado";
        }
        else{
            //falso
            resultado = "Reprovado";
        }

        //saída de dados
        System.out.println("Nome do aluno: "+nome);
        System.out.println("Idade do aluno: "+idade);
        System.out.println("Nota 1: "+nota1);
        System.out.println("Nota 2: "+nota2);
        System.out.println("Média Final: "+media);
        System.out.println("Resultado Final: "+resultado);
    }
}