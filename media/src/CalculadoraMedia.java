public class CalculadoraMedia {

    public static double calcularMedia(double[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("O array de números não pode estar vazio.");
        }

        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }

        return soma / numeros.length;
    }

    public static void main(String[] args) {
        double[] notas = { 7.5, 8.0, 6.5, 9.0, 7.0 }; // Exemplo de array de notas
        double media = calcularMedia(notas);

        System.out.println("A média das notas é: " + media);
    }
}