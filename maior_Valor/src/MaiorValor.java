import java.util.Scanner;

public class MaiorValor {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite três números:");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            int maior = Math.max(b, Math.max(c, a));
            int menor = Math.min(b, Math.min(c, a));

            System.out.println("Maior: " + maior + " Menor: " + menor);
        }
    }
}