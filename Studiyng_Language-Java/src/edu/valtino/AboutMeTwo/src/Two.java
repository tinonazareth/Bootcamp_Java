import java.util.Locale;
import java.util.Scanner;


public class Two {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Digite o seu nome");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobreNome = scanner.next();

            System.out.println("Digite sua idade");
            int idade = scanner.nextInt();
            
            System.out.println("Digte sua altura");
            double altura = scanner.nextDouble();

            
      System.out.println("Olá meu é " + nome + " " + sobreNome);
      System.out.println("Tenho " + idade + " anos");
      System.out.println("Minha altura é: " + altura + " cm ");
        }
    }
}
