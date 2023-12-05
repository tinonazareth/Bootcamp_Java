import java.util.Scanner;

public class VerificadorPrimo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Digite um número inteiro positivo:");
            int numero = sc.nextInt();

            if (ehPrimo(numero)) {
                System.out.println(numero + " é um número primo.");
            } else {
                System.out.println(numero + " não é um número primo.");
            }
        }
    }

    // Método para verificar se um número é primo
    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false; // Números menores ou iguais a 1 não são primos
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Se for divisível por algum número entre 2 e a raiz quadrada, não é primo
            }
        }
        return true; // Se não foi divisível por nenhum número, é primo
    }
}