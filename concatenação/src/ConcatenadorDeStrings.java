import java.util.List;

public class ConcatenadorDeStrings {
    public static String concatenar(List<String> listaDeStrings) {
        StringBuilder resultado = new StringBuilder();
        for (String str : listaDeStrings) {
            resultado.append(str);
        }
        return resultado.toString();
    }

    public static void main(String[] args) {
        // Exemplo de uso:
        List<String> minhaLista = List.of("Olá, ", "mundo", "!");
        String resultadoConcatenado = concatenar(minhaLista);
        System.out.println("Resultado da concatenação: " + resultadoConcatenado);
    }
}