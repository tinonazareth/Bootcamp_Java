import java.util.Scanner;

/* faça um programa que calcule o
fatorial de um número inteiro
fornecido pelo usúario.
Ex.: 5!= 120
* */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fatorial: ");
        int fatorial = scan.nextInt();

        int multiplicacao = 1;
        System.out.print(fatorial + "! = ");
        for (int i = fatorial; i >= 1; i--){
            multiplicacao *= i;
        }
        System.out.println(multiplicacao);
    }
}