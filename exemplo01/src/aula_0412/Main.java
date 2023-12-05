package aula_0412;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        Humano pessoa = new Humano();

        pessoa.nome = "Valtino";
        pessoa.sobreNome = "Nazareth";
        pessoa.altura = 1.72;
        pessoa.peso = 73.5;
        pessoa.dataNacimento = LocalDate.of(1975,12 ,30);
        
        /*
         * pessoa.apresentar();
        pessoa.mostrarImc();

        String nomeComp = pessoa.nomeCompleto();
        System.out.println(nomeComp);

        double resultImc = pessoa.resultadoImc();
        System.out.println(resultImc);
         */
        System.out.println("Antes de comer " + pessoa.peso);
         pessoa.comer("Abacaxi");
         pessoa.comer("Banana");
         pessoa.comer("Jaca");
         System.out.println("Peso atual " + pessoa.peso);
         pessoa.mostrarImc();
         pessoa.fazerExercicio();
         System.out.println("Um dia de exercicio " + pessoa.peso);
         pessoa.mostrarImc();
    }
    
}
