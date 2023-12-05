public class CalculadoraJurosCompostos {

    public static double calcularMontante(double principal, double taxaJuros, int tempoMeses) {
        if (principal <= 0 || taxaJuros < 0 || tempoMeses <= 0) {
            throw new IllegalArgumentException("Os parâmetros devem ser positivos.");
        }

        double taxaDecimal = taxaJuros / 100.0;
        double montante = principal * Math.pow(1 + taxaDecimal, tempoMeses);
        return montante;
    }

    public static void main(String[] args) {
        double principal = 1000.0; // Exemplo de valor principal
        double taxaJuros = 5.0; // Exemplo de taxa de juros (5%)
        int tempoMeses = 12; // Exemplo de período em meses

        double montanteFinal = calcularMontante(principal, taxaJuros, tempoMeses);

        System.out.printf("O montante final após %d meses é: R$ %.2f%n", tempoMeses, montanteFinal);
    }
}