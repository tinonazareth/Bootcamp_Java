import java.util.Scanner;

/* Desenvolva um gerador de tabuada,
capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
O usúario deve informar de qual número ele deseja ver a tabuada.
A saida deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 x 1 = 5
5 x 2 = 10
...
5 x 10 = 50
* */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número para gerar a sua tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuado do " + tabuada);
        for (int i = 1; i <= 10; i++ ){
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }
}