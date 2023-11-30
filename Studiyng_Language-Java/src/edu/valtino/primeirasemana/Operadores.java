package edu.valtino.primeirasemana;

import java.sql.Date;

public class Operadores {
    public static void main(String[] args) {
        // Símbolos especiais que tem um significado próprio para a linguagem e estão
        // associados a determinadas operações

        // Operador de atribuição (=)
        String meuNome = "Valtino Nazareth";
        int idade = 47;
        double peso = 73.5;
        char sexo = 'M';
        boolean doadorOrgao = false;
        Date dataNascimento = new Date(idade); // tipo class criando um novo ojeto

        // Operador Aritméticos (+ - * / %)
        double somar = 10.5 + 15.7;
        int subtrair = 113 - 25;
        int multiplicar = 20 * 7;
        int dividir = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        // Operadores Unários
        // (+) operador unário de valor positivo
        // (-) operador unário de valor negativo
        // (++) operador unário de incremento de valor (repetição)
        // (--) operador unário de decremento de valor
        // (!) operador unário lógico de negação

        int numero1 = 5;
         numero1++;
         System.out.println(numero1);
         // Para imprimir o valor da variavel antes do incremento e decremento colocar o operador antes exemplo: ++numero1

         // Invertendo o valor da variavel boolean adicionamos o sinal de ! ( isso em menoria, mas a variavel continuara ter o valor original).
         boolean variavel = true;
         variavel = !variavel; // invertendo no escopo
         System.out.println(variavel); 

         // Operador Ternario
         // O operador ternário é representado pelos símbolos ? : utilizados na seguinte estrutura de sintaxe:
         // <expressão condicional> ? <caso condição seja true> : <caso condição seja false>
         int a, b;

         a = 5;
         b = 6;
        //  String resultado1 = "";

        //  Exemplo de Condicional utilizando uma estrutura IF/ELSE
        // if (a == b) {
        //     resultado1 = "Verdadeiro";
        // }else{
        //     resultado1 = "Falso";
        // } 
        String resultado1 = a == b ? "verdadeiro" : "Falso";

        System.out.println(resultado1);

        /*ESTE SÃO APENAS EXEMPLOS DE CRIAÇÃO ONDE AS VARIÁVEIS NÃO ESTÃO SENDO UTILIZADAS OK */
    }   

}
