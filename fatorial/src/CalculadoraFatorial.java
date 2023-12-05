public class CalculadoraFatorial {
    public static long calcularFatorial(int numero) {
        if (numero == 0) {
            return 1;
        } else {
            return numero * calcularFatorial(numero - 1);
        }
    }

    public static void main(String[] args) {
        int numero = 6;
        long resultado = calcularFatorial(numero);
        System.out.printf("Fatorial de %d = %d%n", numero, resultado);
    }
}