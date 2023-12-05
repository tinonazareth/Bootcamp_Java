public class SubstituirCaracteres {

    public static String substituirCaractere(String original, char antigoCaractere, char novoCaractere) {
        // Verifica se a string original é nula ou vazia
        if (original == null || original.isEmpty()) {
            return original;
        }

        // Cria um StringBuilder para construir a nova string
        StringBuilder novaString = new StringBuilder();

        // Itera sobre cada caractere da string original
        for (char c : original.toCharArray()) {
            // Se o caractere for igual ao antigo, substitui pelo novo
            if (c == antigoCaractere) {
                novaString.append(novoCaractere);
            } else {
                novaString.append(c);
            }
        }

        // Retorna a nova string com as substituições
        return novaString.toString();
    }

    public static void main(String[] args) {
        String textoOriginal = "Esta é uma string de exemplo com alguns caracteres repetidos.";
        char antigoCaractere = 'a';
        char novoCaractere = 'X';

        String textoSubstituido = substituirCaractere(textoOriginal, antigoCaractere, novoCaractere);

        System.out.println("Texto original: " + textoOriginal);
        System.out.println("Texto substituído: " + textoSubstituido);
    }
}
