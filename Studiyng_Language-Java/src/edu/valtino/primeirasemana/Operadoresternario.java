package edu.valtino.primeirasemana;

public class Operadoresternario {
    public static void main(String[] args) {
        // Operadores Relacionais
        /*
         * == Quando desejamos verifcar se uma variável é IGUAL a outra
         * != Quando desejamos verificar se uma variável é DIFERENTE da outra
         * > Quando desejamos verificae se uma variável é MAIOR que a outra.
         * >= Quando desejamos verificar se uma variável é MAIOR OU IGUAL a outra
         * < Quando desejamos verificar se uma variável é MENOR que a outra
         * <= Quando desejamos verificar se uma variável é MENOR OU IGUAL a outra
         */
        String nomeUm = "Valtino";
        String nomeDois = new String("Valtino"); // objeto
        System.out.println(nomeUm.equals(nomeDois)); // Utilizamos o método equals para comparar conteúdo
        
        
        
         int numero1 = 1;
        int numero2 = 2;

        if (numero1 > numero2) {
            System.out.println("Numero 1 maior que numero 2");
        } else if (numero1 < numero2) {
            System.out.println("Numero 1 é menor que numero 2");
        }

        boolean simNao = numero1 == numero2;
        System.out.println("Numero 1 é igual a numero 2 ? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("Numero 1 é diferente de numero 2 ? " + simNao);

        
    }

}
