package edu.valtino.primeirasemana;

public class TiposVariaveis {
    // Representa textos
    String nome = "Valtino Nazareth";
    // Tipos primitivos
    byte idade = 123;
    short ano = 2023;
    int cep = 21070333; // se o cep começar com zero, talvez seja melhor uma variável do tipo (String)
    long cpf = 12458236545872415L; // tambem se começar com zero, talvez outro tipo coloca se o L no final
    float pi = 3.14F; // Colocar F no final.
    double salarioMinimo = 2500.43; // Representação em milhar

    // Constantes sempre declarada em caixa alta e (final) antes do tipo
    final double VALOR_DE_PI = 3.14;
}
