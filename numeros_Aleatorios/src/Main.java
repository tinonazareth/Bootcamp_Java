import java.util.Random;
import java.util.Scanner;

/*
* Faça um programa que leia 20 números inteiros aleatórios (entre a e 100),
* armazene-os num vetor.
* Ao final mostre os números e seus sucessores.
* */
public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatiros = new int[20];

        for (int i = 0; i < numerosAleatiros.length; i++){
            int numero = random.nextInt(100);
            numerosAleatiros[i] = numero;
        }
        System.out.print("Números aleatórios: ");
        for (int numero : numerosAleatiros ) {
            System.out.print(numero + " ");
        }
        System.out.print("\nSucessores dos números aleatórios: ");
        for (int numero : numerosAleatiros ) {
            System.out.print((numero+1) + " ");
        }
        System.out.print("\nAntecessores dos números aleatórios: ");
        for (int numero : numerosAleatiros ) {
            System.out.print((numero-1) + " ");
        }
    }
}