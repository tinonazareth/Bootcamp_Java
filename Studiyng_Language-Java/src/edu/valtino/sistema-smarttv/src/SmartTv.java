public class SmartTv {

    /*
         * Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
         * 1. Ela tenha as característica: ligada (boolean), canal (int) e volume (int).
         * 2. Nossa TV poderá ligar e desligar e assim mudar o estado ligado.
         * 3. Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1.
         * 4. Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número
         * correspondente.
         */

    boolean tvLigada = false; // A TV está desligada
    int canalAtual = 1; // A TV inicia no canal 1
    int volumeAtual = 10; // A TV inicia já no volume 10
        
    public void ligar(){
        tvLigada = true;
    }

    public void desligar(){
        tvLigada = false;
    }

    public void aumentarVolume(){
        volumeAtual++;
        System.out.println("Aumentando o volume para " + volumeAtual);
    }

    public void diminuirVolume(){
        volumeAtual--;
        System.out.println("Diminuindo o volume para " + volumeAtual);
    }

    public void mudarCanal(int novoCanal){
        canalAtual = novoCanal;
    }

    public void subirCanal(){
        canalAtual++;
        System.out.println("Trocando de canal para cima: " + canalAtual);
    }

    public void descerCanal(){
        canalAtual--;
        System.out.println("Trocando de canal para baixo: " + canalAtual);
    }
} 