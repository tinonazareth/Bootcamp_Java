package aula_0412;

import java.time.LocalDate;

public class Humano {
    String nome;
    String sobreNome;
    LocalDate dataNacimento;
    double altura;
    double peso;

        void apresentar(){
            System.out.println("Olá meu nome é " + nome + " e meu sobrenome " + sobreNome + ".");
        }

        void mostrarImc(){
            double imc = (peso / altura) * altura;
            System.out.println(" O seu IMC é " + imc);
        }

       String nomeCompleto(){
        return nome + ""+ sobreNome;
       }

       double resultadoImc(){
        double imc = (peso / altura) * altura;
        return imc;
       }

       void fazerExercicio(){
        System.out.println("Estou me exercitando");
         peso = 0.5;
    }

    void comer(String comida){
        System.out.println("Estou comendo " + comida);
        peso += 0.5;
    }
}
