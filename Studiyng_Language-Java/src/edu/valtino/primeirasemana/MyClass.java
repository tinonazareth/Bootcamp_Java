package edu.valtino.primeirasemana;

public class MyClass {
// Método Main PRINCIAL
    public static void main(String[] args) {
     // Declarando variáveis
    String primeiroNome = "Valtino";
    String segundoNome = "Nazareth";
    // Variável com chamada de método
    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
    // Imprimindo a variável
    System.out.println(nomeCompleto);

    }

    // Método static retorna uma String
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);

    }
}
