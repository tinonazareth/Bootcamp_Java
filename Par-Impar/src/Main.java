import java.util.Scanner;

/* Faça um programa que N números inteiros,
calcule e mostre a quantidade de números pares e a
quantidade de números impares.
* */
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantInpares = 0;

        System.out.println("Qauntos números você deseja inserir? ");
        quantNumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantInpares++;

            count ++;
        }while (count < quantNumeros);

        System.out.println("Quantidade Par: " + quantPares);
        System.out.println("Quantidade Impar: " + quantInpares);
    }
}