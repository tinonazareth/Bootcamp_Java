package edu.valtino.primeirasemana;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // Os operadores lógicos representam o recurso que nos permite criar expressões lógicas maiores a partir da junção de duas ou mais expressões.
        // && Operador lógica E
        // || Operador lógico OU
        boolean condicao1 = true;
        boolean condicao2 = false;
                                 // Expressão relacional
        if (condicao1 && condicao2 && ( 7 > 4)) {
            System.out.println(" As duas condições são verdadeira");
        }else if (condicao1 || condicao2) {
            System.out.println("Uma das condições é veradeira");
        }
        System.out.println("FIM");
    }
}
